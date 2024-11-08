from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.version import Version
from openapi_server.models.version_manifest_latest import VersionManifestLatest
from openapi_server import util

from openapi_server.models.version import Version  # noqa: E501
from openapi_server.models.version_manifest_latest import VersionManifestLatest  # noqa: E501

class VersionManifest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, latest=None, versions=None):  # noqa: E501
        """VersionManifest - a model defined in OpenAPI

        :param latest: The latest of this VersionManifest.  # noqa: E501
        :type latest: VersionManifestLatest
        :param versions: The versions of this VersionManifest.  # noqa: E501
        :type versions: List[Version]
        """
        self.openapi_types = {
            'latest': VersionManifestLatest,
            'versions': List[Version]
        }

        self.attribute_map = {
            'latest': 'latest',
            'versions': 'versions'
        }

        self._latest = latest
        self._versions = versions

    @classmethod
    def from_dict(cls, dikt) -> 'VersionManifest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The VersionManifest of this VersionManifest.  # noqa: E501
        :rtype: VersionManifest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def latest(self) -> VersionManifestLatest:
        """Gets the latest of this VersionManifest.


        :return: The latest of this VersionManifest.
        :rtype: VersionManifestLatest
        """
        return self._latest

    @latest.setter
    def latest(self, latest: VersionManifestLatest):
        """Sets the latest of this VersionManifest.


        :param latest: The latest of this VersionManifest.
        :type latest: VersionManifestLatest
        """

        self._latest = latest

    @property
    def versions(self) -> List[Version]:
        """Gets the versions of this VersionManifest.


        :return: The versions of this VersionManifest.
        :rtype: List[Version]
        """
        return self._versions

    @versions.setter
    def versions(self, versions: List[Version]):
        """Sets the versions of this VersionManifest.


        :param versions: The versions of this VersionManifest.
        :type versions: List[Version]
        """

        self._versions = versions
