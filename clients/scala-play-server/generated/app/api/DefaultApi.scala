package api

import play.api.libs.json._
import model.McGameVersionManifestGet200Response
import model.V1PackagesPackageIdVersionIdJsonGet200Response

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-07-06T01:37:06.044701330Z[Etc/UTC]", comments = "Generator version: 7.6.0")
trait DefaultApi {
  /**
    * Get Minecraft version manifest
    */
  def mcGameVersionManifestGet(): McGameVersionManifestGet200Response

  /**
    * Get Minecraft version package details
    */
  def v1PackagesPackageIdVersionIdJsonGet(packageId: String, versionId: String): V1PackagesPackageIdVersionIdJsonGet200Response
}
