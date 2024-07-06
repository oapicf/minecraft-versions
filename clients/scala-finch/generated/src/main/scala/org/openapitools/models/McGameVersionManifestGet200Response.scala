package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.McGameVersionManifestGet200ResponseLatest
import org.openapitools.models.McGameVersionManifestGet200ResponseVersionsInner
import scala.collection.immutable.Seq

/**
 * 
 * @param latest 
 * @param versions 
 */
case class McGameVersionManifestGet200Response(latest: Option[McGameVersionManifestGet200ResponseLatest],
                versions: Option[Seq[McGameVersionManifestGet200ResponseVersionsInner]]
                )

object McGameVersionManifestGet200Response {
    /**
     * Creates the codec for converting McGameVersionManifestGet200Response from and to JSON.
     */
    implicit val decoder: Decoder[McGameVersionManifestGet200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[McGameVersionManifestGet200Response] = deriveEncoder
}
