package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for VersionPackageInfo_javaVersion.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T01:45:35.288154528Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class VersionPackageInfoJavaVersion(
  component: Option[String],
  majorVersion: Option[Int]
)

object VersionPackageInfoJavaVersion {
  implicit lazy val versionPackageInfoJavaVersionJsonFormat: Format[VersionPackageInfoJavaVersion] = Json.format[VersionPackageInfoJavaVersion]
}

