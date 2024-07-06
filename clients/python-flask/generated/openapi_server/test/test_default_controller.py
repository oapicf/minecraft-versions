import unittest

from flask import json

from openapi_server.models.get_minecraft_version_manifest200_response import GetMinecraftVersionManifest200Response  # noqa: E501
from openapi_server.models.v1_packages_package_id_version_id_json_get200_response import V1PackagesPackageIdVersionIdJsonGet200Response  # noqa: E501
from openapi_server.test import BaseTestCase


class TestDefaultController(BaseTestCase):
    """DefaultController integration test stubs"""

    def test_get_minecraft_version_manifest(self):
        """Test case for get_minecraft_version_manifest

        Get Minecraft version manifest
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/mc/game/version_manifest.json',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_v1_packages_package_id_version_id_json_get(self):
        """Test case for v1_packages_package_id_version_id_json_get

        Get Minecraft version package details
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/packages/{package_id}/{version_id_jso}'.format(package_id='177e49d3233cb6eac42f0495c0a48e719870c2ae', version_id='1.21'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
