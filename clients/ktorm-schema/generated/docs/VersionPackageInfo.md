
# Table `VersionPackageInfo`
(mapped from: VersionPackageInfo)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**version** | version | text |  | **kotlin.String** |  |  [optional]
**assetIndex** | assetIndex | long |  | [**VersionPackageInfoAssetIndex**](VersionPackageInfoAssetIndex.md) |  |  [optional] [foreignkey]
**assets** | assets | text |  | **kotlin.String** |  |  [optional]
**complianceLevel** | complianceLevel | int |  | **kotlin.Int** |  |  [optional]
**downloads** | downloads | long |  | [**VersionPackageInfoDownloads**](VersionPackageInfoDownloads.md) |  |  [optional] [foreignkey]
**id** | id | text PRIMARY KEY |  | **kotlin.String** |  |  [optional]
**javaVersion** | javaVersion | long |  | [**VersionPackageInfoJavaVersion**](VersionPackageInfoJavaVersion.md) |  |  [optional] [foreignkey]
**mainClass** | mainClass | text |  | **kotlin.String** |  |  [optional]
**minimumLauncherVersion** | minimumLauncherVersion | int |  | **kotlin.Int** |  |  [optional]
**time** | time | datetime |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) |  |  [optional]
**releaseTime** | releaseTime | datetime |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) |  |  [optional]
**type** | type | text |  | **kotlin.String** |  |  [optional]














