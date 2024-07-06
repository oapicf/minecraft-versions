namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.McGameVersionManifestGet200ResponseLatest
open OpenAPI.Model.McGameVersionManifestGet200ResponseVersionsInner

module McGameVersionManifestGet200Response =

  //#region McGameVersionManifestGet200Response


  type _mc_game_version_manifest_get_200_response = {
    Latest : McGameVersionManifestGet200ResponseLatest;
    Versions : McGameVersionManifestGet200ResponseVersionsInner[];
  }
  //#endregion
