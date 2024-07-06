package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient

/**
 * 
 * @param client 
 * @param clientUnderscoremappings 
 * @param server 
 * @param serverUnderscoremappings 
 */
case class V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads(client: Option[V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient],
                clientUnderscoremappings: Option[V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient],
                server: Option[V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient],
                serverUnderscoremappings: Option[V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient]
                )

object V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads {
    /**
     * Creates the codec for converting V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads from and to JSON.
     */
    implicit val decoder: Decoder[V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads] = deriveDecoder
    implicit val encoder: ObjectEncoder[V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads] = deriveEncoder
}
