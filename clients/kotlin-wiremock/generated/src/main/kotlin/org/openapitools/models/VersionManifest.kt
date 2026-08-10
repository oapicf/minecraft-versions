@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class VersionManifest(
    @field:JsonProperty("latest")
    val latest: VersionManifestLatest? = null,

    @field:JsonProperty("versions")
    val versions: kotlin.collections.List<Version>? = null,

)
