package org.openapitools.api

import org.openapitools.model.VersionPackageInfo
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.enums.*
import io.swagger.v3.oas.annotations.media.*
import io.swagger.v3.oas.annotations.responses.*
import io.swagger.v3.oas.annotations.security.*
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired

import javax.validation.Valid
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

import kotlin.collections.List
import kotlin.collections.Map

@RestController
@Validated
@RequestMapping("\${api.base-path:}")
class V1ApiController() {

    @Operation(
        summary = "Get Minecraft version package info",
        operationId = "getMinecraftVersionPackageInfo",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Get package version details", content = [Content(schema = Schema(implementation = VersionPackageInfo::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/v1/packages/{packageId}/{versionId}.json"],
        produces = ["application/json"]
    )
    fun getMinecraftVersionPackageInfo(@Parameter(description = "", required = true) @PathVariable("packageId") packageId: kotlin.String,@Parameter(description = "", required = true) @PathVariable("versionId") versionId: kotlin.String): ResponseEntity<VersionPackageInfo> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
