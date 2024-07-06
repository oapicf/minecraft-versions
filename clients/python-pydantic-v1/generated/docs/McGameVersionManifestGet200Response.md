# McGameVersionManifestGet200Response


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**latest** | [**McGameVersionManifestGet200ResponseLatest**](McGameVersionManifestGet200ResponseLatest.md) |  | [optional] 
**versions** | [**List[McGameVersionManifestGet200ResponseVersionsInner]**](McGameVersionManifestGet200ResponseVersionsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mc_game_version_manifest_get200_response import McGameVersionManifestGet200Response

# TODO update the JSON string below
json = "{}"
# create an instance of McGameVersionManifestGet200Response from a JSON string
mc_game_version_manifest_get200_response_instance = McGameVersionManifestGet200Response.from_json(json)
# print the JSON string representation of the object
print McGameVersionManifestGet200Response.to_json()

# convert the object into a dict
mc_game_version_manifest_get200_response_dict = mc_game_version_manifest_get200_response_instance.to_dict()
# create an instance of McGameVersionManifestGet200Response from a dict
mc_game_version_manifest_get200_response_from_dict = McGameVersionManifestGet200Response.from_dict(mc_game_version_manifest_get200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


