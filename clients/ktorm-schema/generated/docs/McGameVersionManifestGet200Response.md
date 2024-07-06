
# Table `_mc_game_version_manifest_get_200_response`
(mapped from: McGameVersionManifestGet200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**latest** | latest | long |  | [**McGameVersionManifestGet200ResponseLatest**](McGameVersionManifestGet200ResponseLatest.md) |  |  [optional] [foreignkey]
**versions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;McGameVersionManifestGet200ResponseVersionsInner&gt;**](McGameVersionManifestGet200ResponseVersionsInner.md) |  |  [optional]



# **Table `McGameVersionManifestGet200ResponseMcGameVersionManifestGet200ResponseVersionsInner`**
(mapped from: McGameVersionManifestGet200ResponseMcGameVersionManifestGet200ResponseVersionsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
mcGameVersionManifestGet200Response | mcGameVersionManifestGet200Response | long | | kotlin.Long | Primary Key | *one*
mcGameVersionManifestGet200ResponseVersionsInner | mcGameVersionManifestGet200ResponseVersionsInner | long | | kotlin.Long | Foreign Key | *many*



