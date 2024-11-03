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
 * @param time  for example: ''2024-04-01T11:14:41.000Z''
 * @param releaseTime  for example: ''2024-04-01T11:07:19.000Z''
 * @param `type`  for example: ''snapshot''
*/
final case class VersionPackageInfo (
  version: Option[String] = None,
  assetIndex: Option[VersionPackageInfoAssetIndex] = None,
  assets: Option[String] = None,
  complianceLevel: Option[Int] = None,
  downloads: Option[VersionPackageInfoDownloads] = None,
  id: Option[String] = None,
  javaVersion: Option[VersionPackageInfoJavaVersion] = None,
  mainClass: Option[String] = None,
  minimumLauncherVersion: Option[Int] = None,
  time: Option[OffsetDateTime] = None,
  releaseTime: Option[OffsetDateTime] = None,
  `type`: Option[String] = None
)

