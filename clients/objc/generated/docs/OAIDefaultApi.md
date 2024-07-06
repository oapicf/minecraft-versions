# OAIDefaultApi

All URIs are relative to *https://launchermeta.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMinecraftVersionManifest**](OAIDefaultApi.md#getminecraftversionmanifest) | **GET** /mc/game/version_manifest.json | Get Minecraft version manifest
[**getMinecraftVersionPackageInfo**](OAIDefaultApi.md#getminecraftversionpackageinfo) | **GET** /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package info


# **getMinecraftVersionManifest**
```objc
-(NSURLSessionTask*) getMinecraftVersionManifestWithCompletionHandler: 
        (void (^)(OAIVersionManifest* output, NSError* error)) handler;
```

Get Minecraft version manifest

### Example
```objc


OAIDefaultApi*apiInstance = [[OAIDefaultApi alloc] init];

// Get Minecraft version manifest
[apiInstance getMinecraftVersionManifestWithCompletionHandler: 
          ^(OAIVersionManifest* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIDefaultApi->getMinecraftVersionManifest: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OAIVersionManifest***](OAIVersionManifest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getMinecraftVersionPackageInfo**
```objc
-(NSURLSessionTask*) getMinecraftVersionPackageInfoWithPackageId: (NSString*) packageId
    versionId: (NSString*) versionId
        completionHandler: (void (^)(OAIVersionPackageInfo* output, NSError* error)) handler;
```

Get Minecraft version package info

### Example
```objc

NSString* packageId = 177e49d3233cb6eac42f0495c0a48e719870c2ae; // 
NSString* versionId = 1.21; // 

OAIDefaultApi*apiInstance = [[OAIDefaultApi alloc] init];

// Get Minecraft version package info
[apiInstance getMinecraftVersionPackageInfoWithPackageId:packageId
              versionId:versionId
          completionHandler: ^(OAIVersionPackageInfo* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIDefaultApi->getMinecraftVersionPackageInfo: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packageId** | **NSString***|  | 
 **versionId** | **NSString***|  | 

### Return type

[**OAIVersionPackageInfo***](OAIVersionPackageInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

