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
 * OpenAPIV1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex
 *
 * 
 */
class OPENAPI_API OpenAPIV1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex : public Model
{
public:
    virtual ~OpenAPIV1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	TOptional<FString> Id;
	TOptional<FString> Sha1;
	TOptional<int32> Size;
	TOptional<int32> TotalSize;
	TOptional<FString> Url;
};

}
