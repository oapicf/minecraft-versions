namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.VersionPackageInfoAssetIndex
open OpenAPI.Model.VersionPackageInfoDownloads
open OpenAPI.Model.VersionPackageInfoJavaVersion

module VersionPackageInfo =

  //#region VersionPackageInfo


  type VersionPackageInfo = {
    Version : string;
    AssetIndex : VersionPackageInfoAssetIndex;
    Assets : string;
    ComplianceLevel : int;
    Downloads : VersionPackageInfoDownloads;
    Id : string;
    JavaVersion : VersionPackageInfoJavaVersion;
    MainClass : string;
    MinimumLauncherVersion : int;
    Time : Nullable<DateTime>;
    ReleaseTime : Nullable<DateTime>;
    Type : string;
  }
  //#endregion
