package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for VersionManifest_latest.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T05:54:06.208641866Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class VersionManifestLatest(
  release: Option[String],
  snapshot: Option[String]
)

object VersionManifestLatest {
  implicit lazy val versionManifestLatestJsonFormat: Format[VersionManifestLatest] = Json.format[VersionManifestLatest]
}

