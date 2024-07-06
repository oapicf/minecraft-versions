package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.time.ZonedDateTime

/**
 * 
 * @param id 
 * @param _type 
 * @param url 
 * @param time 
 * @param releaseTime 
 */
case class McGameVersionManifestGet200ResponseVersionsInner(id: Option[String],
                _type: Option[String],
                url: Option[String],
                time: Option[ZonedDateTime],
                releaseTime: Option[ZonedDateTime]
                )

object McGameVersionManifestGet200ResponseVersionsInner {
    /**
     * Creates the codec for converting McGameVersionManifestGet200ResponseVersionsInner from and to JSON.
     */
    implicit val decoder: Decoder[McGameVersionManifestGet200ResponseVersionsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[McGameVersionManifestGet200ResponseVersionsInner] = deriveEncoder
}
