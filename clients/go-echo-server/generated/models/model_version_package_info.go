package models

import (
	"time"
)

type VersionPackageInfo struct {

	Version string `json:"version,omitempty"`

	AssetIndex VersionPackageInfoAssetIndex `json:"assetIndex,omitempty"`

	Assets string `json:"assets,omitempty"`

	ComplianceLevel int32 `json:"complianceLevel,omitempty"`

	Downloads VersionPackageInfoDownloads `json:"downloads,omitempty"`

	Id string `json:"id,omitempty"`

	JavaVersion VersionPackageInfoJavaVersion `json:"javaVersion,omitempty"`

	MainClass string `json:"mainClass,omitempty"`

	MinimumLauncherVersion int32 `json:"minimumLauncherVersion,omitempty"`

	Time time.Time `json:"time,omitempty"`

	ReleaseTime time.Time `json:"releaseTime,omitempty"`

	Type string `json:"type,omitempty"`
}
