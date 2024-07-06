from typing import List, Dict
from aiohttp import web

from openapi_server.models.mc_game_version_manifest_get200_response import McGameVersionManifestGet200Response
from openapi_server.models.v1_packages_package_id_version_id_json_get200_response import V1PackagesPackageIdVersionIdJsonGet200Response
from openapi_server import util


async def mc_game_version_manifest_get(request: web.Request, ) -> web.Response:
    """Get Minecraft version manifest

    


    """
    return web.Response(status=200)


async def v1_packages_package_id_version_id_json_get(request: web.Request, package_id, version_id) -> web.Response:
    """Get Minecraft version package details

    

    :param package_id: 
    :type package_id: str
    :param version_id: 
    :type version_id: str

    """
    return web.Response(status=200)
