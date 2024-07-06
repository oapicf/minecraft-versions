-module(openapi_default_api).

-export([get_minecraft_version_manifest/1, get_minecraft_version_manifest/2,
         get_minecraft_version_package_info/3, get_minecraft_version_package_info/4]).

-define(BASE_URL, <<"">>).

%% @doc Get Minecraft version manifest
%% 
-spec get_minecraft_version_manifest(ctx:ctx()) -> {ok, openapi_version_manifest:openapi_version_manifest(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_minecraft_version_manifest(Ctx) ->
    get_minecraft_version_manifest(Ctx, #{}).

-spec get_minecraft_version_manifest(ctx:ctx(), maps:map()) -> {ok, openapi_version_manifest:openapi_version_manifest(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_minecraft_version_manifest(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/mc/game/version_manifest.json"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get Minecraft version package info
%% 
-spec get_minecraft_version_package_info(ctx:ctx(), binary(), binary()) -> {ok, openapi_version_package_info:openapi_version_package_info(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_minecraft_version_package_info(Ctx, PackageId, VersionId) ->
    get_minecraft_version_package_info(Ctx, PackageId, VersionId, #{}).

-spec get_minecraft_version_package_info(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_version_package_info:openapi_version_package_info(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_minecraft_version_package_info(Ctx, PackageId, VersionId, Optional) ->
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


