# VersionPackageInfoDownloads
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Client** | [**Download**](Download.md) |  | [optional] 
**ClientMappings** | [**Download**](Download.md) |  | [optional] 
**Server** | [**Download**](Download.md) |  | [optional] 
**ServerMappings** | [**Download**](Download.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$VersionPackageInfoDownloads = Initialize-PSOpenAPIToolsVersionPackageInfoDownloads  -Client null `
 -ClientMappings null `
 -Server null `
 -ServerMappings null
```

- Convert the resource to JSON
```powershell
$VersionPackageInfoDownloads | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

