from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class VersionPackageInfoAssetIndex(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id=None, sha1=None, size=None, total_size=None, url=None):  # noqa: E501
        """VersionPackageInfoAssetIndex - a model defined in OpenAPI

        :param id: The id of this VersionPackageInfoAssetIndex.  # noqa: E501
        :type id: str
        :param sha1: The sha1 of this VersionPackageInfoAssetIndex.  # noqa: E501
        :type sha1: str
        :param size: The size of this VersionPackageInfoAssetIndex.  # noqa: E501
        :type size: int
        :param total_size: The total_size of this VersionPackageInfoAssetIndex.  # noqa: E501
        :type total_size: int
        :param url: The url of this VersionPackageInfoAssetIndex.  # noqa: E501
        :type url: str
        """
        self.openapi_types = {
            'id': str,
            'sha1': str,
            'size': int,
            'total_size': int,
            'url': str
        }

        self.attribute_map = {
            'id': 'id',
            'sha1': 'sha1',
            'size': 'size',
            'total_size': 'totalSize',
            'url': 'url'
        }

        self._id = id
        self._sha1 = sha1
        self._size = size
        self._total_size = total_size
        self._url = url

    @classmethod
    def from_dict(cls, dikt) -> 'VersionPackageInfoAssetIndex':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The VersionPackageInfo_assetIndex of this VersionPackageInfoAssetIndex.  # noqa: E501
        :rtype: VersionPackageInfoAssetIndex
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> str:
        """Gets the id of this VersionPackageInfoAssetIndex.


        :return: The id of this VersionPackageInfoAssetIndex.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this VersionPackageInfoAssetIndex.


        :param id: The id of this VersionPackageInfoAssetIndex.
        :type id: str
        """

        self._id = id

    @property
    def sha1(self) -> str:
        """Gets the sha1 of this VersionPackageInfoAssetIndex.


        :return: The sha1 of this VersionPackageInfoAssetIndex.
        :rtype: str
        """
        return self._sha1

    @sha1.setter
    def sha1(self, sha1: str):
        """Sets the sha1 of this VersionPackageInfoAssetIndex.


        :param sha1: The sha1 of this VersionPackageInfoAssetIndex.
        :type sha1: str
        """

        self._sha1 = sha1

    @property
    def size(self) -> int:
        """Gets the size of this VersionPackageInfoAssetIndex.


        :return: The size of this VersionPackageInfoAssetIndex.
        :rtype: int
        """
        return self._size

    @size.setter
    def size(self, size: int):
        """Sets the size of this VersionPackageInfoAssetIndex.


        :param size: The size of this VersionPackageInfoAssetIndex.
        :type size: int
        """

        self._size = size

    @property
    def total_size(self) -> int:
        """Gets the total_size of this VersionPackageInfoAssetIndex.


        :return: The total_size of this VersionPackageInfoAssetIndex.
        :rtype: int
        """
        return self._total_size

    @total_size.setter
    def total_size(self, total_size: int):
        """Sets the total_size of this VersionPackageInfoAssetIndex.


        :param total_size: The total_size of this VersionPackageInfoAssetIndex.
        :type total_size: int
        """

        self._total_size = total_size

    @property
    def url(self) -> str:
        """Gets the url of this VersionPackageInfoAssetIndex.


        :return: The url of this VersionPackageInfoAssetIndex.
        :rtype: str
        """
        return self._url

    @url.setter
    def url(self, url: str):
        """Sets the url of this VersionPackageInfoAssetIndex.


        :param url: The url of this VersionPackageInfoAssetIndex.
        :type url: str
        """

        self._url = url
