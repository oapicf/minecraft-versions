namespace OpenAPI
open DefaultApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module DefaultApiServiceInterface =

    //#region Service interface
    type IDefaultApiService =
      abstract member GetMinecraftVersionManifest : unit -> GetMinecraftVersionManifestResult
      abstract member GetMinecraftVersionPackageInfo : unit -> GetMinecraftVersionPackageInfoResult
    //#endregion