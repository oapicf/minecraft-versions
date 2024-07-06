
package org.openapitools.client.model

import java.time.OffsetDateTime

case class V1PackagesPackageIdVersionIdJsonGet200Response (
    _version: Option[String],
    _assetIndex: Option[V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex],
    _assets: Option[Integer],
    _complianceLevel: Option[Integer],
    _downloads: Option[V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads],
    _id: Option[String],
    _javaVersion: Option[V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion],
    _mainClass: Option[String],
    _minimumLauncherVersion: Option[Integer],
    _time: Option[OffsetDateTime],
    _releaseTime: Option[OffsetDateTime],
    _type: Option[String]
)
object V1PackagesPackageIdVersionIdJsonGet200Response {
    def toStringBody(var_version: Object, var_assetIndex: Object, var_assets: Object, var_complianceLevel: Object, var_downloads: Object, var_id: Object, var_javaVersion: Object, var_mainClass: Object, var_minimumLauncherVersion: Object, var_time: Object, var_releaseTime: Object, var_type: Object) =
        s"""
        | {
        | "version":$var_version,"assetIndex":$var_assetIndex,"assets":$var_assets,"complianceLevel":$var_complianceLevel,"downloads":$var_downloads,"id":$var_id,"javaVersion":$var_javaVersion,"mainClass":$var_mainClass,"minimumLauncherVersion":$var_minimumLauncherVersion,"time":$var_time,"releaseTime":$var_releaseTime,"type":$var_type
        | }
        """.stripMargin
}
