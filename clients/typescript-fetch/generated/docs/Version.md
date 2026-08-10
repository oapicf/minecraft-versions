
# Version


## Properties

Name | Type
------------ | -------------
`id` | string
`type` | string
`url` | string
`time` | Date
`releaseTime` | Date

## Example

```typescript
import type { Version } from ''

// TODO: Update the object below with actual values
const example = {
  "id": 24w14potato,
  "type": snapshot,
  "url": https://piston-meta.mojang.com/v1/packages/21df7f4ba484a6437ab5e9dca0b4dfb5dcefc802/24w14potato.json,
  "time": 2024-04-01T11:14:41.000+00:00,
  "releaseTime": 2024-04-01T11:07:19.000+00:00,
} satisfies Version

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as Version
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


