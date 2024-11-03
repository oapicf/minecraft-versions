/**
 * 
 * SDK for Minecraft versions info
 *
 * The version of the OpenAPI document: 0.12.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

#include "OAIVersionManifest_latest.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIVersionManifest_latest::OAIVersionManifest_latest(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIVersionManifest_latest::OAIVersionManifest_latest() {
    this->initializeModel();
}

OAIVersionManifest_latest::~OAIVersionManifest_latest() {}

void OAIVersionManifest_latest::initializeModel() {

    m_release_isSet = false;
    m_release_isValid = false;

    m_snapshot_isSet = false;
    m_snapshot_isValid = false;
}

void OAIVersionManifest_latest::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIVersionManifest_latest::fromJsonObject(QJsonObject json) {

    m_release_isValid = ::OpenAPI::fromJsonValue(m_release, json[QString("release")]);
    m_release_isSet = !json[QString("release")].isNull() && m_release_isValid;

    m_snapshot_isValid = ::OpenAPI::fromJsonValue(m_snapshot, json[QString("snapshot")]);
    m_snapshot_isSet = !json[QString("snapshot")].isNull() && m_snapshot_isValid;
}

QString OAIVersionManifest_latest::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIVersionManifest_latest::asJsonObject() const {
    QJsonObject obj;
    if (m_release_isSet) {
        obj.insert(QString("release"), ::OpenAPI::toJsonValue(m_release));
    }
    if (m_snapshot_isSet) {
        obj.insert(QString("snapshot"), ::OpenAPI::toJsonValue(m_snapshot));
    }
    return obj;
}

QString OAIVersionManifest_latest::getRelease() const {
    return m_release;
}
void OAIVersionManifest_latest::setRelease(const QString &release) {
    m_release = release;
    m_release_isSet = true;
}

bool OAIVersionManifest_latest::is_release_Set() const{
    return m_release_isSet;
}

bool OAIVersionManifest_latest::is_release_Valid() const{
    return m_release_isValid;
}

QString OAIVersionManifest_latest::getSnapshot() const {
    return m_snapshot;
}
void OAIVersionManifest_latest::setSnapshot(const QString &snapshot) {
    m_snapshot = snapshot;
    m_snapshot_isSet = true;
}

bool OAIVersionManifest_latest::is_snapshot_Set() const{
    return m_snapshot_isSet;
}

bool OAIVersionManifest_latest::is_snapshot_Valid() const{
    return m_snapshot_isValid;
}

bool OAIVersionManifest_latest::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_release_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_snapshot_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIVersionManifest_latest::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
