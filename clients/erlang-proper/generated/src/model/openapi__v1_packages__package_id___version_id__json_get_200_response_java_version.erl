-module(openapi__v1_packages__package_id___version_id__json_get_200_response_java_version).

-include("openapi.hrl").

-export([openapi__v1_packages__package_id___version_id__json_get_200_response_java_version/0]).

-export([openapi__v1_packages__package_id___version_id__json_get_200_response_java_version/1]).

-export_type([openapi__v1_packages__package_id___version_id__json_get_200_response_java_version/0]).

-type openapi__v1_packages__package_id___version_id__json_get_200_response_java_version() ::
  [ {'component', binary() }
  | {'majorVersion', integer() }
  ].


openapi__v1_packages__package_id___version_id__json_get_200_response_java_version() ->
    openapi__v1_packages__package_id___version_id__json_get_200_response_java_version([]).

openapi__v1_packages__package_id___version_id__json_get_200_response_java_version(Fields) ->
  Default = [ {'component', binary() }
            , {'majorVersion', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

