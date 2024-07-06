package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for _v1_packages__packageId___versionId__json_get_200_response_downloads_client.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-07-06T01:37:06.044701330Z[Etc/UTC]", comments = "Generator version: 7.6.0")
case class V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient(
  sha1: Option[String],
  size: Option[Int],
  url: Option[String]
)

object V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient {
  implicit lazy val v1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClientJsonFormat: Format[V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient] = Json.format[V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient]
}

