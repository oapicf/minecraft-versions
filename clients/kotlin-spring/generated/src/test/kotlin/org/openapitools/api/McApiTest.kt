package org.openapitools.api

import org.openapitools.model.McGameVersionManifestGet200Response
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class McApiTest {

    private val api: McApiController = McApiController()

    /**
     * To test McApiController.mcGameVersionManifestGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun mcGameVersionManifestGetTest() {
        val response: ResponseEntity<McGameVersionManifestGet200Response> = api.mcGameVersionManifestGet()

        // TODO: test validations
    }
}
