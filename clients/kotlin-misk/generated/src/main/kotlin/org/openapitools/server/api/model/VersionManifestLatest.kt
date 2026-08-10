package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class VersionManifestLatest(
    val release: kotlin.String? = null,
    val snapshot: kotlin.String? = null
)
