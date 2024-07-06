
# Table `VersionManifest`
(mapped from: VersionManifest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**latest** | latest | long |  | [**VersionManifestLatest**](VersionManifestLatest.md) |  |  [optional] [foreignkey]
**versions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;Version&gt;**](Version.md) |  |  [optional]



# **Table `VersionManifestVersion`**
(mapped from: VersionManifestVersion)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
versionManifest | versionManifest | long | | kotlin.Long | Primary Key | *one*
version | version | long | | kotlin.Long | Foreign Key | *many*



