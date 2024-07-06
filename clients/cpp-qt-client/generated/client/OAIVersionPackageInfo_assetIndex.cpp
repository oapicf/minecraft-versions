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

#include "OAIVersionPackageInfo_assetIndex.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIVersionPackageInfo_assetIndex::OAIVersionPackageInfo_assetIndex(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIVersionPackageInfo_assetIndex::OAIVersionPackageInfo_assetIndex() {
    this->initializeModel();
}

OAIVersionPackageInfo_assetIndex::~OAIVersionPackageInfo_assetIndex() {}

void OAIVersionPackageInfo_assetIndex::initializeModel() {

    m_id_isSet = false;
    m_id_isValid = false;

    m_sha1_isSet = false;
    m_sha1_isValid = false;

    m_size_isSet = false;
    m_size_isValid = false;

    m_total_size_isSet = false;
    m_total_size_isValid = false;

    m_url_isSet = false;
    m_url_isValid = false;
}

void OAIVersionPackageInfo_assetIndex::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIVersionPackageInfo_assetIndex::fromJsonObject(QJsonObject json) {

    m_id_isValid = ::OpenAPI::fromJsonValue(m_id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_sha1_isValid = ::OpenAPI::fromJsonValue(m_sha1, json[QString("sha1")]);
    m_sha1_isSet = !json[QString("sha1")].isNull() && m_sha1_isValid;

    m_size_isValid = ::OpenAPI::fromJsonValue(m_size, json[QString("size")]);
    m_size_isSet = !json[QString("size")].isNull() && m_size_isValid;

    m_total_size_isValid = ::OpenAPI::fromJsonValue(m_total_size, json[QString("totalSize")]);
    m_total_size_isSet = !json[QString("totalSize")].isNull() && m_total_size_isValid;

    m_url_isValid = ::OpenAPI::fromJsonValue(m_url, json[QString("url")]);
    m_url_isSet = !json[QString("url")].isNull() && m_url_isValid;
}

QString OAIVersionPackageInfo_assetIndex::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIVersionPackageInfo_assetIndex::asJsonObject() const {
    QJsonObject obj;
    if (m_id_isSet) {
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(m_id));
    }
    if (m_sha1_isSet) {
        obj.insert(QString("sha1"), ::OpenAPI::toJsonValue(m_sha1));
    }
    if (m_size_isSet) {
        obj.insert(QString("size"), ::OpenAPI::toJsonValue(m_size));
    }
    if (m_total_size_isSet) {
        obj.insert(QString("totalSize"), ::OpenAPI::toJsonValue(m_total_size));
    }
    if (m_url_isSet) {
        obj.insert(QString("url"), ::OpenAPI::toJsonValue(m_url));
    }
    return obj;
}

QString OAIVersionPackageInfo_assetIndex::getId() const {
    return m_id;
}
void OAIVersionPackageInfo_assetIndex::setId(const QString &id) {
    m_id = id;
    m_id_isSet = true;
}

bool OAIVersionPackageInfo_assetIndex::is_id_Set() const{
    return m_id_isSet;
}

bool OAIVersionPackageInfo_assetIndex::is_id_Valid() const{
    return m_id_isValid;
}

QString OAIVersionPackageInfo_assetIndex::getSha1() const {
    return m_sha1;
}
void OAIVersionPackageInfo_assetIndex::setSha1(const QString &sha1) {
    m_sha1 = sha1;
    m_sha1_isSet = true;
}

bool OAIVersionPackageInfo_assetIndex::is_sha1_Set() const{
    return m_sha1_isSet;
}

bool OAIVersionPackageInfo_assetIndex::is_sha1_Valid() const{
    return m_sha1_isValid;
}

qint32 OAIVersionPackageInfo_assetIndex::getSize() const {
    return m_size;
}
void OAIVersionPackageInfo_assetIndex::setSize(const qint32 &size) {
    m_size = size;
    m_size_isSet = true;
}

bool OAIVersionPackageInfo_assetIndex::is_size_Set() const{
    return m_size_isSet;
}

bool OAIVersionPackageInfo_assetIndex::is_size_Valid() const{
    return m_size_isValid;
}

qint32 OAIVersionPackageInfo_assetIndex::getTotalSize() const {
    return m_total_size;
}
void OAIVersionPackageInfo_assetIndex::setTotalSize(const qint32 &total_size) {
    m_total_size = total_size;
    m_total_size_isSet = true;
}

bool OAIVersionPackageInfo_assetIndex::is_total_size_Set() const{
    return m_total_size_isSet;
}

bool OAIVersionPackageInfo_assetIndex::is_total_size_Valid() const{
    return m_total_size_isValid;
}

QString OAIVersionPackageInfo_assetIndex::getUrl() const {
    return m_url;
}
void OAIVersionPackageInfo_assetIndex::setUrl(const QString &url) {
    m_url = url;
    m_url_isSet = true;
}

bool OAIVersionPackageInfo_assetIndex::is_url_Set() const{
    return m_url_isSet;
}

bool OAIVersionPackageInfo_assetIndex::is_url_Valid() const{
    return m_url_isValid;
}

bool OAIVersionPackageInfo_assetIndex::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_sha1_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_size_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_total_size_isSet) {
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

bool OAIVersionPackageInfo_assetIndex::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
