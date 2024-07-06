-module(openapi_version_package_info_downloads).

-export([encode/1]).

-export_type([openapi_version_package_info_downloads/0]).

-type openapi_version_package_info_downloads() ::
    #{ 'client' => openapi_download:openapi_download(),
       'client_mappings' => openapi_download:openapi_download(),
       'server' => openapi_download:openapi_download(),
       'server_mappings' => openapi_download:openapi_download()
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
