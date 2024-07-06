namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module McGameVersionManifestGet200ResponseLatest =

  //#region McGameVersionManifestGet200ResponseLatest

  [<CLIMutable>]
  type McGameVersionManifestGet200ResponseLatest = {
    [<JsonProperty(PropertyName = "release")>]
    Release : string;
    [<JsonProperty(PropertyName = "snapshot")>]
    Snapshot : string;
  }

  //#endregion
