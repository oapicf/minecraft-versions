package api

import play.api.libs.json._
import model.VersionManifest
import model.VersionPackageInfo

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T01:45:35.288154528Z[Etc/UTC]", comments = "Generator version: 7.12.0")
trait DefaultApi {
  /**
    * Get Minecraft version manifest
    */
  def getMinecraftVersionManifest(): VersionManifest

  /**
    * Get Minecraft version package info
    */
  def getMinecraftVersionPackageInfo(packageId: String, versionId: String): VersionPackageInfo
}
