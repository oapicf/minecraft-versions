/**
 * 
 * SDK for Minecraft versions info
 *
 * The version of the OpenAPI document: 1.1.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * OAIVersionPackageInfo_assetIndex.h
 *
 * 
 */

#ifndef OAIVersionPackageInfo_assetIndex_H
#define OAIVersionPackageInfo_assetIndex_H

#include <QJsonObject>

#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIVersionPackageInfo_assetIndex : public OAIObject {
public:
    OAIVersionPackageInfo_assetIndex();
    OAIVersionPackageInfo_assetIndex(QString json);
    ~OAIVersionPackageInfo_assetIndex() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getId() const;
    void setId(const QString &id);
    bool is_id_Set() const;
    bool is_id_Valid() const;

    QString getSha1() const;
    void setSha1(const QString &sha1);
    bool is_sha1_Set() const;
    bool is_sha1_Valid() const;

    qint32 getSize() const;
    void setSize(const qint32 &size);
    bool is_size_Set() const;
    bool is_size_Valid() const;

    qint32 getTotalSize() const;
    void setTotalSize(const qint32 &total_size);
    bool is_total_size_Set() const;
    bool is_total_size_Valid() const;

    QString getUrl() const;
    void setUrl(const QString &url);
    bool is_url_Set() const;
    bool is_url_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString id;
    bool m_id_isSet;
    bool m_id_isValid;

    QString sha1;
    bool m_sha1_isSet;
    bool m_sha1_isValid;

    qint32 size;
    bool m_size_isSet;
    bool m_size_isValid;

    qint32 total_size;
    bool m_total_size_isSet;
    bool m_total_size_isValid;

    QString url;
    bool m_url_isSet;
    bool m_url_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIVersionPackageInfo_assetIndex)

#endif // OAIVersionPackageInfo_assetIndex_H
