#![allow(unused_qualifications)]

use http::HeaderValue;
use validator::Validate;

#[cfg(feature = "server")]
use crate::header;
use crate::{models, types::*};

      
      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct V1PackagesPackageIdVersionIdJsonGetPathParams {
                pub package_id: String,
                pub version_id: String,
    }







#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct McGameVersionManifestGet200Response {
    #[serde(rename = "latest")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub latest: Option<models::McGameVersionManifestGet200ResponseLatest>,

    #[serde(rename = "versions")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub versions: Option<Vec<models::McGameVersionManifestGet200ResponseVersionsInner>>,

}


impl McGameVersionManifestGet200Response {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new() -> McGameVersionManifestGet200Response {
        McGameVersionManifestGet200Response {
            latest: None,
            versions: None,
        }
    }
}

/// Converts the McGameVersionManifestGet200Response value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for McGameVersionManifestGet200Response {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![
            // Skipping latest in query parameter serialization

            // Skipping versions in query parameter serialization

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a McGameVersionManifestGet200Response value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for McGameVersionManifestGet200Response {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub latest: Vec<models::McGameVersionManifestGet200ResponseLatest>,
            pub versions: Vec<Vec<models::McGameVersionManifestGet200ResponseVersionsInner>>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing McGameVersionManifestGet200Response".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "latest" => intermediate_rep.latest.push(<models::McGameVersionManifestGet200ResponseLatest as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    "versions" => return std::result::Result::Err("Parsing a container in this style is not supported in McGameVersionManifestGet200Response".to_string()),
                    _ => return std::result::Result::Err("Unexpected key while parsing McGameVersionManifestGet200Response".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(McGameVersionManifestGet200Response {
            latest: intermediate_rep.latest.into_iter().next(),
            versions: intermediate_rep.versions.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<McGameVersionManifestGet200Response> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<McGameVersionManifestGet200Response>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<McGameVersionManifestGet200Response>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for McGameVersionManifestGet200Response - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<McGameVersionManifestGet200Response> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <McGameVersionManifestGet200Response as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into McGameVersionManifestGet200Response - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}







#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct McGameVersionManifestGet200ResponseLatest {
    #[serde(rename = "release")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub release: Option<String>,

    #[serde(rename = "snapshot")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub snapshot: Option<String>,

}


impl McGameVersionManifestGet200ResponseLatest {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new() -> McGameVersionManifestGet200ResponseLatest {
        McGameVersionManifestGet200ResponseLatest {
            release: None,
            snapshot: None,
        }
    }
}

/// Converts the McGameVersionManifestGet200ResponseLatest value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for McGameVersionManifestGet200ResponseLatest {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            self.release.as_ref().map(|release| {
                [
                    "release".to_string(),
                    release.to_string(),
                ].join(",")
            }),


            self.snapshot.as_ref().map(|snapshot| {
                [
                    "snapshot".to_string(),
                    snapshot.to_string(),
                ].join(",")
            }),

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a McGameVersionManifestGet200ResponseLatest value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for McGameVersionManifestGet200ResponseLatest {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub release: Vec<String>,
            pub snapshot: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing McGameVersionManifestGet200ResponseLatest".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "release" => intermediate_rep.release.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "snapshot" => intermediate_rep.snapshot.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing McGameVersionManifestGet200ResponseLatest".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(McGameVersionManifestGet200ResponseLatest {
            release: intermediate_rep.release.into_iter().next(),
            snapshot: intermediate_rep.snapshot.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<McGameVersionManifestGet200ResponseLatest> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<McGameVersionManifestGet200ResponseLatest>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<McGameVersionManifestGet200ResponseLatest>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for McGameVersionManifestGet200ResponseLatest - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<McGameVersionManifestGet200ResponseLatest> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <McGameVersionManifestGet200ResponseLatest as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into McGameVersionManifestGet200ResponseLatest - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}







#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct McGameVersionManifestGet200ResponseVersionsInner {
    #[serde(rename = "id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub id: Option<String>,

    #[serde(rename = "type")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub r#type: Option<String>,

    #[serde(rename = "url")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub url: Option<String>,

    #[serde(rename = "time")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub time: Option<chrono::DateTime::<chrono::Utc>>,

    #[serde(rename = "releaseTime")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub release_time: Option<chrono::DateTime::<chrono::Utc>>,

}


impl McGameVersionManifestGet200ResponseVersionsInner {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new() -> McGameVersionManifestGet200ResponseVersionsInner {
        McGameVersionManifestGet200ResponseVersionsInner {
            id: None,
            r#type: None,
            url: None,
            time: None,
            release_time: None,
        }
    }
}

/// Converts the McGameVersionManifestGet200ResponseVersionsInner value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for McGameVersionManifestGet200ResponseVersionsInner {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            self.id.as_ref().map(|id| {
                [
                    "id".to_string(),
                    id.to_string(),
                ].join(",")
            }),


            self.r#type.as_ref().map(|r#type| {
                [
                    "type".to_string(),
                    r#type.to_string(),
                ].join(",")
            }),


            self.url.as_ref().map(|url| {
                [
                    "url".to_string(),
                    url.to_string(),
                ].join(",")
            }),

            // Skipping time in query parameter serialization

            // Skipping releaseTime in query parameter serialization

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a McGameVersionManifestGet200ResponseVersionsInner value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for McGameVersionManifestGet200ResponseVersionsInner {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub id: Vec<String>,
            pub r#type: Vec<String>,
            pub url: Vec<String>,
            pub time: Vec<chrono::DateTime::<chrono::Utc>>,
            pub release_time: Vec<chrono::DateTime::<chrono::Utc>>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing McGameVersionManifestGet200ResponseVersionsInner".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "id" => intermediate_rep.id.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "type" => intermediate_rep.r#type.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "url" => intermediate_rep.url.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "time" => intermediate_rep.time.push(<chrono::DateTime::<chrono::Utc> as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "releaseTime" => intermediate_rep.release_time.push(<chrono::DateTime::<chrono::Utc> as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing McGameVersionManifestGet200ResponseVersionsInner".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(McGameVersionManifestGet200ResponseVersionsInner {
            id: intermediate_rep.id.into_iter().next(),
            r#type: intermediate_rep.r#type.into_iter().next(),
            url: intermediate_rep.url.into_iter().next(),
            time: intermediate_rep.time.into_iter().next(),
            release_time: intermediate_rep.release_time.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<McGameVersionManifestGet200ResponseVersionsInner> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<McGameVersionManifestGet200ResponseVersionsInner>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<McGameVersionManifestGet200ResponseVersionsInner>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for McGameVersionManifestGet200ResponseVersionsInner - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<McGameVersionManifestGet200ResponseVersionsInner> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <McGameVersionManifestGet200ResponseVersionsInner as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into McGameVersionManifestGet200ResponseVersionsInner - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}







#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct V1PackagesPackageIdVersionIdJsonGet200Response {
    #[serde(rename = "version")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub version: Option<String>,

    #[serde(rename = "assetIndex")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub asset_index: Option<models::V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex>,

    #[serde(rename = "assets")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub assets: Option<i32>,

    #[serde(rename = "complianceLevel")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub compliance_level: Option<i32>,

    #[serde(rename = "downloads")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub downloads: Option<models::V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads>,

    #[serde(rename = "id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub id: Option<String>,

    #[serde(rename = "javaVersion")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub java_version: Option<models::V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion>,

    #[serde(rename = "mainClass")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub main_class: Option<String>,

    #[serde(rename = "minimumLauncherVersion")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub minimum_launcher_version: Option<i32>,

    #[serde(rename = "time")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub time: Option<chrono::DateTime::<chrono::Utc>>,

    #[serde(rename = "releaseTime")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub release_time: Option<chrono::DateTime::<chrono::Utc>>,

    #[serde(rename = "type")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub r#type: Option<String>,

}


impl V1PackagesPackageIdVersionIdJsonGet200Response {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new() -> V1PackagesPackageIdVersionIdJsonGet200Response {
        V1PackagesPackageIdVersionIdJsonGet200Response {
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

/// Converts the V1PackagesPackageIdVersionIdJsonGet200Response value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for V1PackagesPackageIdVersionIdJsonGet200Response {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            self.version.as_ref().map(|version| {
                [
                    "version".to_string(),
                    version.to_string(),
                ].join(",")
            }),

            // Skipping assetIndex in query parameter serialization


            self.assets.as_ref().map(|assets| {
                [
                    "assets".to_string(),
                    assets.to_string(),
                ].join(",")
            }),


            self.compliance_level.as_ref().map(|compliance_level| {
                [
                    "complianceLevel".to_string(),
                    compliance_level.to_string(),
                ].join(",")
            }),

            // Skipping downloads in query parameter serialization


            self.id.as_ref().map(|id| {
                [
                    "id".to_string(),
                    id.to_string(),
                ].join(",")
            }),

            // Skipping javaVersion in query parameter serialization


            self.main_class.as_ref().map(|main_class| {
                [
                    "mainClass".to_string(),
                    main_class.to_string(),
                ].join(",")
            }),


            self.minimum_launcher_version.as_ref().map(|minimum_launcher_version| {
                [
                    "minimumLauncherVersion".to_string(),
                    minimum_launcher_version.to_string(),
                ].join(",")
            }),

            // Skipping time in query parameter serialization

            // Skipping releaseTime in query parameter serialization


            self.r#type.as_ref().map(|r#type| {
                [
                    "type".to_string(),
                    r#type.to_string(),
                ].join(",")
            }),

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a V1PackagesPackageIdVersionIdJsonGet200Response value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for V1PackagesPackageIdVersionIdJsonGet200Response {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub version: Vec<String>,
            pub asset_index: Vec<models::V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex>,
            pub assets: Vec<i32>,
            pub compliance_level: Vec<i32>,
            pub downloads: Vec<models::V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads>,
            pub id: Vec<String>,
            pub java_version: Vec<models::V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion>,
            pub main_class: Vec<String>,
            pub minimum_launcher_version: Vec<i32>,
            pub time: Vec<chrono::DateTime::<chrono::Utc>>,
            pub release_time: Vec<chrono::DateTime::<chrono::Utc>>,
            pub r#type: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing V1PackagesPackageIdVersionIdJsonGet200Response".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "version" => intermediate_rep.version.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "assetIndex" => intermediate_rep.asset_index.push(<models::V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "assets" => intermediate_rep.assets.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "complianceLevel" => intermediate_rep.compliance_level.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "downloads" => intermediate_rep.downloads.push(<models::V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "id" => intermediate_rep.id.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "javaVersion" => intermediate_rep.java_version.push(<models::V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "mainClass" => intermediate_rep.main_class.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "minimumLauncherVersion" => intermediate_rep.minimum_launcher_version.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "time" => intermediate_rep.time.push(<chrono::DateTime::<chrono::Utc> as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "releaseTime" => intermediate_rep.release_time.push(<chrono::DateTime::<chrono::Utc> as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "type" => intermediate_rep.r#type.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing V1PackagesPackageIdVersionIdJsonGet200Response".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(V1PackagesPackageIdVersionIdJsonGet200Response {
            version: intermediate_rep.version.into_iter().next(),
            asset_index: intermediate_rep.asset_index.into_iter().next(),
            assets: intermediate_rep.assets.into_iter().next(),
            compliance_level: intermediate_rep.compliance_level.into_iter().next(),
            downloads: intermediate_rep.downloads.into_iter().next(),
            id: intermediate_rep.id.into_iter().next(),
            java_version: intermediate_rep.java_version.into_iter().next(),
            main_class: intermediate_rep.main_class.into_iter().next(),
            minimum_launcher_version: intermediate_rep.minimum_launcher_version.into_iter().next(),
            time: intermediate_rep.time.into_iter().next(),
            release_time: intermediate_rep.release_time.into_iter().next(),
            r#type: intermediate_rep.r#type.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<V1PackagesPackageIdVersionIdJsonGet200Response> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<V1PackagesPackageIdVersionIdJsonGet200Response>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<V1PackagesPackageIdVersionIdJsonGet200Response>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for V1PackagesPackageIdVersionIdJsonGet200Response - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<V1PackagesPackageIdVersionIdJsonGet200Response> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <V1PackagesPackageIdVersionIdJsonGet200Response as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into V1PackagesPackageIdVersionIdJsonGet200Response - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}







#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex {
    #[serde(rename = "id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub id: Option<String>,

    #[serde(rename = "sha1")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub sha1: Option<String>,

    #[serde(rename = "size")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub size: Option<i32>,

    #[serde(rename = "totalSize")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub total_size: Option<i32>,

    #[serde(rename = "url")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub url: Option<String>,

}


