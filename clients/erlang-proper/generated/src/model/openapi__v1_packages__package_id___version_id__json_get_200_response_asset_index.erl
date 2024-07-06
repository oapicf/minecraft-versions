-module(openapi__v1_packages__package_id___version_id__json_get_200_response_asset_index).

-include("openapi.hrl").

-export([openapi__v1_packages__package_id___version_id__json_get_200_response_asset_index/0]).

-export([openapi__v1_packages__package_id___version_id__json_get_200_response_asset_index/1]).

-export_type([openapi__v1_packages__package_id___version_id__json_get_200_response_asset_index/0]).

-type openapi__v1_packages__package_id___version_id__json_get_200_response_asset_index() ::
  [ {'id', binary() }
  | {'sha1', binary() }
  | {'size', integer() }
  | {'totalSize', integer() }
  | {'url', binary() }
  ].


openapi__v1_packages__package_id___version_id__json_get_200_response_asset_index() ->
    openapi__v1_packages__package_id___version_id__json_get_200_response_asset_index([]).

openapi__v1_packages__package_id___version_id__json_get_200_response_asset_index(Fields) ->
  Default = [ {'id', binary() }
            , {'sha1', binary() }
            , {'size', integer() }
            , {'totalSize', integer() }
            , {'url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

