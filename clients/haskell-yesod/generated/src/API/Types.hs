{-# LANGUAGE GeneralizedNewtypeDeriving #-}
{-# LANGUAGE DeriveGeneric              #-}
{-# LANGUAGE NoImplicitPrelude          #-}
{-# OPTIONS_GHC -fno-warn-unused-binds -fno-warn-unused-imports #-}

module API.Types (
  GetMinecraftVersionManifest200Response (..),
  GetMinecraftVersionManifest200ResponseLatest (..),
  GetMinecraftVersionManifest200ResponseVersionsInner (..),
  V1PackagesPackageIdVersionIdJsonGet200Response (..),
  V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex (..),
  V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads (..),
  V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient (..),
  V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion (..),
  ) where

import ClassyPrelude.Yesod
import Data.Foldable (foldl)
import qualified Data.List as List
import Data.Maybe (fromMaybe)
import Data.Aeson (Value, FromJSON(..), ToJSON(..), genericToJSON, genericParseJSON)
import Data.Aeson.Types (Options(..), defaultOptions)
import qualified Data.Char as Char
import qualified Data.Text as T
import qualified Data.Map as Map
import GHC.Generics (Generic)


-- | 
data GetMinecraftVersionManifest200Response = GetMinecraftVersionManifest200Response
  { getMinecraftVersionManifest200ResponseLatest :: Maybe GetMinecraftVersionManifest200ResponseLatest -- ^ 
  , getMinecraftVersionManifest200ResponseVersions :: Maybe [GetMinecraftVersionManifest200ResponseVersionsInner] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetMinecraftVersionManifest200Response where
  parseJSON = genericParseJSON optionsGetMinecraftVersionManifest200Response
instance ToJSON GetMinecraftVersionManifest200Response where
  toJSON = genericToJSON optionsGetMinecraftVersionManifest200Response

optionsGetMinecraftVersionManifest200Response :: Options
optionsGetMinecraftVersionManifest200Response =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getMinecraftVersionManifest200ResponseLatest", "latest")
      , ("getMinecraftVersionManifest200ResponseVersions", "versions")
      ]


-- | 
data GetMinecraftVersionManifest200ResponseLatest = GetMinecraftVersionManifest200ResponseLatest
  { getMinecraftVersionManifest200ResponseLatestRelease :: Maybe Text -- ^ 
  , getMinecraftVersionManifest200ResponseLatestSnapshot :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetMinecraftVersionManifest200ResponseLatest where
  parseJSON = genericParseJSON optionsGetMinecraftVersionManifest200ResponseLatest
instance ToJSON GetMinecraftVersionManifest200ResponseLatest where
  toJSON = genericToJSON optionsGetMinecraftVersionManifest200ResponseLatest

optionsGetMinecraftVersionManifest200ResponseLatest :: Options
optionsGetMinecraftVersionManifest200ResponseLatest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getMinecraftVersionManifest200ResponseLatestRelease", "release")
      , ("getMinecraftVersionManifest200ResponseLatestSnapshot", "snapshot")
      ]


-- | 
data GetMinecraftVersionManifest200ResponseVersionsInner = GetMinecraftVersionManifest200ResponseVersionsInner
  { getMinecraftVersionManifest200ResponseVersionsInnerId :: Maybe Text -- ^ 
  , getMinecraftVersionManifest200ResponseVersionsInnerType :: Maybe Text -- ^ 
  , getMinecraftVersionManifest200ResponseVersionsInnerUrl :: Maybe Text -- ^ 
  , getMinecraftVersionManifest200ResponseVersionsInnerTime :: Maybe UTCTime -- ^ 
  , getMinecraftVersionManifest200ResponseVersionsInnerReleaseTime :: Maybe UTCTime -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetMinecraftVersionManifest200ResponseVersionsInner where
  parseJSON = genericParseJSON optionsGetMinecraftVersionManifest200ResponseVersionsInner
instance ToJSON GetMinecraftVersionManifest200ResponseVersionsInner where
  toJSON = genericToJSON optionsGetMinecraftVersionManifest200ResponseVersionsInner

optionsGetMinecraftVersionManifest200ResponseVersionsInner :: Options
optionsGetMinecraftVersionManifest200ResponseVersionsInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getMinecraftVersionManifest200ResponseVersionsInnerId", "id")
      , ("getMinecraftVersionManifest200ResponseVersionsInnerType", "type")
      , ("getMinecraftVersionManifest200ResponseVersionsInnerUrl", "url")
      , ("getMinecraftVersionManifest200ResponseVersionsInnerTime", "time")
      , ("getMinecraftVersionManifest200ResponseVersionsInnerReleaseTime", "releaseTime")
      ]


-- | 
data V1PackagesPackageIdVersionIdJsonGet200Response = V1PackagesPackageIdVersionIdJsonGet200Response
  { v1PackagesPackageIdVersionIdJsonGet200ResponseVersion :: Maybe Text -- ^ 
  , v1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex :: Maybe V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex -- ^ 
  , v1PackagesPackageIdVersionIdJsonGet200ResponseAssets :: Maybe Int -- ^ 
  , v1PackagesPackageIdVersionIdJsonGet200ResponseComplianceLevel :: Maybe Int -- ^ 
  , v1PackagesPackageIdVersionIdJsonGet200ResponseDownloads :: Maybe V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads -- ^ 
  , v1PackagesPackageIdVersionIdJsonGet200ResponseId :: Maybe Text -- ^ 
  , v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion :: Maybe V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion -- ^ 
  , v1PackagesPackageIdVersionIdJsonGet200ResponseMainClass :: Maybe Text -- ^ 
  , v1PackagesPackageIdVersionIdJsonGet200ResponseMinimumLauncherVersion :: Maybe Int -- ^ 
  , v1PackagesPackageIdVersionIdJsonGet200ResponseTime :: Maybe UTCTime -- ^ 
  , v1PackagesPackageIdVersionIdJsonGet200ResponseReleaseTime :: Maybe UTCTime -- ^ 
  , v1PackagesPackageIdVersionIdJsonGet200ResponseType :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON V1PackagesPackageIdVersionIdJsonGet200Response where
  parseJSON = genericParseJSON optionsV1PackagesPackageIdVersionIdJsonGet200Response
instance ToJSON V1PackagesPackageIdVersionIdJsonGet200Response where
  toJSON = genericToJSON optionsV1PackagesPackageIdVersionIdJsonGet200Response

optionsV1PackagesPackageIdVersionIdJsonGet200Response :: Options
optionsV1PackagesPackageIdVersionIdJsonGet200Response =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("v1PackagesPackageIdVersionIdJsonGet200ResponseVersion", "version")
      , ("v1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex", "assetIndex")
      , ("v1PackagesPackageIdVersionIdJsonGet200ResponseAssets", "assets")
      , ("v1PackagesPackageIdVersionIdJsonGet200ResponseComplianceLevel", "complianceLevel")
      , ("v1PackagesPackageIdVersionIdJsonGet200ResponseDownloads", "downloads")
      , ("v1PackagesPackageIdVersionIdJsonGet200ResponseId", "id")
      , ("v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion", "javaVersion")
      , ("v1PackagesPackageIdVersionIdJsonGet200ResponseMainClass", "mainClass")
      , ("v1PackagesPackageIdVersionIdJsonGet200ResponseMinimumLauncherVersion", "minimumLauncherVersion")
      , ("v1PackagesPackageIdVersionIdJsonGet200ResponseTime", "time")
      , ("v1PackagesPackageIdVersionIdJsonGet200ResponseReleaseTime", "releaseTime")
      , ("v1PackagesPackageIdVersionIdJsonGet200ResponseType", "type")
      ]


-- | 
data V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex = V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex
  { v1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndexId :: Maybe Text -- ^ 
  , v1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndexSha1 :: Maybe Text -- ^ 
  , v1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndexSize :: Maybe Int -- ^ 
  , v1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndexTotalSize :: Maybe Int -- ^ 
  , v1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndexUrl :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex where
  parseJSON = genericParseJSON optionsV1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex
instance ToJSON V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex where
  toJSON = genericToJSON optionsV1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex

optionsV1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex :: Options
optionsV1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("v1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndexId", "id")
      , ("v1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndexSha1", "sha1")
      , ("v1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndexSize", "size")
      , ("v1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndexTotalSize", "totalSize")
      , ("v1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndexUrl", "url")
      ]


-- | 
data V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads = V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads
  { v1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient :: Maybe V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient -- ^ 
  , v1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClientUnderscoremappings :: Maybe V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient -- ^ 
  , v1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsServer :: Maybe V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient -- ^ 
  , v1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsServerUnderscoremappings :: Maybe V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads where
  parseJSON = genericParseJSON optionsV1PackagesPackageIdVersionIdJsonGet200ResponseDownloads
instance ToJSON V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads where
  toJSON = genericToJSON optionsV1PackagesPackageIdVersionIdJsonGet200ResponseDownloads

optionsV1PackagesPackageIdVersionIdJsonGet200ResponseDownloads :: Options
optionsV1PackagesPackageIdVersionIdJsonGet200ResponseDownloads =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("v1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient", "client")
      , ("v1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClientUnderscoremappings", "client_mappings")
      , ("v1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsServer", "server")
      , ("v1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsServerUnderscoremappings", "server_mappings")
      ]


-- | 
data V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient = V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient
  { v1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClientSha1 :: Maybe Text -- ^ 
  , v1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClientSize :: Maybe Int -- ^ 
  , v1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClientUrl :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient where
  parseJSON = genericParseJSON optionsV1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient
instance ToJSON V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient where
  toJSON = genericToJSON optionsV1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient

optionsV1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient :: Options
optionsV1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("v1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClientSha1", "sha1")
      , ("v1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClientSize", "size")
      , ("v1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClientUrl", "url")
      ]


-- | 
data V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion = V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion
  { v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersionComponent :: Maybe Text -- ^ 
  , v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersionMajorVersion :: Maybe Int -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion where
  parseJSON = genericParseJSON optionsV1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion
instance ToJSON V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion where
  toJSON = genericToJSON optionsV1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion

optionsV1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion :: Options
optionsV1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersionComponent", "component")
      , ("v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersionMajorVersion", "majorVersion")
      ]

