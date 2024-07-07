# Eiffel API client for openapi

SDK for Minecraft versions info

## Overview
This API client was generated by the [OpenAPI Generator](https://openapi-generator.tech) project.  By using the [openapi-spec](https://openapis.org) from a remote server, you can easily generate an API client.

- API version: 0.9.0-pre.0
- Package version: 1.0.0
- Generator version: 7.6.0
- Build package: org.openapitools.codegen.languages.EiffelClientCodegen
For more information, please visit [https://github.com/oapicf/minecraft-versions](https://github.com/oapicf/minecraft-versions)

## Installation
Add the library into your Eiffel configuration file.
```
    "<library name="api_client" location="%PATH_TO_EIFFEL_OPENAPI_CLIENT%\api_client.ecf"/>"
```

## Documentation for API Endpoints

All URIs are relative to *https://launchermeta.mojang.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DEFAULT_API* | [**minecraft_version_manifest**](docs/DEFAULT_API.md#minecraft_version_manifest) | **Get** /mc/game/version_manifest.json | Get Minecraft version manifest
*DEFAULT_API* | [**minecraft_version_package_info**](docs/DEFAULT_API.md#minecraft_version_package_info) | **Get** /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package info


## Documentation For Models

 - [DOWNLOAD](docs/DOWNLOAD.md)
 - [VERSION](docs/VERSION.md)
 - [VERSION_MANIFEST](docs/VERSION_MANIFEST.md)
 - [VERSION_MANIFEST_LATEST](docs/VERSION_MANIFEST_LATEST.md)
 - [VERSION_PACKAGE_INFO](docs/VERSION_PACKAGE_INFO.md)
 - [VERSION_PACKAGE_INFO_ASSET_INDEX](docs/VERSION_PACKAGE_INFO_ASSET_INDEX.md)
 - [VERSION_PACKAGE_INFO_DOWNLOADS](docs/VERSION_PACKAGE_INFO_DOWNLOADS.md)
 - [VERSION_PACKAGE_INFO_JAVA_VERSION](docs/VERSION_PACKAGE_INFO_JAVA_VERSION.md)


## Documentation For Authorization

 All endpoints do not require authorization.


## Author

blah+oapicf@cliffano.com
