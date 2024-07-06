# minecraftversions.DefaultApi

All URIs are relative to *https://launchermeta.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_minecraft_version_manifest**](DefaultApi.md#get_minecraft_version_manifest) | **GET** /mc/game/version_manifest.json | Get Minecraft version manifest
[**get_minecraft_version_package_info**](DefaultApi.md#get_minecraft_version_package_info) | **GET** /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package info


# **get_minecraft_version_manifest**
> VersionManifest get_minecraft_version_manifest()

Get Minecraft version manifest

### Example


```python
import minecraftversions
from minecraftversions.models.version_manifest import VersionManifest
from minecraftversions.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://launchermeta.mojang.com
# See configuration.py for a list of all supported configuration parameters.
configuration = minecraftversions.Configuration(
    host = "https://launchermeta.mojang.com"
)


# Enter a context with an instance of the API client
with minecraftversions.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = minecraftversions.DefaultApi(api_client)

    try:
        # Get Minecraft version manifest
        api_response = api_instance.get_minecraft_version_manifest()
        print("The response of DefaultApi->get_minecraft_version_manifest:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_minecraft_version_manifest: %s\n" % e)
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
**200** | A list of Minecraft versions with the latest and snapshot releases |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_minecraft_version_package_info**
> VersionPackageInfo get_minecraft_version_package_info(package_id, version_id)

Get Minecraft version package info

### Example


```python
import minecraftversions
from minecraftversions.models.version_package_info import VersionPackageInfo
from minecraftversions.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://launchermeta.mojang.com
# See configuration.py for a list of all supported configuration parameters.
configuration = minecraftversions.Configuration(
    host = "https://launchermeta.mojang.com"
)


# Enter a context with an instance of the API client
with minecraftversions.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = minecraftversions.DefaultApi(api_client)
    package_id = '177e49d3233cb6eac42f0495c0a48e719870c2ae' # str | 
    version_id = '1.21' # str | 

    try:
        # Get Minecraft version package info
        api_response = api_instance.get_minecraft_version_package_info(package_id, version_id)
        print("The response of DefaultApi->get_minecraft_version_package_info:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_minecraft_version_package_info: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **package_id** | **str**|  | 
 **version_id** | **str**|  | 

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
**200** | Get package version details |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

