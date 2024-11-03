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
 * OAIVersionPackageInfo_javaVersion.h
 *
 * 
 */

#ifndef OAIVersionPackageInfo_javaVersion_H
#define OAIVersionPackageInfo_javaVersion_H

#include <QJsonObject>

#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIVersionPackageInfo_javaVersion : public OAIObject {
public:
    OAIVersionPackageInfo_javaVersion();
    OAIVersionPackageInfo_javaVersion(QString json);
    ~OAIVersionPackageInfo_javaVersion() override;

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

    QString component;
    bool m_component_isSet;
    bool m_component_isValid;

    qint32 major_version;
    bool m_major_version_isSet;
    bool m_major_version_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIVersionPackageInfo_javaVersion)

#endif // OAIVersionPackageInfo_javaVersion_H
