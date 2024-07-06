# DefaultAPI

All URIs are relative to *https://launchermeta.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMinecraftVersionManifest**](DefaultAPI.md#getminecraftversionmanifest) | **GET** /mc/game/version_manifest.json | Get Minecraft version manifest
[**getMinecraftVersionPackageInfo**](DefaultAPI.md#getminecraftversionpackageinfo) | **GET** /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package info


# **getMinecraftVersionManifest**
```swift
    open class func getMinecraftVersionManifest(completion: @escaping (_ data: VersionManifest?, _ error: Error?) -> Void)
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

[**VersionManifest**](VersionManifest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getMinecraftVersionPackageInfo**
```swift
    open class func getMinecraftVersionPackageInfo(packageId: String, versionId: String, completion: @escaping (_ data: VersionPackageInfo?, _ error: Error?) -> Void)
```

Get Minecraft version package info

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let packageId = "packageId_example" // String | 
let versionId = "versionId_example" // String | 

// Get Minecraft version package info
DefaultAPI.getMinecraftVersionPackageInfo(packageId: packageId, versionId: versionId) { (response, error) in
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

[**VersionPackageInfo**](VersionPackageInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

