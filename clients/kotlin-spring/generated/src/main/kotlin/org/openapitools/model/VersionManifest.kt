package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.Version
import org.openapitools.model.VersionManifestLatest
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
 * @param latest 
 * @param versions 
 */
data class VersionManifest(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("latest") val latest: VersionManifestLatest? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("versions") val versions: kotlin.collections.List<Version>? = null
    ) {

}

