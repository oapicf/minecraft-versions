package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param component 
 * @param majorVersion 
 */
case class VersionPackageInfoJavaVersion(component: Option[String],
                majorVersion: Option[Int]
                )

object VersionPackageInfoJavaVersion {
    /**
     * Creates the codec for converting VersionPackageInfoJavaVersion from and to JSON.
     */
    implicit val decoder: Decoder[VersionPackageInfoJavaVersion] = deriveDecoder
    implicit val encoder: ObjectEncoder[VersionPackageInfoJavaVersion] = deriveEncoder
}
