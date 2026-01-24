
# VersionManifest


## Properties

Name | Type
------------ | -------------
`latest` | [VersionManifestLatest](VersionManifestLatest.md)
`versions` | [Array&lt;Version&gt;](Version.md)

## Example

```typescript
import type { VersionManifest } from ''

// TODO: Update the object below with actual values
const example = {
  "latest": null,
  "versions": null,
} satisfies VersionManifest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as VersionManifest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


