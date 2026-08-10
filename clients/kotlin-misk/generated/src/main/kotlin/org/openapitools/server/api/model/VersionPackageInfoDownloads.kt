package org.openapitools.server.api.model

import org.openapitools.server.api.model.Download
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class VersionPackageInfoDownloads(
    val client: Download? = null,
    val clientMappings: Download? = null,
    val server: Download? = null,
    val serverMappings: Download? = null
)
