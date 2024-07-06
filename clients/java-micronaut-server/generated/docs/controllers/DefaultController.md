# DefaultController

All URIs are relative to `""`

The controller class is defined in **[DefaultController.java](../../src/main/java/org/openapitools/controller/DefaultController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMinecraftVersionManifest**](#getMinecraftVersionManifest) | **GET** /mc/game/version_manifest.json | Get Minecraft version manifest
[**getMinecraftVersionPackageInfo**](#getMinecraftVersionPackageInfo) | **GET** /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package info

<a id="getMinecraftVersionManifest"></a>
# **getMinecraftVersionManifest**
```java
Mono<VersionManifest> DefaultController.getMinecraftVersionManifest()
```

Get Minecraft version manifest


### Return type
[**VersionManifest**](../../docs/models/VersionManifest.md)


### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="getMinecraftVersionPackageInfo"></a>
# **getMinecraftVersionPackageInfo**
```java
Mono<VersionPackageInfo> DefaultController.getMinecraftVersionPackageInfo(packageIdversionId)
```

Get Minecraft version package info

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**packageId** | `String` |  |
**versionId** | `String` |  |

### Return type
[**VersionPackageInfo**](../../docs/models/VersionPackageInfo.md)


### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

