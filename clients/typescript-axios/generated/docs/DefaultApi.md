# DefaultApi

All URIs are relative to *https://launchermeta.mojang.com*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**getMinecraftVersionManifest**](#getminecraftversionmanifest) | **GET** /mc/game/version_manifest.json | Get Minecraft version manifest|
|[**getMinecraftVersionPackageInfo**](#getminecraftversionpackageinfo) | **GET** /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package info|

# **getMinecraftVersionManifest**
> VersionManifest getMinecraftVersionManifest()


### Example

```typescript
import {
    DefaultApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new DefaultApi(configuration);

const { status, data } = await apiInstance.getMinecraftVersionManifest();
```

### Parameters
This endpoint does not have any parameters.


### Return type

**VersionManifest**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | A list of Minecraft versions with the latest and snapshot releases |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getMinecraftVersionPackageInfo**
> VersionPackageInfo getMinecraftVersionPackageInfo()


### Example

```typescript
import {
    DefaultApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new DefaultApi(configuration);

let packageId: string; // (default to undefined)
let versionId: string; // (default to undefined)

const { status, data } = await apiInstance.getMinecraftVersionPackageInfo(
    packageId,
    versionId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **packageId** | [**string**] |  | defaults to undefined|
| **versionId** | [**string**] |  | defaults to undefined|


### Return type

**VersionPackageInfo**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Get package version details |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

