
package org.openapitools.client.model


case class VersionPackageInfoJavaVersion (
    _component: Option[String],
    _majorVersion: Option[Integer]
)
object VersionPackageInfoJavaVersion {
    def toStringBody(var_component: Object, var_majorVersion: Object) =
        s"""
        | {
        | "component":$var_component,"majorVersion":$var_majorVersion
        | }
        """.stripMargin
}
