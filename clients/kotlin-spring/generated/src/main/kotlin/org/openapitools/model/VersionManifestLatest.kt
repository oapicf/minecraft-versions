package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * @param release 
 * @param snapshot 
 */
data class VersionManifestLatest(

    @Schema(example = "1.21", description = "")
    @get:JsonProperty("release") val release: kotlin.String? = null,

    @Schema(example = "24w14potato", description = "")
    @get:JsonProperty("snapshot") val snapshot: kotlin.String? = null
) {

}

