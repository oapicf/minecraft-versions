# OpenAPIServer
SDK for Minecraft versions info

This [Symfony](https://symfony.com/) bundle is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 0.9.0-pre.0
- Generator version: 7.6.0
- Build package: org.openapitools.codegen.languages.PhpSymfonyServerCodegen
For more information, please visit [https://github.com/oapicf/minecraft-versions](https://github.com/oapicf/minecraft-versions)

## Requirements

PHP 8.0 and later

## Installation & Usage

To install the dependencies via [Composer](http://getcomposer.org/), add the following repository to `composer.json` of your Symfony project:

```json
{
    "repositories": [{
        "type": "path",
        "url": "//Path to your generated openapi bundle"
    }],
}
```

Then run:

```
composer require oapicf/minecraft-versions:dev-master
```

to add the generated openapi bundle as a dependency.

## Tests

To run the unit tests for the generated bundle, first navigate to the directory containing the code, then run the following commands:

```
composer install
./vendor/bin/phpunit
```


## Getting Started

Step 1: Please follow the [installation procedure](#installation--usage) first.

Step 2: Enable the bundle in the bundle configuration:

```php
// app/config/bundles.php
return [
    // ...
    OpenAPI\Server\OpenAPIServerBundle::class => ['all' => true],
];
```

Step 3: Register the routes:

```yaml
# app/config/routes.yaml
open_api_server:
    resource: "@OpenAPIServerBundle/Resources/config/routing.yaml"
```

Step 4: Implement the API calls:

```php
<?php
// src/Acme/MyBundle/Api/DefaultApi.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\DefaultApiInterface;

class DefaultApi implements DefaultApiInterface // An interface is autogenerated
{

    // Other operation methods ...
}
```

Step 5: Tag your API implementation:

```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\DefaultApi:
        tags:
            - { name: "open_api_server.api", api: "default" }
    # ...
```

Now you can start using the bundle!


## Documentation for API Endpoints

All URIs are relative to *https://launchermeta.mojang.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApiInterface* | [**getMinecraftVersionManifest**](docs/Api/DefaultApiInterface.md#getminecraftversionmanifest) | **GET** /mc/game/version_manifest.json | Get Minecraft version manifest
*DefaultApiInterface* | [**v1PackagesPackageIdVersionIdJsonGet**](docs/Api/DefaultApiInterface.md#v1packagespackageidversionidjsonget) | **GET** /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package details


## Documentation For Models

 - [GetMinecraftVersionManifest200Response](docs/Model/GetMinecraftVersionManifest200Response.md)
 - [GetMinecraftVersionManifest200ResponseLatest](docs/Model/GetMinecraftVersionManifest200ResponseLatest.md)
 - [GetMinecraftVersionManifest200ResponseVersionsInner](docs/Model/GetMinecraftVersionManifest200ResponseVersionsInner.md)
 - [V1PackagesPackageIdVersionIdJsonGet200Response](docs/Model/V1PackagesPackageIdVersionIdJsonGet200Response.md)
 - [V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex](docs/Model/V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex.md)
 - [V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads](docs/Model/V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.md)
 - [V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient](docs/Model/V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient.md)
 - [V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion](docs/Model/V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion.md)


## Documentation For Authorization

Endpoints do not require authorization.


## Author

blah+oapicf@cliffano.com
