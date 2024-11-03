/**
 * 
 * SDK for Minecraft versions info
 *
 * The version of the OpenAPI document: 0.12.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * OAIVersion.h
 *
 * 
 */

#ifndef OAIVersion_H
#define OAIVersion_H

#include <QJsonObject>

#include <QDateTime>
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIVersion : public OAIObject {
public:
    OAIVersion();
    OAIVersion(QString json);
    ~OAIVersion() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getId() const;
    void setId(const QString &id);
    bool is_id_Set() const;
    bool is_id_Valid() const;

    QString getType() const;
    void setType(const QString &type);
    bool is_type_Set() const;
    bool is_type_Valid() const;

    QString getUrl() const;
    void setUrl(const QString &url);
    bool is_url_Set() const;
    bool is_url_Valid() const;

    QDateTime getTime() const;
    void setTime(const QDateTime &time);
    bool is_time_Set() const;
    bool is_time_Valid() const;

    QDateTime getReleaseTime() const;
    void setReleaseTime(const QDateTime &release_time);
    bool is_release_time_Set() const;
    bool is_release_time_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString id;
    bool m_id_isSet;
    bool m_id_isValid;

    QString type;
    bool m_type_isSet;
    bool m_type_isValid;

    QString url;
    bool m_url_isSet;
    bool m_url_isValid;

    QDateTime time;
    bool m_time_isSet;
    bool m_time_isValid;

    QDateTime release_time;
    bool m_release_time_isSet;
    bool m_release_time_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIVersion)

#endif // OAIVersion_H
