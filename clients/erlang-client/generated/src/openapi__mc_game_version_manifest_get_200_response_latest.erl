-module(openapi__mc_game_version_manifest_get_200_response_latest).

-export([encode/1]).

-export_type([openapi__mc_game_version_manifest_get_200_response_latest/0]).

-type openapi__mc_game_version_manifest_get_200_response_latest() ::
    #{ 'release' => binary(),
       'snapshot' => binary()
     }.

encode(#{ 'release' := Release,
          'snapshot' := Snapshot
        }) ->
    #{ 'release' => Release,
       'snapshot' => Snapshot
     }.
