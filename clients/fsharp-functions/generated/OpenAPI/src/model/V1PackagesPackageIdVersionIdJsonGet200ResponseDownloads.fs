namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient

module V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads =

  //#region V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads

  [<CLIMutable>]
  type V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads = {
    [<JsonProperty(PropertyName = "client")>]
    Client : V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient;
    [<JsonProperty(PropertyName = "client_mappings")>]
    ClientMappings : V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient;
    [<JsonProperty(PropertyName = "server")>]
    Server : V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient;
    [<JsonProperty(PropertyName = "server_mappings")>]
    ServerMappings : V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient;
  }

  //#endregion
