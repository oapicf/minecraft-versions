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



#include "CppRestOpenAPIClient/model/VersionPackageInfo_assetIndex.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

VersionPackageInfo_assetIndex::VersionPackageInfo_assetIndex()
{
    m_Id = utility::conversions::to_string_t("");
    m_IdIsSet = false;
    m_Sha1 = utility::conversions::to_string_t("");
    m_Sha1IsSet = false;
    m_Size = 0;
    m_SizeIsSet = false;
    m_TotalSize = 0;
    m_TotalSizeIsSet = false;
    m_Url = utility::conversions::to_string_t("");
    m_UrlIsSet = false;
}

VersionPackageInfo_assetIndex::~VersionPackageInfo_assetIndex()
{
}

void VersionPackageInfo_assetIndex::validate()
{
    // TODO: implement validation
}

web::json::value VersionPackageInfo_assetIndex::toJson() const
{
    web::json::value val = web::json::value::object();
    if(m_IdIsSet)
    {   
        
        val[utility::conversions::to_string_t(U("id"))] = ModelBase::toJson(m_Id);
    }
    if(m_Sha1IsSet)
    {   
        
        val[utility::conversions::to_string_t(U("sha1"))] = ModelBase::toJson(m_Sha1);
    }
    if(m_SizeIsSet)
    {   
        
        val[utility::conversions::to_string_t(U("size"))] = ModelBase::toJson(m_Size);
    }
    if(m_TotalSizeIsSet)
    {   
        
        val[utility::conversions::to_string_t(U("totalSize"))] = ModelBase::toJson(m_TotalSize);
    }
    if(m_UrlIsSet)
    {   
        
        val[utility::conversions::to_string_t(U("url"))] = ModelBase::toJson(m_Url);
    }

    return val;
}

bool VersionPackageInfo_assetIndex::fromJson(const web::json::value& val)
{
    bool ok = true;
    if(val.has_field(utility::conversions::to_string_t(U("id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setId);
            setId(refVal_setId);
            
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("sha1"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("sha1")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setSha1;
            ok &= ModelBase::fromJson(fieldValue, refVal_setSha1);
            setSha1(refVal_setSha1);
            
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("size"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("size")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setSize;
            ok &= ModelBase::fromJson(fieldValue, refVal_setSize);
            setSize(refVal_setSize);
            
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("totalSize"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("totalSize")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setTotalSize;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTotalSize);
            setTotalSize(refVal_setTotalSize);
            
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("url"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("url")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setUrl;
            ok &= ModelBase::fromJson(fieldValue, refVal_setUrl);
            setUrl(refVal_setUrl);
            
        }
    }
    return ok;
}

void VersionPackageInfo_assetIndex::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_IdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("id")), m_Id));
    }
    if(m_Sha1IsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("sha1")), m_Sha1));
    }
    if(m_SizeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("size")), m_Size));
    }
    if(m_TotalSizeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("totalSize")), m_TotalSize));
    }
    if(m_UrlIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("url")), m_Url));
    }
}

bool VersionPackageInfo_assetIndex::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("id"))))
    {
        utility::string_t refVal_setId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("id"))), refVal_setId );
        setId(refVal_setId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("sha1"))))
    {
        utility::string_t refVal_setSha1;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("sha1"))), refVal_setSha1 );
        setSha1(refVal_setSha1);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("size"))))
    {
        int32_t refVal_setSize;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("size"))), refVal_setSize );
        setSize(refVal_setSize);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("totalSize"))))
    {
        int32_t refVal_setTotalSize;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("totalSize"))), refVal_setTotalSize );
        setTotalSize(refVal_setTotalSize);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("url"))))
    {
        utility::string_t refVal_setUrl;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("url"))), refVal_setUrl );
        setUrl(refVal_setUrl);
    }
    return ok;
}


utility::string_t VersionPackageInfo_assetIndex::getId() const
{
    return m_Id;
}


void VersionPackageInfo_assetIndex::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool VersionPackageInfo_assetIndex::idIsSet() const
{
    return m_IdIsSet;
}

void VersionPackageInfo_assetIndex::unsetId()
{
    m_IdIsSet = false;
}
utility::string_t VersionPackageInfo_assetIndex::getSha1() const
{
    return m_Sha1;
}


void VersionPackageInfo_assetIndex::setSha1(const utility::string_t& value)
{
    m_Sha1 = value;
    m_Sha1IsSet = true;
}

bool VersionPackageInfo_assetIndex::sha1IsSet() const
{
    return m_Sha1IsSet;
}

void VersionPackageInfo_assetIndex::unsetSha1()
{
    m_Sha1IsSet = false;
}
int32_t VersionPackageInfo_assetIndex::getSize() const
{
    return m_Size;
}

void VersionPackageInfo_assetIndex::setSize(int32_t value)
{
    m_Size = value;
    m_SizeIsSet = true;
}

bool VersionPackageInfo_assetIndex::sizeIsSet() const
{
    return m_SizeIsSet;
}

void VersionPackageInfo_assetIndex::unsetSize()
{
    m_SizeIsSet = false;
}
int32_t VersionPackageInfo_assetIndex::getTotalSize() const
{
    return m_TotalSize;
}

void VersionPackageInfo_assetIndex::setTotalSize(int32_t value)
{
    m_TotalSize = value;
    m_TotalSizeIsSet = true;
}

bool VersionPackageInfo_assetIndex::totalSizeIsSet() const
{
    return m_TotalSizeIsSet;
}

void VersionPackageInfo_assetIndex::unsetTotalSize()
{
    m_TotalSizeIsSet = false;
}
utility::string_t VersionPackageInfo_assetIndex::getUrl() const
{
    return m_Url;
}


void VersionPackageInfo_assetIndex::setUrl(const utility::string_t& value)
{
    m_Url = value;
    m_UrlIsSet = true;
}

bool VersionPackageInfo_assetIndex::urlIsSet() const
{
    return m_UrlIsSet;
}

void VersionPackageInfo_assetIndex::unsetUrl()
{
    m_UrlIsSet = false;
}

}
}
}
}


