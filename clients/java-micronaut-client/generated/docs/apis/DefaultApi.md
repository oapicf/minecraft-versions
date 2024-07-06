# DefaultApi

All URIs are relative to *https://launchermeta.mojang.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getMinecraftVersionManifest**](DefaultApi.md#getMinecraftVersionManifest) | **GET** /mc/game/version_manifest.json | Get Minecraft version manifest |
| [**getMinecraftVersionPackageInfo**](DefaultApi.md#getMinecraftVersionPackageInfo) | **GET** /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package info |


## Creating DefaultApi

To initiate an instance of `DefaultApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.DefaultApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(DefaultApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    DefaultApi defaultApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="getMinecraftVersionManifest"></a>
# **getMinecraftVersionManifest**
```java
Mono<VersionManifest> DefaultApi.getMinecraftVersionManifest()
```

Get Minecraft version manifest



### Return type
[**VersionManifest**](VersionManifest.md)



### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="getMinecraftVersionPackageInfo"></a>
# **getMinecraftVersionPackageInfo**
```java
Mono<VersionPackageInfo> DefaultApi.getMinecraftVersionPackageInfo(packageIdversionId)
```

Get Minecraft version package info

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **packageId** | `String`|  | |
| **versionId** | `String`|  | |


### Return type
[**VersionPackageInfo**](VersionPackageInfo.md)



### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

