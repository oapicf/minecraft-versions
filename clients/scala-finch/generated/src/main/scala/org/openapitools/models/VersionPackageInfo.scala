package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.time.ZonedDateTime
import org.openapitools.models.VersionPackageInfoAssetIndex
import org.openapitools.models.VersionPackageInfoDownloads
import org.openapitools.models.VersionPackageInfoJavaVersion

/**
 * 
 * @param version 
 * @param assetIndex 
 * @param assets 
 * @param complianceLevel 
 * @param downloads 
 * @param id 
 * @param javaVersion 
 * @param mainClass 
 * @param minimumLauncherVersion 
 * @param time 
 * @param releaseTime 
 * @param _type 
 */
case class VersionPackageInfo(version: Option[String],
                assetIndex: Option[VersionPackageInfoAssetIndex],
                assets: Option[String],
                complianceLevel: Option[Int],
                downloads: Option[VersionPackageInfoDownloads],
                id: Option[String],
                javaVersion: Option[VersionPackageInfoJavaVersion],
                mainClass: Option[String],
                minimumLauncherVersion: Option[Int],
                time: Option[ZonedDateTime],
                releaseTime: Option[ZonedDateTime],
                _type: Option[String]
                )

object VersionPackageInfo {
    /**
     * Creates the codec for converting VersionPackageInfo from and to JSON.
     */
    implicit val decoder: Decoder[VersionPackageInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[VersionPackageInfo] = deriveEncoder
}
