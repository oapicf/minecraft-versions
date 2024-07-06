# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from openapi_server.models.mc_game_version_manifest_get200_response import McGameVersionManifestGet200Response
from openapi_server.models.v1_packages_package_id_version_id_json_get200_response import V1PackagesPackageIdVersionIdJsonGet200Response


class BaseDefaultApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseDefaultApi.subclasses = BaseDefaultApi.subclasses + (cls,)
    def mc_game_version_manifest_get(
        self,
    ) -> McGameVersionManifestGet200Response:
        ...


    def v1_packages_package_id_version_id_json_get(
        self,
        packageId: str,
        versionId: str,
    ) -> V1PackagesPackageIdVersionIdJsonGet200Response:
        ...
