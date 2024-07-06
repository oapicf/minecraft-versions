package api

import model.GetMinecraftVersionManifest200Response
import model.V1PackagesPackageIdVersionIdJsonGet200Response

/**
  * Provides a default implementation for [[DefaultApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-07-06T08:47:35.761849206Z[Etc/UTC]", comments = "Generator version: 7.6.0")
class DefaultApiImpl extends DefaultApi {
  /**
    * @inheritdoc
    */
  override def getMinecraftVersionManifest(): GetMinecraftVersionManifest200Response = {
    // TODO: Implement better logic

    GetMinecraftVersionManifest200Response(None, None)
  }

  /**
    * @inheritdoc
    */
  override def v1PackagesPackageIdVersionIdJsonGet(packageId: String, versionId: String): V1PackagesPackageIdVersionIdJsonGet200Response = {
    // TODO: Implement better logic

    V1PackagesPackageIdVersionIdJsonGet200Response(None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
