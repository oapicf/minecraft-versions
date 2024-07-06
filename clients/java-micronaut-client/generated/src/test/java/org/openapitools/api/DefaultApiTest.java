package org.openapitools.api;

import org.openapitools.model.GetMinecraftVersionManifest200Response;
import org.openapitools.model.V1PackagesPackageIdVersionIdJsonGet200Response;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

/**
 * API tests for DefaultApi
 */
@MicronautTest
public class DefaultApiTest {

    @Inject
    DefaultApi api;

    
    /**
     * Get Minecraft version manifest
     */
    @Test
    @Disabled("Not Implemented")
    public void getMinecraftVersionManifestTest() {
        // given

        // when
        GetMinecraftVersionManifest200Response body = api.getMinecraftVersionManifest().block();

        // then
        // TODO implement the getMinecraftVersionManifestTest()
    }

    
    /**
     * Get Minecraft version package details
     */
    @Test
    @Disabled("Not Implemented")
    public void v1PackagesPackageIdVersionIdJsonGetTest() {
        // given
        String packageId = "177e49d3233cb6eac42f0495c0a48e719870c2ae";
        String versionId = "1.21";

        // when
        V1PackagesPackageIdVersionIdJsonGet200Response body = api.v1PackagesPackageIdVersionIdJsonGet(packageId, versionId).block();

        // then
        // TODO implement the v1PackagesPackageIdVersionIdJsonGetTest()
    }

    
}
