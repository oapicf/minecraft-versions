-module(openapi_version_manifest_latest).

-include("openapi.hrl").

-export([openapi_version_manifest_latest/0]).

-export([openapi_version_manifest_latest/1]).

-export_type([openapi_version_manifest_latest/0]).

-type openapi_version_manifest_latest() ::
  [ {'release', binary() }
  | {'snapshot', binary() }
  ].


openapi_version_manifest_latest() ->
    openapi_version_manifest_latest([]).

openapi_version_manifest_latest(Fields) ->
  Default = [ {'release', binary() }
            , {'snapshot', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

