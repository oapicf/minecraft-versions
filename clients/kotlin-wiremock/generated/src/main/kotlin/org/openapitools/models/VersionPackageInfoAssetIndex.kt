@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class VersionPackageInfoAssetIndex(
    @field:JsonProperty("id")
    val id: kotlin.String? = null,

    @field:JsonProperty("sha1")
    val sha1: kotlin.String? = null,

    @field:JsonProperty("size")
    val propertySize: kotlin.Int? = null,

    @field:JsonProperty("totalSize")
    val totalSize: kotlin.Int? = null,

    @field:JsonProperty("url")
    val url: kotlin.String? = null,

)
