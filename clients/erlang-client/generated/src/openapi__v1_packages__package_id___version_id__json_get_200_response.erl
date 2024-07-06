-module(openapi__v1_packages__package_id___version_id__json_get_200_response).

-export([encode/1]).

-export_type([openapi__v1_packages__package_id___version_id__json_get_200_response/0]).

-type openapi__v1_packages__package_id___version_id__json_get_200_response() ::
    #{ 'version' => binary(),
       'assetIndex' => openapi__v1_packages__package_id___version_id__json_get_200_response_asset_index:openapi__v1_packages__package_id___version_id__json_get_200_response_asset_index(),
       'assets' => integer(),
       'complianceLevel' => integer(),
       'downloads' => openapi__v1_packages__package_id___version_id__json_get_200_response_downloads:openapi__v1_packages__package_id___version_id__json_get_200_response_downloads(),
       'id' => binary(),
       'javaVersion' => openapi__v1_packages__package_id___version_id__json_get_200_response_java_version:openapi__v1_packages__package_id___version_id__json_get_200_response_java_version(),
       'mainClass' => binary(),
       'minimumLauncherVersion' => integer(),
       'time' => openapi_date_time:openapi_date_time(),
       'releaseTime' => openapi_date_time:openapi_date_time(),
       'type' => binary()
     }.

encode(#{ 'version' := Version,
          'assetIndex' := AssetIndex,
          'assets' := Assets,
          'complianceLevel' := ComplianceLevel,
          'downloads' := Downloads,
          'id' := Id,
          'javaVersion' := JavaVersion,
          'mainClass' := MainClass,
          'minimumLauncherVersion' := MinimumLauncherVersion,
          'time' := Time,
          'releaseTime' := ReleaseTime,
          'type' := Type
        }) ->
    #{ 'version' => Version,
       'assetIndex' => AssetIndex,
       'assets' => Assets,
       'complianceLevel' => ComplianceLevel,
       'downloads' => Downloads,
       'id' => Id,
       'javaVersion' => JavaVersion,
       'mainClass' => MainClass,
       'minimumLauncherVersion' => MinimumLauncherVersion,
       'time' => Time,
       'releaseTime' => ReleaseTime,
       'type' => Type
     }.
