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

#include "Modules/ModuleInterface.h"
#include "Modules/ModuleManager.h"
#include "Logging/LogMacros.h"

DECLARE_LOG_CATEGORY_EXTERN(LogOpenAPI, Log, All);

class OPENAPI_API OpenAPIModule : public IModuleInterface
{
public:
	void StartupModule() final;
	void ShutdownModule() final;
};
