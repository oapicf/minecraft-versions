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



#include "Version.h"

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

Version::Version(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string Version::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void Version::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree Version::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("id", m_Id);
	pt.put("type", m_Type);
	pt.put("url", m_Url);
	pt.put("time", m_Time);
	pt.put("releaseTime", m_ReleaseTime);
	return pt;
}

void Version::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Id = pt.get("id", "");
	m_Type = pt.get("type", "");
	m_Url = pt.get("url", "");
	m_Time = pt.get("time", "");
	m_ReleaseTime = pt.get("releaseTime", "");
}

std::string Version::getId() const
{
    return m_Id;
}

void Version::setId(std::string value)
{
    m_Id = value;
}


std::string Version::getType() const
{
    return m_Type;
}

void Version::setType(std::string value)
{
    m_Type = value;
}


std::string Version::getUrl() const
{
    return m_Url;
}

void Version::setUrl(std::string value)
{
    m_Url = value;
}


std::string Version::getTime() const
{
    return m_Time;
}

void Version::setTime(std::string value)
{
    m_Time = value;
}


std::string Version::getReleaseTime() const
{
    return m_ReleaseTime;
}

void Version::setReleaseTime(std::string value)
{
    m_ReleaseTime = value;
}



std::vector<Version> createVersionVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<Version>();
    for (const auto& child: pt) {
        vec.emplace_back(Version(child.second));
    }

    return vec;
}

}
}
}
}

