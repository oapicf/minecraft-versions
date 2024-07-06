QT += network

HEADERS += \
# Models
    $${PWD}/OAI_mc_game_version_manifest_get_200_response.h \
    $${PWD}/OAI_mc_game_version_manifest_get_200_response_latest.h \
    $${PWD}/OAI_mc_game_version_manifest_get_200_response_versions_inner.h \
    $${PWD}/OAI_v1_packages__packageId___versionId__json_get_200_response.h \
    $${PWD}/OAI_v1_packages__packageId___versionId__json_get_200_response_assetIndex.h \
    $${PWD}/OAI_v1_packages__packageId___versionId__json_get_200_response_downloads.h \
    $${PWD}/OAI_v1_packages__packageId___versionId__json_get_200_response_downloads_client.h \
    $${PWD}/OAI_v1_packages__packageId___versionId__json_get_200_response_javaVersion.h \
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
    $${PWD}/OAI_mc_game_version_manifest_get_200_response.cpp \
    $${PWD}/OAI_mc_game_version_manifest_get_200_response_latest.cpp \
    $${PWD}/OAI_mc_game_version_manifest_get_200_response_versions_inner.cpp \
    $${PWD}/OAI_v1_packages__packageId___versionId__json_get_200_response.cpp \
    $${PWD}/OAI_v1_packages__packageId___versionId__json_get_200_response_assetIndex.cpp \
    $${PWD}/OAI_v1_packages__packageId___versionId__json_get_200_response_downloads.cpp \
    $${PWD}/OAI_v1_packages__packageId___versionId__json_get_200_response_downloads_client.cpp \
    $${PWD}/OAI_v1_packages__packageId___versionId__json_get_200_response_javaVersion.cpp \
# APIs
    $${PWD}/OAIDefaultApi.cpp \
# Others
    $${PWD}/OAIHelpers.cpp \
    $${PWD}/OAIHttpRequest.cpp \
    $${PWD}/OAIHttpFileElement.cpp \
    $${PWD}/OAIOauth.cpp
