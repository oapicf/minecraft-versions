#
# 
# SDK for Minecraft versions info
# The version of the OpenAPI document: 0.9.0-pre.0
# Contact: blah+oapicf@cliffano.com
# Generated by: https://openapi-generator.tech
#

import httpclient
import json
import logging
import marshal
import options
import strformat
import strutils
import tables
import typetraits
import uri

import ../models/model_version_manifest
import ../models/model_version_package_info

const basepath = "https://launchermeta.mojang.com"

template constructResult[T](response: Response): untyped =
  if response.code in {Http200, Http201, Http202, Http204, Http206}:
    try:
      when name(stripGenericParams(T.typedesc).typedesc) == name(Table):
        (some(json.to(parseJson(response.body), T.typedesc)), response)
      else:
        (some(marshal.to[T](response.body)), response)
    except JsonParsingError:
      # The server returned a malformed response though the response code is 2XX
      # TODO: need better error handling
      error("JsonParsingError")
      (none(T.typedesc), response)
  else:
    (none(T.typedesc), response)


proc getMinecraftVersionManifest*(httpClient: HttpClient): (Option[VersionManifest], Response) =
  ## Get Minecraft version manifest

  let response = httpClient.get(basepath & "/mc/game/version_manifest.json")
  constructResult[VersionManifest](response)


proc getMinecraftVersionPackageInfo*(httpClient: HttpClient, packageId: string, versionId: string): (Option[VersionPackageInfo], Response) =
  ## Get Minecraft version package info

  let response = httpClient.get(basepath & fmt"/v1/packages/{packageId}/{versionId}.json")
  constructResult[VersionPackageInfo](response)

