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

/*
 * VersionPackageInfo_javaVersion.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_VersionPackageInfo_javaVersion_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_VersionPackageInfo_javaVersion_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {



class  VersionPackageInfo_javaVersion
    : public ModelBase
{
public:
    VersionPackageInfo_javaVersion();
    virtual ~VersionPackageInfo_javaVersion();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;


    /////////////////////////////////////////////
    /// VersionPackageInfo_javaVersion members


    utility::string_t getComponent() const;
    bool componentIsSet() const;
    void unsetComponent();
    void setComponent(const utility::string_t& value);

    int32_t getMajorVersion() const;
    bool majorVersionIsSet() const;
    void unsetMajorVersion();
    void setMajorVersion(int32_t value);


protected:
    utility::string_t m_Component;
    bool m_ComponentIsSet;

    int32_t m_MajorVersion;
    bool m_MajorVersionIsSet;

};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_VersionPackageInfo_javaVersion_H_ */
