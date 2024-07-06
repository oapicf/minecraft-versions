package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for Version.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-07-06T13:14:18.208034375Z[Etc/UTC]", comments = "Generator version: 7.6.0")
case class Version(
  id: Option[String],
  `type`: Option[String],
  url: Option[String],
  time: Option[OffsetDateTime],
  releaseTime: Option[OffsetDateTime]
)

object Version {
  implicit lazy val versionJsonFormat: Format[Version] = Json.format[Version]
}

