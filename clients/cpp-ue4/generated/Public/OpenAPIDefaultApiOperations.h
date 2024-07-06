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
#include "OpenAPIDefaultApi.h"

#include "OpenAPIGetMinecraftVersionManifest200Response.h"
#include "OpenAPIV1PackagesPackageIdVersionIdJsonGet200Response.h"

namespace OpenAPI
{

/* Get Minecraft version manifest

*/
class OPENAPI_API OpenAPIDefaultApi::GetMinecraftVersionManifestRequest : public Request
{
public:
    virtual ~GetMinecraftVersionManifestRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

};

class OPENAPI_API OpenAPIDefaultApi::GetMinecraftVersionManifestResponse : public Response
{
public:
    virtual ~GetMinecraftVersionManifestResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIGetMinecraftVersionManifest200Response Content;
};

/* Get Minecraft version package details

*/
class OPENAPI_API OpenAPIDefaultApi::V1PackagesPackageIdVersionIdJsonGetRequest : public Request
{
public:
    virtual ~V1PackagesPackageIdVersionIdJsonGetRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	FString PackageId;
	FString VersionId;
};

class OPENAPI_API OpenAPIDefaultApi::V1PackagesPackageIdVersionIdJsonGetResponse : public Response
{
public:
    virtual ~V1PackagesPackageIdVersionIdJsonGetResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIV1PackagesPackageIdVersionIdJsonGet200Response Content;
};

}