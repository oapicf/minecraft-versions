use async_trait::async_trait;
use axum::extract::*;
use axum_extra::extract::{CookieJar, Multipart};
use bytes::Bytes;
use http::Method;
use serde::{Deserialize, Serialize};

use crate::{models, types::*};

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GetMinecraftVersionManifestResponse {
    /// A list of Minecraft versions with the latest and snapshot releases
    Status200_AListOfMinecraftVersionsWithTheLatestAndSnapshotReleases
    (models::GetMinecraftVersionManifest200Response)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum V1PackagesPackageIdVersionIdJsonGetResponse {
    /// Get package version details
    Status200_GetPackageVersionDetails
    (models::V1PackagesPackageIdVersionIdJsonGet200Response)
}


/// Default
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Default {
    /// Get Minecraft version manifest.
    ///
    /// GetMinecraftVersionManifest - GET /mc/game/version_manifest.json
    async fn get_minecraft_version_manifest(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
    ) -> Result<GetMinecraftVersionManifestResponse, String>;

    /// Get Minecraft version package details.
    ///
    /// V1PackagesPackageIdVersionIdJsonGet - GET /v1/packages/{packageId}/{versionId}.json
    async fn v1_packages_package_id_version_id_json_get(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::V1PackagesPackageIdVersionIdJsonGetPathParams,
    ) -> Result<V1PackagesPackageIdVersionIdJsonGetResponse, String>;
}
