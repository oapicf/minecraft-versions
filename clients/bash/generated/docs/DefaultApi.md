# DefaultApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMinecraftVersionManifest**](DefaultApi.md#getMinecraftVersionManifest) | **GET** /mc/game/version_manifest.json | Get Minecraft version manifest
[**getMinecraftVersionPackageInfo**](DefaultApi.md#getMinecraftVersionPackageInfo) | **GET** /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package info



## getMinecraftVersionManifest

Get Minecraft version manifest

### Example

```bash
 getMinecraftVersionManifest
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**VersionManifest**](VersionManifest.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getMinecraftVersionPackageInfo

Get Minecraft version package info

### Example

```bash
 getMinecraftVersionPackageInfo packageId=value versionId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packageId** | **string** |  | [default to null]
 **versionId** | **string** |  | [default to null]

### Return type

[**VersionPackageInfo**](VersionPackageInfo.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

