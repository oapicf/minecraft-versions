# DefaultApi

All URIs are relative to *https://launchermeta.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mcGameVersionManifestGet**](DefaultApi.md#mcGameVersionManifestGet) | **GET** /mc/game/version_manifest | Get Minecraft version manifest
[**v1PackagesPackageIdVersionIdJsonGet**](DefaultApi.md#v1PackagesPackageIdVersionIdJsonGet) | **GET** /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package details



## mcGameVersionManifestGet

> McGameVersionManifestGet200Response mcGameVersionManifestGet()

Get Minecraft version manifest

### Example

```java
// Import classes:
//import org.openapitools.client.api.DefaultApi;

DefaultApi apiInstance = new DefaultApi();
try {
    McGameVersionManifestGet200Response result = apiInstance.mcGameVersionManifestGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#mcGameVersionManifestGet");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**McGameVersionManifestGet200Response**](McGameVersionManifestGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1PackagesPackageIdVersionIdJsonGet

> V1PackagesPackageIdVersionIdJsonGet200Response v1PackagesPackageIdVersionIdJsonGet(packageId, versionId)

Get Minecraft version package details

### Example

```java
// Import classes:
//import org.openapitools.client.api.DefaultApi;

DefaultApi apiInstance = new DefaultApi();
String packageId = 177e49d3233cb6eac42f0495c0a48e719870c2ae; // String | 
String versionId = 1.21; // String | 
try {
    V1PackagesPackageIdVersionIdJsonGet200Response result = apiInstance.v1PackagesPackageIdVersionIdJsonGet(packageId, versionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#v1PackagesPackageIdVersionIdJsonGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packageId** | **String**|  | [default to null]
 **versionId** | **String**|  | [default to null]

### Return type

[**V1PackagesPackageIdVersionIdJsonGet200Response**](V1PackagesPackageIdVersionIdJsonGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

