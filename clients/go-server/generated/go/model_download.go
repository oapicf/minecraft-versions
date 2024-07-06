// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * SDK for Minecraft versions info
 *
 * API version: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 */

package openapi




type Download struct {

	Sha1 string `json:"sha1,omitempty"`

	Size int32 `json:"size,omitempty"`

	Url string `json:"url,omitempty"`
}

// AssertDownloadRequired checks if the required fields are not zero-ed
func AssertDownloadRequired(obj Download) error {
	return nil
}

// AssertDownloadConstraints checks if the values respects the defined constraints
func AssertDownloadConstraints(obj Download) error {
	return nil
}
