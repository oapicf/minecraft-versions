-module(openapi_version_manifest_latest).

-export([encode/1]).

-export_type([openapi_version_manifest_latest/0]).

-type openapi_version_manifest_latest() ::
    #{ 'release' => binary(),
       'snapshot' => binary()
     }.

encode(#{ 'release' := Release,
          'snapshot' := Snapshot
        }) ->
    #{ 'release' => Release,
       'snapshot' => Snapshot
     }.
