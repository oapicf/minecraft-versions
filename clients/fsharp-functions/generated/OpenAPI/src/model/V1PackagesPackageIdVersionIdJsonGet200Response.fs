namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex
open OpenAPI.Model.V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads
open OpenAPI.Model.V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion

module V1PackagesPackageIdVersionIdJsonGet200Response =

  //#region V1PackagesPackageIdVersionIdJsonGet200Response

  [<CLIMutable>]
  type V1PackagesPackageIdVersionIdJsonGet200Response = {
    [<JsonProperty(PropertyName = "version")>]
    Version : string;
    [<JsonProperty(PropertyName = "assetIndex")>]
    AssetIndex : V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex;
    [<JsonProperty(PropertyName = "assets")>]
    Assets : int;
    [<JsonProperty(PropertyName = "complianceLevel")>]
    ComplianceLevel : int;
    [<JsonProperty(PropertyName = "downloads")>]
    Downloads : V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "javaVersion")>]
    JavaVersion : V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion;
    [<JsonProperty(PropertyName = "mainClass")>]
    MainClass : string;
    [<JsonProperty(PropertyName = "minimumLauncherVersion")>]
    MinimumLauncherVersion : int;
    [<JsonProperty(PropertyName = "time")>]
    Time : Nullable<DateTime>;
    [<JsonProperty(PropertyName = "releaseTime")>]
    ReleaseTime : Nullable<DateTime>;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
  }

  //#endregion
