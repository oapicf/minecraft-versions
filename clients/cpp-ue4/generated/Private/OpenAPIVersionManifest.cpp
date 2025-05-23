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

#include "OpenAPIVersionManifest.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPIVersionManifest::WriteJson(JsonWriter& Writer) const
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

bool OpenAPIVersionManifest::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
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
