# coding: utf-8

from fastapi.testclient import TestClient


from openapi_server.models.mc_game_version_manifest_get200_response import McGameVersionManifestGet200Response  # noqa: F401
from openapi_server.models.v1_packages_package_id_version_id_json_get200_response import V1PackagesPackageIdVersionIdJsonGet200Response  # noqa: F401


def test_mc_game_version_manifest_get(client: TestClient):
    """Test case for mc_game_version_manifest_get

    Get Minecraft version manifest
    """

    headers = {
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/mc/game/version_manifest",
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_v1_packages_package_id_version_id_json_get(client: TestClient):
    """Test case for v1_packages_package_id_version_id_json_get

    Get Minecraft version package details
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

