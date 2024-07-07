# PSOpenAPITools - the PowerShell module for the 

SDK for Minecraft versions info

This PowerShell module is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 0.9.0-pre.0
- SDK version: 0.1.2
- Generator version: 7.6.0
- Build package: org.openapitools.codegen.languages.PowerShellClientCodegen
    For more information, please visit [https://github.com/oapicf/minecraft-versions](https://github.com/oapicf/minecraft-versions)

<a id="frameworks-supported"></a>
## Frameworks supported
- PowerShell 6.2 or later

<a id="dependencies"></a>
## Dependencies

<a id="installation"></a>
## Installation


To install from the source, run the following command to build and install the PowerShell module locally:
```powershell
Build.ps1
Import-Module -Name '.\src\PSOpenAPITools' -Verbose
```

To avoid function name collision, one can use `-Prefix`, e.g. `Import-Module -Name '.\src\PSOpenAPITools' -Prefix prefix`

To uninstall the module, simply run:
```powershell
Remove-Module -FullyQualifiedName @{ModuleName = "PSOpenAPITools"; ModuleVersion = "0.1.2"}
```

<a id="tests"></a>
## Tests

To install and run `Pester`, please execute the following commands in the terminal:

```powershell
Install-module -name Pester -force

Invoke-Pester
```

For troubleshooting, please run `$DebugPreference = 'Continue'` to turn on debugging and disable it with `$DebugPreference = 'SilentlyContinue'` when done with the troubleshooting.

## Documentation for API Endpoints

All URIs are relative to *https://launchermeta.mojang.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**Get-MinecraftVersionManifest**](docs/DefaultApi.md#Get-MinecraftVersionManifest) | **GET** /mc/game/version_manifest.json | Get Minecraft version manifest
*DefaultApi* | [**Get-MinecraftVersionPackageInfo**](docs/DefaultApi.md#Get-MinecraftVersionPackageInfo) | **GET** /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package info


## Documentation for Models

 - [PSOpenAPITools\Model.Download](docs/Download.md)
 - [PSOpenAPITools\Model.Version](docs/Version.md)
 - [PSOpenAPITools\Model.VersionManifest](docs/VersionManifest.md)
 - [PSOpenAPITools\Model.VersionManifestLatest](docs/VersionManifestLatest.md)
 - [PSOpenAPITools\Model.VersionPackageInfo](docs/VersionPackageInfo.md)
 - [PSOpenAPITools\Model.VersionPackageInfoAssetIndex](docs/VersionPackageInfoAssetIndex.md)
 - [PSOpenAPITools\Model.VersionPackageInfoDownloads](docs/VersionPackageInfoDownloads.md)
 - [PSOpenAPITools\Model.VersionPackageInfoJavaVersion](docs/VersionPackageInfoJavaVersion.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization

Endpoints do not require authorization.
