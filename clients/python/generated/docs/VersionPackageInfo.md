# VersionPackageInfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | **str** |  | [optional] 
**asset_index** | [**VersionPackageInfoAssetIndex**](VersionPackageInfoAssetIndex.md) |  | [optional] 
**assets** | **str** |  | [optional] 
**compliance_level** | **int** |  | [optional] 
**downloads** | [**VersionPackageInfoDownloads**](VersionPackageInfoDownloads.md) |  | [optional] 
**id** | **str** |  | [optional] 
**java_version** | [**VersionPackageInfoJavaVersion**](VersionPackageInfoJavaVersion.md) |  | [optional] 
**main_class** | **str** |  | [optional] 
**minimum_launcher_version** | **int** |  | [optional] 
**time** | **datetime** |  | [optional] 
**release_time** | **datetime** |  | [optional] 
**type** | **str** |  | [optional] 

## Example

```python
from minecraftversions.models.version_package_info import VersionPackageInfo

# TODO update the JSON string below
json = "{}"
# create an instance of VersionPackageInfo from a JSON string
version_package_info_instance = VersionPackageInfo.from_json(json)
# print the JSON string representation of the object
print(VersionPackageInfo.to_json())

# convert the object into a dict
version_package_info_dict = version_package_info_instance.to_dict()
# create an instance of VersionPackageInfo from a dict
version_package_info_from_dict = VersionPackageInfo.from_dict(version_package_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


