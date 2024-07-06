# DefaultAPI

All URIs are relative to *https://launchermeta.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMinecraftVersionManifest**](DefaultAPI.md#getminecraftversionmanifest) | **GET** /mc/game/version_manifest.json | Get Minecraft version manifest
[**v1PackagesPackageIdVersionIdJsonGet**](DefaultAPI.md#v1packagespackageidversionidjsonget) | **GET** /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package details


# **getMinecraftVersionManifest**
```swift
    open class func getMinecraftVersionManifest(completion: @escaping (_ data: GetMinecraftVersionManifest200Response?, _ error: Error?) -> Void)
```

Get Minecraft version manifest

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient


// Get Minecraft version manifest
DefaultAPI.getMinecraftVersionManifest() { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetMinecraftVersionManifest200Response**](GetMinecraftVersionManifest200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1PackagesPackageIdVersionIdJsonGet**
```swift
    open class func v1PackagesPackageIdVersionIdJsonGet(packageId: String, versionId: String, completion: @escaping (_ data: V1PackagesPackageIdVersionIdJsonGet200Response?, _ error: Error?) -> Void)
```

Get Minecraft version package details

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let packageId = "packageId_example" // String | 
let versionId = "versionId_example" // String | 

// Get Minecraft version package details
DefaultAPI.v1PackagesPackageIdVersionIdJsonGet(packageId: packageId, versionId: versionId) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packageId** | **String** |  | 
 **versionId** | **String** |  | 

### Return type

[**V1PackagesPackageIdVersionIdJsonGet200Response**](V1PackagesPackageIdVersionIdJsonGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

