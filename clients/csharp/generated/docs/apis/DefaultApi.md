# Org.OpenAPITools.Api.DefaultApi

All URIs are relative to *https://launchermeta.mojang.com*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**GetMinecraftVersionManifest**](DefaultApi.md#getminecraftversionmanifest) | **GET** /mc/game/version_manifest.json | Get Minecraft version manifest |
| [**GetMinecraftVersionPackageInfo**](DefaultApi.md#getminecraftversionpackageinfo) | **GET** /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package info |

<a id="getminecraftversionmanifest"></a>
# **GetMinecraftVersionManifest**
> VersionManifest GetMinecraftVersionManifest ()

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
    public class GetMinecraftVersionManifestExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://launchermeta.mojang.com";
            var apiInstance = new DefaultApi(config);

            try
            {
                // Get Minecraft version manifest
                VersionManifest result = apiInstance.GetMinecraftVersionManifest();
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DefaultApi.GetMinecraftVersionManifest: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetMinecraftVersionManifestWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get Minecraft version manifest
    ApiResponse<VersionManifest> response = apiInstance.GetMinecraftVersionManifestWithHttpInfo();
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DefaultApi.GetMinecraftVersionManifestWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
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


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of Minecraft versions with the latest and snapshot releases |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="getminecraftversionpackageinfo"></a>
# **GetMinecraftVersionPackageInfo**
> VersionPackageInfo GetMinecraftVersionPackageInfo (string packageId, string versionId)

Get Minecraft version package info

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetMinecraftVersionPackageInfoExample
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
                // Get Minecraft version package info
                VersionPackageInfo result = apiInstance.GetMinecraftVersionPackageInfo(packageId, versionId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DefaultApi.GetMinecraftVersionPackageInfo: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetMinecraftVersionPackageInfoWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get Minecraft version package info
    ApiResponse<VersionPackageInfo> response = apiInstance.GetMinecraftVersionPackageInfoWithHttpInfo(packageId, versionId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DefaultApi.GetMinecraftVersionPackageInfoWithHttpInfo: " + e.Message);
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

[**VersionPackageInfo**](VersionPackageInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get package version details |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

