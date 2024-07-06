# coding: utf-8

"""
    SDK for Minecraft versions info

    The version of the OpenAPI document: 0.9.0-pre.0
    Contact: blah+oapicf@cliffano.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from minecraftversions.models.version_manifest_latest import VersionManifestLatest

class TestVersionManifestLatest(unittest.TestCase):
    """VersionManifestLatest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> VersionManifestLatest:
        """Test VersionManifestLatest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `VersionManifestLatest`
        """
        model = VersionManifestLatest()
        if include_optional:
            return VersionManifestLatest(
                release = '1.21',
                snapshot = '24w14potato'
            )
        else:
            return VersionManifestLatest(
        )
        """

    def testVersionManifestLatest(self):
        """Test VersionManifestLatest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
