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



#include "CppRestOpenAPIClient/model/VersionPackageInfo.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



VersionPackageInfo::VersionPackageInfo()
{
    m_Version = utility::conversions::to_string_t("");
    m_VersionIsSet = false;
    m_AssetIndexIsSet = false;
    m_Assets = utility::conversions::to_string_t("");
    m_AssetsIsSet = false;
    m_ComplianceLevel = 0;
    m_ComplianceLevelIsSet = false;
    m_DownloadsIsSet = false;
    m_Id = utility::conversions::to_string_t("");
    m_IdIsSet = false;
    m_JavaVersionIsSet = false;
    m_MainClass = utility::conversions::to_string_t("");
    m_MainClassIsSet = false;
    m_MinimumLauncherVersion = 0;
    m_MinimumLauncherVersionIsSet = false;
    m_Time = utility::datetime();
    m_TimeIsSet = false;
    m_ReleaseTime = utility::datetime();
    m_ReleaseTimeIsSet = false;
    m_Type = utility::conversions::to_string_t("");
    m_TypeIsSet = false;
}

VersionPackageInfo::~VersionPackageInfo()
{
}

void VersionPackageInfo::validate()
{
    // TODO: implement validation
}

web::json::value VersionPackageInfo::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_VersionIsSet)
    {
        val[utility::conversions::to_string_t(U("version"))] = ModelBase::toJson(m_Version);
    }
    if(m_AssetIndexIsSet)
    {
        val[utility::conversions::to_string_t(U("assetIndex"))] = ModelBase::toJson(m_AssetIndex);
    }
    if(m_AssetsIsSet)
    {
        val[utility::conversions::to_string_t(U("assets"))] = ModelBase::toJson(m_Assets);
    }
    if(m_ComplianceLevelIsSet)
    {
        val[utility::conversions::to_string_t(U("complianceLevel"))] = ModelBase::toJson(m_ComplianceLevel);
    }
    if(m_DownloadsIsSet)
    {
        val[utility::conversions::to_string_t(U("downloads"))] = ModelBase::toJson(m_Downloads);
    }
    if(m_IdIsSet)
    {
        val[utility::conversions::to_string_t(U("id"))] = ModelBase::toJson(m_Id);
    }
    if(m_JavaVersionIsSet)
    {
        val[utility::conversions::to_string_t(U("javaVersion"))] = ModelBase::toJson(m_JavaVersion);
    }
    if(m_MainClassIsSet)
    {
        val[utility::conversions::to_string_t(U("mainClass"))] = ModelBase::toJson(m_MainClass);
    }
    if(m_MinimumLauncherVersionIsSet)
    {
        val[utility::conversions::to_string_t(U("minimumLauncherVersion"))] = ModelBase::toJson(m_MinimumLauncherVersion);
    }
    if(m_TimeIsSet)
    {
        val[utility::conversions::to_string_t(U("time"))] = ModelBase::toJson(m_Time);
    }
    if(m_ReleaseTimeIsSet)
    {
        val[utility::conversions::to_string_t(U("releaseTime"))] = ModelBase::toJson(m_ReleaseTime);
    }
    if(m_TypeIsSet)
    {
        val[utility::conversions::to_string_t(U("type"))] = ModelBase::toJson(m_Type);
    }

    return val;
}

