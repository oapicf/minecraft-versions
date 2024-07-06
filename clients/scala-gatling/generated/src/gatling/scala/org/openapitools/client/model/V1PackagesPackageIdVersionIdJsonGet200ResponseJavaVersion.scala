
package org.openapitools.client.model


case class V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion (
    _component: Option[String],
    _majorVersion: Option[Integer]
)
object V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion {
    def toStringBody(var_component: Object, var_majorVersion: Object) =
        s"""
        | {
        | "component":$var_component,"majorVersion":$var_majorVersion
        | }
        """.stripMargin
}
