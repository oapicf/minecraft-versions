package api

import model.VersionManifest
import model.VersionPackageInfo

/**
  * Provides a default implementation for [[DefaultApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T01:45:35.288154528Z[Etc/UTC]", comments = "Generator version: 7.12.0")
class DefaultApiImpl extends DefaultApi {
  /**
    * @inheritdoc
    */
  override def getMinecraftVersionManifest(): VersionManifest = {
    // TODO: Implement better logic

    VersionManifest(None, None)
  }

  /**
    * @inheritdoc
    */
  override def getMinecraftVersionPackageInfo(packageId: String, versionId: String): VersionPackageInfo = {
    // TODO: Implement better logic

    VersionPackageInfo(None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
