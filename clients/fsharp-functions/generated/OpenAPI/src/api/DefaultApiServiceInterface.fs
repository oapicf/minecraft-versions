namespace OpenAPI
open DefaultApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module DefaultApiServiceInterface =

    //#region Service interface
    type IDefaultApiService =
      abstract member McGameVersionManifestGet : unit -> McGameVersionManifestGetResult
      abstract member V1PackagesPackageIdVersionIdJsonGet : unit -> V1PackagesPackageIdVersionIdJsonGetResult
    //#endregion