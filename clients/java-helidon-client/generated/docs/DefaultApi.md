# DefaultApi

All URIs are relative to *https://launchermeta.mojang.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getMinecraftVersionManifest**](DefaultApi.md#getMinecraftVersionManifest) | **GET** /mc/game/version_manifest.json | Get Minecraft version manifest |
| [**getMinecraftVersionPackageInfo**](DefaultApi.md#getMinecraftVersionPackageInfo) | **GET** /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package info |



## getMinecraftVersionManifest

> VersionManifest getMinecraftVersionManifest()

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


## getMinecraftVersionPackageInfo

> VersionPackageInfo getMinecraftVersionPackageInfo(packageId, versionId)

Get Minecraft version package info

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **packageId** | **String**|  | |
| **versionId** | **String**|  | |

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

