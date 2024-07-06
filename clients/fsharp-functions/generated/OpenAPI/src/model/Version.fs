namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module Version =

  //#region Version

  [<CLIMutable>]
  type Version = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
    [<JsonProperty(PropertyName = "time")>]
    Time : Nullable<DateTime>;
    [<JsonProperty(PropertyName = "releaseTime")>]
    ReleaseTime : Nullable<DateTime>;
  }

  //#endregion
