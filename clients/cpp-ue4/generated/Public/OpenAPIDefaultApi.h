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

#include "CoreMinimal.h"
#include "OpenAPIBaseModel.h"

namespace OpenAPI
{

class OPENAPI_API OpenAPIDefaultApi
{
public:
	OpenAPIDefaultApi();
	~OpenAPIDefaultApi();

	/* Sets the URL Endpoint.
	* Note: several fallback endpoints can be configured in request retry policies, see Request::SetShouldRetry */
	void SetURL(const FString& Url);

	/* Adds global header params to all requests */
	void AddHeaderParam(const FString& Key, const FString& Value);
	void ClearHeaderParams();

	/* Sets the retry manager to the user-defined retry manager. User must manage the lifetime of the retry manager.
	* If no retry manager is specified and a request needs retries, a default retry manager will be used.
	* See also: Request::SetShouldRetry */
	void SetHttpRetryManager(FHttpRetrySystem::FManager& RetryManager);
	FHttpRetrySystem::FManager& GetHttpRetryManager();

	class GetMinecraftVersionManifestRequest;
	class GetMinecraftVersionManifestResponse;
	class V1PackagesPackageIdVersionIdJsonGetRequest;
	class V1PackagesPackageIdVersionIdJsonGetResponse;
	
    DECLARE_DELEGATE_OneParam(FGetMinecraftVersionManifestDelegate, const GetMinecraftVersionManifestResponse&);
    DECLARE_DELEGATE_OneParam(FV1PackagesPackageIdVersionIdJsonGetDelegate, const V1PackagesPackageIdVersionIdJsonGetResponse&);
    
    FHttpRequestPtr GetMinecraftVersionManifest(const GetMinecraftVersionManifestRequest& Request, const FGetMinecraftVersionManifestDelegate& Delegate = FGetMinecraftVersionManifestDelegate()) const;
    FHttpRequestPtr V1PackagesPackageIdVersionIdJsonGet(const V1PackagesPackageIdVersionIdJsonGetRequest& Request, const FV1PackagesPackageIdVersionIdJsonGetDelegate& Delegate = FV1PackagesPackageIdVersionIdJsonGetDelegate()) const;
    
private:
    void OnGetMinecraftVersionManifestResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FGetMinecraftVersionManifestDelegate Delegate) const;
    void OnV1PackagesPackageIdVersionIdJsonGetResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FV1PackagesPackageIdVersionIdJsonGetDelegate Delegate) const;
    
	FHttpRequestRef CreateHttpRequest(const Request& Request) const;
	bool IsValid() const;
	void HandleResponse(FHttpResponsePtr HttpResponse, bool bSucceeded, Response& InOutResponse) const;

	FString Url;
	TMap<FString,FString> AdditionalHeaderParams;
	mutable FHttpRetrySystem::FManager* RetryManager = nullptr;
	mutable TUniquePtr<HttpRetryManager> DefaultRetryManager;
};

}