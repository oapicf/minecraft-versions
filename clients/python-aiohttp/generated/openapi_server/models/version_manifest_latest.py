# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model import Model
from openapi_server import util


class VersionManifestLatest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, release: str=None, snapshot: str=None):
        """VersionManifestLatest - a model defined in OpenAPI

        :param release: The release of this VersionManifestLatest.
        :param snapshot: The snapshot of this VersionManifestLatest.
        """
        self.openapi_types = {
            'release': str,
            'snapshot': str
        }

        self.attribute_map = {
            'release': 'release',
            'snapshot': 'snapshot'
        }

        self._release = release
        self._snapshot = snapshot

    @classmethod
    def from_dict(cls, dikt: dict) -> 'VersionManifestLatest':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The VersionManifest_latest of this VersionManifestLatest.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def release(self):
        """Gets the release of this VersionManifestLatest.


        :return: The release of this VersionManifestLatest.
        :rtype: str
        """
        return self._release

    @release.setter
    def release(self, release):
        """Sets the release of this VersionManifestLatest.


        :param release: The release of this VersionManifestLatest.
        :type release: str
        """

        self._release = release

    @property
    def snapshot(self):
        """Gets the snapshot of this VersionManifestLatest.


        :return: The snapshot of this VersionManifestLatest.
        :rtype: str
        """
        return self._snapshot

    @snapshot.setter
    def snapshot(self, snapshot):
        """Sets the snapshot of this VersionManifestLatest.


        :param snapshot: The snapshot of this VersionManifestLatest.
        :type snapshot: str
        """

        self._snapshot = snapshot