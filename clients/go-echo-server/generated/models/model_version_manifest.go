package models

type VersionManifest struct {

	Latest VersionManifestLatest `json:"latest,omitempty"`

	Versions []Version `json:"versions,omitempty"`
}
