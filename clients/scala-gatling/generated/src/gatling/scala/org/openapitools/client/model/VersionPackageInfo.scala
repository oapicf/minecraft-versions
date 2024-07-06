
package org.openapitools.client.model

import java.time.OffsetDateTime

case class VersionPackageInfo (
    _version: Option[String],
    _assetIndex: Option[VersionPackageInfoAssetIndex],
    _assets: Option[String],
    _complianceLevel: Option[Integer],
    _downloads: Option[VersionPackageInfoDownloads],
    _id: Option[String],
    _javaVersion: Option[VersionPackageInfoJavaVersion],
    _mainClass: Option[String],
    _minimumLauncherVersion: Option[Integer],
    _time: Option[OffsetDateTime],
    _releaseTime: Option[OffsetDateTime],
    _type: Option[String]
)
object VersionPackageInfo {
    def toStringBody(var_version: Object, var_assetIndex: Object, var_assets: Object, var_complianceLevel: Object, var_downloads: Object, var_id: Object, var_javaVersion: Object, var_mainClass: Object, var_minimumLauncherVersion: Object, var_time: Object, var_releaseTime: Object, var_type: Object) =
        s"""
        | {
        | "version":$var_version,"assetIndex":$var_assetIndex,"assets":$var_assets,"complianceLevel":$var_complianceLevel,"downloads":$var_downloads,"id":$var_id,"javaVersion":$var_javaVersion,"mainClass":$var_mainClass,"minimumLauncherVersion":$var_minimumLauncherVersion,"time":$var_time,"releaseTime":$var_releaseTime,"type":$var_type
        | }
        """.stripMargin
}
