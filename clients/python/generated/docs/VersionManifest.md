# VersionManifest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**latest** | [**VersionManifestLatest**](VersionManifestLatest.md) |  | [optional] 
**versions** | [**List[Version]**](Version.md) |  | [optional] 

## Example

```python
from minecraft_versions.models.version_manifest import VersionManifest

# TODO update the JSON string below
json = "{}"
# create an instance of VersionManifest from a JSON string
version_manifest_instance = VersionManifest.from_json(json)
# print the JSON string representation of the object
print(VersionManifest.to_json())

# convert the object into a dict
version_manifest_dict = version_manifest_instance.to_dict()
# create an instance of VersionManifest from a dict
version_manifest_from_dict = VersionManifest.from_dict(version_manifest_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


