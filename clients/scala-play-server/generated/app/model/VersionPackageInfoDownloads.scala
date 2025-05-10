package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for VersionPackageInfo_downloads.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T01:45:35.288154528Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class VersionPackageInfoDownloads(
  client: Option[Download],
  clientMappings: Option[Download],
  server: Option[Download],
  serverMappings: Option[Download]
)

object VersionPackageInfoDownloads {
  implicit lazy val versionPackageInfoDownloadsJsonFormat: Format[VersionPackageInfoDownloads] = Json.format[VersionPackageInfoDownloads]
}

