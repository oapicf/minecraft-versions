package models

type VersionPackageInfoDownloads struct {

	Client Download `json:"client,omitempty"`

	ClientMappings Download `json:"client_mappings,omitempty"`

	Server Download `json:"server,omitempty"`

	ServerMappings Download `json:"server_mappings,omitempty"`
}
