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

#include <QJsonArray>
#include <QJsonDocument>
#include <QJsonObject>
#include <QVariantMap>
#include <QDebug>

#include "OAIDefaultApiHandler.h"
#include "OAIDefaultApiRequest.h"

namespace OpenAPI {

OAIDefaultApiHandler::OAIDefaultApiHandler(){

}

OAIDefaultApiHandler::~OAIDefaultApiHandler(){

}

void OAIDefaultApiHandler::getMinecraftVersionManifest() {
    auto reqObj = qobject_cast<OAIDefaultApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAIVersionManifest res;
        reqObj->getMinecraftVersionManifestResponse(res);
    }
}
void OAIDefaultApiHandler::getMinecraftVersionPackageInfo(QString package_id, QString version_id) {
    Q_UNUSED(package_id);
    Q_UNUSED(version_id);
    auto reqObj = qobject_cast<OAIDefaultApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAIVersionPackageInfo res;
        reqObj->getMinecraftVersionPackageInfoResponse(res);
    }
}


}
