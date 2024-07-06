# DEFAULT_API

All URIs are relative to *https://launchermeta.mojang.com*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**mc_game_version_manifest_get**](DEFAULT_API.md#mc_game_version_manifest_get) | **Get** /mc/game/version_manifest | Get Minecraft version manifest
[**v1_packages_package_id_version_id_json_get**](DEFAULT_API.md#v1_packages_package_id_version_id_json_get) | **Get** /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package details


# **mc_game_version_manifest_get**
> mc_game_version_manifest_get : detachable MODEL_MC_GAME_VERSION_MANIFEST_GET_200_RESPONSE


Get Minecraft version manifest


### Parameters
This endpoint does not need any parameter.

### Return type

[**MODEL_MC_GAME_VERSION_MANIFEST_GET_200_RESPONSE**](_mc_game_version_manifest_get_200_response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1_packages_package_id_version_id_json_get**
> v1_packages_package_id_version_id_json_get (package_id: STRING_32 ; version_id: STRING_32 ): detachable MODEL_V1_PACKAGES__PACKAGE_ID___VERSION_ID__JSON_GET_200_RESPONSE


Get Minecraft version package details


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **package_id** | **STRING_32**|  | [default to null]
 **version_id** | **STRING_32**|  | [default to null]

### Return type

[**MODEL_V1_PACKAGES__PACKAGE_ID___VERSION_ID__JSON_GET_200_RESPONSE**](_v1_packages__packageId___versionId__json_get_200_response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

