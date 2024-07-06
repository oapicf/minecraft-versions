-module(openapi_version_package_info).

-export([encode/1]).

-export_type([openapi_version_package_info/0]).

-type openapi_version_package_info() ::
    #{ 'version' => binary(),
       'assetIndex' => openapi_version_package_info_asset_index:openapi_version_package_info_asset_index(),
       'assets' => binary(),
       'complianceLevel' => integer(),
       'downloads' => openapi_version_package_info_downloads:openapi_version_package_info_downloads(),
       'id' => binary(),
       'javaVersion' => openapi_version_package_info_java_version:openapi_version_package_info_java_version(),
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
