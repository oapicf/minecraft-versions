# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model import Model
from openapi_server.models.mc_game_version_manifest_get200_response_latest import McGameVersionManifestGet200ResponseLatest
from openapi_server.models.mc_game_version_manifest_get200_response_versions_inner import McGameVersionManifestGet200ResponseVersionsInner
from openapi_server import util


class McGameVersionManifestGet200Response(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, latest: McGameVersionManifestGet200ResponseLatest=None, versions: List[McGameVersionManifestGet200ResponseVersionsInner]=None):
        """McGameVersionManifestGet200Response - a model defined in OpenAPI

        :param latest: The latest of this McGameVersionManifestGet200Response.
        :param versions: The versions of this McGameVersionManifestGet200Response.
        """
        self.openapi_types = {
            'latest': McGameVersionManifestGet200ResponseLatest,
            'versions': List[McGameVersionManifestGet200ResponseVersionsInner]
        }

        self.attribute_map = {
            'latest': 'latest',
            'versions': 'versions'
        }

        self._latest = latest
        self._versions = versions

    @classmethod
    def from_dict(cls, dikt: dict) -> 'McGameVersionManifestGet200Response':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The _mc_game_version_manifest_get_200_response of this McGameVersionManifestGet200Response.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def latest(self):
        """Gets the latest of this McGameVersionManifestGet200Response.


        :return: The latest of this McGameVersionManifestGet200Response.
        :rtype: McGameVersionManifestGet200ResponseLatest
        """
        return self._latest

    @latest.setter
    def latest(self, latest):
        """Sets the latest of this McGameVersionManifestGet200Response.


        :param latest: The latest of this McGameVersionManifestGet200Response.
        :type latest: McGameVersionManifestGet200ResponseLatest
        """

        self._latest = latest

    @property
    def versions(self):
        """Gets the versions of this McGameVersionManifestGet200Response.


        :return: The versions of this McGameVersionManifestGet200Response.
        :rtype: List[McGameVersionManifestGet200ResponseVersionsInner]
        """
        return self._versions

    @versions.setter
    def versions(self, versions):
        """Sets the versions of this McGameVersionManifestGet200Response.


        :param versions: The versions of this McGameVersionManifestGet200Response.
        :type versions: List[McGameVersionManifestGet200ResponseVersionsInner]
        """

        self._versions = versions