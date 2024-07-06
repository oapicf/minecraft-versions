package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.Version
import org.openapitools.models.VersionManifestLatest
import scala.collection.immutable.Seq

/**
 * 
 * @param latest 
 * @param versions 
 */
case class VersionManifest(latest: Option[VersionManifestLatest],
                versions: Option[Seq[Version]]
                )

object VersionManifest {
    /**
     * Creates the codec for converting VersionManifest from and to JSON.
     */
    implicit val decoder: Decoder[VersionManifest] = deriveDecoder
    implicit val encoder: ObjectEncoder[VersionManifest] = deriveEncoder
}
