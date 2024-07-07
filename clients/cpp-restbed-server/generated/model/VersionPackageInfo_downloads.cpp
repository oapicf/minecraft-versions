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



#include "VersionPackageInfo_downloads.h"

#include <string>
#include <vector>
#include <map>
#include <sstream>
#include <stdexcept>
#include <regex>
#include <boost/lexical_cast.hpp>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>
#include "helpers.h"

using boost::property_tree::ptree;
using boost::property_tree::read_json;
using boost::property_tree::write_json;

namespace org {
namespace openapitools {
namespace server {
namespace model {

VersionPackageInfo_downloads::VersionPackageInfo_downloads(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string VersionPackageInfo_downloads::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void VersionPackageInfo_downloads::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree VersionPackageInfo_downloads::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.add_child("client", m_Client.toPropertyTree());
	pt.add_child("client_mappings", m_Client_mappings.toPropertyTree());
	pt.add_child("server", m_Server.toPropertyTree());
	pt.add_child("server_mappings", m_Server_mappings.toPropertyTree());
	return pt;
}

void VersionPackageInfo_downloads::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	if (pt.get_child_optional("client")) {
        m_Client = fromPt<Download>(pt.get_child("client"));
	}
	if (pt.get_child_optional("client_mappings")) {
        m_Client_mappings = fromPt<Download>(pt.get_child("client_mappings"));
	}
	if (pt.get_child_optional("server")) {
        m_Server = fromPt<Download>(pt.get_child("server"));
	}
	if (pt.get_child_optional("server_mappings")) {
        m_Server_mappings = fromPt<Download>(pt.get_child("server_mappings"));
	}
}

Download VersionPackageInfo_downloads::getClient() const
{
    return m_Client;
}

void VersionPackageInfo_downloads::setClient(Download value)
{
    m_Client = value;
}


Download VersionPackageInfo_downloads::getClientMappings() const
{
    return m_Client_mappings;
}

void VersionPackageInfo_downloads::setClientMappings(Download value)
{
    m_Client_mappings = value;
}


Download VersionPackageInfo_downloads::getServer() const
{
    return m_Server;
}

void VersionPackageInfo_downloads::setServer(Download value)
{
    m_Server = value;
}


Download VersionPackageInfo_downloads::getServerMappings() const
{
    return m_Server_mappings;
}

void VersionPackageInfo_downloads::setServerMappings(Download value)
{
    m_Server_mappings = value;
}



std::vector<VersionPackageInfo_downloads> createVersionPackageInfo_downloadsVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<VersionPackageInfo_downloads>();
    for (const auto& child: pt) {
        vec.emplace_back(VersionPackageInfo_downloads(child.second));
    }

    return vec;
}

}
}
}
}
