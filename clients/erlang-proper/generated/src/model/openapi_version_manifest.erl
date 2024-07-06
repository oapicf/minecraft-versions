-module(openapi_version_manifest).

-include("openapi.hrl").

-export([openapi_version_manifest/0]).

-export([openapi_version_manifest/1]).

-export_type([openapi_version_manifest/0]).

-type openapi_version_manifest() ::
  [ {'latest', openapi_version_manifest_latest:openapi_version_manifest_latest() }
  | {'versions', list(openapi_version:openapi_version()) }
  ].


openapi_version_manifest() ->
    openapi_version_manifest([]).

openapi_version_manifest(Fields) ->
  Default = [ {'latest', openapi_version_manifest_latest:openapi_version_manifest_latest() }
            , {'versions', list(openapi_version:openapi_version()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

