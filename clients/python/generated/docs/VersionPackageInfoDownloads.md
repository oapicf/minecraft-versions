# VersionPackageInfoDownloads


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**client** | [**Download**](Download.md) |  | [optional] 
**client_mappings** | [**Download**](Download.md) |  | [optional] 
**server** | [**Download**](Download.md) |  | [optional] 
**server_mappings** | [**Download**](Download.md) |  | [optional] 

## Example

```python
from minecraft_versions.models.version_package_info_downloads import VersionPackageInfoDownloads

# TODO update the JSON string below
json = "{}"
# create an instance of VersionPackageInfoDownloads from a JSON string
version_package_info_downloads_instance = VersionPackageInfoDownloads.from_json(json)
# print the JSON string representation of the object
print(VersionPackageInfoDownloads.to_json())

# convert the object into a dict
version_package_info_downloads_dict = version_package_info_downloads_instance.to_dict()
# create an instance of VersionPackageInfoDownloads from a dict
version_package_info_downloads_from_dict = VersionPackageInfoDownloads.from_dict(version_package_info_downloads_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


