# OAIDefaultApi

All URIs are relative to *https://launchermeta.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mcGameVersionManifestGet**](OAIDefaultApi.md#mcgameversionmanifestget) | **GET** /mc/game/version_manifest | Get Minecraft version manifest
[**v1PackagesPackageIdVersionIdJsonGet**](OAIDefaultApi.md#v1packagespackageidversionidjsonget) | **GET** /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package details


# **mcGameVersionManifestGet**
```objc
-(NSURLSessionTask*) mcGameVersionManifestGetWithCompletionHandler: 
        (void (^)(OAIMcGameVersionManifestGet200Response* output, NSError* error)) handler;
```

Get Minecraft version manifest

### Example
```objc


OAIDefaultApi*apiInstance = [[OAIDefaultApi alloc] init];

// Get Minecraft version manifest
[apiInstance mcGameVersionManifestGetWithCompletionHandler: 
          ^(OAIMcGameVersionManifestGet200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIDefaultApi->mcGameVersionManifestGet: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OAIMcGameVersionManifestGet200Response***](OAIMcGameVersionManifestGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1PackagesPackageIdVersionIdJsonGet**
```objc
-(NSURLSessionTask*) v1PackagesPackageIdVersionIdJsonGetWithPackageId: (NSString*) packageId
    versionId: (NSString*) versionId
        completionHandler: (void (^)(OAIV1PackagesPackageIdVersionIdJsonGet200Response* output, NSError* error)) handler;
```

Get Minecraft version package details

### Example
```objc

NSString* packageId = 177e49d3233cb6eac42f0495c0a48e719870c2ae; // 
NSString* versionId = 1.21; // 

OAIDefaultApi*apiInstance = [[OAIDefaultApi alloc] init];

// Get Minecraft version package details
[apiInstance v1PackagesPackageIdVersionIdJsonGetWithPackageId:packageId
              versionId:versionId
          completionHandler: ^(OAIV1PackagesPackageIdVersionIdJsonGet200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIDefaultApi->v1PackagesPackageIdVersionIdJsonGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packageId** | **NSString***|  | 
 **versionId** | **NSString***|  | 

### Return type

[**OAIV1PackagesPackageIdVersionIdJsonGet200Response***](OAIV1PackagesPackageIdVersionIdJsonGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

