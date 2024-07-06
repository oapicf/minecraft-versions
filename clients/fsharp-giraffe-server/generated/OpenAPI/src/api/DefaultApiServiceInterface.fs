namespace OpenAPI
open DefaultApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module DefaultApiServiceInterface =

    //#region Service interface
    type IDefaultApiService =
      abstract member McGameVersionManifestGet:HttpContext ->McGameVersionManifestGetResult
      abstract member V1PackagesPackageIdVersionIdJsonGet:HttpContext -> V1PackagesPackageIdVersionIdJsonGetArgs->V1PackagesPackageIdVersionIdJsonGetResult
    //#endregion