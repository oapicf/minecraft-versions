package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for _v1_packages__packageId___versionId__json_get_200_response_assetIndex.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-07-06T08:47:35.761849206Z[Etc/UTC]", comments = "Generator version: 7.6.0")
case class V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex(
  id: Option[String],
  sha1: Option[String],
  size: Option[Int],
  totalSize: Option[Int],
  url: Option[String]
)

object V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex {
  implicit lazy val v1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndexJsonFormat: Format[V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex] = Json.format[V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex]
}

