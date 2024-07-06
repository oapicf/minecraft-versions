# MinecraftVersionsClient::VersionPackageInfoDownloads

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **client** | [**Download**](Download.md) |  | [optional] |
| **client_mappings** | [**Download**](Download.md) |  | [optional] |
| **server** | [**Download**](Download.md) |  | [optional] |
| **server_mappings** | [**Download**](Download.md) |  | [optional] |

## Example

```ruby
require 'minecraft_versions'

instance = MinecraftVersionsClient::VersionPackageInfoDownloads.new(
  client: null,
  client_mappings: null,
  server: null,
  server_mappings: null
)
```

