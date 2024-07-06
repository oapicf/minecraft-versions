# MinecraftVersionsClient::VersionManifest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **latest** | [**VersionManifestLatest**](VersionManifestLatest.md) |  | [optional] |
| **versions** | [**Array&lt;Version&gt;**](Version.md) |  | [optional] |

## Example

```ruby
require 'minecraft_versions'

instance = MinecraftVersionsClient::VersionManifest.new(
  latest: null,
  versions: null
)
```

