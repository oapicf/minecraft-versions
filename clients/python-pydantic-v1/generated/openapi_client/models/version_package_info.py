# coding: utf-8

"""
    SDK for Minecraft versions info

    The version of the OpenAPI document: 0.9.0-pre.0
    Contact: blah+oapicf@cliffano.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from datetime import datetime
from typing import Optional
from pydantic import BaseModel, Field, StrictInt, StrictStr
from openapi_client.models.version_package_info_asset_index import VersionPackageInfoAssetIndex
from openapi_client.models.version_package_info_downloads import VersionPackageInfoDownloads
from openapi_client.models.version_package_info_java_version import VersionPackageInfoJavaVersion

class VersionPackageInfo(BaseModel):
    """
    VersionPackageInfo
    """
    version: Optional[StrictStr] = None
    asset_index: Optional[VersionPackageInfoAssetIndex] = Field(default=None, alias="assetIndex")
    assets: Optional[StrictStr] = None
    compliance_level: Optional[StrictInt] = Field(default=None, alias="complianceLevel")
    downloads: Optional[VersionPackageInfoDownloads] = None
    id: Optional[StrictStr] = None
    java_version: Optional[VersionPackageInfoJavaVersion] = Field(default=None, alias="javaVersion")
    main_class: Optional[StrictStr] = Field(default=None, alias="mainClass")
    minimum_launcher_version: Optional[StrictInt] = Field(default=None, alias="minimumLauncherVersion")
    time: Optional[datetime] = None
    release_time: Optional[datetime] = Field(default=None, alias="releaseTime")
    type: Optional[StrictStr] = None
    __properties = ["version", "assetIndex", "assets", "complianceLevel", "downloads", "id", "javaVersion", "mainClass", "minimumLauncherVersion", "time", "releaseTime", "type"]

    class Config:
        """Pydantic configuration"""
        allow_population_by_field_name = True
        validate_assignment = True

    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.dict(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> VersionPackageInfo:
        """Create an instance of VersionPackageInfo from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of asset_index
        if self.asset_index:
            _dict['assetIndex'] = self.asset_index.to_dict()
        # override the default output from pydantic by calling `to_dict()` of downloads
        if self.downloads:
            _dict['downloads'] = self.downloads.to_dict()
        # override the default output from pydantic by calling `to_dict()` of java_version
        if self.java_version:
            _dict['javaVersion'] = self.java_version.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> VersionPackageInfo:
        """Create an instance of VersionPackageInfo from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return VersionPackageInfo.parse_obj(obj)

        _obj = VersionPackageInfo.parse_obj({
            "version": obj.get("version"),
            "asset_index": VersionPackageInfoAssetIndex.from_dict(obj.get("assetIndex")) if obj.get("assetIndex") is not None else None,
            "assets": obj.get("assets"),
            "compliance_level": obj.get("complianceLevel"),
            "downloads": VersionPackageInfoDownloads.from_dict(obj.get("downloads")) if obj.get("downloads") is not None else None,
            "id": obj.get("id"),
            "java_version": VersionPackageInfoJavaVersion.from_dict(obj.get("javaVersion")) if obj.get("javaVersion") is not None else None,
            "main_class": obj.get("mainClass"),
            "minimum_launcher_version": obj.get("minimumLauncherVersion"),
            "time": obj.get("time"),
            "release_time": obj.get("releaseTime"),
            "type": obj.get("type")
        })
        return _obj


