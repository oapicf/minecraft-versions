/**
 * 
 * SDK for Minecraft versions info
 *
 * The version of the OpenAPI document: 1.1.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.12.0.
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


#include <memory>
#include <utility>
#include <exception>

#include <corvusoft/restbed/session.hpp>
#include <corvusoft/restbed/resource.hpp>
#include <corvusoft/restbed/request.hpp>
#include <corvusoft/restbed/service.hpp>
#include <corvusoft/restbed/settings.hpp>

#include "VersionManifest.h"
#include "VersionPackageInfo.h"
#include <string>

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

///
/// Exception to flag problems in the handlers
///
class  DefaultApiException: public std::exception
{
public:
    DefaultApiException(int status_code, std::string what);

    int getStatus() const;
    const char* what() const noexcept override;

private:
    int m_status;
    std::string m_what;
};

/// <summary>
/// Get Minecraft version manifest
/// </summary>
/// <remarks>
/// 
/// </remarks>
class  DefaultApiMcGameVersion_manifest.jsonResource: public restbed::Resource
{
public:
    DefaultApiMcGameVersion_manifest.jsonResource(const std::string& context = "");
    virtual ~DefaultApiMcGameVersion_manifest.jsonResource();

protected:
    //////////////////////////////////////////////////////////
    // Override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, std::shared_ptr<VersionManifest>> handler_GET(
        );


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);



    virtual std::pair<int, std::string> handleDefaultApiException(const DefaultApiException& e);
    virtual std::pair<int, std::string> handleStdException(const std::exception& e);
    virtual std::pair<int, std::string> handleUnspecifiedException();

    virtual void setResponseHeader(const std::shared_ptr<restbed::Session>& session,
        const std::string& header);


    virtual void returnResponse(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result, const std::string& contentType);
    virtual void defaultSessionClose(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result);

private:
    void handler_GET_internal(const std::shared_ptr<restbed::Session> session);
};


/// <summary>
/// Get Minecraft version package info
/// </summary>
/// <remarks>
/// 
/// </remarks>
class  DefaultApiV1PackagesPackageId{versionId}.jsonResource: public restbed::Resource
{
public:
    DefaultApiV1PackagesPackageId{versionId}.jsonResource(const std::string& context = "");
    virtual ~DefaultApiV1PackagesPackageId{versionId}.jsonResource();

protected:
    //////////////////////////////////////////////////////////
    // Override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, std::shared_ptr<VersionPackageInfo>> handler_GET(
        std::string const & packageId, std::string const & versionId);


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);

    virtual std::string getPathParam_packageId(const std::shared_ptr<const restbed::Request>& request)
    {
        return request->get_path_parameter("packageId", "");
    }

    virtual std::string getPathParam_versionId(const std::shared_ptr<const restbed::Request>& request)
    {
        return request->get_path_parameter("versionId", "");
    }



    virtual std::pair<int, std::string> handleDefaultApiException(const DefaultApiException& e);
    virtual std::pair<int, std::string> handleStdException(const std::exception& e);
    virtual std::pair<int, std::string> handleUnspecifiedException();

    virtual void setResponseHeader(const std::shared_ptr<restbed::Session>& session,
        const std::string& header);


    virtual void returnResponse(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result, const std::string& contentType);
    virtual void defaultSessionClose(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result);

private:
    void handler_GET_internal(const std::shared_ptr<restbed::Session> session);
};



//
// The restbed service to actually implement the REST server
//
class  DefaultApi
{
public:
    explicit DefaultApi(std::shared_ptr<restbed::Service> const& restbedService);
    virtual ~DefaultApi();

    virtual void setDefaultApiMcGameVersion_manifest.jsonResource(std::shared_ptr<DefaultApiMcGameVersion_manifest.jsonResource> spDefaultApiMcGameVersion_manifest.jsonResource);
    virtual void setDefaultApiV1PackagesPackageId{versionId}.jsonResource(std::shared_ptr<DefaultApiV1PackagesPackageId{versionId}.jsonResource> spDefaultApiV1PackagesPackageId{versionId}.jsonResource);

    virtual void publishDefaultResources();

    virtual std::shared_ptr<restbed::Service> service();

protected:
    std::shared_ptr<DefaultApiMcGameVersion_manifest.jsonResource> m_spDefaultApiMcGameVersion_manifest.jsonResource;
    std::shared_ptr<DefaultApiV1PackagesPackageId{versionId}.jsonResource> m_spDefaultApiV1PackagesPackageId{versionId}.jsonResource;

private:
    std::shared_ptr<restbed::Service> m_service;
};


}
}
}
}

#endif /* DefaultApi_H_ */

