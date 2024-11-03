package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for VersionManifest.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T05:54:06.208641866Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class VersionManifest(
  latest: Option[VersionManifestLatest],
  versions: Option[List[Version]]
)

object VersionManifest {
  implicit lazy val versionManifestJsonFormat: Format[VersionManifest] = Json.format[VersionManifest]
}

