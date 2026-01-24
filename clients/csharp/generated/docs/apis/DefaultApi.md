# Org.OpenAPITools.Api.DefaultApi

All URIs are relative to *https://launchermeta.mojang.com*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**GetMinecraftVersionManifest**](DefaultApi.md#getminecraftversionmanifest) | **GET** /mc/game/version_manifest.json | Get Minecraft version manifest |
| [**GetMinecraftVersionPackageInfo**](DefaultApi.md#getminecraftversionpackageinfo) | **GET** /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package info |

<a id="getminecraftversionmanifest"></a>
# **GetMinecraftVersionManifest**
> VersionManifest GetMinecraftVersionManifest ()

Get Minecraft version manifest


### Parameters
This endpoint does not need any parameter.
### Return type

[**VersionManifest**](VersionManifest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of Minecraft versions with the latest and snapshot releases |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="getminecraftversionpackageinfo"></a>
# **GetMinecraftVersionPackageInfo**
> VersionPackageInfo GetMinecraftVersionPackageInfo (string packageId, string versionId)

Get Minecraft version package info


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **packageId** | **string** |  |  |
| **versionId** | **string** |  |  |

### Return type

[**VersionPackageInfo**](VersionPackageInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get package version details |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

