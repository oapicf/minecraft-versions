# org.openapitools - Kotlin Server library for 

## Requires

* Kotlin 1.3.10
* Maven 3.3

## Build

```
mvn clean package
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.

<a id="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://launchermeta.mojang.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**getMinecraftVersionManifest**](docs/DefaultApi.md#getminecraftversionmanifest) | **GET** /mc/game/version_manifest.json | Get Minecraft version manifest
*DefaultApi* | [**getMinecraftVersionPackageInfo**](docs/DefaultApi.md#getminecraftversionpackageinfo) | **GET** /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package info


<a id="documentation-for-models"></a>
## Documentation for Models

 - [org.openapitools.server.api.model.Download](docs/Download.md)
 - [org.openapitools.server.api.model.Version](docs/Version.md)
 - [org.openapitools.server.api.model.VersionManifest](docs/VersionManifest.md)
 - [org.openapitools.server.api.model.VersionManifestLatest](docs/VersionManifestLatest.md)
 - [org.openapitools.server.api.model.VersionPackageInfo](docs/VersionPackageInfo.md)
 - [org.openapitools.server.api.model.VersionPackageInfoAssetIndex](docs/VersionPackageInfoAssetIndex.md)
 - [org.openapitools.server.api.model.VersionPackageInfoDownloads](docs/VersionPackageInfoDownloads.md)
 - [org.openapitools.server.api.model.VersionPackageInfoJavaVersion](docs/VersionPackageInfoJavaVersion.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization

Endpoints do not require authorization.

