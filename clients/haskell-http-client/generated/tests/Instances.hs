{-# LANGUAGE CPP #-}
{-# OPTIONS_GHC -fno-warn-unused-imports -fno-warn-unused-matches #-}

module Instances where

import OpenAPI.Model
import OpenAPI.Core

import qualified Data.Aeson as A
import qualified Data.ByteString.Lazy as BL
import qualified Data.HashMap.Strict as HM
import qualified Data.Set as Set
import qualified Data.Text as T
import qualified Data.Time as TI
import qualified Data.Vector as V
import Data.String (fromString)

import Control.Monad
import Data.Char (isSpace)
import Data.List (sort)
import Test.QuickCheck

import ApproxEq

instance Arbitrary T.Text where
  arbitrary = T.pack <$> arbitrary

instance Arbitrary TI.Day where
  arbitrary = TI.ModifiedJulianDay . (2000 +) <$> arbitrary
  shrink = (TI.ModifiedJulianDay <$>) . shrink . TI.toModifiedJulianDay

instance Arbitrary TI.UTCTime where
  arbitrary =
    TI.UTCTime <$> arbitrary <*> (TI.secondsToDiffTime <$> choose (0, 86401))

instance Arbitrary BL.ByteString where
    arbitrary = BL.pack <$> arbitrary
    shrink xs = BL.pack <$> shrink (BL.unpack xs)

instance Arbitrary ByteArray where
    arbitrary = ByteArray <$> arbitrary
    shrink (ByteArray xs) = ByteArray <$> shrink xs

instance Arbitrary Binary where
    arbitrary = Binary <$> arbitrary
    shrink (Binary xs) = Binary <$> shrink xs

instance Arbitrary DateTime where
    arbitrary = DateTime <$> arbitrary
    shrink (DateTime xs) = DateTime <$> shrink xs

instance Arbitrary Date where
    arbitrary = Date <$> arbitrary
    shrink (Date xs) = Date <$> shrink xs

#if MIN_VERSION_aeson(2,0,0)
#else
-- | A naive Arbitrary instance for A.Value:
instance Arbitrary A.Value where
  arbitrary = arbitraryValue
#endif

arbitraryValue :: Gen A.Value
arbitraryValue =
  frequency [(3, simpleTypes), (1, arrayTypes), (1, objectTypes)]
    where
      simpleTypes :: Gen A.Value
      simpleTypes =
        frequency
          [ (1, return A.Null)
          , (2, liftM A.Bool (arbitrary :: Gen Bool))
          , (2, liftM (A.Number . fromIntegral) (arbitrary :: Gen Int))
          , (2, liftM (A.String . T.pack) (arbitrary :: Gen String))
          ]
      mapF (k, v) = (fromString k, v)
      simpleAndArrays = frequency [(1, sized sizedArray), (4, simpleTypes)]
      arrayTypes = sized sizedArray
      objectTypes = sized sizedObject
      sizedArray n = liftM (A.Array . V.fromList) $ replicateM n simpleTypes
      sizedObject n =
        liftM (A.object . map mapF) $
        replicateM n $ (,) <$> (arbitrary :: Gen String) <*> simpleAndArrays

-- | Checks if a given list has no duplicates in _O(n log n)_.
hasNoDups
  :: (Ord a)
  => [a] -> Bool
hasNoDups = go Set.empty
  where
    go _ [] = True
    go s (x:xs)
      | s' <- Set.insert x s
      , Set.size s' > Set.size s = go s' xs
      | otherwise = False

instance ApproxEq TI.Day where
  (=~) = (==)

arbitraryReduced :: Arbitrary a => Int -> Gen a
arbitraryReduced n = resize (n `div` 2) arbitrary

arbitraryReducedMaybe :: Arbitrary a => Int -> Gen (Maybe a)
arbitraryReducedMaybe 0 = elements [Nothing]
arbitraryReducedMaybe n = arbitraryReduced n

arbitraryReducedMaybeValue :: Int -> Gen (Maybe A.Value)
arbitraryReducedMaybeValue 0 = elements [Nothing]
arbitraryReducedMaybeValue n = do
  generated <- arbitraryReduced n
  if generated == Just A.Null
    then return Nothing
    else return generated

-- * Models

instance Arbitrary Download where
  arbitrary = sized genDownload

genDownload :: Int -> Gen Download
genDownload n =
  Download
    <$> arbitraryReducedMaybe n -- downloadSha1 :: Maybe Text
    <*> arbitraryReducedMaybe n -- downloadSize :: Maybe Int
    <*> arbitraryReducedMaybe n -- downloadUrl :: Maybe Text
  
instance Arbitrary Version where
  arbitrary = sized genVersion

genVersion :: Int -> Gen Version
genVersion n =
  Version
    <$> arbitraryReducedMaybe n -- versionId :: Maybe Text
    <*> arbitraryReducedMaybe n -- versionType :: Maybe Text
    <*> arbitraryReducedMaybe n -- versionUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- versionTime :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- versionReleaseTime :: Maybe DateTime
  
instance Arbitrary VersionManifest where
  arbitrary = sized genVersionManifest

genVersionManifest :: Int -> Gen VersionManifest
genVersionManifest n =
  VersionManifest
    <$> arbitraryReducedMaybe n -- versionManifestLatest :: Maybe VersionManifestLatest
    <*> arbitraryReducedMaybe n -- versionManifestVersions :: Maybe [Version]
  
instance Arbitrary VersionManifestLatest where
  arbitrary = sized genVersionManifestLatest

genVersionManifestLatest :: Int -> Gen VersionManifestLatest
genVersionManifestLatest n =
  VersionManifestLatest
    <$> arbitraryReducedMaybe n -- versionManifestLatestRelease :: Maybe Text
    <*> arbitraryReducedMaybe n -- versionManifestLatestSnapshot :: Maybe Text
  
instance Arbitrary VersionPackageInfo where
  arbitrary = sized genVersionPackageInfo

genVersionPackageInfo :: Int -> Gen VersionPackageInfo
genVersionPackageInfo n =
  VersionPackageInfo
    <$> arbitraryReducedMaybe n -- versionPackageInfoVersion :: Maybe Text
    <*> arbitraryReducedMaybe n -- versionPackageInfoAssetIndex :: Maybe VersionPackageInfoAssetIndex
    <*> arbitraryReducedMaybe n -- versionPackageInfoAssets :: Maybe Text
    <*> arbitraryReducedMaybe n -- versionPackageInfoComplianceLevel :: Maybe Int
    <*> arbitraryReducedMaybe n -- versionPackageInfoDownloads :: Maybe VersionPackageInfoDownloads
    <*> arbitraryReducedMaybe n -- versionPackageInfoId :: Maybe Text
    <*> arbitraryReducedMaybe n -- versionPackageInfoJavaVersion :: Maybe VersionPackageInfoJavaVersion
    <*> arbitraryReducedMaybe n -- versionPackageInfoMainClass :: Maybe Text
    <*> arbitraryReducedMaybe n -- versionPackageInfoMinimumLauncherVersion :: Maybe Int
    <*> arbitraryReducedMaybe n -- versionPackageInfoTime :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- versionPackageInfoReleaseTime :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- versionPackageInfoType :: Maybe Text
  
instance Arbitrary VersionPackageInfoAssetIndex where
  arbitrary = sized genVersionPackageInfoAssetIndex

genVersionPackageInfoAssetIndex :: Int -> Gen VersionPackageInfoAssetIndex
genVersionPackageInfoAssetIndex n =
  VersionPackageInfoAssetIndex
    <$> arbitraryReducedMaybe n -- versionPackageInfoAssetIndexId :: Maybe Text
    <*> arbitraryReducedMaybe n -- versionPackageInfoAssetIndexSha1 :: Maybe Text
    <*> arbitraryReducedMaybe n -- versionPackageInfoAssetIndexSize :: Maybe Int
    <*> arbitraryReducedMaybe n -- versionPackageInfoAssetIndexTotalSize :: Maybe Int
    <*> arbitraryReducedMaybe n -- versionPackageInfoAssetIndexUrl :: Maybe Text
  
instance Arbitrary VersionPackageInfoDownloads where
  arbitrary = sized genVersionPackageInfoDownloads

genVersionPackageInfoDownloads :: Int -> Gen VersionPackageInfoDownloads
genVersionPackageInfoDownloads n =
  VersionPackageInfoDownloads
    <$> arbitraryReducedMaybe n -- versionPackageInfoDownloadsClient :: Maybe Download
    <*> arbitraryReducedMaybe n -- versionPackageInfoDownloadsClientMappings :: Maybe Download
    <*> arbitraryReducedMaybe n -- versionPackageInfoDownloadsServer :: Maybe Download
    <*> arbitraryReducedMaybe n -- versionPackageInfoDownloadsServerMappings :: Maybe Download
  
instance Arbitrary VersionPackageInfoJavaVersion where
  arbitrary = sized genVersionPackageInfoJavaVersion

genVersionPackageInfoJavaVersion :: Int -> Gen VersionPackageInfoJavaVersion
genVersionPackageInfoJavaVersion n =
  VersionPackageInfoJavaVersion
    <$> arbitraryReducedMaybe n -- versionPackageInfoJavaVersionComponent :: Maybe Text
    <*> arbitraryReducedMaybe n -- versionPackageInfoJavaVersionMajorVersion :: Maybe Int
  



