from typing import List, Dict
from aiohttp import web

from openapi_server.models.version_manifest import VersionManifest
from openapi_server.models.version_package_info import VersionPackageInfo
from openapi_server import util


async def get_minecraft_version_manifest(request: web.Request, ) -> web.Response:
    """Get Minecraft version manifest

    


    """
    return web.Response(status=200)


async def get_minecraft_version_package_info(request: web.Request, package_id, version_id) -> web.Response:
    """Get Minecraft version package info

    

    :param package_id: 
    :type package_id: str
    :param version_id: 
    :type version_id: str

    """
    return web.Response(status=200)
