namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open DefaultApiHandlerParams
open DefaultApiServiceInterface
open DefaultApiServiceImplementation
open OpenAPI.Model.GetMinecraftVersionManifest200Response
open OpenAPI.Model.V1PackagesPackageIdVersionIdJsonGet200Response

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

    //#region V1PackagesPackageIdVersionIdJsonGet
    /// <summary>
    /// Get Minecraft version package details
    /// </summary>

    let V1PackagesPackageIdVersionIdJsonGet (pathParams:V1PackagesPackageIdVersionIdJsonGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : V1PackagesPackageIdVersionIdJsonGetArgs
          let result = DefaultApiService.V1PackagesPackageIdVersionIdJsonGet ctx serviceArgs
          return! (match result with
                      | V1PackagesPackageIdVersionIdJsonGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

