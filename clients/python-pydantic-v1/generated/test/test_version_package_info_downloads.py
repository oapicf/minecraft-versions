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

from openapi_client.models.version_package_info_downloads import VersionPackageInfoDownloads  # noqa: E501

class TestVersionPackageInfoDownloads(unittest.TestCase):
    """VersionPackageInfoDownloads unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> VersionPackageInfoDownloads:
        """Test VersionPackageInfoDownloads
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `VersionPackageInfoDownloads`
        """
        model = VersionPackageInfoDownloads()  # noqa: E501
        if include_optional:
            return VersionPackageInfoDownloads(
                client = openapi_client.models.download.Download(
                    sha1 = '', 
                    size = 56, 
                    url = '', ),
                client_mappings = openapi_client.models.download.Download(
                    sha1 = '', 
                    size = 56, 
                    url = '', ),
                server = openapi_client.models.download.Download(
                    sha1 = '', 
                    size = 56, 
                    url = '', ),
                server_mappings = openapi_client.models.download.Download(
                    sha1 = '', 
                    size = 56, 
                    url = '', )
            )
        else:
            return VersionPackageInfoDownloads(
        )
        """

    def testVersionPackageInfoDownloads(self):
        """Test VersionPackageInfoDownloads"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
