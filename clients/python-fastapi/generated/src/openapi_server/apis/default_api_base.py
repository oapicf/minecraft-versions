# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import StrictStr
from openapi_server.models.version_manifest import VersionManifest
from openapi_server.models.version_package_info import VersionPackageInfo


class BaseDefaultApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseDefaultApi.subclasses = BaseDefaultApi.subclasses + (cls,)
    async def get_minecraft_version_manifest(
        self,
    ) -> VersionManifest:
        ...


    async def get_minecraft_version_package_info(
        self,
        packageId: StrictStr,
        versionId: StrictStr,
    ) -> VersionPackageInfo:
        ...
