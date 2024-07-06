namespace OpenAPI.Model

open System
open System.Collections.Generic

module Version =

  //#region Version


  type Version = {
    Id : string;
    Type : string;
    Url : string;
    Time : Nullable<DateTime>;
    ReleaseTime : Nullable<DateTime>;
  }
  //#endregion
