# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model import Model
from openapi_server.models.v1_packages_package_id_version_id_json_get200_response_downloads_client import V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient
from openapi_server import util


class V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, client: V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient=None, client_mappings: V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient=None, server: V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient=None, server_mappings: V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient=None):
        """V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads - a model defined in OpenAPI

        :param client: The client of this V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.
        :param client_mappings: The client_mappings of this V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.
        :param server: The server of this V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.
        :param server_mappings: The server_mappings of this V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.
        """
        self.openapi_types = {
            'client': V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient,
            'client_mappings': V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient,
            'server': V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient,
            'server_mappings': V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient
        }

        self.attribute_map = {
            'client': 'client',
            'client_mappings': 'client_mappings',
            'server': 'server',
            'server_mappings': 'server_mappings'
        }

        self._client = client
        self._client_mappings = client_mappings
        self._server = server
        self._server_mappings = server_mappings

    @classmethod
    def from_dict(cls, dikt: dict) -> 'V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The _v1_packages__packageId___versionId__json_get_200_response_downloads of this V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def client(self):
        """Gets the client of this V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.


        :return: The client of this V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.
        :rtype: V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient
        """
        return self._client

    @client.setter
    def client(self, client):
        """Sets the client of this V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.


        :param client: The client of this V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.
        :type client: V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient
        """

        self._client = client

    @property
    def client_mappings(self):
        """Gets the client_mappings of this V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.


        :return: The client_mappings of this V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.
        :rtype: V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient
        """
        return self._client_mappings

    @client_mappings.setter
    def client_mappings(self, client_mappings):
        """Sets the client_mappings of this V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.


        :param client_mappings: The client_mappings of this V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.
        :type client_mappings: V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient
        """

        self._client_mappings = client_mappings

    @property
    def server(self):
        """Gets the server of this V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.


        :return: The server of this V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.
        :rtype: V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient
        """
        return self._server

    @server.setter
    def server(self, server):
        """Sets the server of this V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.


        :param server: The server of this V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.
        :type server: V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient
        """

        self._server = server

    @property
    def server_mappings(self):
        """Gets the server_mappings of this V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.


        :return: The server_mappings of this V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.
        :rtype: V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient
        """
        return self._server_mappings

    @server_mappings.setter
    def server_mappings(self, server_mappings):
        """Sets the server_mappings of this V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.


        :param server_mappings: The server_mappings of this V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.
        :type server_mappings: V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient
        """

        self._server_mappings = server_mappings
