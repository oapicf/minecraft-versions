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
pub struct V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex {
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<String>,
    #[serde(rename = "sha1", skip_serializing_if = "Option::is_none")]
    pub sha1: Option<String>,
    #[serde(rename = "size", skip_serializing_if = "Option::is_none")]
    pub size: Option<i32>,
    #[serde(rename = "totalSize", skip_serializing_if = "Option::is_none")]
    pub total_size: Option<i32>,
    #[serde(rename = "url", skip_serializing_if = "Option::is_none")]
    pub url: Option<String>,
}

impl V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex {
    pub fn new() -> V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex {
        V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex {
            id: None,
            sha1: None,
            size: None,
            total_size: None,
            url: None,
        }
    }
}
