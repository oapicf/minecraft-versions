# DefaultApi

All URIs are relative to *https://launchermeta.mojang.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getMinecraftVersionManifest**](DefaultApi.md#getMinecraftVersionManifest) | **GET** /mc/game/version_manifest.json | Get Minecraft version manifest |
| [**getMinecraftVersionPackageInfo**](DefaultApi.md#getMinecraftVersionPackageInfo) | **GET** /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package info |


<a name="getMinecraftVersionManifest"></a>
# **getMinecraftVersionManifest**
> VersionManifest getMinecraftVersionManifest()

Get Minecraft version manifest

### Parameters
This endpoint does not need any parameter.

### Return type

[**VersionManifest**](../Models/VersionManifest.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getMinecraftVersionPackageInfo"></a>
# **getMinecraftVersionPackageInfo**
> VersionPackageInfo getMinecraftVersionPackageInfo(packageId, versionId)

Get Minecraft version package info

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **packageId** | **String**|  | [default to null] |
| **versionId** | **String**|  | [default to null] |

### Return type

[**VersionPackageInfo**](../Models/VersionPackageInfo.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

