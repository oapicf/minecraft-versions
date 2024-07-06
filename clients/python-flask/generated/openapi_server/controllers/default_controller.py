import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.version_manifest import VersionManifest  # noqa: E501
from openapi_server.models.version_package_info import VersionPackageInfo  # noqa: E501
from openapi_server import util


def get_minecraft_version_manifest():  # noqa: E501
    """Get Minecraft version manifest

     # noqa: E501


    :rtype: Union[VersionManifest, Tuple[VersionManifest, int], Tuple[VersionManifest, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_minecraft_version_package_info(package_id, version_id):  # noqa: E501
    """Get Minecraft version package info

     # noqa: E501

    :param package_id: 
    :type package_id: str
    :param version_id: 
    :type version_id: str

    :rtype: Union[VersionPackageInfo, Tuple[VersionPackageInfo, int], Tuple[VersionPackageInfo, int, Dict[str, str]]
    """
    return 'do some magic!'
