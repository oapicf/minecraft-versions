# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.version_manifest import VersionManifest  # noqa: E501
from app.openapi_server.models.version_package_info import VersionPackageInfo  # noqa: E501
from openapi_server.test import BaseTestCase


class TestDefaultController(BaseTestCase):
    """DefaultController integration test stubs"""

    def test_get_minecraft_version_manifest(self):
        """Test case for get_minecraft_version_manifest

        Get Minecraft version manifest
        """
        response = self.client.open(
            '/mc/game/version_manifest.json',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_minecraft_version_package_info(self):
        """Test case for get_minecraft_version_package_info

        Get Minecraft version package info
        """
        response = self.client.open(
            '/v1/packages/{package_id}/{version_id_jso}'.format(package_id='177e49d3233cb6eac42f0495c0a48e719870c2ae', version_id='1.21'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
