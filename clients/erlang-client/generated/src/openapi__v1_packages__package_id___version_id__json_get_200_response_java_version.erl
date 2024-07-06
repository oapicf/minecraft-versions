-module(openapi__v1_packages__package_id___version_id__json_get_200_response_java_version).

-export([encode/1]).

-export_type([openapi__v1_packages__package_id___version_id__json_get_200_response_java_version/0]).

-type openapi__v1_packages__package_id___version_id__json_get_200_response_java_version() ::
    #{ 'component' => binary(),
       'majorVersion' => integer()
     }.

encode(#{ 'component' := Component,
          'majorVersion' := MajorVersion
        }) ->
    #{ 'component' => Component,
       'majorVersion' => MajorVersion
     }.
