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



#include "_v1_packages__packageId___versionId__json_get_200_response_assetIndex.h"

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

_v1_packages__packageId___versionId__json_get_200_response_assetIndex::_v1_packages__packageId___versionId__json_get_200_response_assetIndex(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string _v1_packages__packageId___versionId__json_get_200_response_assetIndex::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void _v1_packages__packageId___versionId__json_get_200_response_assetIndex::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree _v1_packages__packageId___versionId__json_get_200_response_assetIndex::toPropertyTree()
{
    return toPropertyTree_internal();
}

void _v1_packages__packageId___versionId__json_get_200_response_assetIndex::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string _v1_packages__packageId___versionId__json_get_200_response_assetIndex::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void _v1_packages__packageId___versionId__json_get_200_response_assetIndex::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree _v1_packages__packageId___versionId__json_get_200_response_assetIndex::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	pt.put("id", m_Id);
	pt.put("sha1", m_Sha1);
	pt.put("size", m_Size);
	pt.put("totalSize", m_TotalSize);
	pt.put("url", m_Url);
	return pt;
}

void _v1_packages__packageId___versionId__json_get_200_response_assetIndex::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
	m_Id = pt.get("id", "");
	m_Sha1 = pt.get("sha1", "");
	m_Size = pt.get("size", 0);
	m_TotalSize = pt.get("totalSize", 0);
	m_Url = pt.get("url", "");
}

std::string _v1_packages__packageId___versionId__json_get_200_response_assetIndex::getId() const
{
    return m_Id;
}

void _v1_packages__packageId___versionId__json_get_200_response_assetIndex::setId(std::string value)
{
	m_Id = value;
}
std::string _v1_packages__packageId___versionId__json_get_200_response_assetIndex::getSha1() const
{
    return m_Sha1;
}

void _v1_packages__packageId___versionId__json_get_200_response_assetIndex::setSha1(std::string value)
{
	m_Sha1 = value;
}
int32_t _v1_packages__packageId___versionId__json_get_200_response_assetIndex::getSize() const
{
    return m_Size;
}

void _v1_packages__packageId___versionId__json_get_200_response_assetIndex::setSize(int32_t value)
{
	m_Size = value;
}
int32_t _v1_packages__packageId___versionId__json_get_200_response_assetIndex::getTotalSize() const
{
    return m_TotalSize;
}

void _v1_packages__packageId___versionId__json_get_200_response_assetIndex::setTotalSize(int32_t value)
{
	m_TotalSize = value;
}
std::string _v1_packages__packageId___versionId__json_get_200_response_assetIndex::getUrl() const
{
    return m_Url;
}

void _v1_packages__packageId___versionId__json_get_200_response_assetIndex::setUrl(std::string value)
{
	m_Url = value;
}

std::vector<_v1_packages__packageId___versionId__json_get_200_response_assetIndex> create_v1_packages__packageId___versionId__json_get_200_response_assetIndexVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<_v1_packages__packageId___versionId__json_get_200_response_assetIndex>();
    for (const auto& child: pt) {
        vec.emplace_back(_v1_packages__packageId___versionId__json_get_200_response_assetIndex(child.second));
    }

    return vec;
}

}
}
}
}
