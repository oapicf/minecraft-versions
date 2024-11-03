# DefaultApi

All URIs are relative to *https://launchermeta.mojang.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getMinecraftVersionManifest**](DefaultApi.md#getMinecraftVersionManifest) | **GET** /mc/game/version_manifest.json | Get Minecraft version manifest |
| [**getMinecraftVersionPackageInfo**](DefaultApi.md#getMinecraftVersionPackageInfo) | **GET** /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package info |


<a id="getMinecraftVersionManifest"></a>
# **getMinecraftVersionManifest**
> VersionManifest getMinecraftVersionManifest()

Get Minecraft version manifest

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
try {
    val result : VersionManifest = apiInstance.getMinecraftVersionManifest()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getMinecraftVersionManifest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getMinecraftVersionManifest")
    e.printStackTrace()
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

<a id="getMinecraftVersionPackageInfo"></a>
# **getMinecraftVersionPackageInfo**
> VersionPackageInfo getMinecraftVersionPackageInfo(packageId, versionId)

Get Minecraft version package info

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val packageId : kotlin.String = 177e49d3233cb6eac42f0495c0a48e719870c2ae // kotlin.String | 
val versionId : kotlin.String = 1.21 // kotlin.String | 
try {
    val result : VersionPackageInfo = apiInstance.getMinecraftVersionPackageInfo(packageId, versionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getMinecraftVersionPackageInfo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getMinecraftVersionPackageInfo")
    e.printStackTrace()
}
```

### Parameters
| **packageId** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **versionId** | **kotlin.String**|  | |

### Return type

[**VersionPackageInfo**](VersionPackageInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

