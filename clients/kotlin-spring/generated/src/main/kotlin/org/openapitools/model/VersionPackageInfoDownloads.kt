package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.Download
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
data class VersionPackageInfoDownloads(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("client") val client: Download? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("client_mappings") val clientMappings: Download? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("server") val server: Download? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("server_mappings") val serverMappings: Download? = null
) {

}

