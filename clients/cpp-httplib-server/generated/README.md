# cpp-httplib-server - C++ Server

## Overview

This server was generated using the [OpenAPI Generator](https://openapi-generator.tech) project.
It uses the [cpp-httplib](https://github.com/yhirose/cpp-httplib) library to implement a lightweight HTTP server
with JSON request/response handling via [nlohmann/json](https://github.com/nlohmann/json).

## Requirements

- C++17 compatible compiler
- CMake (3.14 or higher)
- OpenSSL (for HTTPS support)
- ZLIB (for compression support)

**Note:** The following libraries are automatically downloaded via CMake FetchContent:
- [cpp-httplib](https://github.com/yhirose/cpp-httplib) v0.15.3
- [nlohmann/json](https://github.com/nlohmann/json) v3.11.3

### Platform-Specific Installation

**Linux (Ubuntu/Debian):**
```bash
sudo apt-get update
sudo apt-get install -y libssl-dev zlib1g-dev cmake build-essential
```

**macOS:**
```bash
brew install openssl zlib cmake
```

**Windows:**
```powershell
# Using vcpkg
vcpkg install openssl:x64-windows zlib:x64-windows

# Then configure CMake with vcpkg toolchain:
cmake -B build -DCMAKE_TOOLCHAIN_FILE=[vcpkg_root]/scripts/buildsystems/vcpkg.cmake
```

## Project Structure

```
├── CMakeLists.txt          # Project build configuration
├── README.md               # This file
├── models/                  # Generated model classes
└── api/                    # Generated API handler classes
```

## Building the Project

```bash
mkdir build
cd build
cmake ..
make
```

## Working with Models

### Model Classes

#### models::Download

```cpp
// Create a model
auto model = models::Download();
model.setSha1(/* value */);  // Set sha1
model.setSize(/* value */);  // Set size
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::Download::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::Download::fromJson(nlohmann::json::parse(jsonString));
```
#### models::Version

```cpp
// Create a model
auto model = models::Version();
model.setId(/* value */);  // Set id
model.setType(/* value */);  // Set type
model.setUrl(/* value */);  // Set url
model.setTime(/* value */);  // Set time
model.setReleaseTime(/* value */);  // Set releaseTime

// Serialize to JSON
nlohmann::json json = models::Version::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::Version::fromJson(nlohmann::json::parse(jsonString));
```
#### models::VersionManifest

```cpp
// Create a model
auto model = models::VersionManifest();
model.setLatest(/* value */);  // Set latest
model.setVersions(/* value */);  // Set versions

// Serialize to JSON
nlohmann::json json = models::VersionManifest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::VersionManifest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::VersionManifestLatest

```cpp
// Create a model
auto model = models::VersionManifestLatest();
model.setRelease(/* value */);  // Set release
model.setSnapshot(/* value */);  // Set snapshot

// Serialize to JSON
nlohmann::json json = models::VersionManifestLatest::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::VersionManifestLatest::fromJson(nlohmann::json::parse(jsonString));
```
#### models::VersionPackageInfo

```cpp
// Create a model
auto model = models::VersionPackageInfo();
model.setVersion(/* value */);  // Set version
model.setAssetIndex(/* value */);  // Set assetIndex
model.setAssets(/* value */);  // Set assets
model.setComplianceLevel(/* value */);  // Set complianceLevel
model.setDownloads(/* value */);  // Set downloads
model.setId(/* value */);  // Set id
model.setJavaVersion(/* value */);  // Set javaVersion
model.setMainClass(/* value */);  // Set mainClass
model.setMinimumLauncherVersion(/* value */);  // Set minimumLauncherVersion
model.setTime(/* value */);  // Set time
model.setReleaseTime(/* value */);  // Set releaseTime
model.setType(/* value */);  // Set type

// Serialize to JSON
nlohmann::json json = models::VersionPackageInfo::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::VersionPackageInfo::fromJson(nlohmann::json::parse(jsonString));
```
#### models::VersionPackageInfoAssetIndex

```cpp
// Create a model
auto model = models::VersionPackageInfoAssetIndex();
model.setId(/* value */);  // Set id
model.setSha1(/* value */);  // Set sha1
model.setSize(/* value */);  // Set size
model.setTotalSize(/* value */);  // Set totalSize
model.setUrl(/* value */);  // Set url

// Serialize to JSON
nlohmann::json json = models::VersionPackageInfoAssetIndex::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::VersionPackageInfoAssetIndex::fromJson(nlohmann::json::parse(jsonString));
```
#### models::VersionPackageInfoDownloads

```cpp
// Create a model
auto model = models::VersionPackageInfoDownloads();
model.setClient(/* value */);  // Set client
model.setClientMappings(/* value */);  // Set client_mappings
model.setServer(/* value */);  // Set server
model.setServerMappings(/* value */);  // Set server_mappings

// Serialize to JSON
nlohmann::json json = models::VersionPackageInfoDownloads::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::VersionPackageInfoDownloads::fromJson(nlohmann::json::parse(jsonString));
```
#### models::VersionPackageInfoJavaVersion

```cpp
// Create a model
auto model = models::VersionPackageInfoJavaVersion();
model.setComponent(/* value */);  // Set component
model.setMajorVersion(/* value */);  // Set majorVersion

// Serialize to JSON
nlohmann::json json = models::VersionPackageInfoJavaVersion::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::VersionPackageInfoJavaVersion::fromJson(nlohmann::json::parse(jsonString));
```

## Implementing API Handlers

### API Classes

Each API is generated as an abstract base class with pure virtual methods that you must implement.

#### CppHttplibServerapi

Create a class that inherits from the generated base class:

```cpp
#include "api/CppHttplibServerapiApi.h"

class CppHttplibServerapiImpl : public Api::CppHttplibServerapi {
public:
    McgameversionManifestjsonGetResponse handleGetForMcgameversionManifestjson() override {

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_VERSION_MANIFEST):
        models::VersionManifest successResponse;
        // ... populate response ...
        return successResponse;
    }

    V1packagespackageIdversionIdjsonGetResponse handleGetForV1packagespackageIdversionIdjson(const V1packagespackageIdversionIdjsonGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_packageId
        // Path: params.m_versionId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_VERSION_PACKAGE_INFO):
        models::VersionPackageInfo successResponse;
        // ... populate response ...
        return successResponse;
    }

};
```

## Running the Server

Here's a complete example of setting up and running the server:

```cpp
#include <httplib.h>
#include <memory>

#include "api/CppHttplibServerapiApi.h"


int main() {
    httplib::Server server;

    // Create API implementations

    CppHttplibServerapiImpl default;


    // Register routes

    default.registerRoutes(server);


    // Start server
    std::cout << "Server starting on http://localhost:8080" << std::endl;
    server.listen("localhost", 8080);

    return 0;
}
```

### Without Authentication

This API does not require authentication. Simply create your API implementations and register them with the server.


## Authentication

This API does not require authentication.


## Error Handling

### Response Variants

Each API endpoint that returns data uses `std::variant` to represent multiple possible response types (success and errors):

```cpp
// Example: endpoint returns success (User) or errors (NotFound, ServerError)
using GetUserResponse = std::variant<User, NotFound, ServerError>;

GetUserResponse handleGetUser(const GetUserRequest& params) override {
    if (userExists(params.m_userId)) {
        User user = fetchUser(params.m_userId);
        return user;  // Automatically sets HTTP 200
    } else {
        NotFound error;
        error.setMessage("User not found");
        return error;  // Automatically sets HTTP 404
    }
}
```

The server automatically:
- Detects which type is returned from the variant
- Sets the appropriate HTTP status code
- Serializes the response to JSON

### HTTP Status Codes

Status codes are automatically set based on the response type you return. Each model type is associated with a specific HTTP status code defined in your OpenAPI specification.

**Optimized Status Code Constants:**
The generator only creates HTTP status code constants (e.g., `HTTP_RESPONSE_CODE_200`, `HTTP_RESPONSE_CODE_404`) for codes actually used by your API operations. This reduces code bloat and compilation time compared to generating all possible HTTP status codes.

### Parameter Validation

The generated code automatically validates:
- **Required parameters**: Returns HTTP 400 if missing
- **Type conversion**: Returns HTTP 400 if parameter cannot be converted to expected type
- **JSON parsing**: Returns HTTP 400 if request body is invalid JSON

Custom validation logic should be implemented in your handler methods.

### Working with Optional Parameters

Optional parameters and model fields use `std::optional`:

```cpp
void handleRequest(const RequestParams& params) override {
    // Check if optional query parameter is present
    if (params.m_optionalParam) {
        auto value = *params.m_optionalParam;  // Dereference to get value
        // Use value...
    }

    // Check if optional request body is present
    if (params.m_request) {
        auto body = *params.m_request;  // Dereference to get body
        // Use body...
    }
}
```

## Advanced Features

### Parameter Serialization Styles

The generator supports various parameter serialization styles as defined in OpenAPI:

- **simple**: Comma-separated values (default for path/header)
- **form**: Ampersand-separated values (default for query)
- **spaceDelimited**: Space-separated values
- **pipeDelimited**: Pipe-separated values
- **deepObject**: Nested object notation for query parameters

These are automatically handled during parameter parsing.

### Enum Handling

All generated enums automatically include an `UNSPECIFIED` value as the first enum entry for safe initialization:

```cpp
enum class Status {
    UNSPECIFIED = 0,  // Added automatically for safety
    PENDING,
    APPROVED,
    REJECTED
};

// Safe default initialization
Status status;  // Defaults to UNSPECIFIED (0)

// Explicit initialization
Status activeStatus = Status::APPROVED;

// Enum serialization/deserialization
// UNSPECIFIED is not a valid API value and indicates uninitialized state
```

**Why UNSPECIFIED?**
- Provides a safe default value for uninitialized enums
- Prevents undefined behavior from using uninitialized enum values
- Makes it clear when an enum hasn't been set vs. having a valid API value
- Does not appear in OpenAPI spec - internal C++ implementation detail

### Union Types (anyOf/oneOf)

When your OpenAPI spec uses `anyOf` or `oneOf`, the generated code uses `std::variant`:

```cpp
// OpenAPI: { "anyOf": [{"type": "string"}, {"type": "number"}] }
using MyUnionType = std::variant<std::string, double>;

// In your model:
MyUnionType value;

// Use std::visit to handle different types:
std::visit([](const auto& v) {
    using T = std::decay_t<decltype(v)>;
    if constexpr (std::is_same_v<T, std::string>) {
        std::cout << "String: " << v << std::endl;
    } else if constexpr (std::is_same_v<T, double>) {
        std::cout << "Number: " << v << std::endl;
    }
}, value);
```

## Additional Resources

- [cpp-httplib Documentation](https://github.com/yhirose/cpp-httplib)
- [nlohmann/json Documentation](https://github.com/nlohmann/json)
- [OpenAPI Generator Documentation](https://openapi-generator.tech/docs/generators/cpp-httplib-server)
- [OpenAPI Specification](https://swagger.io/specification/)

- [cpp-httplib Documentation](https://github.com/yhirose/cpp-httplib)
- [nlohmann/json Documentation](https://github.com/nlohmann/json)
- [OpenAPI Generator Documentation](https://openapi-generator.tech/docs/generators/)
