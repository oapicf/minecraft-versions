import connexion

from app.openapi_server.models.mc_game_version_manifest_get200_response import McGameVersionManifestGet200Response  # noqa: E501
from app.openapi_server.models.v1_packages_package_id_version_id_json_get200_response import V1PackagesPackageIdVersionIdJsonGet200Response  # noqa: E501
from openapi_server import util


def mc_game_version_manifest_get():  # noqa: E501
    """Get Minecraft version manifest

     # noqa: E501


    :rtype: McGameVersionManifestGet200Response
    """
    return 'do some magic!'


def v1_packages_package_id_version_id_json_get(package_id, version_id):  # noqa: E501
    """Get Minecraft version package details

     # noqa: E501

    :param package_id: 
    :type package_id: str
    :param version_id: 
    :type version_id: str

    :rtype: V1PackagesPackageIdVersionIdJsonGet200Response
    """
    return 'do some magic!'
