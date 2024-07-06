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
*DefaultApi* | [**v1PackagesPackageIdVersionIdJsonGet**](docs/DefaultApi.md#v1packagespackageidversionidjsonget) | **GET** /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package details


<a id="documentation-for-models"></a>
## Documentation for Models

 - [org.openapitools.server.api.model.GetMinecraftVersionManifest200Response](docs/GetMinecraftVersionManifest200Response.md)
 - [org.openapitools.server.api.model.GetMinecraftVersionManifest200ResponseLatest](docs/GetMinecraftVersionManifest200ResponseLatest.md)
 - [org.openapitools.server.api.model.GetMinecraftVersionManifest200ResponseVersionsInner](docs/GetMinecraftVersionManifest200ResponseVersionsInner.md)
 - [org.openapitools.server.api.model.V1PackagesPackageIdVersionIdJsonGet200Response](docs/V1PackagesPackageIdVersionIdJsonGet200Response.md)
 - [org.openapitools.server.api.model.V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex](docs/V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex.md)
 - [org.openapitools.server.api.model.V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads](docs/V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.md)
 - [org.openapitools.server.api.model.V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient](docs/V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient.md)
 - [org.openapitools.server.api.model.V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion](docs/V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization

Endpoints do not require authorization.

