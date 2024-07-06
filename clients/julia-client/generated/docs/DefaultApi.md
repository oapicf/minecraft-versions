# DefaultApi

All URIs are relative to *https://launchermeta.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_minecraft_version_manifest**](DefaultApi.md#get_minecraft_version_manifest) | **GET** /mc/game/version_manifest.json | Get Minecraft version manifest
[**get_minecraft_version_package_info**](DefaultApi.md#get_minecraft_version_package_info) | **GET** /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package info


# **get_minecraft_version_manifest**
> get_minecraft_version_manifest(_api::DefaultApi; _mediaType=nothing) -> VersionManifest, OpenAPI.Clients.ApiResponse <br/>
> get_minecraft_version_manifest(_api::DefaultApi, response_stream::Channel; _mediaType=nothing) -> Channel{ VersionManifest }, OpenAPI.Clients.ApiResponse

Get Minecraft version manifest

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**VersionManifest**](VersionManifest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **get_minecraft_version_package_info**
> get_minecraft_version_package_info(_api::DefaultApi, package_id::String, version_id::String; _mediaType=nothing) -> VersionPackageInfo, OpenAPI.Clients.ApiResponse <br/>
> get_minecraft_version_package_info(_api::DefaultApi, response_stream::Channel, package_id::String, version_id::String; _mediaType=nothing) -> Channel{ VersionPackageInfo }, OpenAPI.Clients.ApiResponse

Get Minecraft version package info

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**package_id** | **String**|  | [default to nothing]
**version_id** | **String**|  | [default to nothing]

### Return type

[**VersionPackageInfo**](VersionPackageInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

