# coding: utf-8

"""
    SDK for Minecraft versions info

    The version of the OpenAPI document: 0.12.1-pre.0
    Contact: blah+oapicf@cliffano.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from minecraftverse.models.version_package_info_asset_index import VersionPackageInfoAssetIndex

class TestVersionPackageInfoAssetIndex(unittest.TestCase):
    """VersionPackageInfoAssetIndex unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> VersionPackageInfoAssetIndex:
        """Test VersionPackageInfoAssetIndex
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `VersionPackageInfoAssetIndex`
        """
        model = VersionPackageInfoAssetIndex()
        if include_optional:
            return VersionPackageInfoAssetIndex(
                id = '',
                sha1 = '',
                size = 56,
                total_size = 56,
                url = ''
            )
        else:
            return VersionPackageInfoAssetIndex(
        )
        """

    def testVersionPackageInfoAssetIndex(self):
        """Test VersionPackageInfoAssetIndex"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
