# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model import Model
from openapi_server import util


class V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id: str=None, sha1: str=None, size: int=None, total_size: int=None, url: str=None):
        """V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex - a model defined in OpenAPI

        :param id: The id of this V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex.
        :param sha1: The sha1 of this V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex.
        :param size: The size of this V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex.
        :param total_size: The total_size of this V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex.
        :param url: The url of this V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex.
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
    def from_dict(cls, dikt: dict) -> 'V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The _v1_packages__packageId___versionId__json_get_200_response_assetIndex of this V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self):
        """Gets the id of this V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex.


        :return: The id of this V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex.


        :param id: The id of this V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex.
        :type id: str
        """

        self._id = id

    @property
    def sha1(self):
        """Gets the sha1 of this V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex.


        :return: The sha1 of this V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex.
        :rtype: str
        """
        return self._sha1

    @sha1.setter
    def sha1(self, sha1):
        """Sets the sha1 of this V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex.


        :param sha1: The sha1 of this V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex.
        :type sha1: str
        """

        self._sha1 = sha1

    @property
    def size(self):
        """Gets the size of this V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex.


        :return: The size of this V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex.
        :rtype: int
        """
        return self._size

    @size.setter
    def size(self, size):
        """Sets the size of this V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex.


        :param size: The size of this V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex.
        :type size: int
        """

        self._size = size

    @property
    def total_size(self):
        """Gets the total_size of this V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex.


        :return: The total_size of this V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex.
        :rtype: int
        """
        return self._total_size

    @total_size.setter
    def total_size(self, total_size):
        """Sets the total_size of this V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex.


        :param total_size: The total_size of this V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex.
        :type total_size: int
        """

        self._total_size = total_size

    @property
    def url(self):
        """Gets the url of this V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex.


        :return: The url of this V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex.
        :rtype: str
        """
        return self._url

    @url.setter
    def url(self, url):
        """Sets the url of this V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex.


        :param url: The url of this V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex.
        :type url: str
        """

        self._url = url