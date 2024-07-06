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


#include "_mc_game_version_manifest_get_200_response.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

_mc_game_version_manifest_get_200_response::_mc_game_version_manifest_get_200_response()
{
    m_LatestIsSet = false;
    m_VersionsIsSet = false;
    
}

void _mc_game_version_manifest_get_200_response::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool _mc_game_version_manifest_get_200_response::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool _mc_game_version_manifest_get_200_response::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "_mc_game_version_manifest_get_200_response" : pathPrefix;

             
    if (versionsIsSet())
    {
        const std::vector<org::openapitools::server::model::_mc_game_version_manifest_get_200_response_versions_inner>& value = m_Versions;
        const std::string currentValuePath = _pathPrefix + ".versions";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::_mc_game_version_manifest_get_200_response_versions_inner& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath + ".versions") && success;
 
                i++;
            }
        }

    }
    
    return success;
}

bool _mc_game_version_manifest_get_200_response::operator==(const _mc_game_version_manifest_get_200_response& rhs) const
{
    return
    
    
    
    ((!latestIsSet() && !rhs.latestIsSet()) || (latestIsSet() && rhs.latestIsSet() && getLatest() == rhs.getLatest())) &&
    
    
    ((!versionsIsSet() && !rhs.versionsIsSet()) || (versionsIsSet() && rhs.versionsIsSet() && getVersions() == rhs.getVersions()))
    
    ;
}

bool _mc_game_version_manifest_get_200_response::operator!=(const _mc_game_version_manifest_get_200_response& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const _mc_game_version_manifest_get_200_response& o)
{
    j = nlohmann::json::object();
    if(o.latestIsSet())
        j["latest"] = o.m_Latest;
    if(o.versionsIsSet() || !o.m_Versions.empty())
        j["versions"] = o.m_Versions;
    
}

void from_json(const nlohmann::json& j, _mc_game_version_manifest_get_200_response& o)
{
    if(j.find("latest") != j.end())
    {
        j.at("latest").get_to(o.m_Latest);
        o.m_LatestIsSet = true;
    } 
    if(j.find("versions") != j.end())
    {
        j.at("versions").get_to(o.m_Versions);
        o.m_VersionsIsSet = true;
    } 
    
}

org::openapitools::server::model::_mc_game_version_manifest_get_200_response_latest _mc_game_version_manifest_get_200_response::getLatest() const
{
    return m_Latest;
}
void _mc_game_version_manifest_get_200_response::setLatest(org::openapitools::server::model::_mc_game_version_manifest_get_200_response_latest const& value)
{
    m_Latest = value;
    m_LatestIsSet = true;
}
bool _mc_game_version_manifest_get_200_response::latestIsSet() const
{
    return m_LatestIsSet;
}
void _mc_game_version_manifest_get_200_response::unsetLatest()
{
    m_LatestIsSet = false;
}
std::vector<org::openapitools::server::model::_mc_game_version_manifest_get_200_response_versions_inner> _mc_game_version_manifest_get_200_response::getVersions() const
{
    return m_Versions;
}
void _mc_game_version_manifest_get_200_response::setVersions(std::vector<org::openapitools::server::model::_mc_game_version_manifest_get_200_response_versions_inner> const& value)
{
    m_Versions = value;
    m_VersionsIsSet = true;
}
bool _mc_game_version_manifest_get_200_response::versionsIsSet() const
{
    return m_VersionsIsSet;
}
void _mc_game_version_manifest_get_200_response::unsetVersions()
{
    m_VersionsIsSet = false;
}


} // namespace org::openapitools::server::model

