# coding: utf-8

"""
    SDK for Minecraft versions info

    The version of the OpenAPI document: 0.9.0-pre.0
    Contact: blah+oapicf@cliffano.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest
import datetime

from openapi_client.models.v1_packages_package_id_version_id_json_get200_response_asset_index import V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex  # noqa: E501

class TestV1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex(unittest.TestCase):
    """V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex:
        """Test V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex`
        """
        model = V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex()  # noqa: E501
        if include_optional:
            return V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex(
                id = '',
                sha1 = '',
                size = 56,
                total_size = 56,
                url = ''
            )
        else:
            return V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex(
        )
        """

    def testV1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex(self):
        """Test V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
