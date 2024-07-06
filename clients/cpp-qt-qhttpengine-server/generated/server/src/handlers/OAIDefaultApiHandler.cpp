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
        OAIGetMinecraftVersionManifest_200_response res;
        reqObj->getMinecraftVersionManifestResponse(res);
    }
}
void OAIDefaultApiHandler::v1PackagesPackageIdVersionIdJsonGet(QString package_id, QString version_id) {
    Q_UNUSED(package_id);
    Q_UNUSED(version_id);
    auto reqObj = qobject_cast<OAIDefaultApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAI_v1_packages__packageId___versionId__json_get_200_response res;
        reqObj->v1PackagesPackageIdVersionIdJsonGetResponse(res);
    }
}


}