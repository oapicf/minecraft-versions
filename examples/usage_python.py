import minecraftverse
from minecraftverse.rest import ApiException

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
        version_manifest = api_response
        for version in version_manifest.versions:
            print('version: ' + version.id)
            print('type: ' + version.type)
            print('url: ' + version.url)
    except ApiException as e:
        print("Exception when calling DefaultApi->get_minecraft_version_manifest: %s\n" % e)
        raise
