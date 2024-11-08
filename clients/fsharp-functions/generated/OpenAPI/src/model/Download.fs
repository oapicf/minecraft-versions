namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module Download =

  //#region Download

  [<CLIMutable>]
  type Download = {
    [<JsonProperty(PropertyName = "sha1")>]
    Sha1 : string;
    [<JsonProperty(PropertyName = "size")>]
    Size : int;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
