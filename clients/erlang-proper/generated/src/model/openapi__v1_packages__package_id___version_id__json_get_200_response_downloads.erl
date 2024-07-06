-module(openapi__v1_packages__package_id___version_id__json_get_200_response_downloads).

-include("openapi.hrl").

-export([openapi__v1_packages__package_id___version_id__json_get_200_response_downloads/0]).

-export([openapi__v1_packages__package_id___version_id__json_get_200_response_downloads/1]).

-export_type([openapi__v1_packages__package_id___version_id__json_get_200_response_downloads/0]).

-type openapi__v1_packages__package_id___version_id__json_get_200_response_downloads() ::
  [ {'client', openapi__v1_packages__package_id___version_id__json_get_200_response_downloads_client:openapi__v1_packages__package_id___version_id__json_get_200_response_downloads_client() }
  | {'client_mappings', openapi__v1_packages__package_id___version_id__json_get_200_response_downloads_client:openapi__v1_packages__package_id___version_id__json_get_200_response_downloads_client() }
  | {'server', openapi__v1_packages__package_id___version_id__json_get_200_response_downloads_client:openapi__v1_packages__package_id___version_id__json_get_200_response_downloads_client() }
  | {'server_mappings', openapi__v1_packages__package_id___version_id__json_get_200_response_downloads_client:openapi__v1_packages__package_id___version_id__json_get_200_response_downloads_client() }
  ].


openapi__v1_packages__package_id___version_id__json_get_200_response_downloads() ->
    openapi__v1_packages__package_id___version_id__json_get_200_response_downloads([]).

openapi__v1_packages__package_id___version_id__json_get_200_response_downloads(Fields) ->
  Default = [ {'client', openapi__v1_packages__package_id___version_id__json_get_200_response_downloads_client:openapi__v1_packages__package_id___version_id__json_get_200_response_downloads_client() }
            , {'client_mappings', openapi__v1_packages__package_id___version_id__json_get_200_response_downloads_client:openapi__v1_packages__package_id___version_id__json_get_200_response_downloads_client() }
            , {'server', openapi__v1_packages__package_id___version_id__json_get_200_response_downloads_client:openapi__v1_packages__package_id___version_id__json_get_200_response_downloads_client() }
            , {'server_mappings', openapi__v1_packages__package_id___version_id__json_get_200_response_downloads_client:openapi__v1_packages__package_id___version_id__json_get_200_response_downloads_client() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

