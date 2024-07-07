# minecraftverse
SDK for Minecraft versions info

This Python package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 0.10.1-pre.0
- Package version: 0.10.1-pre.0
- Generator version: 7.6.0
- Build package: org.openapitools.codegen.languages.PythonClientCodegen
For more information, please visit [https://github.com/oapicf/minecraft-versions](https://github.com/oapicf/minecraft-versions)

## Requirements.

Python 3.7+

## Installation & Usage
### pip install

If the python package is hosted on a repository, you can install directly using:

```sh
pip install git+https://github.com/oapicf/minecraft-versions.git
```
(you may need to run `pip` with root permission: `sudo pip install git+https://github.com/oapicf/minecraft-versions.git`)

Then import the package:
```python
import minecraftverse
```

### Setuptools

Install via [Setuptools](http://pypi.python.org/pypi/setuptools).

```sh
python setup.py install --user
```
(or `sudo python setup.py install` to install the package for all users)

Then import the package:
```python
import minecraftverse
```

### Tests

Execute `pytest` to run the tests.

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```python

import minecraftverse
from minecraftverse.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://launchermeta.mojang.com
# See configuration.py for a list of all supported configuration parameters.
configuration = minecraftverse.Configuration(
    host = "https://launchermeta.mojang.com"
)



# Enter a context with an instance of the API client
with minecraftverse.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = minecraftverse.DefaultApi(api_client)

    try:
        # Get Minecraft version manifest
        api_response = api_instance.get_minecraft_version_manifest()
        print("The response of DefaultApi->get_minecraft_version_manifest:\n")
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling DefaultApi->get_minecraft_version_manifest: %s\n" % e)

```

## Documentation for API Endpoints

All URIs are relative to *https://launchermeta.mojang.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**get_minecraft_version_manifest**](docs/DefaultApi.md#get_minecraft_version_manifest) | **GET** /mc/game/version_manifest.json | Get Minecraft version manifest
*DefaultApi* | [**get_minecraft_version_package_info**](docs/DefaultApi.md#get_minecraft_version_package_info) | **GET** /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package info


## Documentation For Models

 - [Download](docs/Download.md)
 - [Version](docs/Version.md)
 - [VersionManifest](docs/VersionManifest.md)
 - [VersionManifestLatest](docs/VersionManifestLatest.md)
 - [VersionPackageInfo](docs/VersionPackageInfo.md)
 - [VersionPackageInfoAssetIndex](docs/VersionPackageInfoAssetIndex.md)
 - [VersionPackageInfoDownloads](docs/VersionPackageInfoDownloads.md)
 - [VersionPackageInfoJavaVersion](docs/VersionPackageInfoJavaVersion.md)


<a id="documentation-for-authorization"></a>
## Documentation For Authorization

Endpoints do not require authorization.


## Author

blah+oapicf@cliffano.com

