package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param release 
 * @param snapshot 
 */
case class VersionManifestLatest(release: Option[String],
                snapshot: Option[String]
                )

object VersionManifestLatest {
    /**
     * Creates the codec for converting VersionManifestLatest from and to JSON.
     */
    implicit val decoder: Decoder[VersionManifestLatest] = deriveDecoder
    implicit val encoder: ObjectEncoder[VersionManifestLatest] = deriveEncoder
}
