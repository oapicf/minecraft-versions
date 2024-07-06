# Version
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** |  | [optional] 
**Type** | **String** |  | [optional] 
**Url** | **String** |  | [optional] 
**Time** | **System.DateTime** |  | [optional] 
**ReleaseTime** | **System.DateTime** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$Version = Initialize-PSOpenAPIToolsVersion  -Id 24w14potato `
 -Type snapshot `
 -Url https://piston-meta.mojang.com/v1/packages/21df7f4ba484a6437ab5e9dca0b4dfb5dcefc802/24w14potato.json `
 -Time 2024-04-01T11:14:41Z `
 -ReleaseTime 2024-04-01T11:07:19Z
```

- Convert the resource to JSON
```powershell
$Version | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

