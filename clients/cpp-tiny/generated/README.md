# Documentation for OpenAPI Petstore
This is a client generator for microcontrollers on the Espressif32 platform and the Arduino framework
After the client have been generated, you have to change these following variables:
- root.cert | Provide your service root certificate.
- src/main.cpp | Change wifi name
- src/main.cpp | Change wifi password
- lib/service/AbstractService.h | Change to your url

# Documentation for  0.12.1-pre.0 Tiny client cpp (Arduino) 

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
|*getMinecraftVersionManifest* | *GET* /mc/game/version_manifest.json | Get Minecraft version manifest.|
|*getMinecraftVersionPackageInfo* | *GET* /v1/packages/{packageId}/{versionId}.json | Get Minecraft version package info.|


## What are the Model files for the data structures/objects?
|Class | Description|
|------------- | -------------|
|*Download* | |
|*Version* | |
|*VersionManifest* | |
|*VersionManifest_latest* | |
|*VersionPackageInfo* | |
|*VersionPackageInfo_assetIndex* | |
|*VersionPackageInfo_downloads* | |
|*VersionPackageInfo_javaVersion* | |

