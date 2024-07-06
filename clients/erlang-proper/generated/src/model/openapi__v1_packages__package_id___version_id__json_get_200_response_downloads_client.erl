-module(openapi__v1_packages__package_id___version_id__json_get_200_response_downloads_client).

-include("openapi.hrl").

-export([openapi__v1_packages__package_id___version_id__json_get_200_response_downloads_client/0]).

-export([openapi__v1_packages__package_id___version_id__json_get_200_response_downloads_client/1]).

-export_type([openapi__v1_packages__package_id___version_id__json_get_200_response_downloads_client/0]).

-type openapi__v1_packages__package_id___version_id__json_get_200_response_downloads_client() ::
  [ {'sha1', binary() }
  | {'size', integer() }
  | {'url', binary() }
  ].


openapi__v1_packages__package_id___version_id__json_get_200_response_downloads_client() ->
    openapi__v1_packages__package_id___version_id__json_get_200_response_downloads_client([]).

openapi__v1_packages__package_id___version_id__json_get_200_response_downloads_client(Fields) ->
  Default = [ {'sha1', binary() }
            , {'size', integer() }
            , {'url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

