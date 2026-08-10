<a name="__pageTop"></a>
# DefaultApi   { #DefaultApi }


All URIs are relative to *https://launchermeta.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_minecraft_version_manifest**](#get_minecraft_version_manifest) | **GET** `/mc/game/version_manifest.json` | Get Minecraft version manifest
[**get_minecraft_version_package_info**](#get_minecraft_version_package_info) | **GET** `/v1/packages/{packageId}/{versionId}.json` | Get Minecraft version package info

# **get_minecraft_version_manifest**   { #get_minecraft_version_manifest }
<a name="get_minecraft_version_manifest"></a>

> `get_minecraft_version_manifest( on_success: Callable, on_failure: Callable)`

Get Minecraft version manifest



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.get_minecraft_version_manifest(
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "get_minecraft_version_manifest", response)
		assert(response.data is VersionManifest)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **get_minecraft_version_package_info**   { #get_minecraft_version_package_info }
<a name="get_minecraft_version_package_info"></a>

> `get_minecraft_version_package_info(packageId: String,versionId: String, on_success: Callable, on_failure: Callable)`

Get Minecraft version package info



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.get_minecraft_version_package_info(
	# packageId: String   Eg: 177e49d3233cb6eac42f0495c0a48e719870c2ae
	packageId,
	# versionId: String   Eg: 1.21
	versionId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "get_minecraft_version_package_info", response)
		assert(response.data is VersionPackageInfo)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```


### Authorization

No authorization required.

[[Back to top]](#__pageTop) \
[[Back to API list]](../README.md#documentation-for-api-endpoints) \
[[Back to Model list]](../README.md#documentation-for-models) \
[[Back to README]](../README.md) \

