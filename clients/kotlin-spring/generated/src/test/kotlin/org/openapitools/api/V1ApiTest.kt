package org.openapitools.api

import org.openapitools.model.VersionPackageInfo
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class V1ApiTest {

    private val api: V1ApiController = V1ApiController()

    /**
     * To test V1ApiController.getMinecraftVersionPackageInfo
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getMinecraftVersionPackageInfoTest() {
        val packageId: kotlin.String = TODO()
        val versionId: kotlin.String = TODO()
        val response: ResponseEntity<VersionPackageInfo> = api.getMinecraftVersionPackageInfo(packageId, versionId)

        // TODO: test validations
    }
}
