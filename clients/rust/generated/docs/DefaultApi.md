# \DefaultApi

All URIs are relative to *https://launchermeta.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_minecraft_version_manifest**](DefaultApi.md#get_minecraft_version_manifest) | **GET** /mc/game/version_manifest.json | Get Minecraft version manifest
[**get_minecraft_version_package_info**](DefaultApi.md#get_minecraft_version_package_info) | **GET** /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package info



## get_minecraft_version_manifest

> models::VersionManifest get_minecraft_version_manifest()
Get Minecraft version manifest

### Parameters

This endpoint does not need any parameter.

### Return type

[**models::VersionManifest**](VersionManifest.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_minecraft_version_package_info

> models::VersionPackageInfo get_minecraft_version_package_info(package_id, version_id)
Get Minecraft version package info

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**package_id** | **String** |  | [required] |
**version_id** | **String** |  | [required] |

### Return type

[**models::VersionPackageInfo**](VersionPackageInfo.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

