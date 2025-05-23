/**
 * 
 * SDK for Minecraft versions info
 *
 * OpenAPI spec version: 1.1.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

#pragma once

#include "OpenAPIBaseModel.h"
#include "OpenAPIDownload.h"

namespace OpenAPI
{

/*
 * OpenAPIVersionPackageInfoDownloads
 *
 * 
 */
class OPENAPI_API OpenAPIVersionPackageInfoDownloads : public Model
{
public:
    virtual ~OpenAPIVersionPackageInfoDownloads() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	TOptional<OpenAPIDownload> Client;
	TOptional<OpenAPIDownload> ClientMappings;
	TOptional<OpenAPIDownload> Server;
	TOptional<OpenAPIDownload> ServerMappings;
};

}
