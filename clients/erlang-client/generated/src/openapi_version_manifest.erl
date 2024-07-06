-module(openapi_version_manifest).

-export([encode/1]).

-export_type([openapi_version_manifest/0]).

-type openapi_version_manifest() ::
    #{ 'latest' => openapi_version_manifest_latest:openapi_version_manifest_latest(),
       'versions' => list()
     }.

encode(#{ 'latest' := Latest,
          'versions' := Versions
        }) ->
    #{ 'latest' => Latest,
       'versions' => Versions
     }.
