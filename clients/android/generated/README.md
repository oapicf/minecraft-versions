# openapi-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>org.openapitools</groupId>
    <artifactId>openapi-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

- target/openapi-android-client-1.0.0.jar
- target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.openapitools.client.api.DefaultApi;

public class DefaultApiExample {

    public static void main(String[] args) {
        DefaultApi apiInstance = new DefaultApi();
        try {
            McGameVersionManifestGet200Response result = apiInstance.mcGameVersionManifestGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#mcGameVersionManifestGet");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://launchermeta.mojang.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**mcGameVersionManifestGet**](docs/DefaultApi.md#mcGameVersionManifestGet) | **GET** /mc/game/version_manifest | Get Minecraft version manifest
*DefaultApi* | [**v1PackagesPackageIdVersionIdJsonGet**](docs/DefaultApi.md#v1PackagesPackageIdVersionIdJsonGet) | **GET** /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package details


## Documentation for Models

 - [McGameVersionManifestGet200Response](docs/McGameVersionManifestGet200Response.md)
 - [McGameVersionManifestGet200ResponseLatest](docs/McGameVersionManifestGet200ResponseLatest.md)
 - [McGameVersionManifestGet200ResponseVersionsInner](docs/McGameVersionManifestGet200ResponseVersionsInner.md)
 - [V1PackagesPackageIdVersionIdJsonGet200Response](docs/V1PackagesPackageIdVersionIdJsonGet200Response.md)
 - [V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex](docs/V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex.md)
 - [V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads](docs/V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.md)
 - [V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient](docs/V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient.md)
 - [V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion](docs/V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

blah+oapicf@cliffano.com