bool VersionPackageInfo::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("version"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("version")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setVersion;
            ok &= ModelBase::fromJson(fieldValue, refVal_setVersion);
            setVersion(refVal_setVersion);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("assetIndex"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("assetIndex")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<VersionPackageInfo_assetIndex> refVal_setAssetIndex;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAssetIndex);
            setAssetIndex(refVal_setAssetIndex);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("assets"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("assets")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setAssets;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAssets);
            setAssets(refVal_setAssets);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("complianceLevel"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("complianceLevel")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setComplianceLevel;
            ok &= ModelBase::fromJson(fieldValue, refVal_setComplianceLevel);
            setComplianceLevel(refVal_setComplianceLevel);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("downloads"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("downloads")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<VersionPackageInfo_downloads> refVal_setDownloads;
            ok &= ModelBase::fromJson(fieldValue, refVal_setDownloads);
            setDownloads(refVal_setDownloads);
        }
    }
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
    if(val.has_field(utility::conversions::to_string_t(U("javaVersion"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("javaVersion")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<VersionPackageInfo_javaVersion> refVal_setJavaVersion;
            ok &= ModelBase::fromJson(fieldValue, refVal_setJavaVersion);
            setJavaVersion(refVal_setJavaVersion);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("mainClass"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("mainClass")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setMainClass;
            ok &= ModelBase::fromJson(fieldValue, refVal_setMainClass);
            setMainClass(refVal_setMainClass);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("minimumLauncherVersion"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("minimumLauncherVersion")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setMinimumLauncherVersion;
            ok &= ModelBase::fromJson(fieldValue, refVal_setMinimumLauncherVersion);
            setMinimumLauncherVersion(refVal_setMinimumLauncherVersion);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("time"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("time")));
        if(!fieldValue.is_null())
        {
            utility::datetime refVal_setTime;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTime);
            setTime(refVal_setTime);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("releaseTime"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("releaseTime")));
        if(!fieldValue.is_null())
        {
            utility::datetime refVal_setReleaseTime;
            ok &= ModelBase::fromJson(fieldValue, refVal_setReleaseTime);
            setReleaseTime(refVal_setReleaseTime);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("type"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("type")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setType;
            ok &= ModelBase::fromJson(fieldValue, refVal_setType);
            setType(refVal_setType);
        }
    }
    return ok;
}

void VersionPackageInfo::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_VersionIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("version")), m_Version));
    }
    if(m_AssetIndexIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("assetIndex")), m_AssetIndex));
    }
    if(m_AssetsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("assets")), m_Assets));
    }
    if(m_ComplianceLevelIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("complianceLevel")), m_ComplianceLevel));
    }
    if(m_DownloadsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("downloads")), m_Downloads));
    }
    if(m_IdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("id")), m_Id));
    }
    if(m_JavaVersionIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("javaVersion")), m_JavaVersion));
    }
    if(m_MainClassIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("mainClass")), m_MainClass));
    }
    if(m_MinimumLauncherVersionIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("minimumLauncherVersion")), m_MinimumLauncherVersion));
    }
    if(m_TimeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("time")), m_Time));
    }
    if(m_ReleaseTimeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("releaseTime")), m_ReleaseTime));
    }
    if(m_TypeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("type")), m_Type));
    }
}

bool VersionPackageInfo::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("version"))))
    {
        utility::string_t refVal_setVersion;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("version"))), refVal_setVersion );
        setVersion(refVal_setVersion);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("assetIndex"))))
    {
        std::shared_ptr<VersionPackageInfo_assetIndex> refVal_setAssetIndex;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("assetIndex"))), refVal_setAssetIndex );
        setAssetIndex(refVal_setAssetIndex);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("assets"))))
    {
        utility::string_t refVal_setAssets;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("assets"))), refVal_setAssets );
        setAssets(refVal_setAssets);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("complianceLevel"))))
    {
        int32_t refVal_setComplianceLevel;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("complianceLevel"))), refVal_setComplianceLevel );
        setComplianceLevel(refVal_setComplianceLevel);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("downloads"))))
    {
        std::shared_ptr<VersionPackageInfo_downloads> refVal_setDownloads;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("downloads"))), refVal_setDownloads );
        setDownloads(refVal_setDownloads);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("id"))))
    {
        utility::string_t refVal_setId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("id"))), refVal_setId );
        setId(refVal_setId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("javaVersion"))))
    {
        std::shared_ptr<VersionPackageInfo_javaVersion> refVal_setJavaVersion;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("javaVersion"))), refVal_setJavaVersion );
        setJavaVersion(refVal_setJavaVersion);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("mainClass"))))
    {
        utility::string_t refVal_setMainClass;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("mainClass"))), refVal_setMainClass );
        setMainClass(refVal_setMainClass);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("minimumLauncherVersion"))))
    {
        int32_t refVal_setMinimumLauncherVersion;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("minimumLauncherVersion"))), refVal_setMinimumLauncherVersion );
        setMinimumLauncherVersion(refVal_setMinimumLauncherVersion);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("time"))))
    {
        utility::datetime refVal_setTime;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("time"))), refVal_setTime );
        setTime(refVal_setTime);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("releaseTime"))))
    {
        utility::datetime refVal_setReleaseTime;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("releaseTime"))), refVal_setReleaseTime );
        setReleaseTime(refVal_setReleaseTime);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("type"))))
    {
        utility::string_t refVal_setType;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("type"))), refVal_setType );
        setType(refVal_setType);
    }
    return ok;
}

utility::string_t VersionPackageInfo::getVersion() const
{
    return m_Version;
}

void VersionPackageInfo::setVersion(const utility::string_t& value)
{
    m_Version = value;
    m_VersionIsSet = true;
}

bool VersionPackageInfo::versionIsSet() const
{
    return m_VersionIsSet;
}

void VersionPackageInfo::unsetVersion()
{
    m_VersionIsSet = false;
}
std::shared_ptr<VersionPackageInfo_assetIndex> VersionPackageInfo::getAssetIndex() const
{
    return m_AssetIndex;
}

void VersionPackageInfo::setAssetIndex(const std::shared_ptr<VersionPackageInfo_assetIndex>& value)
{
    m_AssetIndex = value;
    m_AssetIndexIsSet = true;
}

bool VersionPackageInfo::assetIndexIsSet() const
{
    return m_AssetIndexIsSet;
}

