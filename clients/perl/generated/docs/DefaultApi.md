# WWW::OpenAPIClient::DefaultApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::DefaultApi;
```

All URIs are relative to *https://launchermeta.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_minecraft_version_manifest**](DefaultApi.md#get_minecraft_version_manifest) | **GET** /mc/game/version_manifest.json | Get Minecraft version manifest
[**get_minecraft_version_package_info**](DefaultApi.md#get_minecraft_version_package_info) | **GET** /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package info


# **get_minecraft_version_manifest**
> VersionManifest get_minecraft_version_manifest()

Get Minecraft version manifest

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::DefaultApi;
my $api_instance = WWW::OpenAPIClient::DefaultApi->new(
);


eval {
    my $result = $api_instance->get_minecraft_version_manifest();
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling DefaultApi->get_minecraft_version_manifest: $@\n";
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

# **get_minecraft_version_package_info**
> VersionPackageInfo get_minecraft_version_package_info(package_id => $package_id, version_id => $version_id)

Get Minecraft version package info

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::DefaultApi;
my $api_instance = WWW::OpenAPIClient::DefaultApi->new(
);

my $package_id = 177e49d3233cb6eac42f0495c0a48e719870c2ae; # string | 
my $version_id = 1.21; # string | 

eval {
    my $result = $api_instance->get_minecraft_version_package_info(package_id => $package_id, version_id => $version_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling DefaultApi->get_minecraft_version_package_info: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **package_id** | **string**|  | 
 **version_id** | **string**|  | 

### Return type

[**VersionPackageInfo**](VersionPackageInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

