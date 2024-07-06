package models

import (
	"time"
)

type V1PackagesPackageIdVersionIdJsonGet200Response struct {

	Version string `json:"version,omitempty"`

	AssetIndex V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex `json:"assetIndex,omitempty"`

	Assets int32 `json:"assets,omitempty"`

	ComplianceLevel int32 `json:"complianceLevel,omitempty"`

	Downloads V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads `json:"downloads,omitempty"`

	Id string `json:"id,omitempty"`

	JavaVersion V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion `json:"javaVersion,omitempty"`

	MainClass string `json:"mainClass,omitempty"`

	MinimumLauncherVersion int32 `json:"minimumLauncherVersion,omitempty"`

	Time time.Time `json:"time,omitempty"`

	ReleaseTime time.Time `json:"releaseTime,omitempty"`

	Type string `json:"type,omitempty"`
}
