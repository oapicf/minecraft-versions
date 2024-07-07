// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * SDK for Minecraft versions info
 *
 * API version: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 */

package openapi




type VersionPackageInfoAssetIndex struct {

	Id string `json:"id,omitempty"`

	Sha1 string `json:"sha1,omitempty"`

	Size int32 `json:"size,omitempty"`

	TotalSize int32 `json:"totalSize,omitempty"`

	Url string `json:"url,omitempty"`
}

// AssertVersionPackageInfoAssetIndexRequired checks if the required fields are not zero-ed
func AssertVersionPackageInfoAssetIndexRequired(obj VersionPackageInfoAssetIndex) error {
	return nil
}

// AssertVersionPackageInfoAssetIndexConstraints checks if the values respects the defined constraints
func AssertVersionPackageInfoAssetIndexConstraints(obj VersionPackageInfoAssetIndex) error {
	return nil
}