namespace OpenAPI.Model

open System
open System.Collections.Generic

module Download =

  //#region Download


  type Download = {
    Sha1 : string;
    Size : int;
    Url : string;
  }
  //#endregion
