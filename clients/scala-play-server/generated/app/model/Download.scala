package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Download.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-15T12:30:31.558213574Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class Download(
  sha1: Option[String],
  size: Option[Int],
  url: Option[String]
)

object Download {
  implicit lazy val downloadJsonFormat: Format[Download] = Json.format[Download]
}

