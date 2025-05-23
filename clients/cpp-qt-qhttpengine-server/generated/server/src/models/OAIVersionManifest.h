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
 * OAIVersionManifest.h
 *
 * 
 */

#ifndef OAIVersionManifest_H
#define OAIVersionManifest_H

#include <QJsonObject>

#include "OAIVersion.h"
#include "OAIVersionManifest_latest.h"
#include <QList>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIVersionManifest : public OAIObject {
public:
    OAIVersionManifest();
    OAIVersionManifest(QString json);
    ~OAIVersionManifest() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIVersionManifest_latest getLatest() const;
    void setLatest(const OAIVersionManifest_latest &latest);
    bool is_latest_Set() const;
    bool is_latest_Valid() const;

    QList<OAIVersion> getVersions() const;
    void setVersions(const QList<OAIVersion> &versions);
    bool is_versions_Set() const;
    bool is_versions_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    OAIVersionManifest_latest latest;
    bool m_latest_isSet;
    bool m_latest_isValid;

    QList<OAIVersion> versions;
    bool m_versions_isSet;
    bool m_versions_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIVersionManifest)

#endif // OAIVersionManifest_H
