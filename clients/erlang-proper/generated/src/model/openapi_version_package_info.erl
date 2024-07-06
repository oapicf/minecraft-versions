-module(openapi_version_package_info).

-include("openapi.hrl").

-export([openapi_version_package_info/0]).

-export([openapi_version_package_info/1]).

-export_type([openapi_version_package_info/0]).

-type openapi_version_package_info() ::
  [ {'version', binary() }
  | {'assetIndex', openapi_version_package_info_asset_index:openapi_version_package_info_asset_index() }
  | {'assets', binary() }
  | {'complianceLevel', integer() }
  | {'downloads', openapi_version_package_info_downloads:openapi_version_package_info_downloads() }
  | {'id', binary() }
  | {'javaVersion', openapi_version_package_info_java_version:openapi_version_package_info_java_version() }
  | {'mainClass', binary() }
  | {'minimumLauncherVersion', integer() }
  | {'time', datetime() }
  | {'releaseTime', datetime() }
  | {'type', binary() }
  ].


openapi_version_package_info() ->
    openapi_version_package_info([]).

openapi_version_package_info(Fields) ->
  Default = [ {'version', binary() }
            , {'assetIndex', openapi_version_package_info_asset_index:openapi_version_package_info_asset_index() }
            , {'assets', binary() }
            , {'complianceLevel', integer() }
            , {'downloads', openapi_version_package_info_downloads:openapi_version_package_info_downloads() }
            , {'id', binary() }
            , {'javaVersion', openapi_version_package_info_java_version:openapi_version_package_info_java_version() }
            , {'mainClass', binary() }
            , {'minimumLauncherVersion', integer() }
            , {'time', datetime() }
            , {'releaseTime', datetime() }
            , {'type', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

