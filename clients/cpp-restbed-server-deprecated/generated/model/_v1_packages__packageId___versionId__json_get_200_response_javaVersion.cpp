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



#include "_v1_packages__packageId___versionId__json_get_200_response_javaVersion.h"

#include <string>
#include <vector>
#include <sstream>
#include <stdexcept>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>

using boost::property_tree::ptree;
using boost::property_tree::read_json;
using boost::property_tree::write_json;

namespace org {
namespace openapitools {
namespace server {
namespace model {

_v1_packages__packageId___versionId__json_get_200_response_javaVersion::_v1_packages__packageId___versionId__json_get_200_response_javaVersion(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string _v1_packages__packageId___versionId__json_get_200_response_javaVersion::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void _v1_packages__packageId___versionId__json_get_200_response_javaVersion::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree _v1_packages__packageId___versionId__json_get_200_response_javaVersion::toPropertyTree()
{
    return toPropertyTree_internal();
}

void _v1_packages__packageId___versionId__json_get_200_response_javaVersion::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string _v1_packages__packageId___versionId__json_get_200_response_javaVersion::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void _v1_packages__packageId___versionId__json_get_200_response_javaVersion::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree _v1_packages__packageId___versionId__json_get_200_response_javaVersion::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	pt.put("component", m_Component);
	pt.put("majorVersion", m_MajorVersion);
	return pt;
}

void _v1_packages__packageId___versionId__json_get_200_response_javaVersion::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
	m_Component = pt.get("component", "");
	m_MajorVersion = pt.get("majorVersion", 0);
}

std::string _v1_packages__packageId___versionId__json_get_200_response_javaVersion::getComponent() const
{
    return m_Component;
}

void _v1_packages__packageId___versionId__json_get_200_response_javaVersion::setComponent(std::string value)
{
	m_Component = value;
}
int32_t _v1_packages__packageId___versionId__json_get_200_response_javaVersion::getMajorVersion() const
{
    return m_MajorVersion;
}

void _v1_packages__packageId___versionId__json_get_200_response_javaVersion::setMajorVersion(int32_t value)
{
	m_MajorVersion = value;
}

std::vector<_v1_packages__packageId___versionId__json_get_200_response_javaVersion> create_v1_packages__packageId___versionId__json_get_200_response_javaVersionVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<_v1_packages__packageId___versionId__json_get_200_response_javaVersion>();
    for (const auto& child: pt) {
        vec.emplace_back(_v1_packages__packageId___versionId__json_get_200_response_javaVersion(child.second));
    }

    return vec;
}

}
}
}
}

