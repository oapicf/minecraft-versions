package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class VersionPackageInfoJavaVersion(
    val component: kotlin.String? = null,
    val majorVersion: kotlin.Int? = null
)
