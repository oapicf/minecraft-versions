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

#include "OAI_v1_packages__packageId___versionId__json_get_200_response_downloads_client.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAI_v1_packages__packageId___versionId__json_get_200_response_downloads_client::OAI_v1_packages__packageId___versionId__json_get_200_response_downloads_client(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAI_v1_packages__packageId___versionId__json_get_200_response_downloads_client::OAI_v1_packages__packageId___versionId__json_get_200_response_downloads_client() {
    this->initializeModel();
}

OAI_v1_packages__packageId___versionId__json_get_200_response_downloads_client::~OAI_v1_packages__packageId___versionId__json_get_200_response_downloads_client() {}

void OAI_v1_packages__packageId___versionId__json_get_200_response_downloads_client::initializeModel() {

    m_sha1_isSet = false;
    m_sha1_isValid = false;

    m_size_isSet = false;
    m_size_isValid = false;

    m_url_isSet = false;
    m_url_isValid = false;
}

void OAI_v1_packages__packageId___versionId__json_get_200_response_downloads_client::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAI_v1_packages__packageId___versionId__json_get_200_response_downloads_client::fromJsonObject(QJsonObject json) {

    m_sha1_isValid = ::OpenAPI::fromJsonValue(sha1, json[QString("sha1")]);
    m_sha1_isSet = !json[QString("sha1")].isNull() && m_sha1_isValid;

    m_size_isValid = ::OpenAPI::fromJsonValue(size, json[QString("size")]);
    m_size_isSet = !json[QString("size")].isNull() && m_size_isValid;

    m_url_isValid = ::OpenAPI::fromJsonValue(url, json[QString("url")]);
    m_url_isSet = !json[QString("url")].isNull() && m_url_isValid;
}

QString OAI_v1_packages__packageId___versionId__json_get_200_response_downloads_client::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAI_v1_packages__packageId___versionId__json_get_200_response_downloads_client::asJsonObject() const {
    QJsonObject obj;
    if (m_sha1_isSet) {
        obj.insert(QString("sha1"), ::OpenAPI::toJsonValue(sha1));
    }
    if (m_size_isSet) {
        obj.insert(QString("size"), ::OpenAPI::toJsonValue(size));
    }
    if (m_url_isSet) {
        obj.insert(QString("url"), ::OpenAPI::toJsonValue(url));
    }
    return obj;
}

QString OAI_v1_packages__packageId___versionId__json_get_200_response_downloads_client::getSha1() const {
    return sha1;
}
void OAI_v1_packages__packageId___versionId__json_get_200_response_downloads_client::setSha1(const QString &sha1) {
    this->sha1 = sha1;
    this->m_sha1_isSet = true;
}

bool OAI_v1_packages__packageId___versionId__json_get_200_response_downloads_client::is_sha1_Set() const{
    return m_sha1_isSet;
}

bool OAI_v1_packages__packageId___versionId__json_get_200_response_downloads_client::is_sha1_Valid() const{
    return m_sha1_isValid;
}

qint32 OAI_v1_packages__packageId___versionId__json_get_200_response_downloads_client::getSize() const {
    return size;
}
void OAI_v1_packages__packageId___versionId__json_get_200_response_downloads_client::setSize(const qint32 &size) {
    this->size = size;
    this->m_size_isSet = true;
}

bool OAI_v1_packages__packageId___versionId__json_get_200_response_downloads_client::is_size_Set() const{
    return m_size_isSet;
}

bool OAI_v1_packages__packageId___versionId__json_get_200_response_downloads_client::is_size_Valid() const{
    return m_size_isValid;
}

QString OAI_v1_packages__packageId___versionId__json_get_200_response_downloads_client::getUrl() const {
    return url;
}
void OAI_v1_packages__packageId___versionId__json_get_200_response_downloads_client::setUrl(const QString &url) {
    this->url = url;
    this->m_url_isSet = true;
}

bool OAI_v1_packages__packageId___versionId__json_get_200_response_downloads_client::is_url_Set() const{
    return m_url_isSet;
}

bool OAI_v1_packages__packageId___versionId__json_get_200_response_downloads_client::is_url_Valid() const{
    return m_url_isValid;
}

bool OAI_v1_packages__packageId___versionId__json_get_200_response_downloads_client::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_sha1_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_size_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_url_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAI_v1_packages__packageId___versionId__json_get_200_response_downloads_client::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI