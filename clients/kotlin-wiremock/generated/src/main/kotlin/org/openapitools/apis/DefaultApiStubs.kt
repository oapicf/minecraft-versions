@file:Suppress(
    "RemoveRedundantQualifierName",
    "UnusedImport",
    "unused",
)

package org.openapitools.apis

import com.fasterxml.jackson.databind.ObjectMapper
import com.github.tomakehurst.wiremock.client.MappingBuilder
import com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder
import com.github.tomakehurst.wiremock.client.WireMock.*
import com.github.tomakehurst.wiremock.matching.StringValuePattern
import org.openapitools.models.*

/**
 * WireMock stub request builder.
 */
open class DefaultApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation getMinecraftVersionManifest.
     *
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetMinecraftVersionManifestStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getMinecraftVersionManifest(configurer: MappingBuilder.() -> MappingBuilder = { this }): GetMinecraftVersionManifestStubBuilder =
        GetMinecraftVersionManifestStubBuilder(objectMapper, get(urlPathTemplate("/mc/game/version_manifest.json"))
            .configurer()
        )

    /**
     * Construct a stub for the operation getMinecraftVersionPackageInfo.
     *
     * @param packageId path parameter packageId pattern.
     * @param versionId path parameter versionId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetMinecraftVersionPackageInfoStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getMinecraftVersionPackageInfo(packageId: StringValuePattern, versionId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetMinecraftVersionPackageInfoStubBuilder =
        GetMinecraftVersionPackageInfoStubBuilder(objectMapper, get(urlPathTemplate("/v1/packages/{packageId}/{versionId}.json"))
            .withPathParam("packageId", packageId)
            .withPathParam("versionId", versionId)
            .configurer()
        )
}
