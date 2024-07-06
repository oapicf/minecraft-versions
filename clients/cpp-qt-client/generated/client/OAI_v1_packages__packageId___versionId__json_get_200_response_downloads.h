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
 * OAI_v1_packages__packageId___versionId__json_get_200_response_downloads.h
 *
 * 
 */

#ifndef OAI_v1_packages__packageId___versionId__json_get_200_response_downloads_H
#define OAI_v1_packages__packageId___versionId__json_get_200_response_downloads_H

#include <QJsonObject>

#include "OAI_v1_packages__packageId___versionId__json_get_200_response_downloads_client.h"

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAI_v1_packages__packageId___versionId__json_get_200_response_downloads_client;

class OAI_v1_packages__packageId___versionId__json_get_200_response_downloads : public OAIObject {
public:
    OAI_v1_packages__packageId___versionId__json_get_200_response_downloads();
    OAI_v1_packages__packageId___versionId__json_get_200_response_downloads(QString json);
    ~OAI_v1_packages__packageId___versionId__json_get_200_response_downloads() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAI_v1_packages__packageId___versionId__json_get_200_response_downloads_client getClient() const;
    void setClient(const OAI_v1_packages__packageId___versionId__json_get_200_response_downloads_client &client);
    bool is_client_Set() const;
    bool is_client_Valid() const;

    OAI_v1_packages__packageId___versionId__json_get_200_response_downloads_client getClientMappings() const;
    void setClientMappings(const OAI_v1_packages__packageId___versionId__json_get_200_response_downloads_client &client_mappings);
    bool is_client_mappings_Set() const;
    bool is_client_mappings_Valid() const;

    OAI_v1_packages__packageId___versionId__json_get_200_response_downloads_client getServer() const;
    void setServer(const OAI_v1_packages__packageId___versionId__json_get_200_response_downloads_client &server);
    bool is_server_Set() const;
    bool is_server_Valid() const;

    OAI_v1_packages__packageId___versionId__json_get_200_response_downloads_client getServerMappings() const;
    void setServerMappings(const OAI_v1_packages__packageId___versionId__json_get_200_response_downloads_client &server_mappings);
    bool is_server_mappings_Set() const;
    bool is_server_mappings_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    OAI_v1_packages__packageId___versionId__json_get_200_response_downloads_client m_client;
    bool m_client_isSet;
    bool m_client_isValid;

    OAI_v1_packages__packageId___versionId__json_get_200_response_downloads_client m_client_mappings;
    bool m_client_mappings_isSet;
    bool m_client_mappings_isValid;

    OAI_v1_packages__packageId___versionId__json_get_200_response_downloads_client m_server;
    bool m_server_isSet;
    bool m_server_isValid;

    OAI_v1_packages__packageId___versionId__json_get_200_response_downloads_client m_server_mappings;
    bool m_server_mappings_isSet;
    bool m_server_mappings_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAI_v1_packages__packageId___versionId__json_get_200_response_downloads)

#endif // OAI_v1_packages__packageId___versionId__json_get_200_response_downloads_H
