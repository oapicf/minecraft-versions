# MinecraftVersionsClient::DefaultApi

All URIs are relative to *https://launchermeta.mojang.com*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**get_minecraft_version_manifest**](DefaultApi.md#get_minecraft_version_manifest) | **GET** /mc/game/version_manifest.json | Get Minecraft version manifest |
| [**get_minecraft_version_package_info**](DefaultApi.md#get_minecraft_version_package_info) | **GET** /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package info |


## get_minecraft_version_manifest

> <VersionManifest> get_minecraft_version_manifest

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

> <Array(<VersionManifest>, Integer, Hash)> get_minecraft_version_manifest_with_http_info

```ruby
begin
  # Get Minecraft version manifest
  data, status_code, headers = api_instance.get_minecraft_version_manifest_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <VersionManifest>
rescue MinecraftVersionsClient::ApiError => e
  puts "Error when calling DefaultApi->get_minecraft_version_manifest_with_http_info: #{e}"
end
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


## get_minecraft_version_package_info

> <VersionPackageInfo> get_minecraft_version_package_info(package_id, version_id)

Get Minecraft version package info

### Examples

```ruby
require 'time'
require 'minecraft_versions'

api_instance = MinecraftVersionsClient::DefaultApi.new
package_id = '177e49d3233cb6eac42f0495c0a48e719870c2ae' # String | 
version_id = '1.21' # String | 

begin
  # Get Minecraft version package info
  result = api_instance.get_minecraft_version_package_info(package_id, version_id)
  p result
rescue MinecraftVersionsClient::ApiError => e
  puts "Error when calling DefaultApi->get_minecraft_version_package_info: #{e}"
end
```

#### Using the get_minecraft_version_package_info_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<VersionPackageInfo>, Integer, Hash)> get_minecraft_version_package_info_with_http_info(package_id, version_id)

```ruby
begin
  # Get Minecraft version package info
  data, status_code, headers = api_instance.get_minecraft_version_package_info_with_http_info(package_id, version_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <VersionPackageInfo>
rescue MinecraftVersionsClient::ApiError => e
  puts "Error when calling DefaultApi->get_minecraft_version_package_info_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **package_id** | **String** |  |  |
| **version_id** | **String** |  |  |

### Return type

[**VersionPackageInfo**](VersionPackageInfo.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

