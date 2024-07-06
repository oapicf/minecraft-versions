#![allow(unused_qualifications)]

use http::HeaderValue;
use validator::Validate;

#[cfg(feature = "server")]
use crate::header;
use crate::{models, types::*};

      
      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct GetMinecraftVersionPackageInfoPathParams {
                pub package_id: String,
                pub version_id: String,
    }







#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct Download {
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


impl Download {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new() -> Download {
        Download {
            sha1: None,
            size: None,
            url: None,
        }
    }
}

/// Converts the Download value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for Download {
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

/// Converts Query Parameters representation (style=form, explode=false) to a Download value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for Download {
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
                None => return std::result::Result::Err("Missing value while parsing Download".to_string())
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
                    _ => return std::result::Result::Err("Unexpected key while parsing Download".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(Download {
            sha1: intermediate_rep.sha1.into_iter().next(),
            size: intermediate_rep.size.into_iter().next(),
            url: intermediate_rep.url.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<Download> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<Download>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<Download>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for Download - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<Download> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <Download as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into Download - {}",
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
pub struct Version {
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


impl Version {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new() -> Version {
        Version {
            id: None,
            r#type: None,
            url: None,
            time: None,
            release_time: None,
        }
    }
}

/// Converts the Version value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for Version {
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

/// Converts Query Parameters representation (style=form, explode=false) to a Version value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for Version {
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
                None => return std::result::Result::Err("Missing value while parsing Version".to_string())
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
                    _ => return std::result::Result::Err("Unexpected key while parsing Version".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(Version {
            id: intermediate_rep.id.into_iter().next(),
            r#type: intermediate_rep.r#type.into_iter().next(),
            url: intermediate_rep.url.into_iter().next(),
            time: intermediate_rep.time.into_iter().next(),
            release_time: intermediate_rep.release_time.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<Version> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<Version>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<Version>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for Version - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<Version> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <Version as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into Version - {}",
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
pub struct VersionManifest {
    #[serde(rename = "latest")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub latest: Option<models::VersionManifestLatest>,

    #[serde(rename = "versions")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub versions: Option<Vec<models::Version>>,

}


impl VersionManifest {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new() -> VersionManifest {
        VersionManifest {
            latest: None,
            versions: None,
        }
    }
}

/// Converts the VersionManifest value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for VersionManifest {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![
            // Skipping latest in query parameter serialization

            // Skipping versions in query parameter serialization

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a VersionManifest value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for VersionManifest {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub latest: Vec<models::VersionManifestLatest>,
            pub versions: Vec<Vec<models::Version>>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing VersionManifest".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "latest" => intermediate_rep.latest.push(<models::VersionManifestLatest as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    "versions" => return std::result::Result::Err("Parsing a container in this style is not supported in VersionManifest".to_string()),
                    _ => return std::result::Result::Err("Unexpected key while parsing VersionManifest".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(VersionManifest {
            latest: intermediate_rep.latest.into_iter().next(),
            versions: intermediate_rep.versions.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<VersionManifest> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<VersionManifest>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<VersionManifest>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for VersionManifest - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<VersionManifest> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <VersionManifest as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into VersionManifest - {}",
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
pub struct VersionManifestLatest {
    #[serde(rename = "release")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub release: Option<String>,

    #[serde(rename = "snapshot")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub snapshot: Option<String>,

}


impl VersionManifestLatest {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new() -> VersionManifestLatest {
        VersionManifestLatest {
            release: None,
            snapshot: None,
        }
    }
}

/// Converts the VersionManifestLatest value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for VersionManifestLatest {
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

/// Converts Query Parameters representation (style=form, explode=false) to a VersionManifestLatest value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for VersionManifestLatest {
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
                None => return std::result::Result::Err("Missing value while parsing VersionManifestLatest".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "release" => intermediate_rep.release.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "snapshot" => intermediate_rep.snapshot.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing VersionManifestLatest".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(VersionManifestLatest {
            release: intermediate_rep.release.into_iter().next(),
            snapshot: intermediate_rep.snapshot.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<VersionManifestLatest> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<VersionManifestLatest>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<VersionManifestLatest>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for VersionManifestLatest - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<VersionManifestLatest> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <VersionManifestLatest as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into VersionManifestLatest - {}",
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
pub struct VersionPackageInfo {
    #[serde(rename = "version")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub version: Option<String>,

    #[serde(rename = "assetIndex")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub asset_index: Option<models::VersionPackageInfoAssetIndex>,

    #[serde(rename = "assets")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub assets: Option<String>,

    #[serde(rename = "complianceLevel")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub compliance_level: Option<i32>,

    #[serde(rename = "downloads")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub downloads: Option<models::VersionPackageInfoDownloads>,

    #[serde(rename = "id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub id: Option<String>,

    #[serde(rename = "javaVersion")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub java_version: Option<models::VersionPackageInfoJavaVersion>,

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


impl VersionPackageInfo {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
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

/// Converts the VersionPackageInfo value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for VersionPackageInfo {
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

/// Converts Query Parameters representation (style=form, explode=false) to a VersionPackageInfo value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for VersionPackageInfo {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub version: Vec<String>,
            pub asset_index: Vec<models::VersionPackageInfoAssetIndex>,
            pub assets: Vec<String>,
            pub compliance_level: Vec<i32>,
            pub downloads: Vec<models::VersionPackageInfoDownloads>,
            pub id: Vec<String>,
            pub java_version: Vec<models::VersionPackageInfoJavaVersion>,
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
                None => return std::result::Result::Err("Missing value while parsing VersionPackageInfo".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "version" => intermediate_rep.version.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "assetIndex" => intermediate_rep.asset_index.push(<models::VersionPackageInfoAssetIndex as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "assets" => intermediate_rep.assets.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "complianceLevel" => intermediate_rep.compliance_level.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "downloads" => intermediate_rep.downloads.push(<models::VersionPackageInfoDownloads as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "id" => intermediate_rep.id.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "javaVersion" => intermediate_rep.java_version.push(<models::VersionPackageInfoJavaVersion as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
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
                    _ => return std::result::Result::Err("Unexpected key while parsing VersionPackageInfo".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(VersionPackageInfo {
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

// Methods for converting between header::IntoHeaderValue<VersionPackageInfo> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<VersionPackageInfo>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<VersionPackageInfo>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for VersionPackageInfo - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<VersionPackageInfo> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <VersionPackageInfo as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into VersionPackageInfo - {}",
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
pub struct VersionPackageInfoAssetIndex {
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


impl VersionPackageInfoAssetIndex {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new() -> VersionPackageInfoAssetIndex {
        VersionPackageInfoAssetIndex {
            id: None,
            sha1: None,
            size: None,
            total_size: None,
            url: None,
        }
    }
}

/// Converts the VersionPackageInfoAssetIndex value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for VersionPackageInfoAssetIndex {
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

/// Converts Query Parameters representation (style=form, explode=false) to a VersionPackageInfoAssetIndex value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for VersionPackageInfoAssetIndex {
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
                None => return std::result::Result::Err("Missing value while parsing VersionPackageInfoAssetIndex".to_string())
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
                    _ => return std::result::Result::Err("Unexpected key while parsing VersionPackageInfoAssetIndex".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(VersionPackageInfoAssetIndex {
            id: intermediate_rep.id.into_iter().next(),
            sha1: intermediate_rep.sha1.into_iter().next(),
            size: intermediate_rep.size.into_iter().next(),
            total_size: intermediate_rep.total_size.into_iter().next(),
            url: intermediate_rep.url.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<VersionPackageInfoAssetIndex> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<VersionPackageInfoAssetIndex>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<VersionPackageInfoAssetIndex>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for VersionPackageInfoAssetIndex - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<VersionPackageInfoAssetIndex> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <VersionPackageInfoAssetIndex as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into VersionPackageInfoAssetIndex - {}",
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
pub struct VersionPackageInfoDownloads {
    #[serde(rename = "client")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub client: Option<models::Download>,

    #[serde(rename = "client_mappings")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub client_mappings: Option<models::Download>,

    #[serde(rename = "server")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub server: Option<models::Download>,

    #[serde(rename = "server_mappings")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub server_mappings: Option<models::Download>,

}


impl VersionPackageInfoDownloads {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new() -> VersionPackageInfoDownloads {
        VersionPackageInfoDownloads {
            client: None,
            client_mappings: None,
            server: None,
            server_mappings: None,
        }
    }
}

/// Converts the VersionPackageInfoDownloads value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for VersionPackageInfoDownloads {
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

/// Converts Query Parameters representation (style=form, explode=false) to a VersionPackageInfoDownloads value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for VersionPackageInfoDownloads {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub client: Vec<models::Download>,
            pub client_mappings: Vec<models::Download>,
            pub server: Vec<models::Download>,
            pub server_mappings: Vec<models::Download>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing VersionPackageInfoDownloads".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "client" => intermediate_rep.client.push(<models::Download as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "client_mappings" => intermediate_rep.client_mappings.push(<models::Download as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "server" => intermediate_rep.server.push(<models::Download as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "server_mappings" => intermediate_rep.server_mappings.push(<models::Download as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing VersionPackageInfoDownloads".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(VersionPackageInfoDownloads {
            client: intermediate_rep.client.into_iter().next(),
            client_mappings: intermediate_rep.client_mappings.into_iter().next(),
            server: intermediate_rep.server.into_iter().next(),
            server_mappings: intermediate_rep.server_mappings.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<VersionPackageInfoDownloads> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<VersionPackageInfoDownloads>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<VersionPackageInfoDownloads>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for VersionPackageInfoDownloads - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<VersionPackageInfoDownloads> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <VersionPackageInfoDownloads as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into VersionPackageInfoDownloads - {}",
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
pub struct VersionPackageInfoJavaVersion {
    #[serde(rename = "component")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub component: Option<String>,

    #[serde(rename = "majorVersion")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub major_version: Option<i32>,

}


impl VersionPackageInfoJavaVersion {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new() -> VersionPackageInfoJavaVersion {
        VersionPackageInfoJavaVersion {
            component: None,
            major_version: None,
        }
    }
}

/// Converts the VersionPackageInfoJavaVersion value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for VersionPackageInfoJavaVersion {
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

/// Converts Query Parameters representation (style=form, explode=false) to a VersionPackageInfoJavaVersion value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for VersionPackageInfoJavaVersion {
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
                None => return std::result::Result::Err("Missing value while parsing VersionPackageInfoJavaVersion".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "component" => intermediate_rep.component.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "majorVersion" => intermediate_rep.major_version.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing VersionPackageInfoJavaVersion".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(VersionPackageInfoJavaVersion {
            component: intermediate_rep.component.into_iter().next(),
            major_version: intermediate_rep.major_version.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<VersionPackageInfoJavaVersion> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<VersionPackageInfoJavaVersion>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<VersionPackageInfoJavaVersion>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for VersionPackageInfoJavaVersion - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<VersionPackageInfoJavaVersion> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <VersionPackageInfoJavaVersion as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into VersionPackageInfoJavaVersion - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}



