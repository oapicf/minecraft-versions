# default_api

All URIs are relative to *https://launchermeta.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
**getMinecraftVersionManifest**](default_api.md#getMinecraftVersionManifest) | **GET** /mc/game/version_manifest.json | Get Minecraft version manifest
**getMinecraftVersionPackageInfo**](default_api.md#getMinecraftVersionPackageInfo) | **GET** /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package info


# **getMinecraftVersionManifest**
> models::VersionManifest getMinecraftVersionManifest()
Get Minecraft version manifest

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**models::VersionManifest**](VersionManifest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getMinecraftVersionPackageInfo**
> models::VersionPackageInfo getMinecraftVersionPackageInfo(package_id, version_id)
Get Minecraft version package info

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **package_id** | **String**|  | 
  **version_id** | **String**|  | 

### Return type

[**models::VersionPackageInfo**](VersionPackageInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

