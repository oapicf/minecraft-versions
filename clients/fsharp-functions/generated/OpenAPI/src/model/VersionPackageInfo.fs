namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.VersionPackageInfoAssetIndex
open OpenAPI.Model.VersionPackageInfoDownloads
open OpenAPI.Model.VersionPackageInfoJavaVersion

module VersionPackageInfo =

  //#region VersionPackageInfo

  [<CLIMutable>]
  type VersionPackageInfo = {
    [<JsonProperty(PropertyName = "version")>]
    Version : string;
    [<JsonProperty(PropertyName = "assetIndex")>]
    AssetIndex : VersionPackageInfoAssetIndex;
    [<JsonProperty(PropertyName = "assets")>]
    Assets : string;
    [<JsonProperty(PropertyName = "complianceLevel")>]
    ComplianceLevel : int;
    [<JsonProperty(PropertyName = "downloads")>]
    Downloads : VersionPackageInfoDownloads;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "javaVersion")>]
    JavaVersion : VersionPackageInfoJavaVersion;
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
