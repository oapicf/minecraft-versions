/*
 * SDK for Minecraft versions info
 *
 * The version of the OpenAPI document: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://openapi-generator.tech
 */

use crate::models;
use serde::{Deserialize, Serialize};

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct VersionPackageInfo {
    #[serde(rename = "version", skip_serializing_if = "Option::is_none")]
    pub version: Option<String>,
    #[serde(rename = "assetIndex", skip_serializing_if = "Option::is_none")]
    pub asset_index: Option<Box<models::VersionPackageInfoAssetIndex>>,
    #[serde(rename = "assets", skip_serializing_if = "Option::is_none")]
    pub assets: Option<String>,
    #[serde(rename = "complianceLevel", skip_serializing_if = "Option::is_none")]
    pub compliance_level: Option<i32>,
    #[serde(rename = "downloads", skip_serializing_if = "Option::is_none")]
    pub downloads: Option<Box<models::VersionPackageInfoDownloads>>,
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<String>,
    #[serde(rename = "javaVersion", skip_serializing_if = "Option::is_none")]
    pub java_version: Option<Box<models::VersionPackageInfoJavaVersion>>,
    #[serde(rename = "mainClass", skip_serializing_if = "Option::is_none")]
    pub main_class: Option<String>,
    #[serde(rename = "minimumLauncherVersion", skip_serializing_if = "Option::is_none")]
    pub minimum_launcher_version: Option<i32>,
    #[serde(rename = "time", skip_serializing_if = "Option::is_none")]
    pub time: Option<String>,
    #[serde(rename = "releaseTime", skip_serializing_if = "Option::is_none")]
    pub release_time: Option<String>,
    #[serde(rename = "type", skip_serializing_if = "Option::is_none")]
    pub r#type: Option<String>,
}

impl VersionPackageInfo {
    pub fn new() -> VersionPackageInfo {
        VersionPackageInfo {
            version: None,
            asset_index: None,
            assets: None,
            compliance_level: None,
            downloads: None,
            id: None,
            java_version: None,
            main_class: None,
            minimum_launcher_version: None,
            time: None,
            release_time: None,
            r#type: None,
        }
    }
}

