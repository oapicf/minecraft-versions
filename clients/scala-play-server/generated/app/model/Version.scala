package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for Version.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T01:45:35.288154528Z[Etc/UTC]", comments = "Generator version: 7.12.0")
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

