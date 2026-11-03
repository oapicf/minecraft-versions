package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for VersionPackageInfo_javaVersion.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:11:09.114711977Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class VersionPackageInfoJavaVersion(
  component: Option[String],
  majorVersion: Option[Int]
)

object VersionPackageInfoJavaVersion {
  implicit lazy val versionPackageInfoJavaVersionJsonFormat: Format[VersionPackageInfoJavaVersion] = Json.format[VersionPackageInfoJavaVersion]
}

