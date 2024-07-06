{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Default where

import           Import


-- | Get Minecraft version manifest
--
-- operationId: getMinecraftVersionManifest
getMcGameVersionManifestJsonR :: Handler Value
getMcGameVersionManifestJsonR = notImplemented

-- | Get Minecraft version package details
--
-- operationId: v1PackagesPackageIdVersionIdJsonGet
getV1PackagesByText{VersionId}JsonR :: Text -- ^ 
                                    -> Text -- ^ 
                                    -> Handler Value
getV1PackagesByText{VersionId}JsonR packageId versionId = notImplemented
