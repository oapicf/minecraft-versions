QT += network

HEADERS += \
# Models
    $${PWD}/OAIDownload.h \
    $${PWD}/OAIVersion.h \
    $${PWD}/OAIVersionManifest.h \
    $${PWD}/OAIVersionManifest_latest.h \
    $${PWD}/OAIVersionPackageInfo.h \
    $${PWD}/OAIVersionPackageInfo_assetIndex.h \
    $${PWD}/OAIVersionPackageInfo_downloads.h \
    $${PWD}/OAIVersionPackageInfo_javaVersion.h \
# APIs
    $${PWD}/OAIDefaultApi.h \
# Others
    $${PWD}/OAIHelpers.h \
    $${PWD}/OAIHttpRequest.h \
    $${PWD}/OAIObject.h \
    $${PWD}/OAIEnum.h \
    $${PWD}/OAIHttpFileElement.h \
    $${PWD}/OAIServerConfiguration.h \
    $${PWD}/OAIServerVariable.h \
    $${PWD}/OAIOauth.h

SOURCES += \
# Models
    $${PWD}/OAIDownload.cpp \
    $${PWD}/OAIVersion.cpp \
    $${PWD}/OAIVersionManifest.cpp \
    $${PWD}/OAIVersionManifest_latest.cpp \
    $${PWD}/OAIVersionPackageInfo.cpp \
    $${PWD}/OAIVersionPackageInfo_assetIndex.cpp \
    $${PWD}/OAIVersionPackageInfo_downloads.cpp \
    $${PWD}/OAIVersionPackageInfo_javaVersion.cpp \
# APIs
    $${PWD}/OAIDefaultApi.cpp \
# Others
    $${PWD}/OAIHelpers.cpp \
    $${PWD}/OAIHttpRequest.cpp \
    $${PWD}/OAIHttpFileElement.cpp \
    $${PWD}/OAIOauth.cpp
