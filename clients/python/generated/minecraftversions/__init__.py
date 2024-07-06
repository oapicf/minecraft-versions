# coding: utf-8

# flake8: noqa

"""
    SDK for Minecraft versions info

    The version of the OpenAPI document: 0.9.0-pre.0
    Contact: blah+oapicf@cliffano.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


__version__ = "0.9.0-pre.0"

# import apis into sdk package
from minecraftversions.api.default_api import DefaultApi

# import ApiClient
from minecraftversions.api_response import ApiResponse
from minecraftversions.api_client import ApiClient
from minecraftversions.configuration import Configuration
from minecraftversions.exceptions import OpenApiException
from minecraftversions.exceptions import ApiTypeError
from minecraftversions.exceptions import ApiValueError
from minecraftversions.exceptions import ApiKeyError
from minecraftversions.exceptions import ApiAttributeError
from minecraftversions.exceptions import ApiException

# import models into sdk package
from minecraftversions.models.download import Download
from minecraftversions.models.version import Version
from minecraftversions.models.version_manifest import VersionManifest
from minecraftversions.models.version_manifest_latest import VersionManifestLatest
from minecraftversions.models.version_package_info import VersionPackageInfo
from minecraftversions.models.version_package_info_asset_index import VersionPackageInfoAssetIndex
from minecraftversions.models.version_package_info_downloads import VersionPackageInfoDownloads
from minecraftversions.models.version_package_info_java_version import VersionPackageInfoJavaVersion
