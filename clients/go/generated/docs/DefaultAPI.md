# \DefaultAPI

All URIs are relative to *https://launchermeta.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetMinecraftVersionManifest**](DefaultAPI.md#GetMinecraftVersionManifest) | **Get** /mc/game/version_manifest.json | Get Minecraft version manifest
[**V1PackagesPackageIdVersionIdJsonGet**](DefaultAPI.md#V1PackagesPackageIdVersionIdJsonGet) | **Get** /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package details



## GetMinecraftVersionManifest

> GetMinecraftVersionManifest200Response GetMinecraftVersionManifest(ctx).Execute()

Get Minecraft version manifest

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/minecraft-versions"
)

func main() {

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DefaultAPI.GetMinecraftVersionManifest(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DefaultAPI.GetMinecraftVersionManifest``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetMinecraftVersionManifest`: GetMinecraftVersionManifest200Response
	fmt.Fprintf(os.Stdout, "Response from `DefaultAPI.GetMinecraftVersionManifest`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiGetMinecraftVersionManifestRequest struct via the builder pattern


### Return type

[**GetMinecraftVersionManifest200Response**](GetMinecraftVersionManifest200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1PackagesPackageIdVersionIdJsonGet

> V1PackagesPackageIdVersionIdJsonGet200Response V1PackagesPackageIdVersionIdJsonGet(ctx, packageId, versionId).Execute()

Get Minecraft version package details

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/minecraft-versions"
)

func main() {
	packageId := "177e49d3233cb6eac42f0495c0a48e719870c2ae" // string | 
	versionId := "1.21" // string | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DefaultAPI.V1PackagesPackageIdVersionIdJsonGet(context.Background(), packageId, versionId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DefaultAPI.V1PackagesPackageIdVersionIdJsonGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `V1PackagesPackageIdVersionIdJsonGet`: V1PackagesPackageIdVersionIdJsonGet200Response
	fmt.Fprintf(os.Stdout, "Response from `DefaultAPI.V1PackagesPackageIdVersionIdJsonGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**packageId** | **string** |  | 
**versionId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1PackagesPackageIdVersionIdJsonGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**V1PackagesPackageIdVersionIdJsonGet200Response**](V1PackagesPackageIdVersionIdJsonGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

