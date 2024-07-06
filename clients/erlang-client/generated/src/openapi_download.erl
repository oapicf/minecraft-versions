-module(openapi_download).

-export([encode/1]).

-export_type([openapi_download/0]).

-type openapi_download() ::
    #{ 'sha1' => binary(),
       'size' => integer(),
       'url' => binary()
     }.

encode(#{ 'sha1' := Sha1,
          'size' := Size,
          'url' := Url
        }) ->
    #{ 'sha1' => Sha1,
       'size' => Size,
       'url' => Url
     }.
