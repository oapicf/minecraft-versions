package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for VersionPackageInfo_assetIndex.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T01:45:35.288154528Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class VersionPackageInfoAssetIndex(
  id: Option[String],
  sha1: Option[String],
  size: Option[Int],
  totalSize: Option[Int],
  url: Option[String]
)

object VersionPackageInfoAssetIndex {
  implicit lazy val versionPackageInfoAssetIndexJsonFormat: Format[VersionPackageInfoAssetIndex] = Json.format[VersionPackageInfoAssetIndex]
}

