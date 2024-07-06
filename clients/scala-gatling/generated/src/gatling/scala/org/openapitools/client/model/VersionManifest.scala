
package org.openapitools.client.model


case class VersionManifest (
    _latest: Option[VersionManifestLatest],
    _versions: Option[List[Version]]
)
object VersionManifest {
    def toStringBody(var_latest: Object, var_versions: Object) =
        s"""
        | {
        | "latest":$var_latest,"versions":$var_versions
        | }
        """.stripMargin
}
