# MinecraftVersionsClient::Version

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** |  | [optional] |
| **type** | **String** |  | [optional] |
| **url** | **String** |  | [optional] |
| **time** | **Time** |  | [optional] |
| **release_time** | **Time** |  | [optional] |

## Example

```ruby
require 'minecraft_versions'

instance = MinecraftVersionsClient::Version.new(
  id: 24w14potato,
  type: snapshot,
  url: https://piston-meta.mojang.com/v1/packages/21df7f4ba484a6437ab5e9dca0b4dfb5dcefc802/24w14potato.json,
  time: 2024-04-01T11:14:41.000Z,
  release_time: 2024-04-01T11:07:19.000Z
)
```

