-module(openapi_version_package_info_java_version).

-export([encode/1]).

-export_type([openapi_version_package_info_java_version/0]).

-type openapi_version_package_info_java_version() ::
    #{ 'component' => binary(),
       'majorVersion' => integer()
     }.

encode(#{ 'component' := Component,
          'majorVersion' := MajorVersion
        }) ->
    #{ 'component' => Component,
       'majorVersion' => MajorVersion
     }.
