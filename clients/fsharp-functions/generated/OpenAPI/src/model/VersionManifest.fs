namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Version
open OpenAPI.Model.VersionManifestLatest

module VersionManifest =

  //#region VersionManifest

  [<CLIMutable>]
  type VersionManifest = {
    [<JsonProperty(PropertyName = "latest")>]
    Latest : VersionManifestLatest;
    [<JsonProperty(PropertyName = "versions")>]
    Versions : Version[];
  }

  //#endregion
