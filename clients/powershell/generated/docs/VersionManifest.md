# VersionManifest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Latest** | [**VersionManifestLatest**](VersionManifestLatest.md) |  | [optional] 
**Versions** | **Version[]** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$VersionManifest = Initialize-PSOpenAPIToolsVersionManifest  -Latest null `
 -Versions null
```

- Convert the resource to JSON
```powershell
$VersionManifest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

