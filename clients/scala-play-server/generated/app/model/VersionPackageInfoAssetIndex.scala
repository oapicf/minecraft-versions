package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for VersionPackageInfo_assetIndex.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-24T10:37:51.711944606Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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

