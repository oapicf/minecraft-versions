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

#include "OpenAPIDefaultApiOperations.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Dom/JsonObject.h"
#include "Templates/SharedPointer.h"
#include "HttpModule.h"
#include "PlatformHttp.h"

namespace OpenAPI
{

FString OpenAPIDefaultApi::GetMinecraftVersionManifestRequest::ComputePath() const
{
	FString Path(TEXT("/mc/game/version_manifest.json"));
	return Path;
}

void OpenAPIDefaultApi::GetMinecraftVersionManifestRequest::SetupHttpRequest(const FHttpRequestRef& HttpRequest) const
{
	static const TArray<FString> Consumes = {  };
	//static const TArray<FString> Produces = { TEXT("application/json") };

	HttpRequest->SetVerb(TEXT("GET"));

}

void OpenAPIDefaultApi::GetMinecraftVersionManifestResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
{
	Response::SetHttpResponseCode(InHttpResponseCode);
	switch ((int)InHttpResponseCode)
	{
	case 200:
		SetResponseString(TEXT("A list of Minecraft versions with the latest and snapshot releases"));
		break;
	}
}

bool OpenAPIDefaultApi::GetMinecraftVersionManifestResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Content);
}

FString OpenAPIDefaultApi::GetMinecraftVersionPackageInfoRequest::ComputePath() const
{
	TMap<FString, FStringFormatArg> PathParams = { 
	{ TEXT("packageId"), FStringFormatArg(ToUrlString(PackageId)) },
	{ TEXT("versionId"), FStringFormatArg(ToUrlString(VersionId)) } };

	FString Path = FString::Format(TEXT("/v1/packages/{packageId}/{versionId}.json"), PathParams);

	return Path;
}

void OpenAPIDefaultApi::GetMinecraftVersionPackageInfoRequest::SetupHttpRequest(const FHttpRequestRef& HttpRequest) const
{
	static const TArray<FString> Consumes = {  };
	//static const TArray<FString> Produces = { TEXT("application/json") };

	HttpRequest->SetVerb(TEXT("GET"));

}

void OpenAPIDefaultApi::GetMinecraftVersionPackageInfoResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
{
	Response::SetHttpResponseCode(InHttpResponseCode);
	switch ((int)InHttpResponseCode)
	{
	case 200:
		SetResponseString(TEXT("Get package version details"));
		break;
	}
}

bool OpenAPIDefaultApi::GetMinecraftVersionPackageInfoResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Content);
}

}
