namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Version
open OpenAPI.Model.VersionManifestLatest

module VersionManifest =

  //#region VersionManifest


  type VersionManifest = {
    Latest : VersionManifestLatest;
    Versions : Version[];
  }
  //#endregion
