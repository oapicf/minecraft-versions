
package org.openapitools.client.model


case class V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex (
    _id: Option[String],
    _sha1: Option[String],
    _size: Option[Integer],
    _totalSize: Option[Integer],
    _url: Option[String]
)
object V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex {
    def toStringBody(var_id: Object, var_sha1: Object, var_size: Object, var_totalSize: Object, var_url: Object) =
        s"""
        | {
        | "id":$var_id,"sha1":$var_sha1,"size":$var_size,"totalSize":$var_totalSize,"url":$var_url
        | }
        """.stripMargin
}
