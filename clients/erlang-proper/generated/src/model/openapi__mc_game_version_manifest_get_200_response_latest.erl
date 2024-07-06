-module(openapi__mc_game_version_manifest_get_200_response_latest).

-include("openapi.hrl").

-export([openapi__mc_game_version_manifest_get_200_response_latest/0]).

-export([openapi__mc_game_version_manifest_get_200_response_latest/1]).

-export_type([openapi__mc_game_version_manifest_get_200_response_latest/0]).

-type openapi__mc_game_version_manifest_get_200_response_latest() ::
  [ {'release', binary() }
  | {'snapshot', binary() }
  ].


openapi__mc_game_version_manifest_get_200_response_latest() ->
    openapi__mc_game_version_manifest_get_200_response_latest([]).

openapi__mc_game_version_manifest_get_200_response_latest(Fields) ->
  Default = [ {'release', binary() }
            , {'snapshot', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

