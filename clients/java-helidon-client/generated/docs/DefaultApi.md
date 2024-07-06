# DefaultApi

All URIs are relative to *https://launchermeta.mojang.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**mcGameVersionManifestGet**](DefaultApi.md#mcGameVersionManifestGet) | **GET** /mc/game/version_manifest | Get Minecraft version manifest |
| [**v1PackagesPackageIdVersionIdJsonGet**](DefaultApi.md#v1PackagesPackageIdVersionIdJsonGet) | **GET** /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package details |



## mcGameVersionManifestGet

> McGameVersionManifestGet200Response mcGameVersionManifestGet()

Get Minecraft version manifest

### Parameters

This endpoint does not need any parameter.

### Return type

[**McGameVersionManifestGet200Response**](McGameVersionManifestGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of Minecraft versions with the latest and snapshot releases |  -  |


## v1PackagesPackageIdVersionIdJsonGet

> V1PackagesPackageIdVersionIdJsonGet200Response v1PackagesPackageIdVersionIdJsonGet(packageId, versionId)

Get Minecraft version package details

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **packageId** | **String**|  | |
| **versionId** | **String**|  | |

### Return type

[**V1PackagesPackageIdVersionIdJsonGet200Response**](V1PackagesPackageIdVersionIdJsonGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get package version details |  -  |

