/**
 * 
 * SDK for Minecraft versions info
 *
 * The version of the OpenAPI document: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * OAI_v1_packages__packageId___versionId__json_get_200_response_javaVersion.h
 *
 * 
 */

#ifndef OAI_v1_packages__packageId___versionId__json_get_200_response_javaVersion_H
#define OAI_v1_packages__packageId___versionId__json_get_200_response_javaVersion_H

#include <QJsonObject>

#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAI_v1_packages__packageId___versionId__json_get_200_response_javaVersion : public OAIObject {
public:
    OAI_v1_packages__packageId___versionId__json_get_200_response_javaVersion();
    OAI_v1_packages__packageId___versionId__json_get_200_response_javaVersion(QString json);
    ~OAI_v1_packages__packageId___versionId__json_get_200_response_javaVersion() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getComponent() const;
    void setComponent(const QString &component);
    bool is_component_Set() const;
    bool is_component_Valid() const;

    qint32 getMajorVersion() const;
    void setMajorVersion(const qint32 &major_version);
    bool is_major_version_Set() const;
    bool is_major_version_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString m_component;
    bool m_component_isSet;
    bool m_component_isValid;

    qint32 m_major_version;
    bool m_major_version_isSet;
    bool m_major_version_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAI_v1_packages__packageId___versionId__json_get_200_response_javaVersion)

#endif // OAI_v1_packages__packageId___versionId__json_get_200_response_javaVersion_H