impl V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
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

/// Converts the V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            self.id.as_ref().map(|id| {
                [
                    "id".to_string(),
                    id.to_string(),
                ].join(",")
            }),


            self.sha1.as_ref().map(|sha1| {
                [
                    "sha1".to_string(),
                    sha1.to_string(),
                ].join(",")
            }),


            self.size.as_ref().map(|size| {
                [
                    "size".to_string(),
                    size.to_string(),
                ].join(",")
            }),


            self.total_size.as_ref().map(|total_size| {
                [
                    "totalSize".to_string(),
                    total_size.to_string(),
                ].join(",")
            }),


            self.url.as_ref().map(|url| {
                [
                    "url".to_string(),
                    url.to_string(),
                ].join(",")
            }),

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub id: Vec<String>,
            pub sha1: Vec<String>,
            pub size: Vec<i32>,
            pub total_size: Vec<i32>,
            pub url: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "id" => intermediate_rep.id.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "sha1" => intermediate_rep.sha1.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "size" => intermediate_rep.size.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "totalSize" => intermediate_rep.total_size.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "url" => intermediate_rep.url.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex {
            id: intermediate_rep.id.into_iter().next(),
            sha1: intermediate_rep.sha1.into_iter().next(),
            size: intermediate_rep.size.into_iter().next(),
            total_size: intermediate_rep.total_size.into_iter().next(),
            url: intermediate_rep.url.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}







