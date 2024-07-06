/**
* 
* SDK for Minecraft versions info
*
* The version of the OpenAPI document: 0.9.0-pre.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


#include "_v1_packages__packageId___versionId__json_get_200_response.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

_v1_packages__packageId___versionId__json_get_200_response::_v1_packages__packageId___versionId__json_get_200_response()
{
    m_Version = "";
    m_VersionIsSet = false;
    m_AssetIndexIsSet = false;
    m_Assets = 0;
    m_AssetsIsSet = false;
    m_ComplianceLevel = 0;
    m_ComplianceLevelIsSet = false;
    m_DownloadsIsSet = false;
    m_Id = "";
    m_IdIsSet = false;
    m_JavaVersionIsSet = false;
    m_MainClass = "";
    m_MainClassIsSet = false;
    m_MinimumLauncherVersion = 0;
    m_MinimumLauncherVersionIsSet = false;
    m_Time = "";
    m_TimeIsSet = false;
    m_ReleaseTime = "";
    m_ReleaseTimeIsSet = false;
    m_Type = "";
    m_TypeIsSet = false;
    
}

void _v1_packages__packageId___versionId__json_get_200_response::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool _v1_packages__packageId___versionId__json_get_200_response::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool _v1_packages__packageId___versionId__json_get_200_response::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "_v1_packages__packageId___versionId__json_get_200_response" : pathPrefix;

                                                    
    return success;
}

bool _v1_packages__packageId___versionId__json_get_200_response::operator==(const _v1_packages__packageId___versionId__json_get_200_response& rhs) const
{
    return
    
    
    
    ((!versionIsSet() && !rhs.versionIsSet()) || (versionIsSet() && rhs.versionIsSet() && getVersion() == rhs.getVersion())) &&
    
    
    ((!assetIndexIsSet() && !rhs.assetIndexIsSet()) || (assetIndexIsSet() && rhs.assetIndexIsSet() && getAssetIndex() == rhs.getAssetIndex())) &&
    
    
    ((!assetsIsSet() && !rhs.assetsIsSet()) || (assetsIsSet() && rhs.assetsIsSet() && getAssets() == rhs.getAssets())) &&
    
    
    ((!complianceLevelIsSet() && !rhs.complianceLevelIsSet()) || (complianceLevelIsSet() && rhs.complianceLevelIsSet() && getComplianceLevel() == rhs.getComplianceLevel())) &&
    
    
    ((!downloadsIsSet() && !rhs.downloadsIsSet()) || (downloadsIsSet() && rhs.downloadsIsSet() && getDownloads() == rhs.getDownloads())) &&
    
    
    ((!idIsSet() && !rhs.idIsSet()) || (idIsSet() && rhs.idIsSet() && getId() == rhs.getId())) &&
    
    
    ((!javaVersionIsSet() && !rhs.javaVersionIsSet()) || (javaVersionIsSet() && rhs.javaVersionIsSet() && getJavaVersion() == rhs.getJavaVersion())) &&
    
    
    ((!mainClassIsSet() && !rhs.mainClassIsSet()) || (mainClassIsSet() && rhs.mainClassIsSet() && getMainClass() == rhs.getMainClass())) &&
    
    
    ((!minimumLauncherVersionIsSet() && !rhs.minimumLauncherVersionIsSet()) || (minimumLauncherVersionIsSet() && rhs.minimumLauncherVersionIsSet() && getMinimumLauncherVersion() == rhs.getMinimumLauncherVersion())) &&
    
    
    ((!timeIsSet() && !rhs.timeIsSet()) || (timeIsSet() && rhs.timeIsSet() && getTime() == rhs.getTime())) &&
    
    
    ((!releaseTimeIsSet() && !rhs.releaseTimeIsSet()) || (releaseTimeIsSet() && rhs.releaseTimeIsSet() && getReleaseTime() == rhs.getReleaseTime())) &&
    
    
    ((!typeIsSet() && !rhs.typeIsSet()) || (typeIsSet() && rhs.typeIsSet() && getType() == rhs.getType()))
    
    ;
}

bool _v1_packages__packageId___versionId__json_get_200_response::operator!=(const _v1_packages__packageId___versionId__json_get_200_response& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const _v1_packages__packageId___versionId__json_get_200_response& o)
{
    j = nlohmann::json::object();
    if(o.versionIsSet())
        j["version"] = o.m_Version;
    if(o.assetIndexIsSet())
        j["assetIndex"] = o.m_AssetIndex;
    if(o.assetsIsSet())
        j["assets"] = o.m_Assets;
    if(o.complianceLevelIsSet())
        j["complianceLevel"] = o.m_ComplianceLevel;
    if(o.downloadsIsSet())
        j["downloads"] = o.m_Downloads;
    if(o.idIsSet())
        j["id"] = o.m_Id;
    if(o.javaVersionIsSet())
        j["javaVersion"] = o.m_JavaVersion;
    if(o.mainClassIsSet())
        j["mainClass"] = o.m_MainClass;
    if(o.minimumLauncherVersionIsSet())
        j["minimumLauncherVersion"] = o.m_MinimumLauncherVersion;
    if(o.timeIsSet())
        j["time"] = o.m_Time;
    if(o.releaseTimeIsSet())
        j["releaseTime"] = o.m_ReleaseTime;
    if(o.typeIsSet())
        j["type"] = o.m_Type;
    
}

void from_json(const nlohmann::json& j, _v1_packages__packageId___versionId__json_get_200_response& o)
{
    if(j.find("version") != j.end())
    {
        j.at("version").get_to(o.m_Version);
        o.m_VersionIsSet = true;
    } 
    if(j.find("assetIndex") != j.end())
    {
        j.at("assetIndex").get_to(o.m_AssetIndex);
        o.m_AssetIndexIsSet = true;
    } 
    if(j.find("assets") != j.end())
    {
        j.at("assets").get_to(o.m_Assets);
        o.m_AssetsIsSet = true;
    } 
    if(j.find("complianceLevel") != j.end())
    {
        j.at("complianceLevel").get_to(o.m_ComplianceLevel);
        o.m_ComplianceLevelIsSet = true;
    } 
    if(j.find("downloads") != j.end())
    {
        j.at("downloads").get_to(o.m_Downloads);
        o.m_DownloadsIsSet = true;
    } 
    if(j.find("id") != j.end())
    {
        j.at("id").get_to(o.m_Id);
        o.m_IdIsSet = true;
    } 
    if(j.find("javaVersion") != j.end())
    {
        j.at("javaVersion").get_to(o.m_JavaVersion);
        o.m_JavaVersionIsSet = true;
    } 
    if(j.find("mainClass") != j.end())
    {
        j.at("mainClass").get_to(o.m_MainClass);
        o.m_MainClassIsSet = true;
    } 
    if(j.find("minimumLauncherVersion") != j.end())
    {
        j.at("minimumLauncherVersion").get_to(o.m_MinimumLauncherVersion);
        o.m_MinimumLauncherVersionIsSet = true;
    } 
    if(j.find("time") != j.end())
    {
        j.at("time").get_to(o.m_Time);
        o.m_TimeIsSet = true;
    } 
    if(j.find("releaseTime") != j.end())
    {
        j.at("releaseTime").get_to(o.m_ReleaseTime);
        o.m_ReleaseTimeIsSet = true;
    } 
    if(j.find("type") != j.end())
    {
        j.at("type").get_to(o.m_Type);
        o.m_TypeIsSet = true;
    } 
    
}

std::string _v1_packages__packageId___versionId__json_get_200_response::getVersion() const
{
    return m_Version;
}
void _v1_packages__packageId___versionId__json_get_200_response::setVersion(std::string const& value)
{
    m_Version = value;
    m_VersionIsSet = true;
}
bool _v1_packages__packageId___versionId__json_get_200_response::versionIsSet() const
{
    return m_VersionIsSet;
}
void _v1_packages__packageId___versionId__json_get_200_response::unsetVersion()
{
    m_VersionIsSet = false;
}
org::openapitools::server::model::_v1_packages__packageId___versionId__json_get_200_response_assetIndex _v1_packages__packageId___versionId__json_get_200_response::getAssetIndex() const
{
    return m_AssetIndex;
}
void _v1_packages__packageId___versionId__json_get_200_response::setAssetIndex(org::openapitools::server::model::_v1_packages__packageId___versionId__json_get_200_response_assetIndex const& value)
{
    m_AssetIndex = value;
    m_AssetIndexIsSet = true;
}
bool _v1_packages__packageId___versionId__json_get_200_response::assetIndexIsSet() const
{
    return m_AssetIndexIsSet;
}
void _v1_packages__packageId___versionId__json_get_200_response::unsetAssetIndex()
{
    m_AssetIndexIsSet = false;
}
int32_t _v1_packages__packageId___versionId__json_get_200_response::getAssets() const
{
    return m_Assets;
}
void _v1_packages__packageId___versionId__json_get_200_response::setAssets(int32_t const value)
{
    m_Assets = value;
    m_AssetsIsSet = true;
}
bool _v1_packages__packageId___versionId__json_get_200_response::assetsIsSet() const
{
    return m_AssetsIsSet;
}
void _v1_packages__packageId___versionId__json_get_200_response::unsetAssets()
{
    m_AssetsIsSet = false;
}
int32_t _v1_packages__packageId___versionId__json_get_200_response::getComplianceLevel() const
{
    return m_ComplianceLevel;
}
void _v1_packages__packageId___versionId__json_get_200_response::setComplianceLevel(int32_t const value)
{
    m_ComplianceLevel = value;
    m_ComplianceLevelIsSet = true;
}
bool _v1_packages__packageId___versionId__json_get_200_response::complianceLevelIsSet() const
{
    return m_ComplianceLevelIsSet;
}
void _v1_packages__packageId___versionId__json_get_200_response::unsetComplianceLevel()
{
    m_ComplianceLevelIsSet = false;
}
org::openapitools::server::model::_v1_packages__packageId___versionId__json_get_200_response_downloads _v1_packages__packageId___versionId__json_get_200_response::getDownloads() const
{
    return m_Downloads;
}
void _v1_packages__packageId___versionId__json_get_200_response::setDownloads(org::openapitools::server::model::_v1_packages__packageId___versionId__json_get_200_response_downloads const& value)
{
    m_Downloads = value;
    m_DownloadsIsSet = true;
}
bool _v1_packages__packageId___versionId__json_get_200_response::downloadsIsSet() const
{
    return m_DownloadsIsSet;
}
void _v1_packages__packageId___versionId__json_get_200_response::unsetDownloads()
{
    m_DownloadsIsSet = false;
}
std::string _v1_packages__packageId___versionId__json_get_200_response::getId() const
{
    return m_Id;
}
void _v1_packages__packageId___versionId__json_get_200_response::setId(std::string const& value)
{
    m_Id = value;
    m_IdIsSet = true;
}
bool _v1_packages__packageId___versionId__json_get_200_response::idIsSet() const
{
    return m_IdIsSet;
}
void _v1_packages__packageId___versionId__json_get_200_response::unsetId()
{
    m_IdIsSet = false;
}
org::openapitools::server::model::_v1_packages__packageId___versionId__json_get_200_response_javaVersion _v1_packages__packageId___versionId__json_get_200_response::getJavaVersion() const
{
    return m_JavaVersion;
}
void _v1_packages__packageId___versionId__json_get_200_response::setJavaVersion(org::openapitools::server::model::_v1_packages__packageId___versionId__json_get_200_response_javaVersion const& value)
{
    m_JavaVersion = value;
    m_JavaVersionIsSet = true;
}
bool _v1_packages__packageId___versionId__json_get_200_response::javaVersionIsSet() const
{
    return m_JavaVersionIsSet;
}
void _v1_packages__packageId___versionId__json_get_200_response::unsetJavaVersion()
{
    m_JavaVersionIsSet = false;
}
std::string _v1_packages__packageId___versionId__json_get_200_response::getMainClass() const
{
    return m_MainClass;
}
void _v1_packages__packageId___versionId__json_get_200_response::setMainClass(std::string const& value)
{
    m_MainClass = value;
    m_MainClassIsSet = true;
}
bool _v1_packages__packageId___versionId__json_get_200_response::mainClassIsSet() const
{
    return m_MainClassIsSet;
}
void _v1_packages__packageId___versionId__json_get_200_response::unsetMainClass()
{
    m_MainClassIsSet = false;
}
int32_t _v1_packages__packageId___versionId__json_get_200_response::getMinimumLauncherVersion() const
{
    return m_MinimumLauncherVersion;
}
void _v1_packages__packageId___versionId__json_get_200_response::setMinimumLauncherVersion(int32_t const value)
{
    m_MinimumLauncherVersion = value;
    m_MinimumLauncherVersionIsSet = true;
}
bool _v1_packages__packageId___versionId__json_get_200_response::minimumLauncherVersionIsSet() const
{
    return m_MinimumLauncherVersionIsSet;
}
void _v1_packages__packageId___versionId__json_get_200_response::unsetMinimumLauncherVersion()
{
    m_MinimumLauncherVersionIsSet = false;
}
std::string _v1_packages__packageId___versionId__json_get_200_response::getTime() const
{
    return m_Time;
}
void _v1_packages__packageId___versionId__json_get_200_response::setTime(std::string const& value)
{
    m_Time = value;
    m_TimeIsSet = true;
}
bool _v1_packages__packageId___versionId__json_get_200_response::timeIsSet() const
{
    return m_TimeIsSet;
}
void _v1_packages__packageId___versionId__json_get_200_response::unsetTime()
{
    m_TimeIsSet = false;
}
std::string _v1_packages__packageId___versionId__json_get_200_response::getReleaseTime() const
{
    return m_ReleaseTime;
}
void _v1_packages__packageId___versionId__json_get_200_response::setReleaseTime(std::string const& value)
{
    m_ReleaseTime = value;
    m_ReleaseTimeIsSet = true;
}
bool _v1_packages__packageId___versionId__json_get_200_response::releaseTimeIsSet() const
{
    return m_ReleaseTimeIsSet;
}
void _v1_packages__packageId___versionId__json_get_200_response::unsetReleaseTime()
{
    m_ReleaseTimeIsSet = false;
}
std::string _v1_packages__packageId___versionId__json_get_200_response::getType() const
{
    return m_Type;
}
void _v1_packages__packageId___versionId__json_get_200_response::setType(std::string const& value)
{
    m_Type = value;
    m_TypeIsSet = true;
}
bool _v1_packages__packageId___versionId__json_get_200_response::typeIsSet() const
{
    return m_TypeIsSet;
}
void _v1_packages__packageId___versionId__json_get_200_response::unsetType()
{
    m_TypeIsSet = false;
}


} // namespace org::openapitools::server::model

