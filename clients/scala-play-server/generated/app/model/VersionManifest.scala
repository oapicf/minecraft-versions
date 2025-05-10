package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for VersionManifest.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T01:45:35.288154528Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class VersionManifest(
  latest: Option[VersionManifestLatest],
  versions: Option[List[Version]]
)

object VersionManifest {
  implicit lazy val versionManifestJsonFormat: Format[VersionManifest] = Json.format[VersionManifest]
}

