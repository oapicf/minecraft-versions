/**
 * OpenAPI Sample
 * SDK for Minecraft versions info
 *
 * The version of the OpenAPI document: 1.1.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 */

package org.openapitools.server.model
import java.time.OffsetDateTime

case class Version(
  id: Option[String],

  `type`: Option[String],

  url: Option[String],

  time: Option[OffsetDateTime],

  releaseTime: Option[OffsetDateTime]

 )
