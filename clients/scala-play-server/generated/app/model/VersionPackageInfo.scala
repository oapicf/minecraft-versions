package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for VersionPackageInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-07-06T13:14:18.208034375Z[Etc/UTC]", comments = "Generator version: 7.6.0")
case class VersionPackageInfo(
  version: Option[String],
  assetIndex: Option[VersionPackageInfoAssetIndex],
  assets: Option[String],
  complianceLevel: Option[Int],
  downloads: Option[VersionPackageInfoDownloads],
  id: Option[String],
  javaVersion: Option[VersionPackageInfoJavaVersion],
  mainClass: Option[String],
  minimumLauncherVersion: Option[Int],
  time: Option[OffsetDateTime],
  releaseTime: Option[OffsetDateTime],
  `type`: Option[String]
)

object VersionPackageInfo {
  implicit lazy val versionPackageInfoJsonFormat: Format[VersionPackageInfo] = Json.format[VersionPackageInfo]
}

