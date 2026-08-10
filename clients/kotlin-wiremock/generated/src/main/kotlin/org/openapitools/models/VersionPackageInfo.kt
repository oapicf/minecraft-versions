@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class VersionPackageInfo(
    @field:JsonProperty("version")
    val version: kotlin.String? = null,

    @field:JsonProperty("assetIndex")
    val assetIndex: VersionPackageInfoAssetIndex? = null,

    @field:JsonProperty("assets")
    val assets: kotlin.String? = null,

    @field:JsonProperty("complianceLevel")
    val complianceLevel: kotlin.Int? = null,

    @field:JsonProperty("downloads")
    val downloads: VersionPackageInfoDownloads? = null,

    @field:JsonProperty("id")
    val id: kotlin.String? = null,

    @field:JsonProperty("javaVersion")
    val javaVersion: VersionPackageInfoJavaVersion? = null,

    @field:JsonProperty("mainClass")
    val mainClass: kotlin.String? = null,

    @field:JsonProperty("minimumLauncherVersion")
    val minimumLauncherVersion: kotlin.Int? = null,

    @field:JsonProperty("time")
    val time: java.time.OffsetDateTime? = null,

    @field:JsonProperty("releaseTime")
    val releaseTime: java.time.OffsetDateTime? = null,

    @field:JsonProperty("type")
    val type: kotlin.String? = null,

)
