-module(openapi__mc_game_version_manifest_get_200_response).

-include("openapi.hrl").

-export([openapi__mc_game_version_manifest_get_200_response/0]).

-export([openapi__mc_game_version_manifest_get_200_response/1]).

-export_type([openapi__mc_game_version_manifest_get_200_response/0]).

-type openapi__mc_game_version_manifest_get_200_response() ::
  [ {'latest', openapi__mc_game_version_manifest_get_200_response_latest:openapi__mc_game_version_manifest_get_200_response_latest() }
  | {'versions', list(openapi__mc_game_version_manifest_get_200_response_versions_inner:openapi__mc_game_version_manifest_get_200_response_versions_inner()) }
  ].


openapi__mc_game_version_manifest_get_200_response() ->
    openapi__mc_game_version_manifest_get_200_response([]).

openapi__mc_game_version_manifest_get_200_response(Fields) ->
  Default = [ {'latest', openapi__mc_game_version_manifest_get_200_response_latest:openapi__mc_game_version_manifest_get_200_response_latest() }
            , {'versions', list(openapi__mc_game_version_manifest_get_200_response_versions_inner:openapi__mc_game_version_manifest_get_200_response_versions_inner()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

