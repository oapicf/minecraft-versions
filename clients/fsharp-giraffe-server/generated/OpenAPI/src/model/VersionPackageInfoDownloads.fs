namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Download

module VersionPackageInfoDownloads =

  //#region VersionPackageInfoDownloads


  type VersionPackageInfo_downloads = {
    Client : Download;
    ClientMappings : Download;
    Server : Download;
    ServerMappings : Download;
  }
  //#endregion
