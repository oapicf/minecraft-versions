package org.openapitools.api;

import org.openapitools.model.VersionManifest;
import org.openapitools.model.VersionPackageInfo;
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
        VersionManifest body = api.getMinecraftVersionManifest().block();

        // then
        // TODO implement the getMinecraftVersionManifestTest()
    }

    
    /**
     * Get Minecraft version package info
     */
    @Test
    @Disabled("Not Implemented")
    public void getMinecraftVersionPackageInfoTest() {
        // given
        String packageId = "177e49d3233cb6eac42f0495c0a48e719870c2ae";
        String versionId = "1.21";

        // when
        VersionPackageInfo body = api.getMinecraftVersionPackageInfo(packageId, versionId).block();

        // then
        // TODO implement the getMinecraftVersionPackageInfoTest()
    }

    
}
