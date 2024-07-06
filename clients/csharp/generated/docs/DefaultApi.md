# Org.OpenAPITools.Api.DefaultApi

All URIs are relative to *https://launchermeta.mojang.com*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**McGameVersionManifestGet**](DefaultApi.md#mcgameversionmanifestget) | **GET** /mc/game/version_manifest | Get Minecraft version manifest |
| [**V1PackagesPackageIdVersionIdJsonGet**](DefaultApi.md#v1packagespackageidversionidjsonget) | **GET** /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package details |

<a id="mcgameversionmanifestget"></a>
# **McGameVersionManifestGet**
> McGameVersionManifestGet200Response McGameVersionManifestGet ()

Get Minecraft version manifest

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class McGameVersionManifestGetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://launchermeta.mojang.com";
            var apiInstance = new DefaultApi(config);

            try
            {
                // Get Minecraft version manifest
                McGameVersionManifestGet200Response result = apiInstance.McGameVersionManifestGet();
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DefaultApi.McGameVersionManifestGet: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the McGameVersionManifestGetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get Minecraft version manifest
    ApiResponse<McGameVersionManifestGet200Response> response = apiInstance.McGameVersionManifestGetWithHttpInfo();
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DefaultApi.McGameVersionManifestGetWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="v1packagespackageidversionidjsonget"></a>
# **V1PackagesPackageIdVersionIdJsonGet**
> V1PackagesPackageIdVersionIdJsonGet200Response V1PackagesPackageIdVersionIdJsonGet (string packageId, string versionId)

Get Minecraft version package details

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class V1PackagesPackageIdVersionIdJsonGetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://launchermeta.mojang.com";
            var apiInstance = new DefaultApi(config);
            var packageId = 177e49d3233cb6eac42f0495c0a48e719870c2ae;  // string | 
            var versionId = 1.21;  // string | 

            try
            {
                // Get Minecraft version package details
                V1PackagesPackageIdVersionIdJsonGet200Response result = apiInstance.V1PackagesPackageIdVersionIdJsonGet(packageId, versionId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DefaultApi.V1PackagesPackageIdVersionIdJsonGet: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the V1PackagesPackageIdVersionIdJsonGetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get Minecraft version package details
    ApiResponse<V1PackagesPackageIdVersionIdJsonGet200Response> response = apiInstance.V1PackagesPackageIdVersionIdJsonGetWithHttpInfo(packageId, versionId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DefaultApi.V1PackagesPackageIdVersionIdJsonGetWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **packageId** | **string** |  |  |
| **versionId** | **string** |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

