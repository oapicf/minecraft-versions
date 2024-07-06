import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.get_minecraft_version_manifest200_response import GetMinecraftVersionManifest200Response  # noqa: E501
from openapi_server.models.v1_packages_package_id_version_id_json_get200_response import V1PackagesPackageIdVersionIdJsonGet200Response  # noqa: E501
from openapi_server import util


def get_minecraft_version_manifest():  # noqa: E501
    """Get Minecraft version manifest

     # noqa: E501


    :rtype: Union[GetMinecraftVersionManifest200Response, Tuple[GetMinecraftVersionManifest200Response, int], Tuple[GetMinecraftVersionManifest200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def v1_packages_package_id_version_id_json_get(package_id, version_id):  # noqa: E501
    """Get Minecraft version package details

     # noqa: E501

    :param package_id: 
    :type package_id: str
    :param version_id: 
    :type version_id: str

    :rtype: Union[V1PackagesPackageIdVersionIdJsonGet200Response, Tuple[V1PackagesPackageIdVersionIdJsonGet200Response, int], Tuple[V1PackagesPackageIdVersionIdJsonGet200Response, int, Dict[str, str]]
    """
    return 'do some magic!'
