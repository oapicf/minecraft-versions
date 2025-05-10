use async_trait::async_trait;
use axum::extract::*;
use axum_extra::extract::{CookieJar, Host};
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
    (models::VersionManifest)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GetMinecraftVersionPackageInfoResponse {
    /// Get package version details
    Status200_GetPackageVersionDetails
    (models::VersionPackageInfo)
}


/// Default
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Default<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    /// Get Minecraft version manifest.
    ///
    /// GetMinecraftVersionManifest - GET /mc/game/version_manifest.json
    async fn get_minecraft_version_manifest(
    &self,
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
    ) -> Result<GetMinecraftVersionManifestResponse, E>;

    /// Get Minecraft version package info.
    ///
    /// GetMinecraftVersionPackageInfo - GET /v1/packages/{packageId}/{versionId}.json
    async fn get_minecraft_version_package_info(
    &self,
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::GetMinecraftVersionPackageInfoPathParams,
    ) -> Result<GetMinecraftVersionPackageInfoResponse, E>;
}
