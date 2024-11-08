# DefaultApi

All URIs are relative to *https://launchermeta.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMinecraftVersionManifest**](DefaultApi.md#getMinecraftVersionManifest) | **GET** /mc/game/version_manifest.json | Get Minecraft version manifest
[**getMinecraftVersionManifestWithHttpInfo**](DefaultApi.md#getMinecraftVersionManifestWithHttpInfo) | **GET** /mc/game/version_manifest.json | Get Minecraft version manifest
[**getMinecraftVersionPackageInfo**](DefaultApi.md#getMinecraftVersionPackageInfo) | **GET** /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package info
[**getMinecraftVersionPackageInfoWithHttpInfo**](DefaultApi.md#getMinecraftVersionPackageInfoWithHttpInfo) | **GET** /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package info



## getMinecraftVersionManifest

> getMinecraftVersionManifest(): ApiRequest[VersionManifest]

Get Minecraft version manifest

### Example

```scala
// Import classes:
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import org.apache.pekko.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher

    val apiInvoker = ApiInvoker()
    val apiInstance = DefaultApi("https://launchermeta.mojang.com")    
    val request = apiInstance.getMinecraftVersionManifest()
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling DefaultApi#getMinecraftVersionManifest")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling DefaultApi#getMinecraftVersionManifest")
            exception.printStackTrace();
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

ApiRequest[[**VersionManifest**](VersionManifest.md)]


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

> getMinecraftVersionPackageInfo(getMinecraftVersionPackageInfoRequest): ApiRequest[VersionPackageInfo]

Get Minecraft version package info

### Example

```scala
// Import classes:
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import org.apache.pekko.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher

    val apiInvoker = ApiInvoker()
    val apiInstance = DefaultApi("https://launchermeta.mojang.com")
    val packageId: String = 177e49d3233cb6eac42f0495c0a48e719870c2ae // String | 

    val versionId: String = 1.21 // String | 
    
    val request = apiInstance.getMinecraftVersionPackageInfo(packageId, versionId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling DefaultApi#getMinecraftVersionPackageInfo")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling DefaultApi#getMinecraftVersionPackageInfo")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packageId** | **String**|  |
 **versionId** | **String**|  |

### Return type

ApiRequest[[**VersionPackageInfo**](VersionPackageInfo.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get package version details |  -  |

