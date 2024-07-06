# DefaultApi

All URIs are relative to *https://launchermeta.mojang.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**mcGameVersionManifestGet**](DefaultApi.md#mcGameVersionManifestGet) | **GET** /mc/game/version_manifest | Get Minecraft version manifest |
| [**v1PackagesPackageIdVersionIdJsonGet**](DefaultApi.md#v1PackagesPackageIdVersionIdJsonGet) | **GET** /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package details |


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

<a id="mcGameVersionManifestGet"></a>
# **mcGameVersionManifestGet**
```java
Mono<McGameVersionManifestGet200Response> DefaultApi.mcGameVersionManifestGet()
```

Get Minecraft version manifest



### Return type
[**McGameVersionManifestGet200Response**](McGameVersionManifestGet200Response.md)



### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="v1PackagesPackageIdVersionIdJsonGet"></a>
# **v1PackagesPackageIdVersionIdJsonGet**
```java
Mono<V1PackagesPackageIdVersionIdJsonGet200Response> DefaultApi.v1PackagesPackageIdVersionIdJsonGet(packageIdversionId)
```

Get Minecraft version package details

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **packageId** | `String`|  | |
| **versionId** | `String`|  | |


### Return type
[**V1PackagesPackageIdVersionIdJsonGet200Response**](V1PackagesPackageIdVersionIdJsonGet200Response.md)



### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

