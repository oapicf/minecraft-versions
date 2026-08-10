@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class VersionPackageInfoDownloads(
    @field:JsonProperty("client")
    val client: Download? = null,

    @field:JsonProperty("client_mappings")
    val clientMappings: Download? = null,

    @field:JsonProperty("server")
    val server: Download? = null,

    @field:JsonProperty("server_mappings")
    val serverMappings: Download? = null,

)
