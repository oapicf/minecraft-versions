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

#include "OAI_v1_packages__packageId___versionId__json_get_200_response_downloads.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAI_v1_packages__packageId___versionId__json_get_200_response_downloads::OAI_v1_packages__packageId___versionId__json_get_200_response_downloads(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAI_v1_packages__packageId___versionId__json_get_200_response_downloads::OAI_v1_packages__packageId___versionId__json_get_200_response_downloads() {
    this->initializeModel();
}

OAI_v1_packages__packageId___versionId__json_get_200_response_downloads::~OAI_v1_packages__packageId___versionId__json_get_200_response_downloads() {}

void OAI_v1_packages__packageId___versionId__json_get_200_response_downloads::initializeModel() {

    m_client_isSet = false;
    m_client_isValid = false;

    m_client_mappings_isSet = false;
    m_client_mappings_isValid = false;

    m_server_isSet = false;
    m_server_isValid = false;

    m_server_mappings_isSet = false;
    m_server_mappings_isValid = false;
}

void OAI_v1_packages__packageId___versionId__json_get_200_response_downloads::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAI_v1_packages__packageId___versionId__json_get_200_response_downloads::fromJsonObject(QJsonObject json) {

    m_client_isValid = ::OpenAPI::fromJsonValue(m_client, json[QString("client")]);
    m_client_isSet = !json[QString("client")].isNull() && m_client_isValid;

    m_client_mappings_isValid = ::OpenAPI::fromJsonValue(m_client_mappings, json[QString("client_mappings")]);
    m_client_mappings_isSet = !json[QString("client_mappings")].isNull() && m_client_mappings_isValid;

    m_server_isValid = ::OpenAPI::fromJsonValue(m_server, json[QString("server")]);
    m_server_isSet = !json[QString("server")].isNull() && m_server_isValid;

    m_server_mappings_isValid = ::OpenAPI::fromJsonValue(m_server_mappings, json[QString("server_mappings")]);
    m_server_mappings_isSet = !json[QString("server_mappings")].isNull() && m_server_mappings_isValid;
}

QString OAI_v1_packages__packageId___versionId__json_get_200_response_downloads::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAI_v1_packages__packageId___versionId__json_get_200_response_downloads::asJsonObject() const {
    QJsonObject obj;
    if (m_client.isSet()) {
        obj.insert(QString("client"), ::OpenAPI::toJsonValue(m_client));
    }
    if (m_client_mappings.isSet()) {
        obj.insert(QString("client_mappings"), ::OpenAPI::toJsonValue(m_client_mappings));
    }
    if (m_server.isSet()) {
        obj.insert(QString("server"), ::OpenAPI::toJsonValue(m_server));
    }
    if (m_server_mappings.isSet()) {
        obj.insert(QString("server_mappings"), ::OpenAPI::toJsonValue(m_server_mappings));
    }
    return obj;
}

OAI_v1_packages__packageId___versionId__json_get_200_response_downloads_client OAI_v1_packages__packageId___versionId__json_get_200_response_downloads::getClient() const {
    return m_client;
}
void OAI_v1_packages__packageId___versionId__json_get_200_response_downloads::setClient(const OAI_v1_packages__packageId___versionId__json_get_200_response_downloads_client &client) {
    m_client = client;
    m_client_isSet = true;
}

bool OAI_v1_packages__packageId___versionId__json_get_200_response_downloads::is_client_Set() const{
    return m_client_isSet;
}

bool OAI_v1_packages__packageId___versionId__json_get_200_response_downloads::is_client_Valid() const{
    return m_client_isValid;
}

OAI_v1_packages__packageId___versionId__json_get_200_response_downloads_client OAI_v1_packages__packageId___versionId__json_get_200_response_downloads::getClientMappings() const {
    return m_client_mappings;
}
void OAI_v1_packages__packageId___versionId__json_get_200_response_downloads::setClientMappings(const OAI_v1_packages__packageId___versionId__json_get_200_response_downloads_client &client_mappings) {
    m_client_mappings = client_mappings;
    m_client_mappings_isSet = true;
}

bool OAI_v1_packages__packageId___versionId__json_get_200_response_downloads::is_client_mappings_Set() const{
    return m_client_mappings_isSet;
}

bool OAI_v1_packages__packageId___versionId__json_get_200_response_downloads::is_client_mappings_Valid() const{
    return m_client_mappings_isValid;
}

OAI_v1_packages__packageId___versionId__json_get_200_response_downloads_client OAI_v1_packages__packageId___versionId__json_get_200_response_downloads::getServer() const {
    return m_server;
}
void OAI_v1_packages__packageId___versionId__json_get_200_response_downloads::setServer(const OAI_v1_packages__packageId___versionId__json_get_200_response_downloads_client &server) {
    m_server = server;
    m_server_isSet = true;
}

bool OAI_v1_packages__packageId___versionId__json_get_200_response_downloads::is_server_Set() const{
    return m_server_isSet;
}

bool OAI_v1_packages__packageId___versionId__json_get_200_response_downloads::is_server_Valid() const{
    return m_server_isValid;
}

OAI_v1_packages__packageId___versionId__json_get_200_response_downloads_client OAI_v1_packages__packageId___versionId__json_get_200_response_downloads::getServerMappings() const {
    return m_server_mappings;
}
void OAI_v1_packages__packageId___versionId__json_get_200_response_downloads::setServerMappings(const OAI_v1_packages__packageId___versionId__json_get_200_response_downloads_client &server_mappings) {
    m_server_mappings = server_mappings;
    m_server_mappings_isSet = true;
}

bool OAI_v1_packages__packageId___versionId__json_get_200_response_downloads::is_server_mappings_Set() const{
    return m_server_mappings_isSet;
}

bool OAI_v1_packages__packageId___versionId__json_get_200_response_downloads::is_server_mappings_Valid() const{
    return m_server_mappings_isValid;
}

bool OAI_v1_packages__packageId___versionId__json_get_200_response_downloads::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_client.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_client_mappings.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_server.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_server_mappings.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAI_v1_packages__packageId___versionId__json_get_200_response_downloads::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
