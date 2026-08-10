package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for VersionPackageInfo_javaVersion.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-10T07:20:08.480409882Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class VersionPackageInfoJavaVersion(
  component: Option[String],
  majorVersion: Option[Int]
)

object VersionPackageInfoJavaVersion {
  implicit lazy val versionPackageInfoJavaVersionJsonFormat: Format[VersionPackageInfoJavaVersion] = Json.format[VersionPackageInfoJavaVersion]
}

