# VersionManifestLatest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Release** | **String** |  | [optional] 
**Snapshot** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$VersionManifestLatest = Initialize-PSOpenAPIToolsVersionManifestLatest  -Release 1.21 `
 -Snapshot 24w14potato
```

- Convert the resource to JSON
```powershell
$VersionManifestLatest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

