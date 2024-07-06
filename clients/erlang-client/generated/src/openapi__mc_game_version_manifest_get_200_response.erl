-module(openapi__mc_game_version_manifest_get_200_response).

-export([encode/1]).

-export_type([openapi__mc_game_version_manifest_get_200_response/0]).

-type openapi__mc_game_version_manifest_get_200_response() ::
    #{ 'latest' => openapi__mc_game_version_manifest_get_200_response_latest:openapi__mc_game_version_manifest_get_200_response_latest(),
       'versions' => list()
     }.

encode(#{ 'latest' := Latest,
          'versions' := Versions
        }) ->
    #{ 'latest' => Latest,
       'versions' => Versions
     }.
