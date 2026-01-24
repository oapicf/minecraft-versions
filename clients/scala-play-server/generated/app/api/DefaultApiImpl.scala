package api

import model.VersionManifest
import model.VersionPackageInfo

/**
  * Provides a default implementation for [[DefaultApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-24T10:37:51.711944606Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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
