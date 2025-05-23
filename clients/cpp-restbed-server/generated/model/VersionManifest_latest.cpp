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



#include "VersionManifest_latest.h"

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

VersionManifest_latest::VersionManifest_latest(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string VersionManifest_latest::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void VersionManifest_latest::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree VersionManifest_latest::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("release", m_Release);
	pt.put("snapshot", m_Snapshot);
	return pt;
}

void VersionManifest_latest::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Release = pt.get("release", "");
	m_Snapshot = pt.get("snapshot", "");
}

std::string VersionManifest_latest::getRelease() const
{
    return m_Release;
}

void VersionManifest_latest::setRelease(std::string value)
{
    m_Release = value;
}


std::string VersionManifest_latest::getSnapshot() const
{
    return m_Snapshot;
}

void VersionManifest_latest::setSnapshot(std::string value)
{
    m_Snapshot = value;
}



std::vector<VersionManifest_latest> createVersionManifest_latestVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<VersionManifest_latest>();
    for (const auto& child: pt) {
        vec.emplace_back(VersionManifest_latest(child.second));
    }

    return vec;
}

}
}
}
}

