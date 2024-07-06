/**
 * 
 * SDK for Minecraft versions info
 *
 * OpenAPI spec version: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

#pragma once

#include "OpenAPIBaseModel.h"

namespace OpenAPI
{

/*
 * OpenAPIMcGameVersionManifestGet200ResponseLatest
 *
 * 
 */
class OPENAPI_API OpenAPIMcGameVersionManifestGet200ResponseLatest : public Model
{
public:
    virtual ~OpenAPIMcGameVersionManifestGet200ResponseLatest() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	TOptional<FString> Release;
	TOptional<FString> Snapshot;
};

}