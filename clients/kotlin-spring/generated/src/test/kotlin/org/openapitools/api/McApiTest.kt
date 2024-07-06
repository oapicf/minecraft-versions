package org.openapitools.api

import org.openapitools.model.VersionManifest
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class McApiTest {

    private val api: McApiController = McApiController()

    /**
     * To test McApiController.getMinecraftVersionManifest
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getMinecraftVersionManifestTest() {
        val response: ResponseEntity<VersionManifest> = api.getMinecraftVersionManifest()

        // TODO: test validations
    }
}
