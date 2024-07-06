-module(openapi_version).

-export([encode/1]).

-export_type([openapi_version/0]).

-type openapi_version() ::
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
