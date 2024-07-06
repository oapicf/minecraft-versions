// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * SDK for Minecraft versions info
 *
 * API version: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 */

package openapi


import (
	"time"
)



type McGameVersionManifestGet200ResponseVersionsInner struct {

	Id string `json:"id,omitempty"`

	Type string `json:"type,omitempty"`

	Url string `json:"url,omitempty"`

	Time time.Time `json:"time,omitempty"`

	ReleaseTime time.Time `json:"releaseTime,omitempty"`
}

// AssertMcGameVersionManifestGet200ResponseVersionsInnerRequired checks if the required fields are not zero-ed
func AssertMcGameVersionManifestGet200ResponseVersionsInnerRequired(obj McGameVersionManifestGet200ResponseVersionsInner) error {
	return nil
}

// AssertMcGameVersionManifestGet200ResponseVersionsInnerConstraints checks if the values respects the defined constraints
func AssertMcGameVersionManifestGet200ResponseVersionsInnerConstraints(obj McGameVersionManifestGet200ResponseVersionsInner) error {
	return nil
}