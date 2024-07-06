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

#include "OAI_mc_game_version_manifest_get_200_response_versions_inner.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAI_mc_game_version_manifest_get_200_response_versions_inner::OAI_mc_game_version_manifest_get_200_response_versions_inner(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAI_mc_game_version_manifest_get_200_response_versions_inner::OAI_mc_game_version_manifest_get_200_response_versions_inner() {
    this->initializeModel();
}

OAI_mc_game_version_manifest_get_200_response_versions_inner::~OAI_mc_game_version_manifest_get_200_response_versions_inner() {}

void OAI_mc_game_version_manifest_get_200_response_versions_inner::initializeModel() {

    m_id_isSet = false;
    m_id_isValid = false;

    m_type_isSet = false;
    m_type_isValid = false;

    m_url_isSet = false;
    m_url_isValid = false;

    m_time_isSet = false;
    m_time_isValid = false;

    m_release_time_isSet = false;
    m_release_time_isValid = false;
}

void OAI_mc_game_version_manifest_get_200_response_versions_inner::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAI_mc_game_version_manifest_get_200_response_versions_inner::fromJsonObject(QJsonObject json) {

    m_id_isValid = ::OpenAPI::fromJsonValue(id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_type_isValid = ::OpenAPI::fromJsonValue(type, json[QString("type")]);
    m_type_isSet = !json[QString("type")].isNull() && m_type_isValid;

    m_url_isValid = ::OpenAPI::fromJsonValue(url, json[QString("url")]);
    m_url_isSet = !json[QString("url")].isNull() && m_url_isValid;

    m_time_isValid = ::OpenAPI::fromJsonValue(time, json[QString("time")]);
    m_time_isSet = !json[QString("time")].isNull() && m_time_isValid;

    m_release_time_isValid = ::OpenAPI::fromJsonValue(release_time, json[QString("releaseTime")]);
    m_release_time_isSet = !json[QString("releaseTime")].isNull() && m_release_time_isValid;
}

QString OAI_mc_game_version_manifest_get_200_response_versions_inner::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAI_mc_game_version_manifest_get_200_response_versions_inner::asJsonObject() const {
    QJsonObject obj;
    if (m_id_isSet) {
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(id));
    }
    if (m_type_isSet) {
        obj.insert(QString("type"), ::OpenAPI::toJsonValue(type));
    }
    if (m_url_isSet) {
        obj.insert(QString("url"), ::OpenAPI::toJsonValue(url));
    }
    if (m_time_isSet) {
        obj.insert(QString("time"), ::OpenAPI::toJsonValue(time));
    }
    if (m_release_time_isSet) {
        obj.insert(QString("releaseTime"), ::OpenAPI::toJsonValue(release_time));
    }
    return obj;
}

QString OAI_mc_game_version_manifest_get_200_response_versions_inner::getId() const {
    return id;
}
void OAI_mc_game_version_manifest_get_200_response_versions_inner::setId(const QString &id) {
    this->id = id;
    this->m_id_isSet = true;
}

bool OAI_mc_game_version_manifest_get_200_response_versions_inner::is_id_Set() const{
    return m_id_isSet;
}

bool OAI_mc_game_version_manifest_get_200_response_versions_inner::is_id_Valid() const{
    return m_id_isValid;
}

QString OAI_mc_game_version_manifest_get_200_response_versions_inner::getType() const {
    return type;
}
void OAI_mc_game_version_manifest_get_200_response_versions_inner::setType(const QString &type) {
    this->type = type;
    this->m_type_isSet = true;
}

bool OAI_mc_game_version_manifest_get_200_response_versions_inner::is_type_Set() const{
    return m_type_isSet;
}

bool OAI_mc_game_version_manifest_get_200_response_versions_inner::is_type_Valid() const{
    return m_type_isValid;
}

QString OAI_mc_game_version_manifest_get_200_response_versions_inner::getUrl() const {
    return url;
}
void OAI_mc_game_version_manifest_get_200_response_versions_inner::setUrl(const QString &url) {
    this->url = url;
    this->m_url_isSet = true;
}

bool OAI_mc_game_version_manifest_get_200_response_versions_inner::is_url_Set() const{
    return m_url_isSet;
}

bool OAI_mc_game_version_manifest_get_200_response_versions_inner::is_url_Valid() const{
    return m_url_isValid;
}

QDateTime OAI_mc_game_version_manifest_get_200_response_versions_inner::getTime() const {
    return time;
}
void OAI_mc_game_version_manifest_get_200_response_versions_inner::setTime(const QDateTime &time) {
    this->time = time;
    this->m_time_isSet = true;
}

bool OAI_mc_game_version_manifest_get_200_response_versions_inner::is_time_Set() const{
    return m_time_isSet;
}

bool OAI_mc_game_version_manifest_get_200_response_versions_inner::is_time_Valid() const{
    return m_time_isValid;
}

QDateTime OAI_mc_game_version_manifest_get_200_response_versions_inner::getReleaseTime() const {
    return release_time;
}
void OAI_mc_game_version_manifest_get_200_response_versions_inner::setReleaseTime(const QDateTime &release_time) {
    this->release_time = release_time;
    this->m_release_time_isSet = true;
}

bool OAI_mc_game_version_manifest_get_200_response_versions_inner::is_release_time_Set() const{
    return m_release_time_isSet;
}

bool OAI_mc_game_version_manifest_get_200_response_versions_inner::is_release_time_Valid() const{
    return m_release_time_isValid;
}

bool OAI_mc_game_version_manifest_get_200_response_versions_inner::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_type_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_url_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_time_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_release_time_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAI_mc_game_version_manifest_get_200_response_versions_inner::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI