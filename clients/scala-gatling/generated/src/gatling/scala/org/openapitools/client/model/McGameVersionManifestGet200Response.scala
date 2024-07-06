
package org.openapitools.client.model


case class McGameVersionManifestGet200Response (
    _latest: Option[McGameVersionManifestGet200ResponseLatest],
    _versions: Option[List[McGameVersionManifestGet200ResponseVersionsInner]]
)
object McGameVersionManifestGet200Response {
    def toStringBody(var_latest: Object, var_versions: Object) =
        s"""
        | {
        | "latest":$var_latest,"versions":$var_versions
        | }
        """.stripMargin
}
