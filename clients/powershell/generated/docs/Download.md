# Download
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Sha1** | **String** |  | [optional] 
**Size** | **Int32** |  | [optional] 
**Url** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$Download = Initialize-PSOpenAPIToolsDownload  -Sha1 null `
 -Size null `
 -Url null
```

- Convert the resource to JSON
```powershell
$Download | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

