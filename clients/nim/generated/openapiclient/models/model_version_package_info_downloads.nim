#
# 
# SDK for Minecraft versions info
# The version of the OpenAPI document: 1.1.1-pre.0
# Contact: blah+oapicf@cliffano.com
# Generated by: https://openapi-generator.tech
#

import json
import tables

import model_download

type VersionPackageInfoDownloads* = object
  ## 
  client*: Download
  clientMappings*: Download
  server*: Download
  serverMappings*: Download
