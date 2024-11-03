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
 * OAIVersionManifest_latest.h
 *
 * 
 */

#ifndef OAIVersionManifest_latest_H
#define OAIVersionManifest_latest_H

#include <QJsonObject>

#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIVersionManifest_latest : public OAIObject {
public:
    OAIVersionManifest_latest();
    OAIVersionManifest_latest(QString json);
    ~OAIVersionManifest_latest() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getRelease() const;
    void setRelease(const QString &release);
    bool is_release_Set() const;
    bool is_release_Valid() const;

    QString getSnapshot() const;
    void setSnapshot(const QString &snapshot);
    bool is_snapshot_Set() const;
    bool is_snapshot_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString m_release;
    bool m_release_isSet;
    bool m_release_isValid;

    QString m_snapshot;
    bool m_snapshot_isSet;
    bool m_snapshot_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIVersionManifest_latest)

#endif // OAIVersionManifest_latest_H
