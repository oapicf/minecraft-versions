-module(openapi_download).

-include("openapi.hrl").

-export([openapi_download/0]).

-export([openapi_download/1]).

-export_type([openapi_download/0]).

-type openapi_download() ::
  [ {'sha1', binary() }
  | {'size', integer() }
  | {'url', binary() }
  ].


openapi_download() ->
    openapi_download([]).

openapi_download(Fields) ->
  Default = [ {'sha1', binary() }
            , {'size', integer() }
            , {'url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

