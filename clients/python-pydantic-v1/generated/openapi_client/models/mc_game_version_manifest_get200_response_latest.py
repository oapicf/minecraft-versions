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


from typing import Optional
from pydantic import BaseModel, StrictStr

class McGameVersionManifestGet200ResponseLatest(BaseModel):
    """
    McGameVersionManifestGet200ResponseLatest
    """
    release: Optional[StrictStr] = None
    snapshot: Optional[StrictStr] = None
    __properties = ["release", "snapshot"]

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
    def from_json(cls, json_str: str) -> McGameVersionManifestGet200ResponseLatest:
        """Create an instance of McGameVersionManifestGet200ResponseLatest from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> McGameVersionManifestGet200ResponseLatest:
        """Create an instance of McGameVersionManifestGet200ResponseLatest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return McGameVersionManifestGet200ResponseLatest.parse_obj(obj)

        _obj = McGameVersionManifestGet200ResponseLatest.parse_obj({
            "release": obj.get("release"),
            "snapshot": obj.get("snapshot")
        })
        return _obj


