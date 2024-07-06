namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion =

  //#region V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion

  [<CLIMutable>]
  type V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion = {
    [<JsonProperty(PropertyName = "component")>]
    Component : string;
    [<JsonProperty(PropertyName = "majorVersion")>]
    MajorVersion : int;
  }

  //#endregion
