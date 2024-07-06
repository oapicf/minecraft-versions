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
case class Download(sha1: Option[String],
                size: Option[Int],
                url: Option[String]
                )

object Download {
    /**
     * Creates the codec for converting Download from and to JSON.
     */
    implicit val decoder: Decoder[Download] = deriveDecoder
    implicit val encoder: ObjectEncoder[Download] = deriveEncoder
}
