# VersionPackageInfoAssetIndex


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | [optional] 
**sha1** | **str** |  | [optional] 
**size** | **int** |  | [optional] 
**total_size** | **int** |  | [optional] 
**url** | **str** |  | [optional] 

## Example

```python
from minecraftversions.models.version_package_info_asset_index import VersionPackageInfoAssetIndex

# TODO update the JSON string below
json = "{}"
# create an instance of VersionPackageInfoAssetIndex from a JSON string
version_package_info_asset_index_instance = VersionPackageInfoAssetIndex.from_json(json)
# print the JSON string representation of the object
print(VersionPackageInfoAssetIndex.to_json())

# convert the object into a dict
version_package_info_asset_index_dict = version_package_info_asset_index_instance.to_dict()
# create an instance of VersionPackageInfoAssetIndex from a dict
version_package_info_asset_index_from_dict = VersionPackageInfoAssetIndex.from_dict(version_package_info_asset_index_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


