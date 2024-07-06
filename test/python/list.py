import unittest
import minecraftversions
from minecraftversions.rest import ApiException
from pprint import pprint

class TestMinecraftVersion(unittest.TestCase):

    def test_get_version_manifest(self):

      configuration = minecraftversions.Configuration(
          host = "https://launchermeta.mojang.com"
      )

      with minecraftversions.ApiClient(configuration) as api_client:

          api_instance = minecraftversions.DefaultApi(api_client)

          try:
              api_response = api_instance.get_minecraft_version_manifest()
              print("The response of DefaultApi->get_minecraft_version_manifest:\n")
              pprint(api_response)
          except ApiException as e:
              self.fail('Exception when calling DefaultApi->get_minecraft_version_manifest: %s\n' % e)

    def test_get_version_package_info(self):

      configuration = minecraftversions.Configuration(
          host = "https://piston-meta.mojang.com"
      )

      with minecraftversions.ApiClient(configuration) as api_client:

          api_instance = minecraftversions.DefaultApi(api_client)

          try:
              api_response = api_instance.get_minecraft_version_manifest()
              print("The response of DefaultApi->get_minecraft_version_manifest:\n")
              pprint(api_response)
          except ApiException as e:
              self.fail('Exception when calling DefaultApi->get_minecraft_version_manifest: %s\n' % e)
