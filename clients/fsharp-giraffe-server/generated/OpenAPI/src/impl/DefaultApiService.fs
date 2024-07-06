namespace OpenAPI
open OpenAPI.Model.GetMinecraftVersionManifest200Response
open OpenAPI.Model.V1PackagesPackageIdVersionIdJsonGet200Response
open DefaultApiHandlerParams
open DefaultApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module DefaultApiServiceImplementation =

    //#region Service implementation
    type DefaultApiServiceImpl() =
      interface IDefaultApiService with

        member this.GetMinecraftVersionManifest ctx  =
            let content = "A list of Minecraft versions with the latest and snapshot releases" :> obj :?> GetMinecraftVersionManifest200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetMinecraftVersionManifestStatusCode200 { content = content }

        member this.V1PackagesPackageIdVersionIdJsonGet ctx args =
            let content = "Get package version details" :> obj :?> V1PackagesPackageIdVersionIdJsonGet200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            V1PackagesPackageIdVersionIdJsonGetStatusCode200 { content = content }

      //#endregion

    let DefaultApiService = DefaultApiServiceImpl() :> IDefaultApiService