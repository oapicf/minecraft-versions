package org.openapitools.server.model

import java.time.OffsetDateTime

/**
 * @param version  for example: ''null''
 * @param assetIndex  for example: ''null''
 * @param assets  for example: ''null''
 * @param complianceLevel  for example: ''null''
 * @param downloads  for example: ''null''
 * @param id  for example: ''null''
 * @param javaVersion  for example: ''null''
 * @param mainClass  for example: ''net.minecraft.client.main.Main''
 * @param minimumLauncherVersion  for example: ''21''
 * @param time  for example: ''2024-04-01T11:14:41Z''
 * @param releaseTime  for example: ''2024-04-01T11:07:19Z''
 * @param `type`  for example: ''snapshot''
*/
final case class V1PackagesPackageIdVersionIdJsonGet200Response (
  version: Option[String] = None,
  assetIndex: Option[V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex] = None,
  assets: Option[Int] = None,
  complianceLevel: Option[Int] = None,
  downloads: Option[V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads] = None,
  id: Option[String] = None,
  javaVersion: Option[V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion] = None,
  mainClass: Option[String] = None,
  minimumLauncherVersion: Option[Int] = None,
  time: Option[OffsetDateTime] = None,
  releaseTime: Option[OffsetDateTime] = None,
  `type`: Option[String] = None
)

