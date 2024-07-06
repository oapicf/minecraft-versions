# minecraftversions.DefaultApi

All URIs are relative to *https://launchermeta.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_minecraft_version_manifest**](DefaultApi.md#get_minecraft_version_manifest) | **GET** /mc/game/version_manifest.json | Get Minecraft version manifest
[**v1_packages_package_id_version_id_json_get**](DefaultApi.md#v1_packages_package_id_version_id_json_get) | **GET** /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package details


# **get_minecraft_version_manifest**
> GetMinecraftVersionManifest200Response get_minecraft_version_manifest()

Get Minecraft version manifest

### Example


```python
import minecraftversions
from minecraftversions.models.get_minecraft_version_manifest200_response import GetMinecraftVersionManifest200Response
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

[**GetMinecraftVersionManifest200Response**](GetMinecraftVersionManifest200Response.md)

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

# **v1_packages_package_id_version_id_json_get**
> V1PackagesPackageIdVersionIdJsonGet200Response v1_packages_package_id_version_id_json_get(package_id, version_id)

Get Minecraft version package details

### Example


```python
import minecraftversions
from minecraftversions.models.v1_packages_package_id_version_id_json_get200_response import V1PackagesPackageIdVersionIdJsonGet200Response
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
        # Get Minecraft version package details
        api_response = api_instance.v1_packages_package_id_version_id_json_get(package_id, version_id)
        print("The response of DefaultApi->v1_packages_package_id_version_id_json_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->v1_packages_package_id_version_id_json_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **package_id** | **str**|  | 
 **version_id** | **str**|  | 

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
**200** | Get package version details |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

