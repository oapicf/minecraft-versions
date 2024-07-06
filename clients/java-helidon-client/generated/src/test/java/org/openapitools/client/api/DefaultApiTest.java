/**
 * 
 * SDK for Minecraft versions info
 *
 * The version of the OpenAPI document: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.model.VersionManifest;
import org.openapitools.client.model.VersionPackageInfo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import org.eclipse.microprofile.rest.client.RestClientBuilder;

import java.net.URL;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * API tests for DefaultApi
 */
public class DefaultApiTest {

    private static DefaultApi client;
    private static final String baseUrl = "http://localhost:8080";

    @BeforeAll
    public static void setup() throws MalformedURLException {
        client = RestClientBuilder.newBuilder()
                        .baseUrl(new URL(baseUrl))
                        .register(ApiException.class)
                        .build(DefaultApi.class);
    }

    
    /**
     * Get Minecraft version manifest
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMinecraftVersionManifestTest() throws Exception {
        //VersionManifest response = client.getMinecraftVersionManifest();
        //assertNotNull(response);
    }
    
    /**
     * Get Minecraft version package info
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMinecraftVersionPackageInfoTest() throws Exception {
        //VersionPackageInfo response = client.getMinecraftVersionPackageInfo(packageId, versionId);
        //assertNotNull(response);
    }
    
}
