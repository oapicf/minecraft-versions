/**
 * 
 * SDK for Minecraft versions info
 *
 * The version of the OpenAPI document: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.6.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "CppRestOpenAPIClient/model/VersionManifest.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



VersionManifest::VersionManifest()
{
    m_LatestIsSet = false;
    m_VersionsIsSet = false;
}

VersionManifest::~VersionManifest()
{
}

void VersionManifest::validate()
{
    // TODO: implement validation
}

web::json::value VersionManifest::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_LatestIsSet)
    {
        val[utility::conversions::to_string_t(U("latest"))] = ModelBase::toJson(m_Latest);
    }
    if(m_VersionsIsSet)
    {
        val[utility::conversions::to_string_t(U("versions"))] = ModelBase::toJson(m_Versions);
    }

    return val;
}

bool VersionManifest::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("latest"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("latest")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<VersionManifest_latest> refVal_setLatest;
            ok &= ModelBase::fromJson(fieldValue, refVal_setLatest);
            setLatest(refVal_setLatest);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("versions"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("versions")));
        if(!fieldValue.is_null())
        {
            std::vector<std::shared_ptr<Version>> refVal_setVersions;
            ok &= ModelBase::fromJson(fieldValue, refVal_setVersions);
            setVersions(refVal_setVersions);
        }
    }
    return ok;
}

void VersionManifest::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_LatestIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("latest")), m_Latest));
    }
    if(m_VersionsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("versions")), m_Versions));
    }
}

bool VersionManifest::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("latest"))))
    {
        std::shared_ptr<VersionManifest_latest> refVal_setLatest;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("latest"))), refVal_setLatest );
        setLatest(refVal_setLatest);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("versions"))))
    {
        std::vector<std::shared_ptr<Version>> refVal_setVersions;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("versions"))), refVal_setVersions );
        setVersions(refVal_setVersions);
    }
    return ok;
}

std::shared_ptr<VersionManifest_latest> VersionManifest::getLatest() const
{
    return m_Latest;
}

void VersionManifest::setLatest(const std::shared_ptr<VersionManifest_latest>& value)
{
    m_Latest = value;
    m_LatestIsSet = true;
}

bool VersionManifest::latestIsSet() const
{
    return m_LatestIsSet;
}

void VersionManifest::unsetLatest()
{
    m_LatestIsSet = false;
}
std::vector<std::shared_ptr<Version>>& VersionManifest::getVersions()
{
    return m_Versions;
}

void VersionManifest::setVersions(const std::vector<std::shared_ptr<Version>>& value)
{
    m_Versions = value;
    m_VersionsIsSet = true;
}

bool VersionManifest::versionsIsSet() const
{
    return m_VersionsIsSet;
}

void VersionManifest::unsetVersions()
{
    m_VersionsIsSet = false;
}
}
}
}
}

