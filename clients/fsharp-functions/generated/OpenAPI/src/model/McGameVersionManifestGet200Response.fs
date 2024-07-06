namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.McGameVersionManifestGet200ResponseLatest
open OpenAPI.Model.McGameVersionManifestGet200ResponseVersionsInner

module McGameVersionManifestGet200Response =

  //#region McGameVersionManifestGet200Response

  [<CLIMutable>]
  type McGameVersionManifestGet200Response = {
    [<JsonProperty(PropertyName = "latest")>]
    Latest : McGameVersionManifestGet200ResponseLatest;
    [<JsonProperty(PropertyName = "versions")>]
    Versions : McGameVersionManifestGet200ResponseVersionsInner[];
  }

  //#endregion
