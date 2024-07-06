namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module VersionManifestLatest =

  //#region VersionManifestLatest

  [<CLIMutable>]
  type VersionManifestLatest = {
    [<JsonProperty(PropertyName = "release")>]
    Release : string;
    [<JsonProperty(PropertyName = "snapshot")>]
    Snapshot : string;
  }

  //#endregion
