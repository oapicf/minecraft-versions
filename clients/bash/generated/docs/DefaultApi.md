# DefaultApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**mcGameVersionManifestGet**](DefaultApi.md#mcGameVersionManifestGet) | **GET** /mc/game/version_manifest | Get Minecraft version manifest
[**v1PackagesPackageIdVersionIdJsonGet**](DefaultApi.md#v1PackagesPackageIdVersionIdJsonGet) | **GET** /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package details



## mcGameVersionManifestGet

Get Minecraft version manifest

### Example

```bash
 mcGameVersionManifestGet
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**McGameVersionManifestGet200Response**](McGameVersionManifestGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## v1PackagesPackageIdVersionIdJsonGet

Get Minecraft version package details

### Example

```bash
 v1PackagesPackageIdVersionIdJsonGet packageId=value versionId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packageId** | **string** |  | [default to null]
 **versionId** | **string** |  | [default to null]

### Return type

[**V1PackagesPackageIdVersionIdJsonGet200Response**](V1PackagesPackageIdVersionIdJsonGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

