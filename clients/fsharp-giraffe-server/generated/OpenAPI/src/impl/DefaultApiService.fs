namespace OpenAPI
open OpenAPI.Model.VersionManifest
open OpenAPI.Model.VersionPackageInfo
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
            let content = "A list of Minecraft versions with the latest and snapshot releases" :> obj :?> VersionManifest // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetMinecraftVersionManifestStatusCode200 { content = content }

        member this.GetMinecraftVersionPackageInfo ctx args =
            let content = "Get package version details" :> obj :?> VersionPackageInfo // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetMinecraftVersionPackageInfoStatusCode200 { content = content }

      //#endregion

    let DefaultApiService = DefaultApiServiceImpl() :> IDefaultApiService