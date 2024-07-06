{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.DefaultSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getMcGameVersionManifestR" $
        it "returns 501 Not Implemented" $ do
            get McGameVersionManifestR
            statusIs 501

    describe "getV1PackagesByText{VersionId}JsonR" $
        it "returns 501 Not Implemented" $ do
            get $ V1PackagesByText{VersionId}JsonR "177e49d3233cb6eac42f0495c0a48e719870c2ae" "1.21"
            statusIs 501
