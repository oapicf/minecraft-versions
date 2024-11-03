package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for VersionPackageInfo_downloads.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T05:54:06.208641866Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class VersionPackageInfoDownloads(
  client: Option[Download],
  clientMappings: Option[Download],
  server: Option[Download],
  serverMappings: Option[Download]
)

object VersionPackageInfoDownloads {
  implicit lazy val versionPackageInfoDownloadsJsonFormat: Format[VersionPackageInfoDownloads] = Json.format[VersionPackageInfoDownloads]
}

