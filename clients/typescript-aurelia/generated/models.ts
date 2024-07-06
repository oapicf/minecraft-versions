/**
 * 
 * SDK for Minecraft versions info
 *
 * The version of the OpenAPI document: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


export interface GetMinecraftVersionManifest200Response {
  latest?: GetMinecraftVersionManifest200ResponseLatest;
  versions?: Array<GetMinecraftVersionManifest200ResponseVersionsInner>;
}


export interface GetMinecraftVersionManifest200ResponseLatest {
  release?: string;
  snapshot?: string;
}


export interface GetMinecraftVersionManifest200ResponseVersionsInner {
  id?: string;
  type?: string;
  url?: string;
  time?: string;
  releaseTime?: string;
}


export interface V1PackagesPackageIdVersionIdJsonGet200Response {
  version?: string;
  assetIndex?: V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex;
  assets?: number;
  complianceLevel?: number;
  downloads?: V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads;
  id?: string;
  javaVersion?: V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion;
  mainClass?: string;
  minimumLauncherVersion?: number;
  time?: string;
  releaseTime?: string;
  type?: string;
}


export interface V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex {
  id?: string;
  sha1?: string;
  size?: number;
  totalSize?: number;
  url?: string;
}


export interface V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads {
  client?: V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient;
  client_mappings?: V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient;
  server?: V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient;
  server_mappings?: V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient;
}


export interface V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient {
  sha1?: string;
  size?: number;
  url?: string;
}


export interface V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion {
  component?: string;
  majorVersion?: number;
}

