
package org.openapitools.client.model


case class V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient (
    _sha1: Option[String],
    _size: Option[Integer],
    _url: Option[String]
)
object V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient {
    def toStringBody(var_sha1: Object, var_size: Object, var_url: Object) =
        s"""
        | {
        | "sha1":$var_sha1,"size":$var_size,"url":$var_url
        | }
        """.stripMargin
}
