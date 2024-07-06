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
    Path,
    Query,
    Response,
    Security,
    status,
)

from openapi_server.models.extra_models import TokenModel  # noqa: F401
from openapi_server.models.mc_game_version_manifest_get200_response import McGameVersionManifestGet200Response
from openapi_server.models.v1_packages_package_id_version_id_json_get200_response import V1PackagesPackageIdVersionIdJsonGet200Response


router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/mc/game/version_manifest",
    responses={
        200: {"model": McGameVersionManifestGet200Response, "description": "A list of Minecraft versions with the latest and snapshot releases"},
    },
    tags=["default"],
    summary="Get Minecraft version manifest",
    response_model_by_alias=True,
)
async def mc_game_version_manifest_get(
) -> McGameVersionManifestGet200Response:
    ...


@router.get(
    "/v1/packages/{packageId}/{versionId}.json",
    responses={
        200: {"model": V1PackagesPackageIdVersionIdJsonGet200Response, "description": "Get package version details"},
    },
    tags=["default"],
    summary="Get Minecraft version package details",
    response_model_by_alias=True,
)
async def v1_packages_package_id_version_id_json_get(
    packageId: str = Path(..., description=""),
    versionId: str = Path(..., description=""),
) -> V1PackagesPackageIdVersionIdJsonGet200Response:
    ...
