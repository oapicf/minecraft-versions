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


package org.openapitools.api;

import org.openapitools.model.VersionManifest;
import org.openapitools.model.VersionPackageInfo;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;


import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.fasterxml.jackson.jaxrs.xml.JacksonXMLProvider;
import org.apache.cxf.jaxrs.provider.MultipartProvider;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * <p>SDK for Minecraft versions info
 *
 * API tests for DefaultApi.
 */
public class DefaultApiTest {

    private DefaultApi api;

    @Before
    public void setup() {
        List<?> providers = Arrays.asList(new JacksonJsonProvider(), new JacksonXMLProvider(), new MultipartProvider());

        api = JAXRSClientFactory.create("https://launchermeta.mojang.com", DefaultApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);

        ClientConfiguration config = WebClient.getConfig(client);
    }

    
    /**
     * Get Minecraft version manifest
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void getMinecraftVersionManifestTest() throws Exception {

        // TODO: delete this line and uncomment the next
        // VersionManifest response = api.getMinecraftVersionManifest();
        // TODO: complete test assertions
    }
    
    /**
     * Get Minecraft version package info
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void getMinecraftVersionPackageInfoTest() throws Exception {
        // TODO: assign appropriate parameter values
        String packageId = null;
        String versionId = null;

        // TODO: delete this line and uncomment the next
        // VersionPackageInfo response = api.getMinecraftVersionPackageInfo(packageId, versionId);
        // TODO: complete test assertions
    }
    
}
