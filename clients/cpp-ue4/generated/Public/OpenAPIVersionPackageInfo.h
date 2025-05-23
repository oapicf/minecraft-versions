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
#include "OpenAPIVersionPackageInfoAssetIndex.h"
#include "OpenAPIVersionPackageInfoDownloads.h"
#include "OpenAPIVersionPackageInfoJavaVersion.h"

namespace OpenAPI
{

/*
 * OpenAPIVersionPackageInfo
 *
 * 
 */
class OPENAPI_API OpenAPIVersionPackageInfo : public Model
{
public:
    virtual ~OpenAPIVersionPackageInfo() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	TOptional<FString> Version;
	TOptional<OpenAPIVersionPackageInfoAssetIndex> AssetIndex;
	TOptional<FString> Assets;
	TOptional<int32> ComplianceLevel;
	TOptional<OpenAPIVersionPackageInfoDownloads> Downloads;
	TOptional<FString> Id;
	TOptional<OpenAPIVersionPackageInfoJavaVersion> JavaVersion;
	TOptional<FString> MainClass;
	TOptional<int32> MinimumLauncherVersion;
	TOptional<FDateTime> Time;
	TOptional<FDateTime> ReleaseTime;
	TOptional<FString> Type;
};

}
