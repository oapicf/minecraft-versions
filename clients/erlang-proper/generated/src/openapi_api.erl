-module(openapi_api).

-export([ get_minecraft_version_manifest/0
        , get_minecraft_version_package_info/2
        ]).

-define(BASE_URL, "").

%% @doc Get Minecraft version manifest
%% 
-spec get_minecraft_version_manifest() ->
  openapi_utils:response().
get_minecraft_version_manifest() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/mc/game/version_manifest.json"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Get Minecraft version package info
%% 
-spec get_minecraft_version_package_info(binary(), binary()) ->
  openapi_utils:response().
get_minecraft_version_package_info(PackageId, VersionId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/v1/packages/", PackageId, "/", VersionId, ".json"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

