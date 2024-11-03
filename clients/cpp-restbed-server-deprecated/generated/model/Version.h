/**
 * 
 * SDK for Minecraft versions info
 *
 * The version of the OpenAPI document: 0.12.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.9.0.
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

    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
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
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string toJsonString_internal(bool prettyJson = false);
    virtual void fromJsonString_internal(std::string const& jsonString);
    virtual boost::property_tree::ptree toPropertyTree_internal();
    virtual void fromPropertyTree_internal(boost::property_tree::ptree const& pt);


protected:
    std::string m_Id = "";
    std::string m_Type = "";
    std::string m_Url = "";
    std::string m_Time = "";
    std::string m_ReleaseTime = "";
};

std::vector<Version> createVersionVectorFromJsonString(const std::string& json);

}
}
}
}

#endif /* Version_H_ */
