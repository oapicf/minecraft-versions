package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for _mc_game_version_manifest_get_200_response_versions_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-07-06T01:37:06.044701330Z[Etc/UTC]", comments = "Generator version: 7.6.0")
case class McGameVersionManifestGet200ResponseVersionsInner(
  id: Option[String],
  `type`: Option[String],
  url: Option[String],
  time: Option[OffsetDateTime],
  releaseTime: Option[OffsetDateTime]
)

object McGameVersionManifestGet200ResponseVersionsInner {
  implicit lazy val mcGameVersionManifestGet200ResponseVersionsInnerJsonFormat: Format[McGameVersionManifestGet200ResponseVersionsInner] = Json.format[McGameVersionManifestGet200ResponseVersionsInner]
}

