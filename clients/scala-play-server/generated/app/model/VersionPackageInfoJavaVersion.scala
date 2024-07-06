package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for VersionPackageInfo_javaVersion.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-07-06T13:14:18.208034375Z[Etc/UTC]", comments = "Generator version: 7.6.0")
case class VersionPackageInfoJavaVersion(
  component: Option[String],
  majorVersion: Option[Int]
)

object VersionPackageInfoJavaVersion {
  implicit lazy val versionPackageInfoJavaVersionJsonFormat: Format[VersionPackageInfoJavaVersion] = Json.format[VersionPackageInfoJavaVersion]
}

