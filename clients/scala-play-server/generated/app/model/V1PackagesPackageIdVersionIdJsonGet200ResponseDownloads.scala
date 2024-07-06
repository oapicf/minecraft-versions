package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for _v1_packages__packageId___versionId__json_get_200_response_downloads.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-07-06T08:47:35.761849206Z[Etc/UTC]", comments = "Generator version: 7.6.0")
case class V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads(
  client: Option[V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient],
  clientMappings: Option[V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient],
  server: Option[V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient],
  serverMappings: Option[V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient]
)

object V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads {
  implicit lazy val v1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsJsonFormat: Format[V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads] = Json.format[V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads]
}

