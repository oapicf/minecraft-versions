namespace OpenAPI

open OpenAPI.Model.VersionManifest
open OpenAPI.Model.VersionPackageInfo
open System.Collections.Generic
open System

module DefaultApiHandlerParams =



    type GetMinecraftVersionManifestStatusCode200Response = {
      content:VersionManifest;
      
    }
    type GetMinecraftVersionManifestResult = GetMinecraftVersionManifestStatusCode200 of GetMinecraftVersionManifestStatusCode200Response

    //#region Path parameters
    [<CLIMutable>]
    type GetMinecraftVersionPackageInfoPathParams = {
      packageId : string ;
    //#endregion
      versionId : string ;
    }
    //#endregion


    type GetMinecraftVersionPackageInfoStatusCode200Response = {
      content:VersionPackageInfo;
      
    }
    type GetMinecraftVersionPackageInfoResult = GetMinecraftVersionPackageInfoStatusCode200 of GetMinecraftVersionPackageInfoStatusCode200Response

    type GetMinecraftVersionPackageInfoArgs = {
      pathParams:GetMinecraftVersionPackageInfoPathParams;
    }
