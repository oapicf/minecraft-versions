package api

import play.api.libs.json._
import model.VersionManifest
import model.VersionPackageInfo

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T05:54:06.208641866Z[Etc/UTC]", comments = "Generator version: 7.9.0")
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
