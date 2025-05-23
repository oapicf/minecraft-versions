
package org.openapitools.client.model


case class VersionManifestLatest (
    _release: Option[String],
    _snapshot: Option[String]
)
object VersionManifestLatest {
    def toStringBody(var_release: Object, var_snapshot: Object) =
        s"""
        | {
        | "release":$var_release,"snapshot":$var_snapshot
        | }
        """.stripMargin
}
