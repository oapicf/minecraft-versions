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

#ifndef OAI_OAIDefaultApiRequest_H
#define OAI_OAIDefaultApiRequest_H

#include <QObject>
#include <QStringList>
#include <QMultiMap>
#include <QNetworkReply>
#include <QSharedPointer>

#include <qhttpengine/socket.h>
#include "OAI_mc_game_version_manifest_get_200_response.h"
#include "OAI_v1_packages__packageId___versionId__json_get_200_response.h"
#include <QString>
#include "OAIDefaultApiHandler.h"

namespace OpenAPI {

class OAIDefaultApiRequest : public QObject
{
    Q_OBJECT

public:
    OAIDefaultApiRequest(QHttpEngine::Socket *s, QSharedPointer<OAIDefaultApiHandler> handler);
    virtual ~OAIDefaultApiRequest();

    void mcGameVersionManifestGetRequest();
    void v1PackagesPackageIdVersionIdJsonGetRequest(const QString& package_id, const QString& version_id);
    

    void mcGameVersionManifestGetResponse(const OAI_mc_game_version_manifest_get_200_response& res);
    void v1PackagesPackageIdVersionIdJsonGetResponse(const OAI_v1_packages__packageId___versionId__json_get_200_response& res);
    

    void mcGameVersionManifestGetError(const OAI_mc_game_version_manifest_get_200_response& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void v1PackagesPackageIdVersionIdJsonGetError(const OAI_v1_packages__packageId___versionId__json_get_200_response& res, QNetworkReply::NetworkError error_type, QString& error_str);
    

    void sendCustomResponse(QByteArray & res, QNetworkReply::NetworkError error_type);

    void sendCustomResponse(QIODevice *res, QNetworkReply::NetworkError error_type);

    QMap<QString, QString> getRequestHeaders() const;

    QHttpEngine::Socket* getRawSocket();

    void setResponseHeaders(const QMultiMap<QString,QString>& headers);

Q_SIGNALS:
    void mcGameVersionManifestGet();
    void v1PackagesPackageIdVersionIdJsonGet(QString package_id, QString version_id);
    

private:
    QMap<QString, QString> requestHeaders;
    QMap<QString, QString> responseHeaders;
    QHttpEngine::Socket  *socket;
    QSharedPointer<OAIDefaultApiHandler> handler;

    inline void setSocketResponseHeaders(){
        QHttpEngine::Socket::HeaderMap resHeaders;
        for(auto itr = responseHeaders.begin(); itr != responseHeaders.end(); ++itr) {
            resHeaders.insert(itr.key().toUtf8(), itr.value().toUtf8());
        }
        socket->setHeaders(resHeaders);
    }
};

}

#endif // OAI_OAIDefaultApiRequest_H