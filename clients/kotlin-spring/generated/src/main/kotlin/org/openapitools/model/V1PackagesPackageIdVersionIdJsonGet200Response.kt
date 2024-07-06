package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex
import org.openapitools.model.V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads
import org.openapitools.model.V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion
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
 * @param version 
 * @param assetIndex 
 * @param assets 
 * @param complianceLevel 
 * @param downloads 
 * @param id 
 * @param javaVersion 
 * @param mainClass 
 * @param minimumLauncherVersion 
 * @param time 
 * @param releaseTime 
 * @param type 
 */
data class V1PackagesPackageIdVersionIdJsonGet200Response(

    @Schema(example = "null", description = "")
    @get:JsonProperty("version") val version: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("assetIndex") val assetIndex: V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("assets") val assets: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("complianceLevel") val complianceLevel: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("downloads") val downloads: V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("javaVersion") val javaVersion: V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion? = null,

    @Schema(example = "net.minecraft.client.main.Main", description = "")
    @get:JsonProperty("mainClass") val mainClass: kotlin.String? = null,

    @Schema(example = "21", description = "")
    @get:JsonProperty("minimumLauncherVersion") val minimumLauncherVersion: kotlin.Int? = null,

    @Schema(example = "2024-04-01T11:14:41Z", description = "")
    @get:JsonProperty("time") val time: java.time.OffsetDateTime? = null,

    @Schema(example = "2024-04-01T11:07:19Z", description = "")
    @get:JsonProperty("releaseTime") val releaseTime: java.time.OffsetDateTime? = null,

    @Schema(example = "snapshot", description = "")
    @get:JsonProperty("type") val type: kotlin.String? = null
) {

}
