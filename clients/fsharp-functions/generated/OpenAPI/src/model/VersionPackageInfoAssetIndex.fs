namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module VersionPackageInfoAssetIndex =

  //#region VersionPackageInfoAssetIndex

  [<CLIMutable>]
  type VersionPackageInfoAssetIndex = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "sha1")>]
    Sha1 : string;
    [<JsonProperty(PropertyName = "size")>]
    Size : int;
    [<JsonProperty(PropertyName = "totalSize")>]
    TotalSize : int;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
