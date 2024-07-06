# PSOpenAPITools.PSOpenAPITools\Api.DefaultApi

All URIs are relative to *https://launchermeta.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Get-MinecraftVersionManifest**](DefaultApi.md#Get-MinecraftVersionManifest) | **GET** /mc/game/version_manifest.json | Get Minecraft version manifest
[**Invoke-V1PackagesPackageIdVersionIdJsonGet**](DefaultApi.md#Invoke-V1PackagesPackageIdVersionIdJsonGet) | **GET** /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package details


<a id="Get-MinecraftVersionManifest"></a>
# **Get-MinecraftVersionManifest**
> GetMinecraftVersionManifest200Response Get-MinecraftVersionManifest<br>

Get Minecraft version manifest

### Example
```powershell

# Get Minecraft version manifest
try {
    $Result = Get-MinecraftVersionManifest
} catch {
    Write-Host ("Exception occurred when calling Get-MinecraftVersionManifest: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetMinecraftVersionManifest200Response**](GetMinecraftVersionManifest200Response.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-V1PackagesPackageIdVersionIdJsonGet"></a>
# **Invoke-V1PackagesPackageIdVersionIdJsonGet**
> V1PackagesPackageIdVersionIdJsonGet200Response Invoke-V1PackagesPackageIdVersionIdJsonGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PackageId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-VersionId] <String><br>

Get Minecraft version package details

### Example
```powershell
$PackageId = "177e49d3233cb6eac42f0495c0a48e719870c2ae" # String | 
$VersionId = "1.21" # String | 

# Get Minecraft version package details
try {
    $Result = Invoke-V1PackagesPackageIdVersionIdJsonGet -PackageId $PackageId -VersionId $VersionId
} catch {
    Write-Host ("Exception occurred when calling Invoke-V1PackagesPackageIdVersionIdJsonGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **PackageId** | **String**|  | 
 **VersionId** | **String**|  | 

### Return type

[**V1PackagesPackageIdVersionIdJsonGet200Response**](V1PackagesPackageIdVersionIdJsonGet200Response.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

