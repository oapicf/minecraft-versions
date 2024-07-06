-module(openapi__v1_packages__package_id___version_id__json_get_200_response).

-include("openapi.hrl").

-export([openapi__v1_packages__package_id___version_id__json_get_200_response/0]).

-export([openapi__v1_packages__package_id___version_id__json_get_200_response/1]).

-export_type([openapi__v1_packages__package_id___version_id__json_get_200_response/0]).

-type openapi__v1_packages__package_id___version_id__json_get_200_response() ::
  [ {'version', binary() }
  | {'assetIndex', openapi__v1_packages__package_id___version_id__json_get_200_response_asset_index:openapi__v1_packages__package_id___version_id__json_get_200_response_asset_index() }
  | {'assets', integer() }
  | {'complianceLevel', integer() }
  | {'downloads', openapi__v1_packages__package_id___version_id__json_get_200_response_downloads:openapi__v1_packages__package_id___version_id__json_get_200_response_downloads() }
  | {'id', binary() }
  | {'javaVersion', openapi__v1_packages__package_id___version_id__json_get_200_response_java_version:openapi__v1_packages__package_id___version_id__json_get_200_response_java_version() }
  | {'mainClass', binary() }
  | {'minimumLauncherVersion', integer() }
  | {'time', datetime() }
  | {'releaseTime', datetime() }
  | {'type', binary() }
  ].


openapi__v1_packages__package_id___version_id__json_get_200_response() ->
    openapi__v1_packages__package_id___version_id__json_get_200_response([]).

openapi__v1_packages__package_id___version_id__json_get_200_response(Fields) ->
  Default = [ {'version', binary() }
            , {'assetIndex', openapi__v1_packages__package_id___version_id__json_get_200_response_asset_index:openapi__v1_packages__package_id___version_id__json_get_200_response_asset_index() }
            , {'assets', integer() }
            , {'complianceLevel', integer() }
            , {'downloads', openapi__v1_packages__package_id___version_id__json_get_200_response_downloads:openapi__v1_packages__package_id___version_id__json_get_200_response_downloads() }
            , {'id', binary() }
            , {'javaVersion', openapi__v1_packages__package_id___version_id__json_get_200_response_java_version:openapi__v1_packages__package_id___version_id__json_get_200_response_java_version() }
            , {'mainClass', binary() }
            , {'minimumLauncherVersion', integer() }
            , {'time', datetime() }
            , {'releaseTime', datetime() }
            , {'type', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

