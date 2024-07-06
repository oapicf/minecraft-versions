# OpenapiClient::DefaultApi

All URIs are relative to *https://launchermeta.mojang.com*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**mc_game_version_manifest_get**](DefaultApi.md#mc_game_version_manifest_get) | **GET** /mc/game/version_manifest | Get Minecraft version manifest |
| [**v1_packages_package_id_version_id_json_get**](DefaultApi.md#v1_packages_package_id_version_id_json_get) | **GET** /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package details |


## mc_game_version_manifest_get

> <McGameVersionManifestGet200Response> mc_game_version_manifest_get

Get Minecraft version manifest

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::DefaultApi.new

begin
  # Get Minecraft version manifest
  result = api_instance.mc_game_version_manifest_get
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DefaultApi->mc_game_version_manifest_get: #{e}"
end
```

#### Using the mc_game_version_manifest_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<McGameVersionManifestGet200Response>, Integer, Hash)> mc_game_version_manifest_get_with_http_info

```ruby
begin
  # Get Minecraft version manifest
  data, status_code, headers = api_instance.mc_game_version_manifest_get_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <McGameVersionManifestGet200Response>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DefaultApi->mc_game_version_manifest_get_with_http_info: #{e}"
end
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


## v1_packages_package_id_version_id_json_get

> <V1PackagesPackageIdVersionIdJsonGet200Response> v1_packages_package_id_version_id_json_get(package_id, version_id)

Get Minecraft version package details

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::DefaultApi.new
package_id = '177e49d3233cb6eac42f0495c0a48e719870c2ae' # String | 
version_id = '1.21' # String | 

begin
  # Get Minecraft version package details
  result = api_instance.v1_packages_package_id_version_id_json_get(package_id, version_id)
  p result
rescue OpenapiClient::ApiError => e
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
rescue OpenapiClient::ApiError => e
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

