# DefaultApi

All URIs are relative to *https://launchermeta.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mcGameVersionManifestGet**](DefaultApi.md#mcGameVersionManifestGet) | **GET** /mc/game/version_manifest | Get Minecraft version manifest
[**v1PackagesPackageIdVersionIdJsonGet**](DefaultApi.md#v1PackagesPackageIdVersionIdJsonGet) | **GET** /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package details


<a id="mcGameVersionManifestGet"></a>
# **mcGameVersionManifestGet**
> McGameVersionManifestGet200Response mcGameVersionManifestGet()

Get Minecraft version manifest

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
try {
    val result : McGameVersionManifestGet200Response = apiInstance.mcGameVersionManifestGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#mcGameVersionManifestGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#mcGameVersionManifestGet")
    e.printStackTrace()
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

<a id="v1PackagesPackageIdVersionIdJsonGet"></a>
# **v1PackagesPackageIdVersionIdJsonGet**
> V1PackagesPackageIdVersionIdJsonGet200Response v1PackagesPackageIdVersionIdJsonGet(packageId, versionId)

Get Minecraft version package details

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val packageId : kotlin.String = 177e49d3233cb6eac42f0495c0a48e719870c2ae // kotlin.String | 
val versionId : kotlin.String = 1.21 // kotlin.String | 
try {
    val result : V1PackagesPackageIdVersionIdJsonGet200Response = apiInstance.v1PackagesPackageIdVersionIdJsonGet(packageId, versionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#v1PackagesPackageIdVersionIdJsonGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#v1PackagesPackageIdVersionIdJsonGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packageId** | **kotlin.String**|  |
 **versionId** | **kotlin.String**|  |

### Return type

[**V1PackagesPackageIdVersionIdJsonGet200Response**](V1PackagesPackageIdVersionIdJsonGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

