package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.time.ZonedDateTime
import org.openapitools.models.V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex
import org.openapitools.models.V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads
import org.openapitools.models.V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion

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
case class V1PackagesPackageIdVersionIdJsonGet200Response(version: Option[String],
                assetIndex: Option[V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex],
                assets: Option[Int],
                complianceLevel: Option[Int],
                downloads: Option[V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads],
                id: Option[String],
                javaVersion: Option[V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion],
                mainClass: Option[String],
                minimumLauncherVersion: Option[Int],
                time: Option[ZonedDateTime],
                releaseTime: Option[ZonedDateTime],
                _type: Option[String]
                )

object V1PackagesPackageIdVersionIdJsonGet200Response {
    /**
     * Creates the codec for converting V1PackagesPackageIdVersionIdJsonGet200Response from and to JSON.
     */
    implicit val decoder: Decoder[V1PackagesPackageIdVersionIdJsonGet200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[V1PackagesPackageIdVersionIdJsonGet200Response] = deriveEncoder
}
