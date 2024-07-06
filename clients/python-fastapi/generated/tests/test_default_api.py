# coding: utf-8

from fastapi.testclient import TestClient


from openapi_server.models.version_manifest import VersionManifest  # noqa: F401
from openapi_server.models.version_package_info import VersionPackageInfo  # noqa: F401


def test_get_minecraft_version_manifest(client: TestClient):
    """Test case for get_minecraft_version_manifest

    Get Minecraft version manifest
    """

    headers = {
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/mc/game/version_manifest.json",
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_minecraft_version_package_info(client: TestClient):
    """Test case for get_minecraft_version_package_info

    Get Minecraft version package info
    """

    headers = {
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/v1/packages/{packageId}/{versionId}.json".format(packageId='177e49d3233cb6eac42f0495c0a48e719870c2ae', versionId='1.21'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

