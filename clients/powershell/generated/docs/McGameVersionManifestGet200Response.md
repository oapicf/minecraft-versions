# McGameVersionManifestGet200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Latest** | [**McGameVersionManifestGet200ResponseLatest**](McGameVersionManifestGet200ResponseLatest.md) |  | [optional] 
**Versions** | [**McGameVersionManifestGet200ResponseVersionsInner[]**](McGameVersionManifestGet200ResponseVersionsInner.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$McGameVersionManifestGet200Response = Initialize-PSOpenAPIToolsMcGameVersionManifestGet200Response  -Latest null `
 -Versions null
```

- Convert the resource to JSON
```powershell
$McGameVersionManifestGet200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

