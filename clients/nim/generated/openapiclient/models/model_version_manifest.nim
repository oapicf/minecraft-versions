#
# 
# SDK for Minecraft versions info
# The version of the OpenAPI document: 0.12.1-pre.0
# Contact: blah+oapicf@cliffano.com
# Generated by: https://openapi-generator.tech
#

import json
import tables

import model_version
import model_version_manifest_latest

type VersionManifest* = object
  ## 
  latest*: VersionManifest_latest
  versions*: seq[Version]
