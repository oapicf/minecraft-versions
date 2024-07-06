namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open DefaultApiHandlerParams
open DefaultApiServiceInterface
open DefaultApiServiceImplementation
open OpenAPI.Model.VersionManifest
open OpenAPI.Model.VersionPackageInfo

module DefaultApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region GetMinecraftVersionManifest
    /// <summary>
    /// Get Minecraft version manifest
    /// </summary>

    let GetMinecraftVersionManifest  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let result = DefaultApiService.GetMinecraftVersionManifest ctx 
          return! (match result with
                      | GetMinecraftVersionManifestStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetMinecraftVersionPackageInfo
    /// <summary>
    /// Get Minecraft version package info
    /// </summary>

    let GetMinecraftVersionPackageInfo (pathParams:GetMinecraftVersionPackageInfoPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetMinecraftVersionPackageInfoArgs
          let result = DefaultApiService.GetMinecraftVersionPackageInfo ctx serviceArgs
          return! (match result with
                      | GetMinecraftVersionPackageInfoStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

