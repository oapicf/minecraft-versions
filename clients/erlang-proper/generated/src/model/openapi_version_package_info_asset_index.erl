-module(openapi_version_package_info_asset_index).

-include("openapi.hrl").

-export([openapi_version_package_info_asset_index/0]).

-export([openapi_version_package_info_asset_index/1]).

-export_type([openapi_version_package_info_asset_index/0]).

-type openapi_version_package_info_asset_index() ::
  [ {'id', binary() }
  | {'sha1', binary() }
  | {'size', integer() }
  | {'totalSize', integer() }
  | {'url', binary() }
  ].


openapi_version_package_info_asset_index() ->
    openapi_version_package_info_asset_index([]).

openapi_version_package_info_asset_index(Fields) ->
  Default = [ {'id', binary() }
            , {'sha1', binary() }
            , {'size', integer() }
            , {'totalSize', integer() }
            , {'url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

