{-# LANGUAGE DataKinds                  #-}
{-# LANGUAGE DeriveDataTypeable         #-}
{-# LANGUAGE DeriveGeneric              #-}
{-# LANGUAGE DeriveTraversable          #-}
{-# LANGUAGE FlexibleContexts           #-}
{-# LANGUAGE FlexibleInstances          #-}
{-# LANGUAGE GeneralizedNewtypeDeriving #-}
{-# LANGUAGE OverloadedStrings          #-}
{-# LANGUAGE RecordWildCards            #-}
{-# LANGUAGE TypeFamilies               #-}
{-# LANGUAGE TypeOperators              #-}
{-# LANGUAGE ViewPatterns               #-}
{-# OPTIONS_GHC
-fno-warn-unused-binds -fno-warn-unused-imports -freduction-depth=328 #-}

module OpenAPI.API
  ( -- * Client and Server
    Config(..)
  , OpenAPIBackend(..)
  , createOpenAPIClient
  , runOpenAPIServer
  , runOpenAPIMiddlewareServer
  , runOpenAPIClient
  , runOpenAPIClientWithManager
  , callOpenAPI
  , OpenAPIClient
  , OpenAPIClientError(..)
  -- ** Servant
  , OpenAPIAPI
  -- ** Plain WAI Application
  , serverWaiApplicationOpenAPI
  ) where

import           OpenAPI.Types

import           Control.Monad.Catch                (Exception, MonadThrow, throwM)
import           Control.Monad.Except               (ExceptT, runExceptT)
import           Control.Monad.IO.Class
import           Control.Monad.Trans.Reader         (ReaderT (..))
import           Data.Aeson                         (Value)
import qualified Data.Aeson                         as Aeson
import qualified Data.ByteString.Lazy               as BSL
import           Data.Coerce                        (coerce)
import           Data.Data                          (Data)
import           Data.Function                      ((&))
import qualified Data.Map                           as Map
import           Data.Monoid                        ((<>))
import           Data.Proxy                         (Proxy (..))
import           Data.Set                           (Set)
import           Data.Text                          (Text)
import qualified Data.Text                          as T
import qualified Data.Text.Encoding                 as T
import           Data.Time
import           Data.UUID                          (UUID)
import           GHC.Exts                           (IsString (..))
import           GHC.Generics                       (Generic)
import           Network.HTTP.Client                (Manager, newManager)
import           Network.HTTP.Client.TLS            (tlsManagerSettings)
import           Network.HTTP.Types.Method          (methodOptions)
import           Network.Wai                        (Middleware)
import qualified Network.Wai.Handler.Warp           as Warp
import           Servant                            (ServerError, serveWithContextT)
import           Servant.API                        hiding (addHeader)
import           Servant.API.Verbs                  (StdMethod (..), Verb)
import           Servant.Client                     (ClientEnv, Scheme (Http), ClientError, client,
                                                     mkClientEnv, parseBaseUrl)
import           Servant.Client.Core                (baseUrlPort, baseUrlHost)
import           Servant.Client.Internal.HttpClient (ClientM (..))
import           Servant.Server                     (Handler (..), Application, Context (EmptyContext))
import           Servant.Server.StaticFiles         (serveDirectoryFileServer)
import           Web.FormUrlEncoded
import           Web.HttpApiData




-- | List of elements parsed from a query.
newtype QueryList (p :: CollectionFormat) a = QueryList
  { fromQueryList :: [a]
  } deriving (Functor, Applicative, Monad, Foldable, Traversable)

-- | Formats in which a list can be encoded into a HTTP path.
data CollectionFormat
  = CommaSeparated -- ^ CSV format for multiple parameters.
  | SpaceSeparated -- ^ Also called "SSV"
  | TabSeparated -- ^ Also called "TSV"
  | PipeSeparated -- ^ `value1|value2|value2`
  | MultiParamArray -- ^ Using multiple GET parameters, e.g. `foo=bar&foo=baz`. Only for GET params.

instance FromHttpApiData a => FromHttpApiData (QueryList 'CommaSeparated a) where
  parseQueryParam = parseSeparatedQueryList ','

instance FromHttpApiData a => FromHttpApiData (QueryList 'TabSeparated a) where
  parseQueryParam = parseSeparatedQueryList '\t'

instance FromHttpApiData a => FromHttpApiData (QueryList 'SpaceSeparated a) where
  parseQueryParam = parseSeparatedQueryList ' '

instance FromHttpApiData a => FromHttpApiData (QueryList 'PipeSeparated a) where
  parseQueryParam = parseSeparatedQueryList '|'

instance FromHttpApiData a => FromHttpApiData (QueryList 'MultiParamArray a) where
  parseQueryParam = error "unimplemented FromHttpApiData for MultiParamArray collection format"

parseSeparatedQueryList :: FromHttpApiData a => Char -> Text -> Either Text (QueryList p a)
parseSeparatedQueryList char = fmap QueryList . mapM parseQueryParam . T.split (== char)

instance ToHttpApiData a => ToHttpApiData (QueryList 'CommaSeparated a) where
  toQueryParam = formatSeparatedQueryList ','

instance ToHttpApiData a => ToHttpApiData (QueryList 'TabSeparated a) where
  toQueryParam = formatSeparatedQueryList '\t'

instance ToHttpApiData a => ToHttpApiData (QueryList 'SpaceSeparated a) where
  toQueryParam = formatSeparatedQueryList ' '

instance ToHttpApiData a => ToHttpApiData (QueryList 'PipeSeparated a) where
  toQueryParam = formatSeparatedQueryList '|'

instance ToHttpApiData a => ToHttpApiData (QueryList 'MultiParamArray a) where
  toQueryParam = error "unimplemented ToHttpApiData for MultiParamArray collection format"

formatSeparatedQueryList :: ToHttpApiData a => Char ->  QueryList p a -> Text
formatSeparatedQueryList char = T.intercalate (T.singleton char) . map toQueryParam . fromQueryList

newtype JSONQueryParam a = JSONQueryParam
  { fromJsonQueryParam :: a
  } deriving (Functor, Foldable, Traversable)

instance Aeson.ToJSON a => ToHttpApiData (JSONQueryParam a) where
  toQueryParam = T.decodeUtf8 . BSL.toStrict . Aeson.encode . fromJsonQueryParam

instance Aeson.FromJSON a => FromHttpApiData (JSONQueryParam a) where
  parseQueryParam = either (Left . T.pack) (Right . JSONQueryParam) . Aeson.eitherDecodeStrict . T.encodeUtf8


-- | Servant type-level API, generated from the OpenAPI spec for OpenAPI.
type OpenAPIAPI
    =    "mc" :> "game" :> "version_manifest.json" :> Verb 'GET 200 '[JSON] VersionManifest -- 'getMinecraftVersionManifest' route
    :<|> "v1" :> "packages" :> Capture "packageId" Text :> "{versionId}.json" :> Verb 'GET 200 '[JSON] VersionPackageInfo -- 'getMinecraftVersionPackageInfo' route
    :<|> Raw


-- | Server or client configuration, specifying the host and port to query or serve on.
data Config = Config
  { configUrl :: String  -- ^ scheme://hostname:port/path, e.g. "http://localhost:8080/"
  } deriving (Eq, Ord, Show, Read)


-- | Custom exception type for our errors.
newtype OpenAPIClientError = OpenAPIClientError ClientError
  deriving (Show, Exception)
-- | Configuration, specifying the full url of the service.


-- | Backend for OpenAPI.
-- The backend can be used both for the client and the server. The client generated from the OpenAPI OpenAPI spec
-- is a backend that executes actions by sending HTTP requests (see @createOpenAPIClient@). Alternatively, provided
-- a backend, the API can be served using @runOpenAPIMiddlewareServer@.
data OpenAPIBackend m = OpenAPIBackend
  { getMinecraftVersionManifest :: m VersionManifest{- ^  -}
  , getMinecraftVersionPackageInfo :: Text -> m VersionPackageInfo{- ^  -}
  }


newtype OpenAPIClient a = OpenAPIClient
  { runClient :: ClientEnv -> ExceptT ClientError IO a
  } deriving Functor

instance Applicative OpenAPIClient where
  pure x = OpenAPIClient (\_ -> pure x)
  (OpenAPIClient f) <*> (OpenAPIClient x) =
    OpenAPIClient (\env -> f env <*> x env)

instance Monad OpenAPIClient where
  (OpenAPIClient a) >>= f =
    OpenAPIClient (\env -> do
      value <- a env
      runClient (f value) env)

instance MonadIO OpenAPIClient where
  liftIO io = OpenAPIClient (\_ -> liftIO io)

createOpenAPIClient :: OpenAPIBackend OpenAPIClient
createOpenAPIClient = OpenAPIBackend{..}
  where
    ((coerce -> getMinecraftVersionManifest) :<|>
     (coerce -> getMinecraftVersionPackageInfo) :<|>
     _) = client (Proxy :: Proxy OpenAPIAPI)

-- | Run requests in the OpenAPIClient monad.
runOpenAPIClient :: Config -> OpenAPIClient a -> ExceptT ClientError IO a
runOpenAPIClient clientConfig cl = do
  manager <- liftIO $ newManager tlsManagerSettings
  runOpenAPIClientWithManager manager clientConfig cl

-- | Run requests in the OpenAPIClient monad using a custom manager.
runOpenAPIClientWithManager :: Manager -> Config -> OpenAPIClient a -> ExceptT ClientError IO a
runOpenAPIClientWithManager manager Config{..} cl = do
  url <- parseBaseUrl configUrl
  runClient cl $ mkClientEnv manager url

-- | Like @runClient@, but returns the response or throws
--   a OpenAPIClientError
callOpenAPI
  :: (MonadIO m, MonadThrow m)
  => ClientEnv -> OpenAPIClient a -> m a
callOpenAPI env f = do
  res <- liftIO $ runExceptT $ runClient f env
  case res of
    Left err       -> throwM (OpenAPIClientError err)
    Right response -> pure response


requestMiddlewareId :: Application -> Application
requestMiddlewareId a = a

-- | Run the OpenAPI server at the provided host and port.
runOpenAPIServer
  :: (MonadIO m, MonadThrow m)
  => Config -> OpenAPIBackend (ExceptT ServerError IO) -> m ()
runOpenAPIServer config backend = runOpenAPIMiddlewareServer config requestMiddlewareId backend

-- | Run the OpenAPI server at the provided host and port.
runOpenAPIMiddlewareServer
  :: (MonadIO m, MonadThrow m)
  => Config -> Middleware -> OpenAPIBackend (ExceptT ServerError IO) -> m ()
runOpenAPIMiddlewareServer Config{..} middleware backend = do
  url <- parseBaseUrl configUrl
  let warpSettings = Warp.defaultSettings
        & Warp.setPort (baseUrlPort url)
        & Warp.setHost (fromString $ baseUrlHost url)
  liftIO $ Warp.runSettings warpSettings $ middleware $ serverWaiApplicationOpenAPI backend

-- | Plain "Network.Wai" Application for the OpenAPI server.
--
-- Can be used to implement e.g. tests that call the API without a full webserver.
serverWaiApplicationOpenAPI :: OpenAPIBackend (ExceptT ServerError IO) -> Application
serverWaiApplicationOpenAPI backend = serveWithContextT (Proxy :: Proxy OpenAPIAPI) context id (serverFromBackend backend)
  where
    context = serverContext
    serverFromBackend OpenAPIBackend{..} =
      (coerce getMinecraftVersionManifest :<|>
       coerce getMinecraftVersionPackageInfo :<|>
       serveDirectoryFileServer "static")


serverContext :: Context ('[])
serverContext = EmptyContext
