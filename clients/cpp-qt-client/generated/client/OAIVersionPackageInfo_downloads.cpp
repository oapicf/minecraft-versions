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

#include "OAIVersionPackageInfo_downloads.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIVersionPackageInfo_downloads::OAIVersionPackageInfo_downloads(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIVersionPackageInfo_downloads::OAIVersionPackageInfo_downloads() {
    this->initializeModel();
}

OAIVersionPackageInfo_downloads::~OAIVersionPackageInfo_downloads() {}

void OAIVersionPackageInfo_downloads::initializeModel() {

    m_client_isSet = false;
    m_client_isValid = false;

    m_client_mappings_isSet = false;
    m_client_mappings_isValid = false;

    m_server_isSet = false;
    m_server_isValid = false;

    m_server_mappings_isSet = false;
    m_server_mappings_isValid = false;
}

void OAIVersionPackageInfo_downloads::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIVersionPackageInfo_downloads::fromJsonObject(QJsonObject json) {

    m_client_isValid = ::OpenAPI::fromJsonValue(m_client, json[QString("client")]);
    m_client_isSet = !json[QString("client")].isNull() && m_client_isValid;

    m_client_mappings_isValid = ::OpenAPI::fromJsonValue(m_client_mappings, json[QString("client_mappings")]);
    m_client_mappings_isSet = !json[QString("client_mappings")].isNull() && m_client_mappings_isValid;

    m_server_isValid = ::OpenAPI::fromJsonValue(m_server, json[QString("server")]);
    m_server_isSet = !json[QString("server")].isNull() && m_server_isValid;

    m_server_mappings_isValid = ::OpenAPI::fromJsonValue(m_server_mappings, json[QString("server_mappings")]);
    m_server_mappings_isSet = !json[QString("server_mappings")].isNull() && m_server_mappings_isValid;
}

QString OAIVersionPackageInfo_downloads::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIVersionPackageInfo_downloads::asJsonObject() const {
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

OAIDownload OAIVersionPackageInfo_downloads::getClient() const {
    return m_client;
}
void OAIVersionPackageInfo_downloads::setClient(const OAIDownload &client) {
    m_client = client;
    m_client_isSet = true;
}

bool OAIVersionPackageInfo_downloads::is_client_Set() const{
    return m_client_isSet;
}

bool OAIVersionPackageInfo_downloads::is_client_Valid() const{
    return m_client_isValid;
}

OAIDownload OAIVersionPackageInfo_downloads::getClientMappings() const {
    return m_client_mappings;
}
void OAIVersionPackageInfo_downloads::setClientMappings(const OAIDownload &client_mappings) {
    m_client_mappings = client_mappings;
    m_client_mappings_isSet = true;
}

bool OAIVersionPackageInfo_downloads::is_client_mappings_Set() const{
    return m_client_mappings_isSet;
}

bool OAIVersionPackageInfo_downloads::is_client_mappings_Valid() const{
    return m_client_mappings_isValid;
}

OAIDownload OAIVersionPackageInfo_downloads::getServer() const {
    return m_server;
}
void OAIVersionPackageInfo_downloads::setServer(const OAIDownload &server) {
    m_server = server;
    m_server_isSet = true;
}

bool OAIVersionPackageInfo_downloads::is_server_Set() const{
    return m_server_isSet;
}

bool OAIVersionPackageInfo_downloads::is_server_Valid() const{
    return m_server_isValid;
}

OAIDownload OAIVersionPackageInfo_downloads::getServerMappings() const {
    return m_server_mappings;
}
void OAIVersionPackageInfo_downloads::setServerMappings(const OAIDownload &server_mappings) {
    m_server_mappings = server_mappings;
    m_server_mappings_isSet = true;
}

bool OAIVersionPackageInfo_downloads::is_server_mappings_Set() const{
    return m_server_mappings_isSet;
}

bool OAIVersionPackageInfo_downloads::is_server_mappings_Valid() const{
    return m_server_mappings_isValid;
}

bool OAIVersionPackageInfo_downloads::isSet() const {
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

bool OAIVersionPackageInfo_downloads::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
