# openapi-client


- API version: 0.9.0-pre.0
  - Generator version: 7.6.0

SDK for Minecraft versions info

  For more information, please visit [https://github.com/oapicf/minecraft-versions](https://github.com/oapicf/minecraft-versions)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle/SBT

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-client:1.0.0"
```

### SBT users

```scala
libraryDependencies += "org.openapitools" % "openapi-client" % "1.0.0"
```

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```scala

import org.openapitools.client.core._
import org.openapitools.client.model._
import org.openapitools.client.api.DefaultApi

import org.apache.pekko.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object DefaultApiExample extends App {

    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    // Create invoker to execute requests
    val apiInvoker = ApiInvoker()
    val apiInstance = DefaultApi("https://launchermeta.mojang.com")
    val request = apiInstance.getMinecraftVersionManifest()
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(org.openapitools.client.core.ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")

        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling DefaultApi#getMinecraftVersionManifest")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) =>
            System.err.println("Exception when calling DefaultApi#getMinecraftVersionManifest")
            exception.printStackTrace();
    }

}

```

## Documentation for API Endpoints

All URIs are relative to *https://launchermeta.mojang.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**getMinecraftVersionManifest**](docs/DefaultApi.md#getMinecraftVersionManifest) | **GET** /mc/game/version_manifest.json | Get Minecraft version manifest
*DefaultApi* | [**v1PackagesPackageIdVersionIdJsonGet**](docs/DefaultApi.md#v1PackagesPackageIdVersionIdJsonGet) | **GET** /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package details


## Documentation for Models

 - [GetMinecraftVersionManifest200Response](docs/GetMinecraftVersionManifest200Response.md)
 - [GetMinecraftVersionManifest200ResponseLatest](docs/GetMinecraftVersionManifest200ResponseLatest.md)
 - [GetMinecraftVersionManifest200ResponseVersionsInner](docs/GetMinecraftVersionManifest200ResponseVersionsInner.md)
 - [V1PackagesPackageIdVersionIdJsonGet200Response](docs/V1PackagesPackageIdVersionIdJsonGet200Response.md)
 - [V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex](docs/V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex.md)
 - [V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads](docs/V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.md)
 - [V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient](docs/V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient.md)
 - [V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion](docs/V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization

Endpoints do not require authorization.


## Author

blah+oapicf@cliffano.com
