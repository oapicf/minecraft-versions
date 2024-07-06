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

#include "OAIVersion.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIVersion::OAIVersion(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIVersion::OAIVersion() {
    this->initializeModel();
}

OAIVersion::~OAIVersion() {}

void OAIVersion::initializeModel() {

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

void OAIVersion::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIVersion::fromJsonObject(QJsonObject json) {

    m_id_isValid = ::OpenAPI::fromJsonValue(m_id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_type_isValid = ::OpenAPI::fromJsonValue(m_type, json[QString("type")]);
    m_type_isSet = !json[QString("type")].isNull() && m_type_isValid;

    m_url_isValid = ::OpenAPI::fromJsonValue(m_url, json[QString("url")]);
    m_url_isSet = !json[QString("url")].isNull() && m_url_isValid;

    m_time_isValid = ::OpenAPI::fromJsonValue(m_time, json[QString("time")]);
    m_time_isSet = !json[QString("time")].isNull() && m_time_isValid;

    m_release_time_isValid = ::OpenAPI::fromJsonValue(m_release_time, json[QString("releaseTime")]);
    m_release_time_isSet = !json[QString("releaseTime")].isNull() && m_release_time_isValid;
}

QString OAIVersion::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIVersion::asJsonObject() const {
    QJsonObject obj;
    if (m_id_isSet) {
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(m_id));
    }
    if (m_type_isSet) {
        obj.insert(QString("type"), ::OpenAPI::toJsonValue(m_type));
    }
    if (m_url_isSet) {
        obj.insert(QString("url"), ::OpenAPI::toJsonValue(m_url));
    }
    if (m_time_isSet) {
        obj.insert(QString("time"), ::OpenAPI::toJsonValue(m_time));
    }
    if (m_release_time_isSet) {
        obj.insert(QString("releaseTime"), ::OpenAPI::toJsonValue(m_release_time));
    }
    return obj;
}

QString OAIVersion::getId() const {
    return m_id;
}
void OAIVersion::setId(const QString &id) {
    m_id = id;
    m_id_isSet = true;
}

bool OAIVersion::is_id_Set() const{
    return m_id_isSet;
}

bool OAIVersion::is_id_Valid() const{
    return m_id_isValid;
}

QString OAIVersion::getType() const {
    return m_type;
}
void OAIVersion::setType(const QString &type) {
    m_type = type;
    m_type_isSet = true;
}

bool OAIVersion::is_type_Set() const{
    return m_type_isSet;
}

bool OAIVersion::is_type_Valid() const{
    return m_type_isValid;
}

QString OAIVersion::getUrl() const {
    return m_url;
}
void OAIVersion::setUrl(const QString &url) {
    m_url = url;
    m_url_isSet = true;
}

bool OAIVersion::is_url_Set() const{
    return m_url_isSet;
}

bool OAIVersion::is_url_Valid() const{
    return m_url_isValid;
}

QDateTime OAIVersion::getTime() const {
    return m_time;
}
void OAIVersion::setTime(const QDateTime &time) {
    m_time = time;
    m_time_isSet = true;
}

bool OAIVersion::is_time_Set() const{
    return m_time_isSet;
}

bool OAIVersion::is_time_Valid() const{
    return m_time_isValid;
}

QDateTime OAIVersion::getReleaseTime() const {
    return m_release_time;
}
void OAIVersion::setReleaseTime(const QDateTime &release_time) {
    m_release_time = release_time;
    m_release_time_isSet = true;
}

bool OAIVersion::is_release_time_Set() const{
    return m_release_time_isSet;
}

bool OAIVersion::is_release_time_Valid() const{
    return m_release_time_isValid;
}

bool OAIVersion::isSet() const {
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

bool OAIVersion::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
