# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model import Model
from openapi_server.models.v1_packages_package_id_version_id_json_get200_response_asset_index import V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex
from openapi_server.models.v1_packages_package_id_version_id_json_get200_response_downloads import V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads
from openapi_server.models.v1_packages_package_id_version_id_json_get200_response_java_version import V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion
from openapi_server import util


class V1PackagesPackageIdVersionIdJsonGet200Response(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, version: str=None, asset_index: V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex=None, assets: int=None, compliance_level: int=None, downloads: V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads=None, id: str=None, java_version: V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion=None, main_class: str=None, minimum_launcher_version: int=None, time: datetime=None, release_time: datetime=None, type: str=None):
        """V1PackagesPackageIdVersionIdJsonGet200Response - a model defined in OpenAPI

        :param version: The version of this V1PackagesPackageIdVersionIdJsonGet200Response.
        :param asset_index: The asset_index of this V1PackagesPackageIdVersionIdJsonGet200Response.
        :param assets: The assets of this V1PackagesPackageIdVersionIdJsonGet200Response.
        :param compliance_level: The compliance_level of this V1PackagesPackageIdVersionIdJsonGet200Response.
        :param downloads: The downloads of this V1PackagesPackageIdVersionIdJsonGet200Response.
        :param id: The id of this V1PackagesPackageIdVersionIdJsonGet200Response.
        :param java_version: The java_version of this V1PackagesPackageIdVersionIdJsonGet200Response.
        :param main_class: The main_class of this V1PackagesPackageIdVersionIdJsonGet200Response.
        :param minimum_launcher_version: The minimum_launcher_version of this V1PackagesPackageIdVersionIdJsonGet200Response.
        :param time: The time of this V1PackagesPackageIdVersionIdJsonGet200Response.
        :param release_time: The release_time of this V1PackagesPackageIdVersionIdJsonGet200Response.
        :param type: The type of this V1PackagesPackageIdVersionIdJsonGet200Response.
        """
        self.openapi_types = {
            'version': str,
            'asset_index': V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex,
            'assets': int,
            'compliance_level': int,
            'downloads': V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads,
            'id': str,
            'java_version': V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion,
            'main_class': str,
            'minimum_launcher_version': int,
            'time': datetime,
            'release_time': datetime,
            'type': str
        }

        self.attribute_map = {
            'version': 'version',
            'asset_index': 'assetIndex',
            'assets': 'assets',
            'compliance_level': 'complianceLevel',
            'downloads': 'downloads',
            'id': 'id',
            'java_version': 'javaVersion',
            'main_class': 'mainClass',
            'minimum_launcher_version': 'minimumLauncherVersion',
            'time': 'time',
            'release_time': 'releaseTime',
            'type': 'type'
        }

        self._version = version
        self._asset_index = asset_index
        self._assets = assets
        self._compliance_level = compliance_level
        self._downloads = downloads
        self._id = id
        self._java_version = java_version
        self._main_class = main_class
        self._minimum_launcher_version = minimum_launcher_version
        self._time = time
        self._release_time = release_time
        self._type = type

    @classmethod
    def from_dict(cls, dikt: dict) -> 'V1PackagesPackageIdVersionIdJsonGet200Response':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The _v1_packages__packageId___versionId__json_get_200_response of this V1PackagesPackageIdVersionIdJsonGet200Response.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def version(self):
        """Gets the version of this V1PackagesPackageIdVersionIdJsonGet200Response.


        :return: The version of this V1PackagesPackageIdVersionIdJsonGet200Response.
        :rtype: str
        """
        return self._version

    @version.setter
    def version(self, version):
        """Sets the version of this V1PackagesPackageIdVersionIdJsonGet200Response.


        :param version: The version of this V1PackagesPackageIdVersionIdJsonGet200Response.
        :type version: str
        """

        self._version = version

    @property
    def asset_index(self):
        """Gets the asset_index of this V1PackagesPackageIdVersionIdJsonGet200Response.


        :return: The asset_index of this V1PackagesPackageIdVersionIdJsonGet200Response.
        :rtype: V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex
        """
        return self._asset_index

    @asset_index.setter
    def asset_index(self, asset_index):
        """Sets the asset_index of this V1PackagesPackageIdVersionIdJsonGet200Response.


        :param asset_index: The asset_index of this V1PackagesPackageIdVersionIdJsonGet200Response.
        :type asset_index: V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex
        """

        self._asset_index = asset_index

    @property
    def assets(self):
        """Gets the assets of this V1PackagesPackageIdVersionIdJsonGet200Response.


        :return: The assets of this V1PackagesPackageIdVersionIdJsonGet200Response.
        :rtype: int
        """
        return self._assets

    @assets.setter
    def assets(self, assets):
        """Sets the assets of this V1PackagesPackageIdVersionIdJsonGet200Response.


        :param assets: The assets of this V1PackagesPackageIdVersionIdJsonGet200Response.
        :type assets: int
        """

        self._assets = assets

    @property
    def compliance_level(self):
        """Gets the compliance_level of this V1PackagesPackageIdVersionIdJsonGet200Response.


        :return: The compliance_level of this V1PackagesPackageIdVersionIdJsonGet200Response.
        :rtype: int
        """
        return self._compliance_level

    @compliance_level.setter
    def compliance_level(self, compliance_level):
        """Sets the compliance_level of this V1PackagesPackageIdVersionIdJsonGet200Response.


        :param compliance_level: The compliance_level of this V1PackagesPackageIdVersionIdJsonGet200Response.
        :type compliance_level: int
        """

        self._compliance_level = compliance_level

    @property
    def downloads(self):
        """Gets the downloads of this V1PackagesPackageIdVersionIdJsonGet200Response.


        :return: The downloads of this V1PackagesPackageIdVersionIdJsonGet200Response.
        :rtype: V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads
        """
        return self._downloads

    @downloads.setter
    def downloads(self, downloads):
        """Sets the downloads of this V1PackagesPackageIdVersionIdJsonGet200Response.


        :param downloads: The downloads of this V1PackagesPackageIdVersionIdJsonGet200Response.
        :type downloads: V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads
        """

        self._downloads = downloads

    @property
    def id(self):
        """Gets the id of this V1PackagesPackageIdVersionIdJsonGet200Response.


        :return: The id of this V1PackagesPackageIdVersionIdJsonGet200Response.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this V1PackagesPackageIdVersionIdJsonGet200Response.


        :param id: The id of this V1PackagesPackageIdVersionIdJsonGet200Response.
        :type id: str
        """

        self._id = id

    @property
    def java_version(self):
        """Gets the java_version of this V1PackagesPackageIdVersionIdJsonGet200Response.


        :return: The java_version of this V1PackagesPackageIdVersionIdJsonGet200Response.
        :rtype: V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion
        """
        return self._java_version

    @java_version.setter
    def java_version(self, java_version):
        """Sets the java_version of this V1PackagesPackageIdVersionIdJsonGet200Response.


        :param java_version: The java_version of this V1PackagesPackageIdVersionIdJsonGet200Response.
        :type java_version: V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion
        """

        self._java_version = java_version

    @property
    def main_class(self):
        """Gets the main_class of this V1PackagesPackageIdVersionIdJsonGet200Response.


        :return: The main_class of this V1PackagesPackageIdVersionIdJsonGet200Response.
        :rtype: str
        """
        return self._main_class

    @main_class.setter
    def main_class(self, main_class):
        """Sets the main_class of this V1PackagesPackageIdVersionIdJsonGet200Response.


        :param main_class: The main_class of this V1PackagesPackageIdVersionIdJsonGet200Response.
        :type main_class: str
        """

        self._main_class = main_class

    @property
    def minimum_launcher_version(self):
        """Gets the minimum_launcher_version of this V1PackagesPackageIdVersionIdJsonGet200Response.


        :return: The minimum_launcher_version of this V1PackagesPackageIdVersionIdJsonGet200Response.
        :rtype: int
        """
        return self._minimum_launcher_version

    @minimum_launcher_version.setter
    def minimum_launcher_version(self, minimum_launcher_version):
        """Sets the minimum_launcher_version of this V1PackagesPackageIdVersionIdJsonGet200Response.


        :param minimum_launcher_version: The minimum_launcher_version of this V1PackagesPackageIdVersionIdJsonGet200Response.
        :type minimum_launcher_version: int
        """

        self._minimum_launcher_version = minimum_launcher_version

    @property
    def time(self):
        """Gets the time of this V1PackagesPackageIdVersionIdJsonGet200Response.


        :return: The time of this V1PackagesPackageIdVersionIdJsonGet200Response.
        :rtype: datetime
        """
        return self._time

    @time.setter
    def time(self, time):
        """Sets the time of this V1PackagesPackageIdVersionIdJsonGet200Response.


        :param time: The time of this V1PackagesPackageIdVersionIdJsonGet200Response.
        :type time: datetime
        """

        self._time = time

    @property
    def release_time(self):
        """Gets the release_time of this V1PackagesPackageIdVersionIdJsonGet200Response.


        :return: The release_time of this V1PackagesPackageIdVersionIdJsonGet200Response.
        :rtype: datetime
        """
        return self._release_time

    @release_time.setter
    def release_time(self, release_time):
        """Sets the release_time of this V1PackagesPackageIdVersionIdJsonGet200Response.


        :param release_time: The release_time of this V1PackagesPackageIdVersionIdJsonGet200Response.
        :type release_time: datetime
        """

        self._release_time = release_time

    @property
    def type(self):
        """Gets the type of this V1PackagesPackageIdVersionIdJsonGet200Response.


        :return: The type of this V1PackagesPackageIdVersionIdJsonGet200Response.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this V1PackagesPackageIdVersionIdJsonGet200Response.


        :param type: The type of this V1PackagesPackageIdVersionIdJsonGet200Response.
        :type type: str
        """

        self._type = type