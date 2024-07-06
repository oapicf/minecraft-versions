package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for _mc_game_version_manifest_get_200_response_latest.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-07-06T01:37:06.044701330Z[Etc/UTC]", comments = "Generator version: 7.6.0")
case class McGameVersionManifestGet200ResponseLatest(
  release: Option[String],
  snapshot: Option[String]
)

object McGameVersionManifestGet200ResponseLatest {
  implicit lazy val mcGameVersionManifestGet200ResponseLatestJsonFormat: Format[McGameVersionManifestGet200ResponseLatest] = Json.format[McGameVersionManifestGet200ResponseLatest]
}

