package models

type VersionPackageInfoAssetIndex struct {

	Id string `json:"id,omitempty"`

	Sha1 string `json:"sha1,omitempty"`

	Size int32 `json:"size,omitempty"`

	TotalSize int32 `json:"totalSize,omitempty"`

	Url string `json:"url,omitempty"`
}
