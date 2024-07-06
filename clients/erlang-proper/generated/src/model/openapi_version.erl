-module(openapi_version).

-include("openapi.hrl").

-export([openapi_version/0]).

-export([openapi_version/1]).

-export_type([openapi_version/0]).

-type openapi_version() ::
  [ {'id', binary() }
  | {'type', binary() }
  | {'url', binary() }
  | {'time', datetime() }
  | {'releaseTime', datetime() }
  ].


openapi_version() ->
    openapi_version([]).

openapi_version(Fields) ->
  Default = [ {'id', binary() }
            , {'type', binary() }
            , {'url', binary() }
            , {'time', datetime() }
            , {'releaseTime', datetime() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

