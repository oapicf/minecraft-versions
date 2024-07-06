package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.Download

/**
 * 
 * @param client 
 * @param clientUnderscoremappings 
 * @param server 
 * @param serverUnderscoremappings 
 */
case class VersionPackageInfoDownloads(client: Option[Download],
                clientUnderscoremappings: Option[Download],
                server: Option[Download],
                serverUnderscoremappings: Option[Download]
                )

object VersionPackageInfoDownloads {
    /**
     * Creates the codec for converting VersionPackageInfoDownloads from and to JSON.
     */
    implicit val decoder: Decoder[VersionPackageInfoDownloads] = deriveDecoder
    implicit val encoder: ObjectEncoder[VersionPackageInfoDownloads] = deriveEncoder
}
