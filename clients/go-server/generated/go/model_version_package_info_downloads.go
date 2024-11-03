// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * SDK for Minecraft versions info
 *
 * API version: 0.12.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 */

package openapi




type VersionPackageInfoDownloads struct {

	Client Download `json:"client,omitempty"`

	ClientMappings Download `json:"client_mappings,omitempty"`

	Server Download `json:"server,omitempty"`

	ServerMappings Download `json:"server_mappings,omitempty"`
}

// AssertVersionPackageInfoDownloadsRequired checks if the required fields are not zero-ed
func AssertVersionPackageInfoDownloadsRequired(obj VersionPackageInfoDownloads) error {
	if err := AssertDownloadRequired(obj.Client); err != nil {
		return err
	}
	if err := AssertDownloadRequired(obj.ClientMappings); err != nil {
		return err
	}
	if err := AssertDownloadRequired(obj.Server); err != nil {
		return err
	}
	if err := AssertDownloadRequired(obj.ServerMappings); err != nil {
		return err
	}
	return nil
}

// AssertVersionPackageInfoDownloadsConstraints checks if the values respects the defined constraints
func AssertVersionPackageInfoDownloadsConstraints(obj VersionPackageInfoDownloads) error {
	if err := AssertDownloadConstraints(obj.Client); err != nil {
		return err
	}
	if err := AssertDownloadConstraints(obj.ClientMappings); err != nil {
		return err
	}
	if err := AssertDownloadConstraints(obj.Server); err != nil {
		return err
	}
	if err := AssertDownloadConstraints(obj.ServerMappings); err != nil {
		return err
	}
	return nil
}
