from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class McGameVersionManifestGet200ResponseVersionsInner(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id=None, type=None, url=None, time=None, release_time=None):  # noqa: E501
        """McGameVersionManifestGet200ResponseVersionsInner - a model defined in OpenAPI

        :param id: The id of this McGameVersionManifestGet200ResponseVersionsInner.  # noqa: E501
        :type id: str
        :param type: The type of this McGameVersionManifestGet200ResponseVersionsInner.  # noqa: E501
        :type type: str
        :param url: The url of this McGameVersionManifestGet200ResponseVersionsInner.  # noqa: E501
        :type url: str
        :param time: The time of this McGameVersionManifestGet200ResponseVersionsInner.  # noqa: E501
        :type time: datetime
        :param release_time: The release_time of this McGameVersionManifestGet200ResponseVersionsInner.  # noqa: E501
        :type release_time: datetime
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
    def from_dict(cls, dikt) -> 'McGameVersionManifestGet200ResponseVersionsInner':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The _mc_game_version_manifest_get_200_response_versions_inner of this McGameVersionManifestGet200ResponseVersionsInner.  # noqa: E501
        :rtype: McGameVersionManifestGet200ResponseVersionsInner
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> str:
        """Gets the id of this McGameVersionManifestGet200ResponseVersionsInner.


        :return: The id of this McGameVersionManifestGet200ResponseVersionsInner.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this McGameVersionManifestGet200ResponseVersionsInner.


        :param id: The id of this McGameVersionManifestGet200ResponseVersionsInner.
        :type id: str
        """

        self._id = id

    @property
    def type(self) -> str:
        """Gets the type of this McGameVersionManifestGet200ResponseVersionsInner.


        :return: The type of this McGameVersionManifestGet200ResponseVersionsInner.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this McGameVersionManifestGet200ResponseVersionsInner.


        :param type: The type of this McGameVersionManifestGet200ResponseVersionsInner.
        :type type: str
        """

        self._type = type

    @property
    def url(self) -> str:
        """Gets the url of this McGameVersionManifestGet200ResponseVersionsInner.


        :return: The url of this McGameVersionManifestGet200ResponseVersionsInner.
        :rtype: str
        """
        return self._url

    @url.setter
    def url(self, url: str):
        """Sets the url of this McGameVersionManifestGet200ResponseVersionsInner.


        :param url: The url of this McGameVersionManifestGet200ResponseVersionsInner.
        :type url: str
        """

        self._url = url

    @property
    def time(self) -> datetime:
        """Gets the time of this McGameVersionManifestGet200ResponseVersionsInner.


        :return: The time of this McGameVersionManifestGet200ResponseVersionsInner.
        :rtype: datetime
        """
        return self._time

    @time.setter
    def time(self, time: datetime):
        """Sets the time of this McGameVersionManifestGet200ResponseVersionsInner.


        :param time: The time of this McGameVersionManifestGet200ResponseVersionsInner.
        :type time: datetime
        """

        self._time = time

    @property
    def release_time(self) -> datetime:
        """Gets the release_time of this McGameVersionManifestGet200ResponseVersionsInner.


        :return: The release_time of this McGameVersionManifestGet200ResponseVersionsInner.
        :rtype: datetime
        """
        return self._release_time

    @release_time.setter
    def release_time(self, release_time: datetime):
        """Sets the release_time of this McGameVersionManifestGet200ResponseVersionsInner.


        :param release_time: The release_time of this McGameVersionManifestGet200ResponseVersionsInner.
        :type release_time: datetime
        """

        self._release_time = release_time