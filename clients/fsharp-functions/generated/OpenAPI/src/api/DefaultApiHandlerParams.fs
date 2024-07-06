namespace OpenAPI

open OpenAPI.Model.GetMinecraftVersionManifest200Response
open OpenAPI.Model.V1PackagesPackageIdVersionIdJsonGet200Response
open System.Collections.Generic
open System

module DefaultApiHandlerParams =



    type GetMinecraftVersionManifestStatusCode200Response = {
      content:GetMinecraftVersionManifest200Response;
      
    }
    type GetMinecraftVersionManifestResult = GetMinecraftVersionManifestStatusCode200 of GetMinecraftVersionManifestStatusCode200Response

    //#region Path parameters
    [<CLIMutable>]
    type V1PackagesPackageIdVersionIdJsonGetPathParams = {
      packageId : string ;
    //#endregion
      versionId : string ;
    }
    //#endregion


    type V1PackagesPackageIdVersionIdJsonGetStatusCode200Response = {
      content:V1PackagesPackageIdVersionIdJsonGet200Response;
      
    }
    type V1PackagesPackageIdVersionIdJsonGetResult = V1PackagesPackageIdVersionIdJsonGetStatusCode200 of V1PackagesPackageIdVersionIdJsonGetStatusCode200Response

    type V1PackagesPackageIdVersionIdJsonGetArgs = {
      pathParams:V1PackagesPackageIdVersionIdJsonGetPathParams;
    }
