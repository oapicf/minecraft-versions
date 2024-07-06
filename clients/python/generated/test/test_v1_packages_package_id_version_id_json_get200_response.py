# coding: utf-8

"""
    SDK for Minecraft versions info

    The version of the OpenAPI document: 0.9.0-pre.0
    Contact: blah+oapicf@cliffano.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from minecraftversions.models.v1_packages_package_id_version_id_json_get200_response import V1PackagesPackageIdVersionIdJsonGet200Response

class TestV1PackagesPackageIdVersionIdJsonGet200Response(unittest.TestCase):
    """V1PackagesPackageIdVersionIdJsonGet200Response unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> V1PackagesPackageIdVersionIdJsonGet200Response:
        """Test V1PackagesPackageIdVersionIdJsonGet200Response
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `V1PackagesPackageIdVersionIdJsonGet200Response`
        """
        model = V1PackagesPackageIdVersionIdJsonGet200Response()
        if include_optional:
            return V1PackagesPackageIdVersionIdJsonGet200Response(
                version = '',
                asset_index = minecraftversions.models._v1_packages__package_id___version_id__json_get_200_response_asset_index._v1_packages__packageId___versionId__json_get_200_response_assetIndex(
                    id = '', 
                    sha1 = '', 
                    size = 56, 
                    total_size = 56, 
                    url = '', ),
                assets = 56,
                compliance_level = 56,
                downloads = minecraftversions.models._v1_packages__package_id___version_id__json_get_200_response_downloads._v1_packages__packageId___versionId__json_get_200_response_downloads(
                    client = minecraftversions.models._v1_packages__package_id___version_id__json_get_200_response_downloads_client._v1_packages__packageId___versionId__json_get_200_response_downloads_client(
                        sha1 = '', 
                        size = 56, 
                        url = '', ), 
                    client_mappings = minecraftversions.models._v1_packages__package_id___version_id__json_get_200_response_downloads_client._v1_packages__packageId___versionId__json_get_200_response_downloads_client(
                        sha1 = '', 
                        size = 56, 
                        url = '', ), 
                    server = , 
                    server_mappings = , ),
                id = '',
                java_version = minecraftversions.models._v1_packages__package_id___version_id__json_get_200_response_java_version._v1_packages__packageId___versionId__json_get_200_response_javaVersion(
                    component = '', 
                    major_version = 56, ),
                main_class = 'net.minecraft.client.main.Main',
                minimum_launcher_version = 21,
                time = '2024-04-01T11:14:41Z',
                release_time = '2024-04-01T11:07:19Z',
                type = 'snapshot'
            )
        else:
            return V1PackagesPackageIdVersionIdJsonGet200Response(
        )
        """

    def testV1PackagesPackageIdVersionIdJsonGet200Response(self):
        """Test V1PackagesPackageIdVersionIdJsonGet200Response"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
