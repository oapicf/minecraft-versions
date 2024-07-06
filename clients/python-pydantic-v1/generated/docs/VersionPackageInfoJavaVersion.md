# VersionPackageInfoJavaVersion


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**component** | **str** |  | [optional] 
**major_version** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.version_package_info_java_version import VersionPackageInfoJavaVersion

# TODO update the JSON string below
json = "{}"
# create an instance of VersionPackageInfoJavaVersion from a JSON string
version_package_info_java_version_instance = VersionPackageInfoJavaVersion.from_json(json)
# print the JSON string representation of the object
print VersionPackageInfoJavaVersion.to_json()

# convert the object into a dict
version_package_info_java_version_dict = version_package_info_java_version_instance.to_dict()
# create an instance of VersionPackageInfoJavaVersion from a dict
version_package_info_java_version_from_dict = VersionPackageInfoJavaVersion.from_dict(version_package_info_java_version_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


