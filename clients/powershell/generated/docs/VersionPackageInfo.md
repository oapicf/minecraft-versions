# VersionPackageInfo
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Version** | **String** |  | [optional] 
**AssetIndex** | [**VersionPackageInfoAssetIndex**](VersionPackageInfoAssetIndex.md) |  | [optional] 
**Assets** | **String** |  | [optional] 
**ComplianceLevel** | **Int32** |  | [optional] 
**Downloads** | [**VersionPackageInfoDownloads**](VersionPackageInfoDownloads.md) |  | [optional] 
**Id** | **String** |  | [optional] 
**JavaVersion** | [**VersionPackageInfoJavaVersion**](VersionPackageInfoJavaVersion.md) |  | [optional] 
**MainClass** | **String** |  | [optional] 
**MinimumLauncherVersion** | **Int32** |  | [optional] 
**Time** | **System.DateTime** |  | [optional] 
**ReleaseTime** | **System.DateTime** |  | [optional] 
**Type** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$VersionPackageInfo = Initialize-PSOpenAPIToolsVersionPackageInfo  -Version null `
 -AssetIndex null `
 -Assets null `
 -ComplianceLevel null `
 -Downloads null `
 -Id null `
 -JavaVersion null `
 -MainClass net.minecraft.client.main.Main `
 -MinimumLauncherVersion 21 `
 -Time 2024-04-01T11:14:41Z `
 -ReleaseTime 2024-04-01T11:07:19Z `
 -Type snapshot
```

- Convert the resource to JSON
```powershell
$VersionPackageInfo | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

