# DEFAULT_API

All URIs are relative to *https://launchermeta.mojang.com*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**minecraft_version_manifest**](DEFAULT_API.md#minecraft_version_manifest) | **Get** /mc/game/version_manifest.json | Get Minecraft version manifest
[**minecraft_version_package_info**](DEFAULT_API.md#minecraft_version_package_info) | **Get** /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package info


# **minecraft_version_manifest**
> minecraft_version_manifest : detachable VERSION_MANIFEST


Get Minecraft version manifest


### Parameters
This endpoint does not need any parameter.

### Return type

[**VERSION_MANIFEST**](VersionManifest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **minecraft_version_package_info**
> minecraft_version_package_info (package_id: STRING_32 ; version_id: STRING_32 ): detachable VERSION_PACKAGE_INFO


Get Minecraft version package info


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **package_id** | **STRING_32**|  | [default to null]
 **version_id** | **STRING_32**|  | [default to null]

### Return type

[**VERSION_PACKAGE_INFO**](VersionPackageInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

