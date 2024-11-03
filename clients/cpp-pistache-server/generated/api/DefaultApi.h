/**
* 
* SDK for Minecraft versions info
*
* The version of the OpenAPI document: 0.12.1-pre.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
/*
 * DefaultApi.h
 *
 * 
 */

#ifndef DefaultApi_H_
#define DefaultApi_H_


#include "ApiBase.h"

#include <pistache/http.h>
#include <pistache/router.h>
#include <pistache/http_headers.h>

#include <optional>
#include <utility>

#include "VersionManifest.h"
#include "VersionPackageInfo.h"
#include <string>

namespace org::openapitools::server::api
{

class  DefaultApi : public ApiBase {
public:
    explicit DefaultApi(const std::shared_ptr<Pistache::Rest::Router>& rtr);
    ~DefaultApi() override = default;
    void init() override;

    static const std::string base;

private:
    void setupRoutes();

    void get_minecraft_version_manifest_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void get_minecraft_version_package_info_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void default_api_default_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);

    /// <summary>
    /// Helper function to handle unexpected Exceptions during Parameter parsing and validation.
    /// May be overridden to return custom error formats. This is called inside a catch block.
    /// Important: When overriding, do not call `throw ex;`, but instead use `throw;`.
    /// </summary>
    virtual void handleParsingException(const std::exception& ex, Pistache::Http::ResponseWriter &response) const noexcept;

    /// <summary>
    /// Helper function to handle unexpected Exceptions during Parameter parsing and validation.
    /// May be overridden to return custom error formats. This is called inside a catch block.
    /// Important: When overriding, do not call `throw ex;`, but instead use `throw;`.
    /// </summary>
    virtual std::pair<Pistache::Http::Code, std::string> handleParsingException(const std::exception& ex) const noexcept;

    /// <summary>
    /// Helper function to handle unexpected Exceptions during processing of the request in handler functions.
    /// May be overridden to return custom error formats. This is called inside a catch block.
    /// Important: When overriding, do not call `throw ex;`, but instead use `throw;`.
    /// </summary>
    virtual void handleOperationException(const std::exception& ex, Pistache::Http::ResponseWriter &response) const noexcept;

    /// <summary>
    /// Helper function to handle unexpected Exceptions during processing of the request in handler functions.
    /// May be overridden to return custom error formats. This is called inside a catch block.
    /// Important: When overriding, do not call `throw ex;`, but instead use `throw;`.
    /// </summary>
    virtual std::pair<Pistache::Http::Code, std::string> handleOperationException(const std::exception& ex) const noexcept;

    /// <summary>
    /// Get Minecraft version manifest
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    virtual void get_minecraft_version_manifest(Pistache::Http::ResponseWriter &response) = 0;
    /// <summary>
    /// Get Minecraft version package info
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="packageId"></param>
    /// <param name="versionId"></param>
    virtual void get_minecraft_version_package_info(const std::string &packageId, const std::string &versionId, Pistache::Http::ResponseWriter &response) = 0;

};

} // namespace org::openapitools::server::api

#endif /* DefaultApi_H_ */

