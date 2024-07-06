-module(openapi__mc_game_version_manifest_get_200_response_versions_inner).

-include("openapi.hrl").

-export([openapi__mc_game_version_manifest_get_200_response_versions_inner/0]).

-export([openapi__mc_game_version_manifest_get_200_response_versions_inner/1]).

-export_type([openapi__mc_game_version_manifest_get_200_response_versions_inner/0]).

-type openapi__mc_game_version_manifest_get_200_response_versions_inner() ::
  [ {'id', binary() }
  | {'type', binary() }
  | {'url', binary() }
  | {'time', datetime() }
  | {'releaseTime', datetime() }
  ].


openapi__mc_game_version_manifest_get_200_response_versions_inner() ->
    openapi__mc_game_version_manifest_get_200_response_versions_inner([]).

openapi__mc_game_version_manifest_get_200_response_versions_inner(Fields) ->
  Default = [ {'id', binary() }
            , {'type', binary() }
            , {'url', binary() }
            , {'time', datetime() }
            , {'releaseTime', datetime() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

