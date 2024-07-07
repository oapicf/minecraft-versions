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
 * OAIVersionPackageInfo_downloads.h
 *
 * 
 */

#ifndef OAIVersionPackageInfo_downloads_H
#define OAIVersionPackageInfo_downloads_H

#include <QJsonObject>

#include "OAIDownload.h"

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAIDownload;

class OAIVersionPackageInfo_downloads : public OAIObject {
public:
    OAIVersionPackageInfo_downloads();
    OAIVersionPackageInfo_downloads(QString json);
    ~OAIVersionPackageInfo_downloads() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIDownload getClient() const;
    void setClient(const OAIDownload &client);
    bool is_client_Set() const;
    bool is_client_Valid() const;

    OAIDownload getClientMappings() const;
    void setClientMappings(const OAIDownload &client_mappings);
    bool is_client_mappings_Set() const;
    bool is_client_mappings_Valid() const;

    OAIDownload getServer() const;
    void setServer(const OAIDownload &server);
    bool is_server_Set() const;
    bool is_server_Valid() const;

    OAIDownload getServerMappings() const;
    void setServerMappings(const OAIDownload &server_mappings);
    bool is_server_mappings_Set() const;
    bool is_server_mappings_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    OAIDownload m_client;
    bool m_client_isSet;
    bool m_client_isValid;

    OAIDownload m_client_mappings;
    bool m_client_mappings_isSet;
    bool m_client_mappings_isValid;

    OAIDownload m_server;
    bool m_server_isSet;
    bool m_server_isValid;

    OAIDownload m_server_mappings;
    bool m_server_mappings_isSet;
    bool m_server_mappings_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIVersionPackageInfo_downloads)

#endif // OAIVersionPackageInfo_downloads_H