package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for _v1_packages__packageId___versionId__json_get_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-07-06T01:37:06.044701330Z[Etc/UTC]", comments = "Generator version: 7.6.0")
case class V1PackagesPackageIdVersionIdJsonGet200Response(
  version: Option[String],
  assetIndex: Option[V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex],
  assets: Option[Int],
  complianceLevel: Option[Int],
  downloads: Option[V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads],
  id: Option[String],
  javaVersion: Option[V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion],
  mainClass: Option[String],
  minimumLauncherVersion: Option[Int],
  time: Option[OffsetDateTime],
  releaseTime: Option[OffsetDateTime],
  `type`: Option[String]
)

object V1PackagesPackageIdVersionIdJsonGet200Response {
  implicit lazy val v1PackagesPackageIdVersionIdJsonGet200ResponseJsonFormat: Format[V1PackagesPackageIdVersionIdJsonGet200Response] = Json.format[V1PackagesPackageIdVersionIdJsonGet200Response]
}

