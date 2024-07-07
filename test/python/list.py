import unittest
import minecraftverse
from minecraftverse.rest import ApiException
from pprint import pprint

class TestMinecraftVersion(unittest.TestCase):

    def test_get_version_manifest(self):

      configuration = minecraftverse.Configuration(
          host = "https://launchermeta.mojang.com"
      )

      with minecraftverse.ApiClient(configuration) as api_client:

          api_instance = minecraftverse.DefaultApi(api_client)

          try:
              api_response = api_instance.get_minecraft_version_manifest()
              print("The response of DefaultApi->get_minecraft_version_manifest:\n")
              # pprint(api_response)
              version_manifest = api_response;
              print(version_manifest.versions)
              for version in version_manifest.versions:
                  print('version: ' + version.id)
                  assert isinstance(version.id, str)
                  print('type: ' + version.type)
                  assert isinstance(version.type, str)
                  print('url: ' + version.url)
                  assert isinstance(version.url, str)

          except ApiException as e:
              self.fail('Exception when calling DefaultApi->get_minecraft_version_manifest: %s\n' % e)

    def test_get_version_package_info(self):

      configuration = minecraftverse.Configuration(
          host = "https://piston-meta.mojang.com"
      )

      with minecraftverse.ApiClient(configuration) as api_client:

          api_instance = minecraftverse.DefaultApi(api_client)

          try:
              api_response = api_instance.get_minecraft_version_package_info('177e49d3233cb6eac42f0495c0a48e719870c2ae', '1.21')
              print("The response of DefaultApi->get_minecraft_version_manifest:\n")
              pprint(api_response)
              version_package_info = api_response
              print('version: ' + version_package_info.id)
              assert isinstance(version_package_info.id, str)
              print('type: ' + version_package_info.type)
              assert isinstance(version_package_info.type, str)
              version_package_info_downloads = version_package_info.downloads
              server_download = version_package_info_downloads.server
              print('sha1: ' + server_download.sha1)
              assert isinstance(server_download.sha1, str)
              print('size: ' + str(server_download.size))
              assert isinstance(server_download.size, int)
              print('url: ' + server_download.url)
              assert isinstance(server_download.url, str)
          except ApiException as e:
              self.fail('Exception when calling DefaultApi->get_minecraft_version_manifest: %s\n' % e)
