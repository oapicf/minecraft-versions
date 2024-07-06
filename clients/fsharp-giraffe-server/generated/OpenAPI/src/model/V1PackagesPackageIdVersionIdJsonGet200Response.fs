namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex
open OpenAPI.Model.V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads
open OpenAPI.Model.V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion

module V1PackagesPackageIdVersionIdJsonGet200Response =

  //#region V1PackagesPackageIdVersionIdJsonGet200Response


  type _v1_packages__packageId___versionId__json_get_200_response = {
    Version : string;
    AssetIndex : V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex;
    Assets : int;
    ComplianceLevel : int;
    Downloads : V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads;
    Id : string;
    JavaVersion : V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion;
    MainClass : string;
    MinimumLauncherVersion : int;
    Time : Nullable<DateTime>;
    ReleaseTime : Nullable<DateTime>;
    Type : string;
  }
  //#endregion
