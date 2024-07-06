
# Table `_v1_packages__packageId___versionId__json_get_200_response`
(mapped from: V1PackagesPackageIdVersionIdJsonGet200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**version** | version | text |  | **kotlin.String** |  |  [optional]
**assetIndex** | assetIndex | long |  | [**V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex**](V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex.md) |  |  [optional] [foreignkey]
**assets** | assets | int |  | **kotlin.Int** |  |  [optional]
**complianceLevel** | complianceLevel | int |  | **kotlin.Int** |  |  [optional]
**downloads** | downloads | long |  | [**V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads**](V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.md) |  |  [optional] [foreignkey]
**id** | id | text PRIMARY KEY |  | **kotlin.String** |  |  [optional]
**javaVersion** | javaVersion | long |  | [**V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion**](V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion.md) |  |  [optional] [foreignkey]
**mainClass** | mainClass | text |  | **kotlin.String** |  |  [optional]
**minimumLauncherVersion** | minimumLauncherVersion | int |  | **kotlin.Int** |  |  [optional]
**time** | time | datetime |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) |  |  [optional]
**releaseTime** | releaseTime | datetime |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) |  |  [optional]
**type** | type | text |  | **kotlin.String** |  |  [optional]














