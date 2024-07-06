# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model import Model
from openapi_server import util


class VersionPackageInfoJavaVersion(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, component: str=None, major_version: int=None):
        """VersionPackageInfoJavaVersion - a model defined in OpenAPI

        :param component: The component of this VersionPackageInfoJavaVersion.
        :param major_version: The major_version of this VersionPackageInfoJavaVersion.
        """
        self.openapi_types = {
            'component': str,
            'major_version': int
        }

        self.attribute_map = {
            'component': 'component',
            'major_version': 'majorVersion'
        }

        self._component = component
        self._major_version = major_version

    @classmethod
    def from_dict(cls, dikt: dict) -> 'VersionPackageInfoJavaVersion':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The VersionPackageInfo_javaVersion of this VersionPackageInfoJavaVersion.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def component(self):
        """Gets the component of this VersionPackageInfoJavaVersion.


        :return: The component of this VersionPackageInfoJavaVersion.
        :rtype: str
        """
        return self._component

    @component.setter
    def component(self, component):
        """Sets the component of this VersionPackageInfoJavaVersion.


        :param component: The component of this VersionPackageInfoJavaVersion.
        :type component: str
        """

        self._component = component

    @property
    def major_version(self):
        """Gets the major_version of this VersionPackageInfoJavaVersion.


        :return: The major_version of this VersionPackageInfoJavaVersion.
        :rtype: int
        """
        return self._major_version

    @major_version.setter
    def major_version(self, major_version):
        """Sets the major_version of this VersionPackageInfoJavaVersion.


        :param major_version: The major_version of this VersionPackageInfoJavaVersion.
        :type major_version: int
        """

        self._major_version = major_version
