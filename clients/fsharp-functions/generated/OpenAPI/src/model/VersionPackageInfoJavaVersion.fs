namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module VersionPackageInfoJavaVersion =

  //#region VersionPackageInfoJavaVersion

  [<CLIMutable>]
  type VersionPackageInfoJavaVersion = {
    [<JsonProperty(PropertyName = "component")>]
    Component : string;
    [<JsonProperty(PropertyName = "majorVersion")>]
    MajorVersion : int;
  }

  //#endregion
