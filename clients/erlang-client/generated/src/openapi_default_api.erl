-module(openapi_default_api).

-export([mc_game_version_manifest_get/1, mc_game_version_manifest_get/2,
         v1_packages_package_id_version_id_json_get/3, v1_packages_package_id_version_id_json_get/4]).

-define(BASE_URL, <<"">>).

%% @doc Get Minecraft version manifest
%% 
-spec mc_game_version_manifest_get(ctx:ctx()) -> {ok, openapi__mc_game_version_manifest_get_200_response:openapi__mc_game_version_manifest_get_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
mc_game_version_manifest_get(Ctx) ->
    mc_game_version_manifest_get(Ctx, #{}).

-spec mc_game_version_manifest_get(ctx:ctx(), maps:map()) -> {ok, openapi__mc_game_version_manifest_get_200_response:openapi__mc_game_version_manifest_get_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
mc_game_version_manifest_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/mc/game/version_manifest"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get Minecraft version package details
%% 
-spec v1_packages_package_id_version_id_json_get(ctx:ctx(), binary(), binary()) -> {ok, openapi__v1_packages__package_id___version_id__json_get_200_response:openapi__v1_packages__package_id___version_id__json_get_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
v1_packages_package_id_version_id_json_get(Ctx, PackageId, VersionId) ->
    v1_packages_package_id_version_id_json_get(Ctx, PackageId, VersionId, #{}).

-spec v1_packages_package_id_version_id_json_get(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi__v1_packages__package_id___version_id__json_get_200_response:openapi__v1_packages__package_id___version_id__json_get_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
v1_packages_package_id_version_id_json_get(Ctx, PackageId, VersionId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/v1/packages/", PackageId, "/", VersionId, ".json"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


