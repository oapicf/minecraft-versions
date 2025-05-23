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



#include "VersionPackageInfo.h"

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

VersionPackageInfo::VersionPackageInfo(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string VersionPackageInfo::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void VersionPackageInfo::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree VersionPackageInfo::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("version", m_Version);
	pt.add_child("assetIndex", m_AssetIndex.toPropertyTree());
	pt.put("assets", m_Assets);
	pt.put("complianceLevel", m_ComplianceLevel);
	pt.add_child("downloads", m_Downloads.toPropertyTree());
	pt.put("id", m_Id);
	pt.add_child("javaVersion", m_JavaVersion.toPropertyTree());
	pt.put("mainClass", m_MainClass);
	pt.put("minimumLauncherVersion", m_MinimumLauncherVersion);
	pt.put("time", m_Time);
	pt.put("releaseTime", m_ReleaseTime);
	pt.put("type", m_Type);
	return pt;
}

void VersionPackageInfo::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Version = pt.get("version", "");
	if (pt.get_child_optional("assetIndex")) {
        m_AssetIndex = fromPt<VersionPackageInfo_assetIndex>(pt.get_child("assetIndex"));
	}
	m_Assets = pt.get("assets", "");
	m_ComplianceLevel = pt.get("complianceLevel", 0);
	if (pt.get_child_optional("downloads")) {
        m_Downloads = fromPt<VersionPackageInfo_downloads>(pt.get_child("downloads"));
	}
	m_Id = pt.get("id", "");
	if (pt.get_child_optional("javaVersion")) {
        m_JavaVersion = fromPt<VersionPackageInfo_javaVersion>(pt.get_child("javaVersion"));
	}
	m_MainClass = pt.get("mainClass", "");
	m_MinimumLauncherVersion = pt.get("minimumLauncherVersion", 0);
	m_Time = pt.get("time", "");
	m_ReleaseTime = pt.get("releaseTime", "");
	m_Type = pt.get("type", "");
}

std::string VersionPackageInfo::getVersion() const
{
    return m_Version;
}

void VersionPackageInfo::setVersion(std::string value)
{
    m_Version = value;
}


VersionPackageInfo_assetIndex VersionPackageInfo::getAssetIndex() const
{
    return m_AssetIndex;
}

void VersionPackageInfo::setAssetIndex(VersionPackageInfo_assetIndex value)
{
    m_AssetIndex = value;
}


std::string VersionPackageInfo::getAssets() const
{
    return m_Assets;
}

void VersionPackageInfo::setAssets(std::string value)
{
    m_Assets = value;
}


int32_t VersionPackageInfo::getComplianceLevel() const
{
    return m_ComplianceLevel;
}

void VersionPackageInfo::setComplianceLevel(int32_t value)
{
    m_ComplianceLevel = value;
}


VersionPackageInfo_downloads VersionPackageInfo::getDownloads() const
{
    return m_Downloads;
}

void VersionPackageInfo::setDownloads(VersionPackageInfo_downloads value)
{
    m_Downloads = value;
}


std::string VersionPackageInfo::getId() const
{
    return m_Id;
}

void VersionPackageInfo::setId(std::string value)
{
    m_Id = value;
}


VersionPackageInfo_javaVersion VersionPackageInfo::getJavaVersion() const
{
    return m_JavaVersion;
}

void VersionPackageInfo::setJavaVersion(VersionPackageInfo_javaVersion value)
{
    m_JavaVersion = value;
}


std::string VersionPackageInfo::getMainClass() const
{
    return m_MainClass;
}

void VersionPackageInfo::setMainClass(std::string value)
{
    m_MainClass = value;
}


int32_t VersionPackageInfo::getMinimumLauncherVersion() const
{
    return m_MinimumLauncherVersion;
}

void VersionPackageInfo::setMinimumLauncherVersion(int32_t value)
{
    m_MinimumLauncherVersion = value;
}


std::string VersionPackageInfo::getTime() const
{
    return m_Time;
}

void VersionPackageInfo::setTime(std::string value)
{
    m_Time = value;
}


std::string VersionPackageInfo::getReleaseTime() const
{
    return m_ReleaseTime;
}

void VersionPackageInfo::setReleaseTime(std::string value)
{
    m_ReleaseTime = value;
}


std::string VersionPackageInfo::getType() const
{
    return m_Type;
}

void VersionPackageInfo::setType(std::string value)
{
    m_Type = value;
}



std::vector<VersionPackageInfo> createVersionPackageInfoVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<VersionPackageInfo>();
    for (const auto& child: pt) {
        vec.emplace_back(VersionPackageInfo(child.second));
    }

    return vec;
}

}
}
}
}

