package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for VersionManifest.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-24T10:37:51.711944606Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class VersionManifest(
  latest: Option[VersionManifestLatest],
  versions: Option[List[Version]]
)

object VersionManifest {
  implicit lazy val versionManifestJsonFormat: Format[VersionManifest] = Json.format[VersionManifest]
}

