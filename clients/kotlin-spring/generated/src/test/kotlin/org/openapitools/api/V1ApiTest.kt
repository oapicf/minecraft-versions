package org.openapitools.api

import org.openapitools.model.V1PackagesPackageIdVersionIdJsonGet200Response
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class V1ApiTest {

    private val api: V1ApiController = V1ApiController()

    /**
     * To test V1ApiController.v1PackagesPackageIdVersionIdJsonGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun v1PackagesPackageIdVersionIdJsonGetTest() {
        val packageId: kotlin.String = TODO()
        val versionId: kotlin.String = TODO()
        val response: ResponseEntity<V1PackagesPackageIdVersionIdJsonGet200Response> = api.v1PackagesPackageIdVersionIdJsonGet(packageId, versionId)

        // TODO: test validations
    }
}
