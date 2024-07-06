# V1PackagesPackageIdVersionIdJsonGet200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Version** | **String** |  | [optional] 
**AssetIndex** | [**V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex**](V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex.md) |  | [optional] 
**Assets** | **Int32** |  | [optional] 
**ComplianceLevel** | **Int32** |  | [optional] 
**Downloads** | [**V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads**](V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.md) |  | [optional] 
**Id** | **String** |  | [optional] 
**JavaVersion** | [**V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion**](V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion.md) |  | [optional] 
**MainClass** | **String** |  | [optional] 
**MinimumLauncherVersion** | **Int32** |  | [optional] 
**Time** | **System.DateTime** |  | [optional] 
**ReleaseTime** | **System.DateTime** |  | [optional] 
**Type** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$V1PackagesPackageIdVersionIdJsonGet200Response = Initialize-PSOpenAPIToolsV1PackagesPackageIdVersionIdJsonGet200Response  -Version null `
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
$V1PackagesPackageIdVersionIdJsonGet200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
