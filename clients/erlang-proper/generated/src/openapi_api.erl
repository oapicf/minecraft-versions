-module(openapi_api).

-export([ get_minecraft_version_manifest/0
        , v1_packages_package_id_version_id_json_get/2
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

%% @doc Get Minecraft version package details
%% 
-spec v1_packages_package_id_version_id_json_get(binary(), binary()) ->
  openapi_utils:response().
v1_packages_package_id_version_id_json_get(PackageId, VersionId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/v1/packages/", PackageId, "/", VersionId, ".json"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

