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

from openapi_client.models.v1_packages_package_id_version_id_json_get200_response_java_version import V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion  # noqa: E501

class TestV1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion(unittest.TestCase):
    """V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion:
        """Test V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion`
        """
        model = V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion()  # noqa: E501
        if include_optional:
            return V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion(
                component = '',
                major_version = 56
            )
        else:
            return V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion(
        )
        """

    def testV1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion(self):
        """Test V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
