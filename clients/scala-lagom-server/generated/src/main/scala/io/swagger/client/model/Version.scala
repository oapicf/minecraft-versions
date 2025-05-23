/**
 * 
 * SDK for Minecraft versions info
 *
 * The version of the OpenAPI document: 1.1.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.swagger.client.model
import play.api.libs.json._
import java.time.OffsetDateTime

case class Version (
                  id: Option[String],
                  `type`: Option[String],
                  url: Option[String],
                  time: Option[OffsetDateTime],
                  releaseTime: Option[OffsetDateTime]
)

object Version {
implicit val format: Format[Version] = Json.format
}

