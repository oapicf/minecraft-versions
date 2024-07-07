# VersionManifestLatest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**release** | **str** |  | [optional] 
**snapshot** | **str** |  | [optional] 

## Example

```python
from minecraft_versions.models.version_manifest_latest import VersionManifestLatest

# TODO update the JSON string below
json = "{}"
# create an instance of VersionManifestLatest from a JSON string
version_manifest_latest_instance = VersionManifestLatest.from_json(json)
# print the JSON string representation of the object
print(VersionManifestLatest.to_json())

# convert the object into a dict
version_manifest_latest_dict = version_manifest_latest_instance.to_dict()
# create an instance of VersionManifestLatest from a dict
version_manifest_latest_from_dict = VersionManifestLatest.from_dict(version_manifest_latest_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


