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

/*
 * Version.h
 *
 * 
 */

#ifndef Version_H_
#define Version_H_



#include <string>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  Version 
{
public:
    Version() = default;
    explicit Version(boost::property_tree::ptree const& pt);
    virtual ~Version() = default;

    Version(const Version& other) = default; // copy constructor
    Version(Version&& other) noexcept = default; // move constructor

    Version& operator=(const Version& other) = default; // copy assignment
    Version& operator=(Version&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// Version members

    /// <summary>
    /// 
    /// </summary>
    std::string getId() const;
    void setId(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getType() const;
    void setType(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getUrl() const;
    void setUrl(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getTime() const;
    void setTime(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getReleaseTime() const;
    void setReleaseTime(std::string value);

protected:
    std::string m_Id = "";
    std::string m_Type = "";
    std::string m_Url = "";
    std::string m_Time = "";
    std::string m_ReleaseTime = "";
};

std::vector<Version> createVersionVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<Version>(const Version& val) {
    return val.toPropertyTree();
}

template<>
inline Version fromPt<Version>(const boost::property_tree::ptree& pt) {
    Version ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* Version_H_ */
