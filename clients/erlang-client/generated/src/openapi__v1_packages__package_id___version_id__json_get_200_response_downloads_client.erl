-module(openapi__v1_packages__package_id___version_id__json_get_200_response_downloads_client).

-export([encode/1]).

-export_type([openapi__v1_packages__package_id___version_id__json_get_200_response_downloads_client/0]).

-type openapi__v1_packages__package_id___version_id__json_get_200_response_downloads_client() ::
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
