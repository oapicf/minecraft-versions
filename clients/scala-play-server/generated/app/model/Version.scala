package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for Version.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-10T07:20:08.480409882Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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

