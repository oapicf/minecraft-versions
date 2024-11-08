# OpenAPI\Client\DefaultApi

All URIs are relative to https://launchermeta.mojang.com, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getMinecraftVersionManifest()**](DefaultApi.md#getMinecraftVersionManifest) | **GET** /mc/game/version_manifest.json | Get Minecraft version manifest |
| [**getMinecraftVersionPackageInfo()**](DefaultApi.md#getMinecraftVersionPackageInfo) | **GET** /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package info |


## `getMinecraftVersionManifest()`

```php
getMinecraftVersionManifest(): \OpenAPI\Client\Model\VersionManifest
```

Get Minecraft version manifest

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DefaultApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $result = $apiInstance->getMinecraftVersionManifest();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DefaultApi->getMinecraftVersionManifest: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**\OpenAPI\Client\Model\VersionManifest**](../Model/VersionManifest.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getMinecraftVersionPackageInfo()`

```php
getMinecraftVersionPackageInfo($package_id, $version_id): \OpenAPI\Client\Model\VersionPackageInfo
```

Get Minecraft version package info

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DefaultApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$package_id = 177e49d3233cb6eac42f0495c0a48e719870c2ae; // string
$version_id = 1.21; // string

try {
    $result = $apiInstance->getMinecraftVersionPackageInfo($package_id, $version_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DefaultApi->getMinecraftVersionPackageInfo: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **package_id** | **string**|  | |
| **version_id** | **string**|  | |

### Return type

[**\OpenAPI\Client\Model\VersionPackageInfo**](../Model/VersionPackageInfo.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
