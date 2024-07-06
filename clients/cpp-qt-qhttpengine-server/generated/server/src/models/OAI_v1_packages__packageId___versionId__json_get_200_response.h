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
 * OAI_v1_packages__packageId___versionId__json_get_200_response.h
 *
 * 
 */

#ifndef OAI_v1_packages__packageId___versionId__json_get_200_response_H
#define OAI_v1_packages__packageId___versionId__json_get_200_response_H

#include <QJsonObject>

#include "OAI_v1_packages__packageId___versionId__json_get_200_response_assetIndex.h"
#include "OAI_v1_packages__packageId___versionId__json_get_200_response_downloads.h"
#include "OAI_v1_packages__packageId___versionId__json_get_200_response_javaVersion.h"
#include <QDateTime>
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAI_v1_packages__packageId___versionId__json_get_200_response : public OAIObject {
public:
    OAI_v1_packages__packageId___versionId__json_get_200_response();
    OAI_v1_packages__packageId___versionId__json_get_200_response(QString json);
    ~OAI_v1_packages__packageId___versionId__json_get_200_response() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getVersion() const;
    void setVersion(const QString &version);
    bool is_version_Set() const;
    bool is_version_Valid() const;

    OAI_v1_packages__packageId___versionId__json_get_200_response_assetIndex getAssetIndex() const;
    void setAssetIndex(const OAI_v1_packages__packageId___versionId__json_get_200_response_assetIndex &asset_index);
    bool is_asset_index_Set() const;
    bool is_asset_index_Valid() const;

    qint32 getAssets() const;
    void setAssets(const qint32 &assets);
    bool is_assets_Set() const;
    bool is_assets_Valid() const;

    qint32 getComplianceLevel() const;
    void setComplianceLevel(const qint32 &compliance_level);
    bool is_compliance_level_Set() const;
    bool is_compliance_level_Valid() const;

    OAI_v1_packages__packageId___versionId__json_get_200_response_downloads getDownloads() const;
    void setDownloads(const OAI_v1_packages__packageId___versionId__json_get_200_response_downloads &downloads);
    bool is_downloads_Set() const;
    bool is_downloads_Valid() const;

    QString getId() const;
    void setId(const QString &id);
    bool is_id_Set() const;
    bool is_id_Valid() const;

    OAI_v1_packages__packageId___versionId__json_get_200_response_javaVersion getJavaVersion() const;
    void setJavaVersion(const OAI_v1_packages__packageId___versionId__json_get_200_response_javaVersion &java_version);
    bool is_java_version_Set() const;
    bool is_java_version_Valid() const;

    QString getMainClass() const;
    void setMainClass(const QString &main_class);
    bool is_main_class_Set() const;
    bool is_main_class_Valid() const;

    qint32 getMinimumLauncherVersion() const;
    void setMinimumLauncherVersion(const qint32 &minimum_launcher_version);
    bool is_minimum_launcher_version_Set() const;
    bool is_minimum_launcher_version_Valid() const;

    QDateTime getTime() const;
    void setTime(const QDateTime &time);
    bool is_time_Set() const;
    bool is_time_Valid() const;

    QDateTime getReleaseTime() const;
    void setReleaseTime(const QDateTime &release_time);
    bool is_release_time_Set() const;
    bool is_release_time_Valid() const;

    QString getType() const;
    void setType(const QString &type);
    bool is_type_Set() const;
    bool is_type_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString version;
    bool m_version_isSet;
    bool m_version_isValid;

    OAI_v1_packages__packageId___versionId__json_get_200_response_assetIndex asset_index;
    bool m_asset_index_isSet;
    bool m_asset_index_isValid;

    qint32 assets;
    bool m_assets_isSet;
    bool m_assets_isValid;

    qint32 compliance_level;
    bool m_compliance_level_isSet;
    bool m_compliance_level_isValid;

    OAI_v1_packages__packageId___versionId__json_get_200_response_downloads downloads;
    bool m_downloads_isSet;
    bool m_downloads_isValid;

    QString id;
    bool m_id_isSet;
    bool m_id_isValid;

    OAI_v1_packages__packageId___versionId__json_get_200_response_javaVersion java_version;
    bool m_java_version_isSet;
    bool m_java_version_isValid;

    QString main_class;
    bool m_main_class_isSet;
    bool m_main_class_isValid;

    qint32 minimum_launcher_version;
    bool m_minimum_launcher_version_isSet;
    bool m_minimum_launcher_version_isValid;

    QDateTime time;
    bool m_time_isSet;
    bool m_time_isValid;

    QDateTime release_time;
    bool m_release_time_isSet;
    bool m_release_time_isValid;

    QString type;
    bool m_type_isSet;
    bool m_type_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAI_v1_packages__packageId___versionId__json_get_200_response)

#endif // OAI_v1_packages__packageId___versionId__json_get_200_response_H
