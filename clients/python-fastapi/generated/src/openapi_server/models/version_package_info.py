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
from pydantic import BaseModel, ConfigDict, Field, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from openapi_server.models.version_package_info_asset_index import VersionPackageInfoAssetIndex
from openapi_server.models.version_package_info_downloads import VersionPackageInfoDownloads
from openapi_server.models.version_package_info_java_version import VersionPackageInfoJavaVersion
try:
    from typing import Self
except ImportError:
    from typing_extensions import Self

class VersionPackageInfo(BaseModel):
    """
    VersionPackageInfo
    """ # noqa: E501
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
    __properties: ClassVar[List[str]] = ["version", "assetIndex", "assets", "complianceLevel", "downloads", "id", "javaVersion", "mainClass", "minimumLauncherVersion", "time", "releaseTime", "type"]

    model_config = {
        "populate_by_name": True,
        "validate_assignment": True,
        "protected_namespaces": (),
    }


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of VersionPackageInfo from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        _dict = self.model_dump(
            by_alias=True,
            exclude={
            },
            exclude_none=True,
        )
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
    def from_dict(cls, obj: Dict) -> Self:
        """Create an instance of VersionPackageInfo from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "version": obj.get("version"),
            "assetIndex": VersionPackageInfoAssetIndex.from_dict(obj.get("assetIndex")) if obj.get("assetIndex") is not None else None,
            "assets": obj.get("assets"),
            "complianceLevel": obj.get("complianceLevel"),
            "downloads": VersionPackageInfoDownloads.from_dict(obj.get("downloads")) if obj.get("downloads") is not None else None,
            "id": obj.get("id"),
            "javaVersion": VersionPackageInfoJavaVersion.from_dict(obj.get("javaVersion")) if obj.get("javaVersion") is not None else None,
            "mainClass": obj.get("mainClass"),
            "minimumLauncherVersion": obj.get("minimumLauncherVersion"),
            "time": obj.get("time"),
            "releaseTime": obj.get("releaseTime"),
            "type": obj.get("type")
        })
        return _obj


