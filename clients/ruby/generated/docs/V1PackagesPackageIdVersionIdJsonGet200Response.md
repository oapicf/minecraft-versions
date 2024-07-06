# MinecraftVersionsClient::V1PackagesPackageIdVersionIdJsonGet200Response

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **version** | **String** |  | [optional] |
| **asset_index** | [**V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex**](V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex.md) |  | [optional] |
| **assets** | **Integer** |  | [optional] |
| **compliance_level** | **Integer** |  | [optional] |
| **downloads** | [**V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads**](V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.md) |  | [optional] |
| **id** | **String** |  | [optional] |
| **java_version** | [**V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion**](V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion.md) |  | [optional] |
| **main_class** | **String** |  | [optional] |
| **minimum_launcher_version** | **Integer** |  | [optional] |
| **time** | **Time** |  | [optional] |
| **release_time** | **Time** |  | [optional] |
| **type** | **String** |  | [optional] |

## Example

```ruby
require 'minecraft_versions'

instance = MinecraftVersionsClient::V1PackagesPackageIdVersionIdJsonGet200Response.new(
  version: null,
  asset_index: null,
  assets: null,
  compliance_level: null,
  downloads: null,
  id: null,
  java_version: null,
  main_class: net.minecraft.client.main.Main,
  minimum_launcher_version: 21,
  time: 2024-04-01T11:14:41Z,
  release_time: 2024-04-01T11:07:19Z,
  type: snapshot
)
```

