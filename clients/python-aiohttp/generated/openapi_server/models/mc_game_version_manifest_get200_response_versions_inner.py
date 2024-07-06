# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model import Model
from openapi_server import util


class McGameVersionManifestGet200ResponseVersionsInner(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id: str=None, type: str=None, url: str=None, time: datetime=None, release_time: datetime=None):
        """McGameVersionManifestGet200ResponseVersionsInner - a model defined in OpenAPI

        :param id: The id of this McGameVersionManifestGet200ResponseVersionsInner.
        :param type: The type of this McGameVersionManifestGet200ResponseVersionsInner.
        :param url: The url of this McGameVersionManifestGet200ResponseVersionsInner.
        :param time: The time of this McGameVersionManifestGet200ResponseVersionsInner.
        :param release_time: The release_time of this McGameVersionManifestGet200ResponseVersionsInner.
        """
        self.openapi_types = {
            'id': str,
            'type': str,
            'url': str,
            'time': datetime,
            'release_time': datetime
        }

        self.attribute_map = {
            'id': 'id',
            'type': 'type',
            'url': 'url',
            'time': 'time',
            'release_time': 'releaseTime'
        }

        self._id = id
        self._type = type
        self._url = url
        self._time = time
        self._release_time = release_time

    @classmethod
    def from_dict(cls, dikt: dict) -> 'McGameVersionManifestGet200ResponseVersionsInner':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The _mc_game_version_manifest_get_200_response_versions_inner of this McGameVersionManifestGet200ResponseVersionsInner.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self):
        """Gets the id of this McGameVersionManifestGet200ResponseVersionsInner.


        :return: The id of this McGameVersionManifestGet200ResponseVersionsInner.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this McGameVersionManifestGet200ResponseVersionsInner.


        :param id: The id of this McGameVersionManifestGet200ResponseVersionsInner.
        :type id: str
        """

        self._id = id

    @property
    def type(self):
        """Gets the type of this McGameVersionManifestGet200ResponseVersionsInner.


        :return: The type of this McGameVersionManifestGet200ResponseVersionsInner.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this McGameVersionManifestGet200ResponseVersionsInner.


        :param type: The type of this McGameVersionManifestGet200ResponseVersionsInner.
        :type type: str
        """

        self._type = type

    @property
    def url(self):
        """Gets the url of this McGameVersionManifestGet200ResponseVersionsInner.


        :return: The url of this McGameVersionManifestGet200ResponseVersionsInner.
        :rtype: str
        """
        return self._url

    @url.setter
    def url(self, url):
        """Sets the url of this McGameVersionManifestGet200ResponseVersionsInner.


        :param url: The url of this McGameVersionManifestGet200ResponseVersionsInner.
        :type url: str
        """

        self._url = url

    @property
    def time(self):
        """Gets the time of this McGameVersionManifestGet200ResponseVersionsInner.


        :return: The time of this McGameVersionManifestGet200ResponseVersionsInner.
        :rtype: datetime
        """
        return self._time

    @time.setter
    def time(self, time):
        """Sets the time of this McGameVersionManifestGet200ResponseVersionsInner.


        :param time: The time of this McGameVersionManifestGet200ResponseVersionsInner.
        :type time: datetime
        """

        self._time = time

    @property
    def release_time(self):
        """Gets the release_time of this McGameVersionManifestGet200ResponseVersionsInner.


        :return: The release_time of this McGameVersionManifestGet200ResponseVersionsInner.
        :rtype: datetime
        """
        return self._release_time

    @release_time.setter
    def release_time(self, release_time):
        """Sets the release_time of this McGameVersionManifestGet200ResponseVersionsInner.


        :param release_time: The release_time of this McGameVersionManifestGet200ResponseVersionsInner.
        :type release_time: datetime
        """

        self._release_time = release_time