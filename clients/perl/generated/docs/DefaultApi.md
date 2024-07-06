# WWW::OpenAPIClient::DefaultApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::DefaultApi;
```

All URIs are relative to *https://launchermeta.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_minecraft_version_manifest**](DefaultApi.md#get_minecraft_version_manifest) | **GET** /mc/game/version_manifest.json | Get Minecraft version manifest
[**v1_packages_package_id_version_id_json_get**](DefaultApi.md#v1_packages_package_id_version_id_json_get) | **GET** /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package details


# **get_minecraft_version_manifest**
> GetMinecraftVersionManifest200Response get_minecraft_version_manifest()

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

[**GetMinecraftVersionManifest200Response**](GetMinecraftVersionManifest200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1_packages_package_id_version_id_json_get**
> V1PackagesPackageIdVersionIdJsonGet200Response v1_packages_package_id_version_id_json_get(package_id => $package_id, version_id => $version_id)

Get Minecraft version package details

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::DefaultApi;
my $api_instance = WWW::OpenAPIClient::DefaultApi->new(
);

my $package_id = 177e49d3233cb6eac42f0495c0a48e719870c2ae; # string | 
my $version_id = 1.21; # string | 

eval {
    my $result = $api_instance->v1_packages_package_id_version_id_json_get(package_id => $package_id, version_id => $version_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling DefaultApi->v1_packages_package_id_version_id_json_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **package_id** | **string**|  | 
 **version_id** | **string**|  | 

### Return type

[**V1PackagesPackageIdVersionIdJsonGet200Response**](V1PackagesPackageIdVersionIdJsonGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

