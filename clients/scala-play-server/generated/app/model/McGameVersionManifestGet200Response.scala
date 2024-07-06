package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for _mc_game_version_manifest_get_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-07-06T01:37:06.044701330Z[Etc/UTC]", comments = "Generator version: 7.6.0")
case class McGameVersionManifestGet200Response(
  latest: Option[McGameVersionManifestGet200ResponseLatest],
  versions: Option[List[McGameVersionManifestGet200ResponseVersionsInner]]
)

object McGameVersionManifestGet200Response {
  implicit lazy val mcGameVersionManifestGet200ResponseJsonFormat: Format[McGameVersionManifestGet200Response] = Json.format[McGameVersionManifestGet200Response]
}

