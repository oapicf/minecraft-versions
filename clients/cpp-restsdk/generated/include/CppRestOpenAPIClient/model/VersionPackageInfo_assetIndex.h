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
 * VersionPackageInfo_assetIndex.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_VersionPackageInfo_assetIndex_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_VersionPackageInfo_assetIndex_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {



class  VersionPackageInfo_assetIndex
    : public ModelBase
{
public:
    VersionPackageInfo_assetIndex();
    virtual ~VersionPackageInfo_assetIndex();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;


    /////////////////////////////////////////////
    /// VersionPackageInfo_assetIndex members


    utility::string_t getId() const;
    bool idIsSet() const;
    void unsetId();
    void setId(const utility::string_t& value);

    utility::string_t getSha1() const;
    bool sha1IsSet() const;
    void unsetSha1();
    void setSha1(const utility::string_t& value);

    int32_t getSize() const;
    bool sizeIsSet() const;
    void unsetSize();
    void setSize(int32_t value);

    int32_t getTotalSize() const;
    bool totalSizeIsSet() const;
    void unsetTotalSize();
    void setTotalSize(int32_t value);

    utility::string_t getUrl() const;
    bool urlIsSet() const;
    void unsetUrl();
    void setUrl(const utility::string_t& value);


protected:
    utility::string_t m_Id;
    bool m_IdIsSet;

    utility::string_t m_Sha1;
    bool m_Sha1IsSet;

    int32_t m_Size;
    bool m_SizeIsSet;

    int32_t m_TotalSize;
    bool m_TotalSizeIsSet;

    utility::string_t m_Url;
    bool m_UrlIsSet;

};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_VersionPackageInfo_assetIndex_H_ */
