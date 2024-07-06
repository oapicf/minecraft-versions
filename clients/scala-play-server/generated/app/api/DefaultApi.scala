package api

import play.api.libs.json._
import model.GetMinecraftVersionManifest200Response
import model.V1PackagesPackageIdVersionIdJsonGet200Response

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-07-06T08:47:35.761849206Z[Etc/UTC]", comments = "Generator version: 7.6.0")
trait DefaultApi {
  /**
    * Get Minecraft version manifest
    */
  def getMinecraftVersionManifest(): GetMinecraftVersionManifest200Response

  /**
    * Get Minecraft version package details
    */
  def v1PackagesPackageIdVersionIdJsonGet(packageId: String, versionId: String): V1PackagesPackageIdVersionIdJsonGet200Response
}
