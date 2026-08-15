{-# LANGUAGE GeneralizedNewtypeDeriving #-}
{-# LANGUAGE DeriveDataTypeable         #-}
{-# LANGUAGE DeriveGeneric              #-}
{-# LANGUAGE DuplicateRecordFields      #-}
{-# OPTIONS_GHC -fno-warn-unused-binds -fno-warn-unused-imports #-}

module OpenAPI.Types (
  Download (..),
  Version (..),
  VersionManifest (..),
  VersionManifestLatest (..),
  VersionPackageInfo (..),
  VersionPackageInfoAssetIndex (..),
  VersionPackageInfoDownloads (..),
  VersionPackageInfoJavaVersion (..),
  ) where

import Data.Data (Data)
import Data.UUID (UUID)
import Data.List (lookup)
import Data.Maybe (fromMaybe)
import Data.Aeson (Value, FromJSON(..), ToJSON(..), genericToJSON, genericParseJSON)
import Data.Aeson.Types (Options(..), defaultOptions)
import Data.Set (Set)
import Data.Text (Text)
import Data.Time
import Data.Swagger (ToSchema, declareNamedSchema)
import qualified Data.Swagger as Swagger
import qualified Data.Char as Char
import qualified Data.Text as T
import qualified Data.Map as Map
import GHC.Generics (Generic)


-- | 
data Download = Download
  { downloadSha1 :: Maybe Text -- ^ 
  , downloadSize :: Maybe Int -- ^ 
  , downloadUrl :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Download where
  parseJSON = genericParseJSON optionsDownload
instance ToJSON Download where
  toJSON = genericToJSON optionsDownload
instance ToSchema Download where
  declareNamedSchema = Swagger.genericDeclareNamedSchema
    $ Swagger.fromAesonOptions
    $ optionsDownload

optionsDownload :: Options
optionsDownload =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("downloadSha1", "sha1")
      , ("downloadSize", "size")
      , ("downloadUrl", "url")
      ]


-- | 
data Version = Version
  { versionId :: Maybe Text -- ^ 
  , versionType :: Maybe Text -- ^ 
  , versionUrl :: Maybe Text -- ^ 
  , versionTime :: Maybe UTCTime -- ^ 
  , versionReleaseTime :: Maybe UTCTime -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Version where
  parseJSON = genericParseJSON optionsVersion
instance ToJSON Version where
  toJSON = genericToJSON optionsVersion
instance ToSchema Version where
  declareNamedSchema = Swagger.genericDeclareNamedSchema
    $ Swagger.fromAesonOptions
    $ optionsVersion

optionsVersion :: Options
optionsVersion =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("versionId", "id")
      , ("versionType", "type")
      , ("versionUrl", "url")
      , ("versionTime", "time")
      , ("versionReleaseTime", "releaseTime")
      ]


-- | 
data VersionManifest = VersionManifest
  { versionManifestLatest :: Maybe VersionManifestLatest -- ^ 
  , versionManifestVersions :: Maybe [Version] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON VersionManifest where
  parseJSON = genericParseJSON optionsVersionManifest
instance ToJSON VersionManifest where
  toJSON = genericToJSON optionsVersionManifest
instance ToSchema VersionManifest where
  declareNamedSchema = Swagger.genericDeclareNamedSchema
    $ Swagger.fromAesonOptions
    $ optionsVersionManifest

optionsVersionManifest :: Options
optionsVersionManifest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("versionManifestLatest", "latest")
      , ("versionManifestVersions", "versions")
      ]


-- | 
data VersionManifestLatest = VersionManifestLatest
  { versionManifestLatestRelease :: Maybe Text -- ^ 
  , versionManifestLatestSnapshot :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON VersionManifestLatest where
  parseJSON = genericParseJSON optionsVersionManifestLatest
instance ToJSON VersionManifestLatest where
  toJSON = genericToJSON optionsVersionManifestLatest
instance ToSchema VersionManifestLatest where
  declareNamedSchema = Swagger.genericDeclareNamedSchema
    $ Swagger.fromAesonOptions
    $ optionsVersionManifestLatest

optionsVersionManifestLatest :: Options
optionsVersionManifestLatest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("versionManifestLatestRelease", "release")
      , ("versionManifestLatestSnapshot", "snapshot")
      ]


-- | 
data VersionPackageInfo = VersionPackageInfo
  { versionPackageInfoVersion :: Maybe Text -- ^ 
  , versionPackageInfoAssetIndex :: Maybe VersionPackageInfoAssetIndex -- ^ 
  , versionPackageInfoAssets :: Maybe Text -- ^ 
  , versionPackageInfoComplianceLevel :: Maybe Int -- ^ 
  , versionPackageInfoDownloads :: Maybe VersionPackageInfoDownloads -- ^ 
  , versionPackageInfoId :: Maybe Text -- ^ 
  , versionPackageInfoJavaVersion :: Maybe VersionPackageInfoJavaVersion -- ^ 
  , versionPackageInfoMainClass :: Maybe Text -- ^ 
  , versionPackageInfoMinimumLauncherVersion :: Maybe Int -- ^ 
  , versionPackageInfoTime :: Maybe UTCTime -- ^ 
  , versionPackageInfoReleaseTime :: Maybe UTCTime -- ^ 
  , versionPackageInfoType :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON VersionPackageInfo where
  parseJSON = genericParseJSON optionsVersionPackageInfo
instance ToJSON VersionPackageInfo where
  toJSON = genericToJSON optionsVersionPackageInfo
instance ToSchema VersionPackageInfo where
  declareNamedSchema = Swagger.genericDeclareNamedSchema
    $ Swagger.fromAesonOptions
    $ optionsVersionPackageInfo

optionsVersionPackageInfo :: Options
optionsVersionPackageInfo =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("versionPackageInfoVersion", "version")
      , ("versionPackageInfoAssetIndex", "assetIndex")
      , ("versionPackageInfoAssets", "assets")
      , ("versionPackageInfoComplianceLevel", "complianceLevel")
      , ("versionPackageInfoDownloads", "downloads")
      , ("versionPackageInfoId", "id")
      , ("versionPackageInfoJavaVersion", "javaVersion")
      , ("versionPackageInfoMainClass", "mainClass")
      , ("versionPackageInfoMinimumLauncherVersion", "minimumLauncherVersion")
      , ("versionPackageInfoTime", "time")
      , ("versionPackageInfoReleaseTime", "releaseTime")
      , ("versionPackageInfoType", "type")
      ]


-- | 
data VersionPackageInfoAssetIndex = VersionPackageInfoAssetIndex
  { versionPackageInfoAssetIndexId :: Maybe Text -- ^ 
  , versionPackageInfoAssetIndexSha1 :: Maybe Text -- ^ 
  , versionPackageInfoAssetIndexSize :: Maybe Int -- ^ 
  , versionPackageInfoAssetIndexTotalSize :: Maybe Int -- ^ 
  , versionPackageInfoAssetIndexUrl :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON VersionPackageInfoAssetIndex where
  parseJSON = genericParseJSON optionsVersionPackageInfoAssetIndex
instance ToJSON VersionPackageInfoAssetIndex where
  toJSON = genericToJSON optionsVersionPackageInfoAssetIndex
instance ToSchema VersionPackageInfoAssetIndex where
  declareNamedSchema = Swagger.genericDeclareNamedSchema
    $ Swagger.fromAesonOptions
    $ optionsVersionPackageInfoAssetIndex

optionsVersionPackageInfoAssetIndex :: Options
optionsVersionPackageInfoAssetIndex =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("versionPackageInfoAssetIndexId", "id")
      , ("versionPackageInfoAssetIndexSha1", "sha1")
      , ("versionPackageInfoAssetIndexSize", "size")
      , ("versionPackageInfoAssetIndexTotalSize", "totalSize")
      , ("versionPackageInfoAssetIndexUrl", "url")
      ]


-- | 
data VersionPackageInfoDownloads = VersionPackageInfoDownloads
  { versionPackageInfoDownloadsClient :: Maybe Download -- ^ 
  , versionPackageInfoDownloadsClientUnderscoremappings :: Maybe Download -- ^ 
  , versionPackageInfoDownloadsServer :: Maybe Download -- ^ 
  , versionPackageInfoDownloadsServerUnderscoremappings :: Maybe Download -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON VersionPackageInfoDownloads where
  parseJSON = genericParseJSON optionsVersionPackageInfoDownloads
instance ToJSON VersionPackageInfoDownloads where
  toJSON = genericToJSON optionsVersionPackageInfoDownloads
instance ToSchema VersionPackageInfoDownloads where
  declareNamedSchema = Swagger.genericDeclareNamedSchema
    $ Swagger.fromAesonOptions
    $ optionsVersionPackageInfoDownloads

optionsVersionPackageInfoDownloads :: Options
optionsVersionPackageInfoDownloads =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("versionPackageInfoDownloadsClient", "client")
      , ("versionPackageInfoDownloadsClientUnderscoremappings", "client_mappings")
      , ("versionPackageInfoDownloadsServer", "server")
      , ("versionPackageInfoDownloadsServerUnderscoremappings", "server_mappings")
      ]


-- | 
data VersionPackageInfoJavaVersion = VersionPackageInfoJavaVersion
  { versionPackageInfoJavaVersionComponent :: Maybe Text -- ^ 
  , versionPackageInfoJavaVersionMajorVersion :: Maybe Int -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON VersionPackageInfoJavaVersion where
  parseJSON = genericParseJSON optionsVersionPackageInfoJavaVersion
instance ToJSON VersionPackageInfoJavaVersion where
  toJSON = genericToJSON optionsVersionPackageInfoJavaVersion
instance ToSchema VersionPackageInfoJavaVersion where
  declareNamedSchema = Swagger.genericDeclareNamedSchema
    $ Swagger.fromAesonOptions
    $ optionsVersionPackageInfoJavaVersion

optionsVersionPackageInfoJavaVersion :: Options
optionsVersionPackageInfoJavaVersion =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("versionPackageInfoJavaVersionComponent", "component")
      , ("versionPackageInfoJavaVersionMajorVersion", "majorVersion")
      ]

