package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Download(
    val sha1: kotlin.String? = null,
    val propertySize: kotlin.Int? = null,
    val url: kotlin.String? = null
)
