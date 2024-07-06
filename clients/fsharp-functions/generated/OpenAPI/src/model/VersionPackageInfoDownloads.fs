namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Download

module VersionPackageInfoDownloads =

  //#region VersionPackageInfoDownloads

  [<CLIMutable>]
  type VersionPackageInfoDownloads = {
    [<JsonProperty(PropertyName = "client")>]
    Client : Download;
    [<JsonProperty(PropertyName = "client_mappings")>]
    ClientMappings : Download;
    [<JsonProperty(PropertyName = "server")>]
    Server : Download;
    [<JsonProperty(PropertyName = "server_mappings")>]
    ServerMappings : Download;
  }

  //#endregion
