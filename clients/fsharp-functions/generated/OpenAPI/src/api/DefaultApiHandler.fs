namespace OpenAPI

open DefaultApiHandlerParams
open DefaultApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module DefaultApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region GetMinecraftVersionManifest
    /// <summary>
    /// Get Minecraft version manifest
    /// </summary>
   [<FunctionName("GetMinecraftVersionManifest")>]
    let GetMinecraftVersionManifest
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/mc/game/version_manifest.json")>]
        req:HttpRequest ) =

      let result = DefaultApiService.GetMinecraftVersionManifest ()
      match result with
      | GetMinecraftVersionManifestStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region GetMinecraftVersionPackageInfo
    /// <summary>
    /// Get Minecraft version package info
    /// </summary>
   [<FunctionName("GetMinecraftVersionPackageInfo")>]
    let GetMinecraftVersionPackageInfo
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/packages/{packageId}/{versionId}.json")>]
        req:HttpRequest ) =

      let result = DefaultApiService.GetMinecraftVersionPackageInfo ()
      match result with
      | GetMinecraftVersionPackageInfoStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

