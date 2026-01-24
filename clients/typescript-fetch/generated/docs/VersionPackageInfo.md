
# VersionPackageInfo


## Properties

Name | Type
------------ | -------------
`version` | string
`assetIndex` | [VersionPackageInfoAssetIndex](VersionPackageInfoAssetIndex.md)
`assets` | string
`complianceLevel` | number
`downloads` | [VersionPackageInfoDownloads](VersionPackageInfoDownloads.md)
`id` | string
`javaVersion` | [VersionPackageInfoJavaVersion](VersionPackageInfoJavaVersion.md)
`mainClass` | string
`minimumLauncherVersion` | number
`time` | Date
`releaseTime` | Date
`type` | string

## Example

```typescript
import type { VersionPackageInfo } from ''

// TODO: Update the object below with actual values
const example = {
  "version": null,
  "assetIndex": null,
  "assets": null,
  "complianceLevel": null,
  "downloads": null,
  "id": null,
  "javaVersion": null,
  "mainClass": net.minecraft.client.main.Main,
  "minimumLauncherVersion": 21,
  "time": 2024-04-01T11:14:41.000Z,
  "releaseTime": 2024-04-01T11:07:19.000Z,
  "type": snapshot,
} satisfies VersionPackageInfo

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as VersionPackageInfo
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


