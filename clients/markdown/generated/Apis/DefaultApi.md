# DefaultApi

All URIs are relative to *https://launchermeta.mojang.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**mcGameVersionManifestGet**](DefaultApi.md#mcGameVersionManifestGet) | **GET** /mc/game/version_manifest | Get Minecraft version manifest |
| [**v1PackagesPackageIdVersionIdJsonGet**](DefaultApi.md#v1PackagesPackageIdVersionIdJsonGet) | **GET** /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package details |


<a name="mcGameVersionManifestGet"></a>
# **mcGameVersionManifestGet**
> _mc_game_version_manifest_get_200_response mcGameVersionManifestGet()

Get Minecraft version manifest

### Parameters
This endpoint does not need any parameter.

### Return type

[**_mc_game_version_manifest_get_200_response**](../Models/_mc_game_version_manifest_get_200_response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="v1PackagesPackageIdVersionIdJsonGet"></a>
# **v1PackagesPackageIdVersionIdJsonGet**
> _v1_packages__packageId___versionId__json_get_200_response v1PackagesPackageIdVersionIdJsonGet(packageId, versionId)

Get Minecraft version package details

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **packageId** | **String**|  | [default to null] |
| **versionId** | **String**|  | [default to null] |

### Return type

[**_v1_packages__packageId___versionId__json_get_200_response**](../Models/_v1_packages__packageId___versionId__json_get_200_response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

