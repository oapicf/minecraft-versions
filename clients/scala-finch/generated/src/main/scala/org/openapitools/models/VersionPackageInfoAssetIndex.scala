package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param id 
 * @param sha1 
 * @param size 
 * @param totalSize 
 * @param url 
 */
case class VersionPackageInfoAssetIndex(id: Option[String],
                sha1: Option[String],
                size: Option[Int],
                totalSize: Option[Int],
                url: Option[String]
                )

object VersionPackageInfoAssetIndex {
    /**
     * Creates the codec for converting VersionPackageInfoAssetIndex from and to JSON.
     */
    implicit val decoder: Decoder[VersionPackageInfoAssetIndex] = deriveDecoder
    implicit val encoder: ObjectEncoder[VersionPackageInfoAssetIndex] = deriveEncoder
}
