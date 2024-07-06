# minecraft_versions

MinecraftVersionsClient - the Ruby gem for the 

SDK for Minecraft versions info

This SDK is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 0.9.0-pre.0
- Package version: 0.9.0-pre.0
- Generator version: 7.6.0
- Build package: org.openapitools.codegen.languages.RubyClientCodegen
For more information, please visit [https://github.com/oapicf/minecraft-versions](https://github.com/oapicf/minecraft-versions)

## Installation

### Build a gem

To build the Ruby code into a gem:

```shell
gem build minecraft_versions.gemspec
```

Then either install the gem locally:

```shell
gem install ./minecraft_versions-0.9.0-pre.0.gem
```

(for development, run `gem install --dev ./minecraft_versions-0.9.0-pre.0.gem` to install the development dependencies)

or publish the gem to a gem hosting service, e.g. [RubyGems](https://rubygems.org/).

Finally add this to the Gemfile:

    gem 'minecraft_versions', '~> 0.9.0-pre.0'

### Install from Git

If the Ruby gem is hosted at a git repository: https://github.com/oapicf/minecraft-versions, then add the following in the Gemfile:

    gem 'minecraft_versions', :git => 'https://github.com/oapicf/minecraft-versions.git'

### Include the Ruby code directly

Include the Ruby code directly using `-I` as follows:

```shell
ruby -Ilib script.rb
```

## Getting Started

Please follow the [installation](#installation) procedure and then run the following code:

```ruby
# Load the gem
require 'minecraft_versions'

api_instance = MinecraftVersionsClient::DefaultApi.new

begin
  #Get Minecraft version manifest
  result = api_instance.get_minecraft_version_manifest
  p result
rescue MinecraftVersionsClient::ApiError => e
  puts "Exception when calling DefaultApi->get_minecraft_version_manifest: #{e}"
end

```

## Documentation for API Endpoints

All URIs are relative to *https://launchermeta.mojang.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*MinecraftVersionsClient::DefaultApi* | [**get_minecraft_version_manifest**](docs/DefaultApi.md#get_minecraft_version_manifest) | **GET** /mc/game/version_manifest.json | Get Minecraft version manifest
*MinecraftVersionsClient::DefaultApi* | [**v1_packages_package_id_version_id_json_get**](docs/DefaultApi.md#v1_packages_package_id_version_id_json_get) | **GET** /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package details


## Documentation for Models

 - [MinecraftVersionsClient::GetMinecraftVersionManifest200Response](docs/GetMinecraftVersionManifest200Response.md)
 - [MinecraftVersionsClient::GetMinecraftVersionManifest200ResponseLatest](docs/GetMinecraftVersionManifest200ResponseLatest.md)
 - [MinecraftVersionsClient::GetMinecraftVersionManifest200ResponseVersionsInner](docs/GetMinecraftVersionManifest200ResponseVersionsInner.md)
 - [MinecraftVersionsClient::V1PackagesPackageIdVersionIdJsonGet200Response](docs/V1PackagesPackageIdVersionIdJsonGet200Response.md)
 - [MinecraftVersionsClient::V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex](docs/V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex.md)
 - [MinecraftVersionsClient::V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads](docs/V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.md)
 - [MinecraftVersionsClient::V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient](docs/V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient.md)
 - [MinecraftVersionsClient::V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion](docs/V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion.md)


## Documentation for Authorization

Endpoints do not require authorization.
