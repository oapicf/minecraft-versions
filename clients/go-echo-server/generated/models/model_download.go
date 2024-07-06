package models

type Download struct {

	Sha1 string `json:"sha1,omitempty"`

	Size int32 `json:"size,omitempty"`

	Url string `json:"url,omitempty"`
}
