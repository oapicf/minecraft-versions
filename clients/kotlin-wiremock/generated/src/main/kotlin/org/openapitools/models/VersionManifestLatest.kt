@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class VersionManifestLatest(
    @field:JsonProperty("release")
    val release: kotlin.String? = null,

    @field:JsonProperty("snapshot")
    val snapshot: kotlin.String? = null,

)
