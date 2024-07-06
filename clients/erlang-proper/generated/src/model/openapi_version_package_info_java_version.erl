-module(openapi_version_package_info_java_version).

-include("openapi.hrl").

-export([openapi_version_package_info_java_version/0]).

-export([openapi_version_package_info_java_version/1]).

-export_type([openapi_version_package_info_java_version/0]).

-type openapi_version_package_info_java_version() ::
  [ {'component', binary() }
  | {'majorVersion', integer() }
  ].


openapi_version_package_info_java_version() ->
    openapi_version_package_info_java_version([]).

openapi_version_package_info_java_version(Fields) ->
  Default = [ {'component', binary() }
            , {'majorVersion', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

