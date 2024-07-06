# DefaultController

All URIs are relative to `""`

The controller class is defined in **[DefaultController.java](../../src/main/java/org/openapitools/controller/DefaultController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMinecraftVersionManifest**](#getMinecraftVersionManifest) | **GET** /mc/game/version_manifest.json | Get Minecraft version manifest
[**v1PackagesPackageIdVersionIdJsonGet**](#v1PackagesPackageIdVersionIdJsonGet) | **GET** /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package details

<a id="getMinecraftVersionManifest"></a>
# **getMinecraftVersionManifest**
```java
Mono<GetMinecraftVersionManifest200Response> DefaultController.getMinecraftVersionManifest()
```

Get Minecraft version manifest


### Return type
[**GetMinecraftVersionManifest200Response**](../../docs/models/GetMinecraftVersionManifest200Response.md)


### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="v1PackagesPackageIdVersionIdJsonGet"></a>
# **v1PackagesPackageIdVersionIdJsonGet**
```java
Mono<V1PackagesPackageIdVersionIdJsonGet200Response> DefaultController.v1PackagesPackageIdVersionIdJsonGet(packageIdversionId)
```

Get Minecraft version package details

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**packageId** | `String` |  |
**versionId** | `String` |  |

### Return type
[**V1PackagesPackageIdVersionIdJsonGet200Response**](../../docs/models/V1PackagesPackageIdVersionIdJsonGet200Response.md)


### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

