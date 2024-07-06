# MinecraftVersionsClient::VersionManifestLatest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **release** | **String** |  | [optional] |
| **snapshot** | **String** |  | [optional] |

## Example

```ruby
require 'minecraft_versions'

instance = MinecraftVersionsClient::VersionManifestLatest.new(
  release: 1.21,
  snapshot: 24w14potato
)
```

