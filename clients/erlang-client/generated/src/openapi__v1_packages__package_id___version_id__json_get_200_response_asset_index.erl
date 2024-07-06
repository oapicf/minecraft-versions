-module(openapi__v1_packages__package_id___version_id__json_get_200_response_asset_index).

-export([encode/1]).

-export_type([openapi__v1_packages__package_id___version_id__json_get_200_response_asset_index/0]).

-type openapi__v1_packages__package_id___version_id__json_get_200_response_asset_index() ::
    #{ 'id' => binary(),
       'sha1' => binary(),
       'size' => integer(),
       'totalSize' => integer(),
       'url' => binary()
     }.

encode(#{ 'id' := Id,
          'sha1' := Sha1,
          'size' := Size,
          'totalSize' := TotalSize,
          'url' := Url
        }) ->
    #{ 'id' => Id,
       'sha1' => Sha1,
       'size' => Size,
       'totalSize' => TotalSize,
       'url' => Url
     }.
