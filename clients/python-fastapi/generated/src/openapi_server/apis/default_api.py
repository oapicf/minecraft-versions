# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.default_api_base import BaseDefaultApi
import openapi_server.impl

from fastapi import (  # noqa: F401
    APIRouter,
    Body,
    Cookie,
    Depends,
    Form,
    Header,
    HTTPException,
    Path,
    Query,
    Response,
    Security,
    status,
)

from openapi_server.models.extra_models import TokenModel  # noqa: F401
from openapi_server.models.version_manifest import VersionManifest
from openapi_server.models.version_package_info import VersionPackageInfo


router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/mc/game/version_manifest.json",
    responses={
        200: {"model": VersionManifest, "description": "A list of Minecraft versions with the latest and snapshot releases"},
    },
    tags=["default"],
    summary="Get Minecraft version manifest",
    response_model_by_alias=True,
)
async def get_minecraft_version_manifest(
) -> VersionManifest:
    if not BaseDefaultApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseDefaultApi.subclasses[0]().get_minecraft_version_manifest()


@router.get(
    "/v1/packages/{packageId}/{versionId}.json",
    responses={
        200: {"model": VersionPackageInfo, "description": "Get package version details"},
    },
    tags=["default"],
    summary="Get Minecraft version package info",
    response_model_by_alias=True,
)
async def get_minecraft_version_package_info(
    packageId: str = Path(..., description=""),
    versionId: str = Path(..., description=""),
) -> VersionPackageInfo:
    if not BaseDefaultApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseDefaultApi.subclasses[0]().get_minecraft_version_package_info(packageId, versionId)
