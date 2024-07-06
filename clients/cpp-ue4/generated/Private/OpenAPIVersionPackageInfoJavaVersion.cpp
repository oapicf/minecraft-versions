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

#include "OpenAPIVersionPackageInfoJavaVersion.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPIVersionPackageInfoJavaVersion::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (Component.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("component")); WriteJsonValue(Writer, Component.GetValue());
	}
	if (MajorVersion.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("majorVersion")); WriteJsonValue(Writer, MajorVersion.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIVersionPackageInfoJavaVersion::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("component"), Component);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("majorVersion"), MajorVersion);

	return ParseSuccess;
}

}
