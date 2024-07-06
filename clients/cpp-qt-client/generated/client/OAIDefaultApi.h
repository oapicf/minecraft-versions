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

#ifndef OAI_OAIDefaultApi_H
#define OAI_OAIDefaultApi_H

#include "OAIHelpers.h"
#include "OAIHttpRequest.h"
#include "OAIServerConfiguration.h"
#include "OAIOauth.h"

#include "OAI_mc_game_version_manifest_get_200_response.h"
#include "OAI_v1_packages__packageId___versionId__json_get_200_response.h"
#include <QString>

#include <QObject>
#include <QByteArray>
#include <QStringList>
#include <QList>
#include <QNetworkAccessManager>

namespace OpenAPI {

class OAIDefaultApi : public QObject {
    Q_OBJECT

public:
    OAIDefaultApi(const int timeOut = 0);
    ~OAIDefaultApi();

    void initializeServerConfigs();
    int setDefaultServerValue(int serverIndex,const QString &operation, const QString &variable,const QString &val);
    void setServerIndex(const QString &operation, int serverIndex);
    void setApiKey(const QString &apiKeyName, const QString &apiKey);
    void setBearerToken(const QString &token);
    void setUsername(const QString &username);
    void setPassword(const QString &password);
    void setTimeOut(const int timeOut);
    void setWorkingDirectory(const QString &path);
    void setNetworkAccessManager(QNetworkAccessManager* manager);
    int addServerConfiguration(const QString &operation, const QUrl &url, const QString &description = "", const QMap<QString, OAIServerVariable> &variables = QMap<QString, OAIServerVariable>());
    void setNewServerForAllOperations(const QUrl &url, const QString &description = "", const QMap<QString, OAIServerVariable> &variables =  QMap<QString, OAIServerVariable>());
    void setNewServer(const QString &operation, const QUrl &url, const QString &description = "", const QMap<QString, OAIServerVariable> &variables =  QMap<QString, OAIServerVariable>());
    void addHeaders(const QString &key, const QString &value);
    void enableRequestCompression();
    void enableResponseCompression();
    void abortRequests();
    QString getParamStylePrefix(const QString &style);
    QString getParamStyleSuffix(const QString &style);
    QString getParamStyleDelimiter(const QString &style, const QString &name, bool isExplode);


    void mcGameVersionManifestGet();

    /**
    * @param[in]  package_id QString [required]
    * @param[in]  version_id QString [required]
    */
    void v1PackagesPackageIdVersionIdJsonGet(const QString &package_id, const QString &version_id);


private:
    QMap<QString,int> _serverIndices;
    QMap<QString,QList<OAIServerConfiguration>> _serverConfigs;
    QMap<QString, QString> _apiKeys;
    QString _bearerToken;
    QString _username;
    QString _password;
    int _timeOut;
    QString _workingDirectory;
    QNetworkAccessManager* _manager;
    QMap<QString, QString> _defaultHeaders;
    bool _isResponseCompressionEnabled;
    bool _isRequestCompressionEnabled;
    OAIHttpRequestInput _latestInput;
    OAIHttpRequestWorker *_latestWorker;
    QStringList _latestScope;
    OauthCode _authFlow;
    OauthImplicit _implicitFlow;
    OauthCredentials _credentialFlow;
    OauthPassword _passwordFlow;
    int _OauthMethod = 0;

    void mcGameVersionManifestGetCallback(OAIHttpRequestWorker *worker);
    void v1PackagesPackageIdVersionIdJsonGetCallback(OAIHttpRequestWorker *worker);

Q_SIGNALS:

    void mcGameVersionManifestGetSignal(OAI_mc_game_version_manifest_get_200_response summary);
    void v1PackagesPackageIdVersionIdJsonGetSignal(OAI_v1_packages__packageId___versionId__json_get_200_response summary);

    void mcGameVersionManifestGetSignalFull(OAIHttpRequestWorker *worker, OAI_mc_game_version_manifest_get_200_response summary);
    void v1PackagesPackageIdVersionIdJsonGetSignalFull(OAIHttpRequestWorker *worker, OAI_v1_packages__packageId___versionId__json_get_200_response summary);

    Q_DECL_DEPRECATED_X("Use mcGameVersionManifestGetSignalError() instead")
    void mcGameVersionManifestGetSignalE(OAI_mc_game_version_manifest_get_200_response summary, QNetworkReply::NetworkError error_type, QString error_str);
    void mcGameVersionManifestGetSignalError(OAI_mc_game_version_manifest_get_200_response summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use v1PackagesPackageIdVersionIdJsonGetSignalError() instead")
    void v1PackagesPackageIdVersionIdJsonGetSignalE(OAI_v1_packages__packageId___versionId__json_get_200_response summary, QNetworkReply::NetworkError error_type, QString error_str);
    void v1PackagesPackageIdVersionIdJsonGetSignalError(OAI_v1_packages__packageId___versionId__json_get_200_response summary, QNetworkReply::NetworkError error_type, const QString &error_str);

    Q_DECL_DEPRECATED_X("Use mcGameVersionManifestGetSignalErrorFull() instead")
    void mcGameVersionManifestGetSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void mcGameVersionManifestGetSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use v1PackagesPackageIdVersionIdJsonGetSignalErrorFull() instead")
    void v1PackagesPackageIdVersionIdJsonGetSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void v1PackagesPackageIdVersionIdJsonGetSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);

    void abortRequestsSignal();
    void allPendingRequestsCompleted();

public Q_SLOTS:
    void tokenAvailable();
};

} // namespace OpenAPI
#endif