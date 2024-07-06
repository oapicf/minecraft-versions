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
 * @param id 
 * @param sha1 
 * @param propertySize 
 * @param totalSize 
 * @param url 
 */
data class VersionPackageInfoAssetIndex(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("sha1") val sha1: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("size") val propertySize: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("totalSize") val totalSize: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("url") val url: kotlin.String? = null
) {

}

