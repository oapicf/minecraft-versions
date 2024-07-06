# DefaultApi

All URIs are relative to *https://launchermeta.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_minecraft_version_manifest**](DefaultApi.md#get_minecraft_version_manifest) | **GET** /mc/game/version_manifest.json | Get Minecraft version manifest
[**v1_packages_package_id_version_id_json_get**](DefaultApi.md#v1_packages_package_id_version_id_json_get) | **GET** /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package details


# **get_minecraft_version_manifest**
> get_minecraft_version_manifest(_api::DefaultApi; _mediaType=nothing) -> GetMinecraftVersionManifest200Response, OpenAPI.Clients.ApiResponse <br/>
> get_minecraft_version_manifest(_api::DefaultApi, response_stream::Channel; _mediaType=nothing) -> Channel{ GetMinecraftVersionManifest200Response }, OpenAPI.Clients.ApiResponse

Get Minecraft version manifest

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**GetMinecraftVersionManifest200Response**](GetMinecraftVersionManifest200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **v1_packages_package_id_version_id_json_get**
> v1_packages_package_id_version_id_json_get(_api::DefaultApi, package_id::String, version_id::String; _mediaType=nothing) -> V1PackagesPackageIdVersionIdJsonGet200Response, OpenAPI.Clients.ApiResponse <br/>
> v1_packages_package_id_version_id_json_get(_api::DefaultApi, response_stream::Channel, package_id::String, version_id::String; _mediaType=nothing) -> Channel{ V1PackagesPackageIdVersionIdJsonGet200Response }, OpenAPI.Clients.ApiResponse

Get Minecraft version package details

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**package_id** | **String**|  | [default to nothing]
**version_id** | **String**|  | [default to nothing]

### Return type

[**V1PackagesPackageIdVersionIdJsonGet200Response**](V1PackagesPackageIdVersionIdJsonGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

