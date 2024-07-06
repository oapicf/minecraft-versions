# MinecraftVersionsClient::DefaultApi

All URIs are relative to *https://launchermeta.mojang.com*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**get_minecraft_version_manifest**](DefaultApi.md#get_minecraft_version_manifest) | **GET** /mc/game/version_manifest.json | Get Minecraft version manifest |
| [**v1_packages_package_id_version_id_json_get**](DefaultApi.md#v1_packages_package_id_version_id_json_get) | **GET** /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package details |


## get_minecraft_version_manifest

> <GetMinecraftVersionManifest200Response> get_minecraft_version_manifest

Get Minecraft version manifest

### Examples

```ruby
require 'time'
require 'minecraft_versions'

api_instance = MinecraftVersionsClient::DefaultApi.new

begin
  # Get Minecraft version manifest
  result = api_instance.get_minecraft_version_manifest
  p result
rescue MinecraftVersionsClient::ApiError => e
  puts "Error when calling DefaultApi->get_minecraft_version_manifest: #{e}"
end
```

#### Using the get_minecraft_version_manifest_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetMinecraftVersionManifest200Response>, Integer, Hash)> get_minecraft_version_manifest_with_http_info

```ruby
begin
  # Get Minecraft version manifest
  data, status_code, headers = api_instance.get_minecraft_version_manifest_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetMinecraftVersionManifest200Response>
rescue MinecraftVersionsClient::ApiError => e
  puts "Error when calling DefaultApi->get_minecraft_version_manifest_with_http_info: #{e}"
end
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


## v1_packages_package_id_version_id_json_get

> <V1PackagesPackageIdVersionIdJsonGet200Response> v1_packages_package_id_version_id_json_get(package_id, version_id)

Get Minecraft version package details

### Examples

```ruby
require 'time'
require 'minecraft_versions'

api_instance = MinecraftVersionsClient::DefaultApi.new
package_id = '177e49d3233cb6eac42f0495c0a48e719870c2ae' # String | 
version_id = '1.21' # String | 

begin
  # Get Minecraft version package details
  result = api_instance.v1_packages_package_id_version_id_json_get(package_id, version_id)
  p result
rescue MinecraftVersionsClient::ApiError => e
  puts "Error when calling DefaultApi->v1_packages_package_id_version_id_json_get: #{e}"
end
```

#### Using the v1_packages_package_id_version_id_json_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<V1PackagesPackageIdVersionIdJsonGet200Response>, Integer, Hash)> v1_packages_package_id_version_id_json_get_with_http_info(package_id, version_id)

```ruby
begin
  # Get Minecraft version package details
  data, status_code, headers = api_instance.v1_packages_package_id_version_id_json_get_with_http_info(package_id, version_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <V1PackagesPackageIdVersionIdJsonGet200Response>
rescue MinecraftVersionsClient::ApiError => e
  puts "Error when calling DefaultApi->v1_packages_package_id_version_id_json_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **package_id** | **String** |  |  |
| **version_id** | **String** |  |  |

### Return type

[**V1PackagesPackageIdVersionIdJsonGet200Response**](V1PackagesPackageIdVersionIdJsonGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

