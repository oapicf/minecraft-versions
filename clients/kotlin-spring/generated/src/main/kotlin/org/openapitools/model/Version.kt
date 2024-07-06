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
 * @param type 
 * @param url 
 * @param time 
 * @param releaseTime 
 */
data class Version(

    @Schema(example = "24w14potato", description = "")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(example = "snapshot", description = "")
    @get:JsonProperty("type") val type: kotlin.String? = null,

    @Schema(example = "https://piston-meta.mojang.com/v1/packages/21df7f4ba484a6437ab5e9dca0b4dfb5dcefc802/24w14potato.json", description = "")
    @get:JsonProperty("url") val url: kotlin.String? = null,

    @Schema(example = "2024-04-01T11:14:41Z", description = "")
    @get:JsonProperty("time") val time: java.time.OffsetDateTime? = null,

    @Schema(example = "2024-04-01T11:07:19Z", description = "")
    @get:JsonProperty("releaseTime") val releaseTime: java.time.OffsetDateTime? = null
) {

}

