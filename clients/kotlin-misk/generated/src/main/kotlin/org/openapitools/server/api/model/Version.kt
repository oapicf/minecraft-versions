package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Version(
    val id: kotlin.String? = null,
    val type: kotlin.String? = null,
    val url: kotlin.String? = null,
    val time: java.time.OffsetDateTime? = null,
    val releaseTime: java.time.OffsetDateTime? = null
)
