-module(openapi_version_package_info_downloads).

-include("openapi.hrl").

-export([openapi_version_package_info_downloads/0]).

-export([openapi_version_package_info_downloads/1]).

-export_type([openapi_version_package_info_downloads/0]).

-type openapi_version_package_info_downloads() ::
  [ {'client', openapi_download:openapi_download() }
  | {'client_mappings', openapi_download:openapi_download() }
  | {'server', openapi_download:openapi_download() }
  | {'server_mappings', openapi_download:openapi_download() }
  ].


openapi_version_package_info_downloads() ->
    openapi_version_package_info_downloads([]).

openapi_version_package_info_downloads(Fields) ->
  Default = [ {'client', openapi_download:openapi_download() }
            , {'client_mappings', openapi_download:openapi_download() }
            , {'server', openapi_download:openapi_download() }
            , {'server_mappings', openapi_download:openapi_download() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

