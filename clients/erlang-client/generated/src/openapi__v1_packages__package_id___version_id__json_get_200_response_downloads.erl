-module(openapi__v1_packages__package_id___version_id__json_get_200_response_downloads).

-export([encode/1]).

-export_type([openapi__v1_packages__package_id___version_id__json_get_200_response_downloads/0]).

-type openapi__v1_packages__package_id___version_id__json_get_200_response_downloads() ::
    #{ 'client' => openapi__v1_packages__package_id___version_id__json_get_200_response_downloads_client:openapi__v1_packages__package_id___version_id__json_get_200_response_downloads_client(),
       'client_mappings' => openapi__v1_packages__package_id___version_id__json_get_200_response_downloads_client:openapi__v1_packages__package_id___version_id__json_get_200_response_downloads_client(),
       'server' => openapi__v1_packages__package_id___version_id__json_get_200_response_downloads_client:openapi__v1_packages__package_id___version_id__json_get_200_response_downloads_client(),
       'server_mappings' => openapi__v1_packages__package_id___version_id__json_get_200_response_downloads_client:openapi__v1_packages__package_id___version_id__json_get_200_response_downloads_client()
     }.

encode(#{ 'client' := Client,
          'client_mappings' := ClientMappings,
          'server' := Server,
          'server_mappings' := ServerMappings
        }) ->
    #{ 'client' => Client,
       'client_mappings' => ClientMappings,
       'server' => Server,
       'server_mappings' => ServerMappings
     }.
