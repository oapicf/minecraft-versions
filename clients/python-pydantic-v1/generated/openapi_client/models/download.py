# coding: utf-8

"""
    SDK for Minecraft versions info

    The version of the OpenAPI document: 0.12.1-pre.0
    Contact: blah+oapicf@cliffano.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json


from typing import Optional
from pydantic import BaseModel, StrictInt, StrictStr

class Download(BaseModel):
    """
    Download
    """
    sha1: Optional[StrictStr] = None
    size: Optional[StrictInt] = None
    url: Optional[StrictStr] = None
    __properties = ["sha1", "size", "url"]

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
    def from_json(cls, json_str: str) -> Download:
        """Create an instance of Download from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> Download:
        """Create an instance of Download from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return Download.parse_obj(obj)

        _obj = Download.parse_obj({
            "sha1": obj.get("sha1"),
            "size": obj.get("size"),
            "url": obj.get("url")
        })
        return _obj


