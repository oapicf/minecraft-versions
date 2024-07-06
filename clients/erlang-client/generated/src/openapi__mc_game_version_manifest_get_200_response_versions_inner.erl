-module(openapi__mc_game_version_manifest_get_200_response_versions_inner).

-export([encode/1]).

-export_type([openapi__mc_game_version_manifest_get_200_response_versions_inner/0]).

-type openapi__mc_game_version_manifest_get_200_response_versions_inner() ::
    #{ 'id' => binary(),
       'type' => binary(),
       'url' => binary(),
       'time' => openapi_date_time:openapi_date_time(),
       'releaseTime' => openapi_date_time:openapi_date_time()
     }.

encode(#{ 'id' := Id,
          'type' := Type,
          'url' := Url,
          'time' := Time,
          'releaseTime' := ReleaseTime
        }) ->
    #{ 'id' => Id,
       'type' => Type,
       'url' => Url,
       'time' => Time,
       'releaseTime' => ReleaseTime
     }.
