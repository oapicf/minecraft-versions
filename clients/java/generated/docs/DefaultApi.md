# DefaultApi

All URIs are relative to *https://launchermeta.mojang.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**mcGameVersionManifestGet**](DefaultApi.md#mcGameVersionManifestGet) | **GET** /mc/game/version_manifest | Get Minecraft version manifest |
| [**v1PackagesPackageIdVersionIdJsonGet**](DefaultApi.md#v1PackagesPackageIdVersionIdJsonGet) | **GET** /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package details |


<a id="mcGameVersionManifestGet"></a>
# **mcGameVersionManifestGet**
> McGameVersionManifestGet200Response mcGameVersionManifestGet()

Get Minecraft version manifest

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://launchermeta.mojang.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      McGameVersionManifestGet200Response result = apiInstance.mcGameVersionManifestGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#mcGameVersionManifestGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of Minecraft versions with the latest and snapshot releases |  -  |

<a id="v1PackagesPackageIdVersionIdJsonGet"></a>
# **v1PackagesPackageIdVersionIdJsonGet**
> V1PackagesPackageIdVersionIdJsonGet200Response v1PackagesPackageIdVersionIdJsonGet(packageId, versionId)

Get Minecraft version package details

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://launchermeta.mojang.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String packageId = "177e49d3233cb6eac42f0495c0a48e719870c2ae"; // String | 
    String versionId = "1.21"; // String | 
    try {
      V1PackagesPackageIdVersionIdJsonGet200Response result = apiInstance.v1PackagesPackageIdVersionIdJsonGet(packageId, versionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#v1PackagesPackageIdVersionIdJsonGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

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

