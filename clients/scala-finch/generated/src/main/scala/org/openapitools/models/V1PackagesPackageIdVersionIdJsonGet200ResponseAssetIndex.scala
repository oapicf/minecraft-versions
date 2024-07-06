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
case class V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex(id: Option[String],
                sha1: Option[String],
                size: Option[Int],
                totalSize: Option[Int],
                url: Option[String]
                )

object V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex {
    /**
     * Creates the codec for converting V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex from and to JSON.
     */
    implicit val decoder: Decoder[V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex] = deriveDecoder
    implicit val encoder: ObjectEncoder[V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex] = deriveEncoder
}
