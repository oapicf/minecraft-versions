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


#include "_v1_packages__packageId___versionId__json_get_200_response_downloads.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

_v1_packages__packageId___versionId__json_get_200_response_downloads::_v1_packages__packageId___versionId__json_get_200_response_downloads()
{
    m_ClientIsSet = false;
    m_Client_mappingsIsSet = false;
    m_ServerIsSet = false;
    m_Server_mappingsIsSet = false;
    
}

void _v1_packages__packageId___versionId__json_get_200_response_downloads::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool _v1_packages__packageId___versionId__json_get_200_response_downloads::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool _v1_packages__packageId___versionId__json_get_200_response_downloads::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "_v1_packages__packageId___versionId__json_get_200_response_downloads" : pathPrefix;

                    
    return success;
}

bool _v1_packages__packageId___versionId__json_get_200_response_downloads::operator==(const _v1_packages__packageId___versionId__json_get_200_response_downloads& rhs) const
{
    return
    
    
    
    ((!clientIsSet() && !rhs.clientIsSet()) || (clientIsSet() && rhs.clientIsSet() && getClient() == rhs.getClient())) &&
    
    
    ((!clientMappingsIsSet() && !rhs.clientMappingsIsSet()) || (clientMappingsIsSet() && rhs.clientMappingsIsSet() && getClientMappings() == rhs.getClientMappings())) &&
    
    
    ((!serverIsSet() && !rhs.serverIsSet()) || (serverIsSet() && rhs.serverIsSet() && getServer() == rhs.getServer())) &&
    
    
    ((!serverMappingsIsSet() && !rhs.serverMappingsIsSet()) || (serverMappingsIsSet() && rhs.serverMappingsIsSet() && getServerMappings() == rhs.getServerMappings()))
    
    ;
}

bool _v1_packages__packageId___versionId__json_get_200_response_downloads::operator!=(const _v1_packages__packageId___versionId__json_get_200_response_downloads& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const _v1_packages__packageId___versionId__json_get_200_response_downloads& o)
{
    j = nlohmann::json::object();
    if(o.clientIsSet())
        j["client"] = o.m_Client;
    if(o.clientMappingsIsSet())
        j["client_mappings"] = o.m_Client_mappings;
    if(o.serverIsSet())
        j["server"] = o.m_Server;
    if(o.serverMappingsIsSet())
        j["server_mappings"] = o.m_Server_mappings;
    
}

void from_json(const nlohmann::json& j, _v1_packages__packageId___versionId__json_get_200_response_downloads& o)
{
    if(j.find("client") != j.end())
    {
        j.at("client").get_to(o.m_Client);
        o.m_ClientIsSet = true;
    } 
    if(j.find("client_mappings") != j.end())
    {
        j.at("client_mappings").get_to(o.m_Client_mappings);
        o.m_Client_mappingsIsSet = true;
    } 
    if(j.find("server") != j.end())
    {
        j.at("server").get_to(o.m_Server);
        o.m_ServerIsSet = true;
    } 
    if(j.find("server_mappings") != j.end())
    {
        j.at("server_mappings").get_to(o.m_Server_mappings);
        o.m_Server_mappingsIsSet = true;
    } 
    
}

org::openapitools::server::model::_v1_packages__packageId___versionId__json_get_200_response_downloads_client _v1_packages__packageId___versionId__json_get_200_response_downloads::getClient() const
{
    return m_Client;
}
void _v1_packages__packageId___versionId__json_get_200_response_downloads::setClient(org::openapitools::server::model::_v1_packages__packageId___versionId__json_get_200_response_downloads_client const& value)
{
    m_Client = value;
    m_ClientIsSet = true;
}
bool _v1_packages__packageId___versionId__json_get_200_response_downloads::clientIsSet() const
{
    return m_ClientIsSet;
}
void _v1_packages__packageId___versionId__json_get_200_response_downloads::unsetClient()
{
    m_ClientIsSet = false;
}
org::openapitools::server::model::_v1_packages__packageId___versionId__json_get_200_response_downloads_client _v1_packages__packageId___versionId__json_get_200_response_downloads::getClientMappings() const
{
    return m_Client_mappings;
}
void _v1_packages__packageId___versionId__json_get_200_response_downloads::setClientMappings(org::openapitools::server::model::_v1_packages__packageId___versionId__json_get_200_response_downloads_client const& value)
{
    m_Client_mappings = value;
    m_Client_mappingsIsSet = true;
}
bool _v1_packages__packageId___versionId__json_get_200_response_downloads::clientMappingsIsSet() const
{
    return m_Client_mappingsIsSet;
}
void _v1_packages__packageId___versionId__json_get_200_response_downloads::unsetClient_mappings()
{
    m_Client_mappingsIsSet = false;
}
org::openapitools::server::model::_v1_packages__packageId___versionId__json_get_200_response_downloads_client _v1_packages__packageId___versionId__json_get_200_response_downloads::getServer() const
{
    return m_Server;
}
void _v1_packages__packageId___versionId__json_get_200_response_downloads::setServer(org::openapitools::server::model::_v1_packages__packageId___versionId__json_get_200_response_downloads_client const& value)
{
    m_Server = value;
    m_ServerIsSet = true;
}
bool _v1_packages__packageId___versionId__json_get_200_response_downloads::serverIsSet() const
{
    return m_ServerIsSet;
}
void _v1_packages__packageId___versionId__json_get_200_response_downloads::unsetServer()
{
    m_ServerIsSet = false;
}
org::openapitools::server::model::_v1_packages__packageId___versionId__json_get_200_response_downloads_client _v1_packages__packageId___versionId__json_get_200_response_downloads::getServerMappings() const
{
    return m_Server_mappings;
}
void _v1_packages__packageId___versionId__json_get_200_response_downloads::setServerMappings(org::openapitools::server::model::_v1_packages__packageId___versionId__json_get_200_response_downloads_client const& value)
{
    m_Server_mappings = value;
    m_Server_mappingsIsSet = true;
}
bool _v1_packages__packageId___versionId__json_get_200_response_downloads::serverMappingsIsSet() const
{
    return m_Server_mappingsIsSet;
}
void _v1_packages__packageId___versionId__json_get_200_response_downloads::unsetServer_mappings()
{
    m_Server_mappingsIsSet = false;
}


} // namespace org::openapitools::server::model

