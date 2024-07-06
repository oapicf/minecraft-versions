# DefaultApi

All URIs are relative to *https://launchermeta.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetMinecraftVersionManifest**](DefaultApi.md#GetMinecraftVersionManifest) | **GET** /mc/game/version_manifest.json | Get Minecraft version manifest
[**GetMinecraftVersionPackageInfo**](DefaultApi.md#GetMinecraftVersionPackageInfo) | **GET** /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package info


# **GetMinecraftVersionManifest**
> VersionManifest GetMinecraftVersionManifest()

Get Minecraft version manifest

### Example
```R
library(openapi)

# Get Minecraft version manifest
#

api_instance <- DefaultApi$new()
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GetMinecraftVersionManifest(data_file = "result.txt")
result <- api_instance$GetMinecraftVersionManifest()
dput(result)
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

# **GetMinecraftVersionPackageInfo**
> VersionPackageInfo GetMinecraftVersionPackageInfo(package_id, version_id)

Get Minecraft version package info

### Example
```R
library(openapi)

# Get Minecraft version package info
#
# prepare function argument(s)
var_package_id <- "177e49d3233cb6eac42f0495c0a48e719870c2ae" # character | 
var_version_id <- "1.21" # character | 

api_instance <- DefaultApi$new()
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GetMinecraftVersionPackageInfo(var_package_id, var_version_iddata_file = "result.txt")
result <- api_instance$GetMinecraftVersionPackageInfo(var_package_id, var_version_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **package_id** | **character**|  | 
 **version_id** | **character**|  | 

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

