/*
 * SDK for Minecraft versions info
 *
 * API version: 0.12.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type VersionManifest struct {

	Latest VersionManifestLatest `json:"latest,omitempty"`

	Versions []Version `json:"versions,omitempty"`
}
