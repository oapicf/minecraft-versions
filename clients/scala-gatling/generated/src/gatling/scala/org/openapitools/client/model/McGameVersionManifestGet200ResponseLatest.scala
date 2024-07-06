
package org.openapitools.client.model


case class McGameVersionManifestGet200ResponseLatest (
    _release: Option[String],
    _snapshot: Option[String]
)
object McGameVersionManifestGet200ResponseLatest {
    def toStringBody(var_release: Object, var_snapshot: Object) =
        s"""
        | {
        | "release":$var_release,"snapshot":$var_snapshot
        | }
        """.stripMargin
}
