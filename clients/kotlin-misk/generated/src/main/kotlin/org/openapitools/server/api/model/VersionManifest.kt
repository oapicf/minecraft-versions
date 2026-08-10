package org.openapitools.server.api.model

import org.openapitools.server.api.model.Version
import org.openapitools.server.api.model.VersionManifestLatest
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class VersionManifest(
    val latest: VersionManifestLatest? = null,
    val versions: kotlin.collections.List<Version>? = null
)
