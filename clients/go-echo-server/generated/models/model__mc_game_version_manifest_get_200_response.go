package models

type McGameVersionManifestGet200Response struct {

	Latest McGameVersionManifestGet200ResponseLatest `json:"latest,omitempty"`

	Versions []McGameVersionManifestGet200ResponseVersionsInner `json:"versions,omitempty"`
}
