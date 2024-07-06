namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient =

  //#region V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient

  [<CLIMutable>]
  type V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient = {
    [<JsonProperty(PropertyName = "sha1")>]
    Sha1 : string;
    [<JsonProperty(PropertyName = "size")>]
    Size : int;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
