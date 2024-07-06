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
case class McGameVersionManifestGet200ResponseLatest(release: Option[String],
                snapshot: Option[String]
                )

object McGameVersionManifestGet200ResponseLatest {
    /**
     * Creates the codec for converting McGameVersionManifestGet200ResponseLatest from and to JSON.
     */
    implicit val decoder: Decoder[McGameVersionManifestGet200ResponseLatest] = deriveDecoder
    implicit val encoder: ObjectEncoder[McGameVersionManifestGet200ResponseLatest] = deriveEncoder
}
