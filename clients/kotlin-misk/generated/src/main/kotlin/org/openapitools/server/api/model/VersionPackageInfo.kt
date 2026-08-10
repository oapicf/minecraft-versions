package org.openapitools.server.api.model

import org.openapitools.server.api.model.VersionPackageInfoAssetIndex
import org.openapitools.server.api.model.VersionPackageInfoDownloads
import org.openapitools.server.api.model.VersionPackageInfoJavaVersion
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class VersionPackageInfo(
    val version: kotlin.String? = null,
    val assetIndex: VersionPackageInfoAssetIndex? = null,
    val assets: kotlin.String? = null,
    val complianceLevel: kotlin.Int? = null,
    val downloads: VersionPackageInfoDownloads? = null,
    val id: kotlin.String? = null,
    val javaVersion: VersionPackageInfoJavaVersion? = null,
    val mainClass: kotlin.String? = null,
    val minimumLauncherVersion: kotlin.Int? = null,
    val time: java.time.OffsetDateTime? = null,
    val releaseTime: java.time.OffsetDateTime? = null,
    val type: kotlin.String? = null
)
