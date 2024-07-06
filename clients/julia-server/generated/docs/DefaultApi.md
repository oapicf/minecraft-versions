# DefaultApi

All URIs are relative to *https://launchermeta.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mc_game_version_manifest_get**](DefaultApi.md#mc_game_version_manifest_get) | **GET** /mc/game/version_manifest | Get Minecraft version manifest
[**v1_packages_package_id_version_id_json_get**](DefaultApi.md#v1_packages_package_id_version_id_json_get) | **GET** /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package details


# **mc_game_version_manifest_get**
> mc_game_version_manifest_get(req::HTTP.Request;) -> McGameVersionManifestGet200Response

Get Minecraft version manifest

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**McGameVersionManifestGet200Response**](McGameVersionManifestGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1_packages_package_id_version_id_json_get**
> v1_packages_package_id_version_id_json_get(req::HTTP.Request, package_id::String, version_id::String;) -> V1PackagesPackageIdVersionIdJsonGet200Response

Get Minecraft version package details

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **HTTP.Request** | The HTTP Request object | 
**package_id** | **String**|  | [default to nothing]
**version_id** | **String**|  | [default to nothing]

### Return type

[**V1PackagesPackageIdVersionIdJsonGet200Response**](V1PackagesPackageIdVersionIdJsonGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

