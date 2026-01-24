package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Download.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-24T10:37:51.711944606Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class Download(
  sha1: Option[String],
  size: Option[Int],
  url: Option[String]
)

object Download {
  implicit lazy val downloadJsonFormat: Format[Download] = Json.format[Download]
}

