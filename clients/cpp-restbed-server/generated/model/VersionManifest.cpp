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



#include "VersionManifest.h"

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

VersionManifest::VersionManifest(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string VersionManifest::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void VersionManifest::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree VersionManifest::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.add_child("latest", m_Latest.toPropertyTree());
	// generate tree for Versions
    tmp_node.clear();
	if (!m_Versions.empty()) {
        tmp_node = toPt(m_Versions);
		pt.add_child("versions", tmp_node);
		tmp_node.clear();
	}
	return pt;
}

void VersionManifest::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	if (pt.get_child_optional("latest")) {
        m_Latest = fromPt<VersionManifest_latest>(pt.get_child("latest"));
	}
	// push all items of Versions into member
	if (pt.get_child_optional("versions")) {
        m_Versions = fromPt<std::vector<Version>>(pt.get_child("versions"));
	}
}

VersionManifest_latest VersionManifest::getLatest() const
{
    return m_Latest;
}

void VersionManifest::setLatest(VersionManifest_latest value)
{
    m_Latest = value;
}


std::vector<Version> VersionManifest::getVersions() const
{
    return m_Versions;
}

void VersionManifest::setVersions(std::vector<Version> value)
{
    m_Versions = value;
}



std::vector<VersionManifest> createVersionManifestVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<VersionManifest>();
    for (const auto& child: pt) {
        vec.emplace_back(VersionManifest(child.second));
    }

    return vec;
}

}
}
}
}

