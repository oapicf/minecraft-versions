{-# LANGUAGE ScopedTypeVariables #-}
{-# LANGUAGE OverloadedStrings #-}
{-# LANGUAGE RecordWildCards #-}
{-# LANGUAGE PartialTypeSignatures #-}

module Main where

import Data.Typeable (Proxy(..))
import Test.Hspec
import Test.Hspec.QuickCheck

import PropMime
import Instances ()

import OpenAPI.Model
import OpenAPI.MimeTypes

main :: IO ()
main =
  hspec $ modifyMaxSize (const 10) $ do
    describe "JSON instances" $ do
      pure ()
      propMimeEq MimeJSON (Proxy :: Proxy Download)
      propMimeEq MimeJSON (Proxy :: Proxy Version)
      propMimeEq MimeJSON (Proxy :: Proxy VersionManifest)
      propMimeEq MimeJSON (Proxy :: Proxy VersionManifestLatest)
      propMimeEq MimeJSON (Proxy :: Proxy VersionPackageInfo)
      propMimeEq MimeJSON (Proxy :: Proxy VersionPackageInfoAssetIndex)
      propMimeEq MimeJSON (Proxy :: Proxy VersionPackageInfoDownloads)
      propMimeEq MimeJSON (Proxy :: Proxy VersionPackageInfoJavaVersion)
      
