package models

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