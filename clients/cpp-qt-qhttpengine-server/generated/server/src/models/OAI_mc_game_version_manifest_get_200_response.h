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
 * OAI_mc_game_version_manifest_get_200_response.h
 *
 * 
 */

#ifndef OAI_mc_game_version_manifest_get_200_response_H
#define OAI_mc_game_version_manifest_get_200_response_H

#include <QJsonObject>

#include "OAI_mc_game_version_manifest_get_200_response_latest.h"
#include "OAI_mc_game_version_manifest_get_200_response_versions_inner.h"
#include <QList>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAI_mc_game_version_manifest_get_200_response : public OAIObject {
public:
    OAI_mc_game_version_manifest_get_200_response();
    OAI_mc_game_version_manifest_get_200_response(QString json);
    ~OAI_mc_game_version_manifest_get_200_response() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAI_mc_game_version_manifest_get_200_response_latest getLatest() const;
    void setLatest(const OAI_mc_game_version_manifest_get_200_response_latest &latest);
    bool is_latest_Set() const;
    bool is_latest_Valid() const;

    QList<OAI_mc_game_version_manifest_get_200_response_versions_inner> getVersions() const;
    void setVersions(const QList<OAI_mc_game_version_manifest_get_200_response_versions_inner> &versions);
    bool is_versions_Set() const;
    bool is_versions_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    OAI_mc_game_version_manifest_get_200_response_latest latest;
    bool m_latest_isSet;
    bool m_latest_isValid;

    QList<OAI_mc_game_version_manifest_get_200_response_versions_inner> versions;
    bool m_versions_isSet;
    bool m_versions_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAI_mc_game_version_manifest_get_200_response)

#endif // OAI_mc_game_version_manifest_get_200_response_H
