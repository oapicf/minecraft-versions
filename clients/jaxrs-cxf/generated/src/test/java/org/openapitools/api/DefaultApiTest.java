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

import org.openapitools.model.GetMinecraftVersionManifest200Response;
import org.openapitools.model.V1PackagesPackageIdVersionIdJsonGet200Response;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;


import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




/**
 * <p>SDK for Minecraft versions info
 *
 * API tests for DefaultApi
 */
public class DefaultApiTest {


    private DefaultApi api;

    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);

        api = JAXRSClientFactory.create("https://launchermeta.mojang.com", DefaultApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);

        ClientConfiguration config = WebClient.getConfig(client);
    }

    
    /**
     * Get Minecraft version manifest
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMinecraftVersionManifestTest() {
        //GetMinecraftVersionManifest200Response response = api.getMinecraftVersionManifest();
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * Get Minecraft version package details
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1PackagesPackageIdVersionIdJsonGetTest() {
        String packageId = null;
        String versionId = null;
        //V1PackagesPackageIdVersionIdJsonGet200Response response = api.v1PackagesPackageIdVersionIdJsonGet(packageId, versionId);
        //assertNotNull(response);
        // TODO: test validations


    }
    
}
