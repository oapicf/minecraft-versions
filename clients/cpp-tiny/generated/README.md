# Documentation for OpenAPI Petstore
This is a client generator for microcontrollers on the Espressif32 platform and the Arduino framework
After the client have been generated, you have to change these following variables:
- root.cert | Provide your service root certificate.
- src/main.cpp | Change wifi name
- src/main.cpp | Change wifi password
- lib/service/AbstractService.h | Change to your url

# Documentation for  0.9.0-pre.0 Tiny client cpp (Arduino) 

The project is structured like this:
```
samples/client/petstore/tiny/cpp/
├── lib
│   ├── Models
│   ├── service
│   └── TestFiles
├── platformio.ini
├── pre_compiling_bourne.py
├── README.md
├── root.cert
├── src
│   └── main.cpp
└── test
    └── RunTests.cpp
```

All URIs are relative to https://launchermeta.mojang.comhttps://launchermeta.mojang.com

### DefaultApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*mcGameVersionManifestGet* | *GET* /mc/game/version_manifest | Get Minecraft version manifest.|
|*v1PackagesPackageIdVersionIdJsonGet* | *GET* /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package details.|


## What are the Model files for the data structures/objects?
|Class | Description|
|------------- | -------------|
|*_mc_game_version_manifest_get_200_response* | |
|*_mc_game_version_manifest_get_200_response_latest* | |
|*_mc_game_version_manifest_get_200_response_versions_inner* | |
|*_v1_packages__packageId___versionId__json_get_200_response* | |
|*_v1_packages__packageId___versionId__json_get_200_response_assetIndex* | |
|*_v1_packages__packageId___versionId__json_get_200_response_downloads* | |
|*_v1_packages__packageId___versionId__json_get_200_response_downloads_client* | |
|*_v1_packages__packageId___versionId__json_get_200_response_javaVersion* | |

