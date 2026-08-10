@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class VersionPackageInfoJavaVersion(
    @field:JsonProperty("component")
    val component: kotlin.String? = null,

    @field:JsonProperty("majorVersion")
    val majorVersion: kotlin.Int? = null,

)
