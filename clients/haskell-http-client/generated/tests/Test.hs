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
      propMimeEq MimeJSON (Proxy :: Proxy McGameVersionManifestGet200Response)
      propMimeEq MimeJSON (Proxy :: Proxy McGameVersionManifestGet200ResponseLatest)
      propMimeEq MimeJSON (Proxy :: Proxy McGameVersionManifestGet200ResponseVersionsInner)
      propMimeEq MimeJSON (Proxy :: Proxy V1PackagesPackageIdVersionIdJsonGet200Response)
      propMimeEq MimeJSON (Proxy :: Proxy V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex)
      propMimeEq MimeJSON (Proxy :: Proxy V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads)
      propMimeEq MimeJSON (Proxy :: Proxy V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient)
      propMimeEq MimeJSON (Proxy :: Proxy V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion)
      
