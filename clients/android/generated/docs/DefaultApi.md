# DefaultApi

All URIs are relative to *https://launchermeta.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMinecraftVersionManifest**](DefaultApi.md#getMinecraftVersionManifest) | **GET** /mc/game/version_manifest.json | Get Minecraft version manifest
[**getMinecraftVersionPackageInfo**](DefaultApi.md#getMinecraftVersionPackageInfo) | **GET** /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package info



## getMinecraftVersionManifest

> VersionManifest getMinecraftVersionManifest()

Get Minecraft version manifest

### Example

```java
// Import classes:
//import org.openapitools.client.api.DefaultApi;

DefaultApi apiInstance = new DefaultApi();
try {
    VersionManifest result = apiInstance.getMinecraftVersionManifest();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getMinecraftVersionManifest");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**VersionManifest**](VersionManifest.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getMinecraftVersionPackageInfo

> VersionPackageInfo getMinecraftVersionPackageInfo(packageId, versionId)

Get Minecraft version package info

### Example

```java
// Import classes:
//import org.openapitools.client.api.DefaultApi;

DefaultApi apiInstance = new DefaultApi();
String packageId = 177e49d3233cb6eac42f0495c0a48e719870c2ae; // String | 
String versionId = 1.21; // String | 
try {
    VersionPackageInfo result = apiInstance.getMinecraftVersionPackageInfo(packageId, versionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getMinecraftVersionPackageInfo");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packageId** | **String**|  | [default to null]
 **versionId** | **String**|  | [default to null]

### Return type

[**VersionPackageInfo**](VersionPackageInfo.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

