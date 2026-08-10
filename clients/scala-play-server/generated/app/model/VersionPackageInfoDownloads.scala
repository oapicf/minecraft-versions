package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for VersionPackageInfo_downloads.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-10T07:20:08.480409882Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class VersionPackageInfoDownloads(
  client: Option[Download],
  clientMappings: Option[Download],
  server: Option[Download],
  serverMappings: Option[Download]
)

object VersionPackageInfoDownloads {
  implicit lazy val versionPackageInfoDownloadsJsonFormat: Format[VersionPackageInfoDownloads] = Json.format[VersionPackageInfoDownloads]
}

