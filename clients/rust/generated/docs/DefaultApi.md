# \DefaultApi

All URIs are relative to *https://launchermeta.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_minecraft_version_manifest**](DefaultApi.md#get_minecraft_version_manifest) | **GET** /mc/game/version_manifest.json | Get Minecraft version manifest
[**v1_packages_package_id_version_id_json_get**](DefaultApi.md#v1_packages_package_id_version_id_json_get) | **GET** /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package details



## get_minecraft_version_manifest

> models::GetMinecraftVersionManifest200Response get_minecraft_version_manifest()
Get Minecraft version manifest

### Parameters

This endpoint does not need any parameter.

### Return type

[**models::GetMinecraftVersionManifest200Response**](getMinecraftVersionManifest_200_response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## v1_packages_package_id_version_id_json_get

> models::V1PackagesPackageIdVersionIdJsonGet200Response v1_packages_package_id_version_id_json_get(package_id, version_id)
Get Minecraft version package details

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**package_id** | **String** |  | [required] |
**version_id** | **String** |  | [required] |

### Return type

[**models::V1PackagesPackageIdVersionIdJsonGet200Response**](_v1_packages__packageId___versionId__json_get_200_response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