#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads {
    #[serde(rename = "client")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub client: Option<models::V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient>,

    #[serde(rename = "client_mappings")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub client_mappings: Option<models::V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient>,

    #[serde(rename = "server")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub server: Option<models::V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient>,

    #[serde(rename = "server_mappings")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub server_mappings: Option<models::V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient>,

}


impl V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new() -> V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads {
        V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads {
            client: None,
            client_mappings: None,
            server: None,
            server_mappings: None,
        }
    }
}

/// Converts the V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![
            // Skipping client in query parameter serialization

            // Skipping client_mappings in query parameter serialization

            // Skipping server in query parameter serialization

            // Skipping server_mappings in query parameter serialization

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub client: Vec<models::V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient>,
            pub client_mappings: Vec<models::V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient>,
            pub server: Vec<models::V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient>,
            pub server_mappings: Vec<models::V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "client" => intermediate_rep.client.push(<models::V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "client_mappings" => intermediate_rep.client_mappings.push(<models::V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "server" => intermediate_rep.server.push(<models::V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "server_mappings" => intermediate_rep.server_mappings.push(<models::V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads {
            client: intermediate_rep.client.into_iter().next(),
            client_mappings: intermediate_rep.client_mappings.into_iter().next(),
            server: intermediate_rep.server.into_iter().next(),
            server_mappings: intermediate_rep.server_mappings.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}







#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient {
    #[serde(rename = "sha1")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub sha1: Option<String>,

    #[serde(rename = "size")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub size: Option<i32>,

    #[serde(rename = "url")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub url: Option<String>,

}


impl V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new() -> V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient {
        V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient {
            sha1: None,
            size: None,
            url: None,
        }
    }
}

/// Converts the V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            self.sha1.as_ref().map(|sha1| {
                [
                    "sha1".to_string(),
                    sha1.to_string(),
                ].join(",")
            }),


            self.size.as_ref().map(|size| {
                [
                    "size".to_string(),
                    size.to_string(),
                ].join(",")
            }),


            self.url.as_ref().map(|url| {
                [
                    "url".to_string(),
                    url.to_string(),
                ].join(",")
            }),

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub sha1: Vec<String>,
            pub size: Vec<i32>,
            pub url: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "sha1" => intermediate_rep.sha1.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "size" => intermediate_rep.size.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "url" => intermediate_rep.url.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient {
            sha1: intermediate_rep.sha1.into_iter().next(),
            size: intermediate_rep.size.into_iter().next(),
            url: intermediate_rep.url.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}







#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion {
    #[serde(rename = "component")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub component: Option<String>,

    #[serde(rename = "majorVersion")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub major_version: Option<i32>,

}


impl V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new() -> V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion {
        V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion {
            component: None,
            major_version: None,
        }
    }
}

/// Converts the V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            self.component.as_ref().map(|component| {
                [
                    "component".to_string(),
                    component.to_string(),
                ].join(",")
            }),


            self.major_version.as_ref().map(|major_version| {
                [
                    "majorVersion".to_string(),
                    major_version.to_string(),
                ].join(",")
            }),

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub component: Vec<String>,
            pub major_version: Vec<i32>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "component" => intermediate_rep.component.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "majorVersion" => intermediate_rep.major_version.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion {
            component: intermediate_rep.component.into_iter().next(),
            major_version: intermediate_rep.major_version.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}



