{-# LANGUAGE GeneralizedNewtypeDeriving #-}
{-# LANGUAGE DeriveGeneric              #-}
{-# LANGUAGE NoImplicitPrelude          #-}
{-# OPTIONS_GHC -fno-warn-unused-binds -fno-warn-unused-imports #-}

module API.Types (
  Download (..),
  Version (..),
  VersionManifest (..),
  VersionManifestLatest (..),
  VersionPackageInfo (..),
  VersionPackageInfoAssetIndex (..),
  VersionPackageInfoDownloads (..),
  VersionPackageInfoJavaVersion (..),
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
data Download = Download
  { downloadSha1 :: Maybe Text -- ^ 
  , downloadSize :: Maybe Int -- ^ 
  , downloadUrl :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON Download where
  parseJSON = genericParseJSON optionsDownload
instance ToJSON Download where
  toJSON = genericToJSON optionsDownload

optionsDownload :: Options
optionsDownload =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
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
  } deriving (Show, Eq, Generic)

instance FromJSON Version where
  parseJSON = genericParseJSON optionsVersion
instance ToJSON Version where
  toJSON = genericToJSON optionsVersion

optionsVersion :: Options
optionsVersion =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
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
  } deriving (Show, Eq, Generic)

instance FromJSON VersionManifest where
  parseJSON = genericParseJSON optionsVersionManifest
instance ToJSON VersionManifest where
  toJSON = genericToJSON optionsVersionManifest

optionsVersionManifest :: Options
optionsVersionManifest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
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
  } deriving (Show, Eq, Generic)

instance FromJSON VersionManifestLatest where
  parseJSON = genericParseJSON optionsVersionManifestLatest
instance ToJSON VersionManifestLatest where
  toJSON = genericToJSON optionsVersionManifestLatest

optionsVersionManifestLatest :: Options
optionsVersionManifestLatest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
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
  , versionPackageInfoAssets :: Maybe Int -- ^ 
  , versionPackageInfoComplianceLevel :: Maybe Int -- ^ 
  , versionPackageInfoDownloads :: Maybe VersionPackageInfoDownloads -- ^ 
  , versionPackageInfoId :: Maybe Text -- ^ 
  , versionPackageInfoJavaVersion :: Maybe VersionPackageInfoJavaVersion -- ^ 
  , versionPackageInfoMainClass :: Maybe Text -- ^ 
  , versionPackageInfoMinimumLauncherVersion :: Maybe Int -- ^ 
  , versionPackageInfoTime :: Maybe UTCTime -- ^ 
  , versionPackageInfoReleaseTime :: Maybe UTCTime -- ^ 
  , versionPackageInfoType :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON VersionPackageInfo where
  parseJSON = genericParseJSON optionsVersionPackageInfo
instance ToJSON VersionPackageInfo where
  toJSON = genericToJSON optionsVersionPackageInfo

optionsVersionPackageInfo :: Options
optionsVersionPackageInfo =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
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
  } deriving (Show, Eq, Generic)

instance FromJSON VersionPackageInfoAssetIndex where
  parseJSON = genericParseJSON optionsVersionPackageInfoAssetIndex
instance ToJSON VersionPackageInfoAssetIndex where
  toJSON = genericToJSON optionsVersionPackageInfoAssetIndex

optionsVersionPackageInfoAssetIndex :: Options
optionsVersionPackageInfoAssetIndex =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
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
  } deriving (Show, Eq, Generic)

instance FromJSON VersionPackageInfoDownloads where
  parseJSON = genericParseJSON optionsVersionPackageInfoDownloads
instance ToJSON VersionPackageInfoDownloads where
  toJSON = genericToJSON optionsVersionPackageInfoDownloads

optionsVersionPackageInfoDownloads :: Options
optionsVersionPackageInfoDownloads =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
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
  } deriving (Show, Eq, Generic)

instance FromJSON VersionPackageInfoJavaVersion where
  parseJSON = genericParseJSON optionsVersionPackageInfoJavaVersion
instance ToJSON VersionPackageInfoJavaVersion where
  toJSON = genericToJSON optionsVersionPackageInfoJavaVersion

optionsVersionPackageInfoJavaVersion :: Options
optionsVersionPackageInfoJavaVersion =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("versionPackageInfoJavaVersionComponent", "component")
      , ("versionPackageInfoJavaVersionMajorVersion", "majorVersion")
      ]

