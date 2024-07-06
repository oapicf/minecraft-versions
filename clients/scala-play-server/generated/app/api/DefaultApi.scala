package api

import play.api.libs.json._
import model.VersionManifest
import model.VersionPackageInfo

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-07-06T13:14:18.208034375Z[Etc/UTC]", comments = "Generator version: 7.6.0")
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
