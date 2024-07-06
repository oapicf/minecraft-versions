package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param sha1 
 * @param size 
 * @param url 
 */
case class V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient(sha1: Option[String],
                size: Option[Int],
                url: Option[String]
                )

object V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient {
    /**
     * Creates the codec for converting V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient from and to JSON.
     */
    implicit val decoder: Decoder[V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient] = deriveDecoder
    implicit val encoder: ObjectEncoder[V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient] = deriveEncoder
}
