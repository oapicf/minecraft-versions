
# VersionPackageInfoDownloads


## Properties

Name | Type
------------ | -------------
`client` | [Download](Download.md)
`clientMappings` | [Download](Download.md)
`server` | [Download](Download.md)
`serverMappings` | [Download](Download.md)

## Example

```typescript
import type { VersionPackageInfoDownloads } from ''

// TODO: Update the object below with actual values
const example = {
  "client": null,
  "clientMappings": null,
  "server": null,
  "serverMappings": null,
} satisfies VersionPackageInfoDownloads

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as VersionPackageInfoDownloads
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