void VersionPackageInfo::unsetAssetIndex()
{
    m_AssetIndexIsSet = false;
}
utility::string_t VersionPackageInfo::getAssets() const
{
    return m_Assets;
}

void VersionPackageInfo::setAssets(const utility::string_t& value)
{
    m_Assets = value;
    m_AssetsIsSet = true;
}

bool VersionPackageInfo::assetsIsSet() const
{
    return m_AssetsIsSet;
}

void VersionPackageInfo::unsetAssets()
{
    m_AssetsIsSet = false;
}
int32_t VersionPackageInfo::getComplianceLevel() const
{
    return m_ComplianceLevel;
}

void VersionPackageInfo::setComplianceLevel(int32_t value)
{
    m_ComplianceLevel = value;
    m_ComplianceLevelIsSet = true;
}

bool VersionPackageInfo::complianceLevelIsSet() const
{
    return m_ComplianceLevelIsSet;
}

void VersionPackageInfo::unsetComplianceLevel()
{
    m_ComplianceLevelIsSet = false;
}
std::shared_ptr<VersionPackageInfo_downloads> VersionPackageInfo::getDownloads() const
{
    return m_Downloads;
}

void VersionPackageInfo::setDownloads(const std::shared_ptr<VersionPackageInfo_downloads>& value)
{
    m_Downloads = value;
    m_DownloadsIsSet = true;
}

bool VersionPackageInfo::downloadsIsSet() const
{
    return m_DownloadsIsSet;
}

void VersionPackageInfo::unsetDownloads()
{
    m_DownloadsIsSet = false;
}
utility::string_t VersionPackageInfo::getId() const
{
    return m_Id;
}

void VersionPackageInfo::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool VersionPackageInfo::idIsSet() const
{
    return m_IdIsSet;
}

void VersionPackageInfo::unsetId()
{
    m_IdIsSet = false;
}
std::shared_ptr<VersionPackageInfo_javaVersion> VersionPackageInfo::getJavaVersion() const
{
    return m_JavaVersion;
}

void VersionPackageInfo::setJavaVersion(const std::shared_ptr<VersionPackageInfo_javaVersion>& value)
{
    m_JavaVersion = value;
    m_JavaVersionIsSet = true;
}

bool VersionPackageInfo::javaVersionIsSet() const
{
    return m_JavaVersionIsSet;
}

void VersionPackageInfo::unsetJavaVersion()
{
    m_JavaVersionIsSet = false;
}
utility::string_t VersionPackageInfo::getMainClass() const
{
    return m_MainClass;
}

void VersionPackageInfo::setMainClass(const utility::string_t& value)
{
    m_MainClass = value;
    m_MainClassIsSet = true;
}

bool VersionPackageInfo::mainClassIsSet() const
{
    return m_MainClassIsSet;
}

void VersionPackageInfo::unsetMainClass()
{
    m_MainClassIsSet = false;
}
int32_t VersionPackageInfo::getMinimumLauncherVersion() const
{
    return m_MinimumLauncherVersion;
}

void VersionPackageInfo::setMinimumLauncherVersion(int32_t value)
{
    m_MinimumLauncherVersion = value;
    m_MinimumLauncherVersionIsSet = true;
}

bool VersionPackageInfo::minimumLauncherVersionIsSet() const
{
    return m_MinimumLauncherVersionIsSet;
}

void VersionPackageInfo::unsetMinimumLauncherVersion()
{
    m_MinimumLauncherVersionIsSet = false;
}
utility::datetime VersionPackageInfo::getTime() const
{
    return m_Time;
}

void VersionPackageInfo::setTime(const utility::datetime& value)
{
    m_Time = value;
    m_TimeIsSet = true;
}

bool VersionPackageInfo::timeIsSet() const
{
    return m_TimeIsSet;
}

void VersionPackageInfo::unsetTime()
{
    m_TimeIsSet = false;
}
utility::datetime VersionPackageInfo::getReleaseTime() const
{
    return m_ReleaseTime;
}

void VersionPackageInfo::setReleaseTime(const utility::datetime& value)
{
    m_ReleaseTime = value;
    m_ReleaseTimeIsSet = true;
}

bool VersionPackageInfo::releaseTimeIsSet() const
{
    return m_ReleaseTimeIsSet;
}

void VersionPackageInfo::unsetReleaseTime()
{
    m_ReleaseTimeIsSet = false;
}
utility::string_t VersionPackageInfo::getType() const
{
    return m_Type;
}

void VersionPackageInfo::setType(const utility::string_t& value)
{
    m_Type = value;
    m_TypeIsSet = true;
}

bool VersionPackageInfo::typeIsSet() const
{
    return m_TypeIsSet;
}

void VersionPackageInfo::unsetType()
{
    m_TypeIsSet = false;
}
}
}
}
}

