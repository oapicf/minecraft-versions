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
case class V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion(component: Option[String],
                majorVersion: Option[Int]
                )

object V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion {
    /**
     * Creates the codec for converting V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion from and to JSON.
     */
    implicit val decoder: Decoder[V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion] = deriveDecoder
    implicit val encoder: ObjectEncoder[V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion] = deriveEncoder
}
