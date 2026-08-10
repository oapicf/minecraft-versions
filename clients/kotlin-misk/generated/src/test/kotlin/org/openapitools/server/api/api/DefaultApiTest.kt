package org.openapitools.server.api.api

import misk.testing.MiskTestModule
import jakarta.inject.Inject
import misk.testing.MiskTest
import misk.testing.MiskTestModule
import org.junit.jupiter.api.Test
import misk.web.HttpCall
import misk.web.PathParam
import misk.web.QueryParam
import misk.web.RequestBody
import misk.web.RequestHeader
import org.openapitools.server.api.model.VersionManifest
import org.openapitools.server.api.model.VersionPackageInfo

@MiskTest(startService = true)
internal class DefaultApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var defaultApi: DefaultApiAction

    /**
     * To test DefaultApiAction.getMinecraftVersionManifest
     */
    @Test
    fun `should handle getMinecraftVersionManifest`() {
        val response: VersionManifest = defaultApi.getMinecraftVersionManifest()
    }

    /**
     * To test DefaultApiAction.getMinecraftVersionPackageInfo
     */
    @Test
    fun `should handle getMinecraftVersionPackageInfo`() {
        val packageId = TODO()
        val versionId = TODO()
        val response: VersionPackageInfo = defaultApi.getMinecraftVersionPackageInfo(packageId, versionId)
    }
}
