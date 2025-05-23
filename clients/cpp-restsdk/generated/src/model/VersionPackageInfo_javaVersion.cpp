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



#include "CppRestOpenAPIClient/model/VersionPackageInfo_javaVersion.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

VersionPackageInfo_javaVersion::VersionPackageInfo_javaVersion()
{
    m_Component = utility::conversions::to_string_t("");
    m_ComponentIsSet = false;
    m_MajorVersion = 0;
    m_MajorVersionIsSet = false;
}

VersionPackageInfo_javaVersion::~VersionPackageInfo_javaVersion()
{
}

void VersionPackageInfo_javaVersion::validate()
{
    // TODO: implement validation
}

web::json::value VersionPackageInfo_javaVersion::toJson() const
{
    web::json::value val = web::json::value::object();
    if(m_ComponentIsSet)
    {   
        
        val[utility::conversions::to_string_t(U("component"))] = ModelBase::toJson(m_Component);
    }
    if(m_MajorVersionIsSet)
    {   
        
        val[utility::conversions::to_string_t(U("majorVersion"))] = ModelBase::toJson(m_MajorVersion);
    }

    return val;
}

bool VersionPackageInfo_javaVersion::fromJson(const web::json::value& val)
{
    bool ok = true;
    if(val.has_field(utility::conversions::to_string_t(U("component"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("component")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setComponent;
            ok &= ModelBase::fromJson(fieldValue, refVal_setComponent);
            setComponent(refVal_setComponent);
            
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("majorVersion"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("majorVersion")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setMajorVersion;
            ok &= ModelBase::fromJson(fieldValue, refVal_setMajorVersion);
            setMajorVersion(refVal_setMajorVersion);
            
        }
    }
    return ok;
}

void VersionPackageInfo_javaVersion::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_ComponentIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("component")), m_Component));
    }
    if(m_MajorVersionIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("majorVersion")), m_MajorVersion));
    }
}

bool VersionPackageInfo_javaVersion::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("component"))))
    {
        utility::string_t refVal_setComponent;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("component"))), refVal_setComponent );
        setComponent(refVal_setComponent);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("majorVersion"))))
    {
        int32_t refVal_setMajorVersion;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("majorVersion"))), refVal_setMajorVersion );
        setMajorVersion(refVal_setMajorVersion);
    }
    return ok;
}


utility::string_t VersionPackageInfo_javaVersion::getComponent() const
{
    return m_Component;
}


void VersionPackageInfo_javaVersion::setComponent(const utility::string_t& value)
{
    m_Component = value;
    m_ComponentIsSet = true;
}

bool VersionPackageInfo_javaVersion::componentIsSet() const
{
    return m_ComponentIsSet;
}

void VersionPackageInfo_javaVersion::unsetComponent()
{
    m_ComponentIsSet = false;
}
int32_t VersionPackageInfo_javaVersion::getMajorVersion() const
{
    return m_MajorVersion;
}

void VersionPackageInfo_javaVersion::setMajorVersion(int32_t value)
{
    m_MajorVersion = value;
    m_MajorVersionIsSet = true;
}

bool VersionPackageInfo_javaVersion::majorVersionIsSet() const
{
    return m_MajorVersionIsSet;
}

void VersionPackageInfo_javaVersion::unsetMajorVersion()
{
    m_MajorVersionIsSet = false;
}

}
}
}
}


