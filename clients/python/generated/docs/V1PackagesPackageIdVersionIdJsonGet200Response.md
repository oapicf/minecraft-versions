# V1PackagesPackageIdVersionIdJsonGet200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | **str** |  | [optional] 
**asset_index** | [**V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex**](V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex.md) |  | [optional] 
**assets** | **int** |  | [optional] 
**compliance_level** | **int** |  | [optional] 
**downloads** | [**V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads**](V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.md) |  | [optional] 
**id** | **str** |  | [optional] 
**java_version** | [**V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion**](V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion.md) |  | [optional] 
**main_class** | **str** |  | [optional] 
**minimum_launcher_version** | **int** |  | [optional] 
**time** | **datetime** |  | [optional] 
**release_time** | **datetime** |  | [optional] 
**type** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.v1_packages_package_id_version_id_json_get200_response import V1PackagesPackageIdVersionIdJsonGet200Response

# TODO update the JSON string below
json = "{}"
# create an instance of V1PackagesPackageIdVersionIdJsonGet200Response from a JSON string
v1_packages_package_id_version_id_json_get200_response_instance = V1PackagesPackageIdVersionIdJsonGet200Response.from_json(json)
# print the JSON string representation of the object
print(V1PackagesPackageIdVersionIdJsonGet200Response.to_json())

# convert the object into a dict
v1_packages_package_id_version_id_json_get200_response_dict = v1_packages_package_id_version_id_json_get200_response_instance.to_dict()
# create an instance of V1PackagesPackageIdVersionIdJsonGet200Response from a dict
v1_packages_package_id_version_id_json_get200_response_from_dict = V1PackagesPackageIdVersionIdJsonGet200Response.from_dict(v1_packages_package_id_version_id_json_get200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


