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

#include "OpenAPIMcGameVersionManifestGet200Response.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPIMcGameVersionManifestGet200Response::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (Latest.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("latest")); WriteJsonValue(Writer, Latest.GetValue());
	}
	if (Versions.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("versions")); WriteJsonValue(Writer, Versions.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIMcGameVersionManifestGet200Response::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("latest"), Latest);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("versions"), Versions);

	return ParseSuccess;
}

}