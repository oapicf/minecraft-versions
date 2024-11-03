package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for Version.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T05:54:06.208641866Z[Etc/UTC]", comments = "Generator version: 7.9.0")
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

