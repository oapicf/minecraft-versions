# coding: utf-8

import pytest
import json
from aiohttp import web

from openapi_server.models.mc_game_version_manifest_get200_response import McGameVersionManifestGet200Response
from openapi_server.models.v1_packages_package_id_version_id_json_get200_response import V1PackagesPackageIdVersionIdJsonGet200Response


pytestmark = pytest.mark.asyncio

async def test_mc_game_version_manifest_get(client):
    """Test case for mc_game_version_manifest_get

    Get Minecraft version manifest
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/mc/game/version_manifest',
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_v1_packages_package_id_version_id_json_get(client):
    """Test case for v1_packages_package_id_version_id_json_get

    Get Minecraft version package details
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/packages/{package_id}/{version_id_jso}'.format(package_id='177e49d3233cb6eac42f0495c0a48e719870c2ae', version_id='1.21'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

