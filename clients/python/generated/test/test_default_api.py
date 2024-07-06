# coding: utf-8

"""
    SDK for Minecraft versions info

    The version of the OpenAPI document: 0.9.0-pre.0
    Contact: blah+oapicf@cliffano.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from minecraftversions.api.default_api import DefaultApi


class TestDefaultApi(unittest.TestCase):
    """DefaultApi unit test stubs"""

    def setUp(self) -> None:
        self.api = DefaultApi()

    def tearDown(self) -> None:
        pass

    def test_get_minecraft_version_manifest(self) -> None:
        """Test case for get_minecraft_version_manifest

        Get Minecraft version manifest
        """
        pass

    def test_v1_packages_package_id_version_id_json_get(self) -> None:
        """Test case for v1_packages_package_id_version_id_json_get

        Get Minecraft version package details
        """
        pass


if __name__ == '__main__':
    unittest.main()