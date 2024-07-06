package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param client 
 * @param clientMappings 
 * @param server 
 * @param serverMappings 
 */
data class V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("client") val client: V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("client_mappings") val clientMappings: V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("server") val server: V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("server_mappings") val serverMappings: V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient? = null
) {

}

