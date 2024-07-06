package org.openapitools.controller;

import org.openapitools.model.McGameVersionManifestGet200Response;
import org.openapitools.model.V1PackagesPackageIdVersionIdJsonGet200Response;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MutableHttpRequest;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.uri.UriTemplate;
import io.micronaut.http.cookie.Cookie;
import io.micronaut.http.client.multipart.MultipartBody;
import io.micronaut.core.type.Argument;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Assertions;
import jakarta.inject.Inject;
import reactor.core.publisher.Mono;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;


/**
 * API tests for DefaultController
 */
@MicronautTest
public class DefaultControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    DefaultController controller;

    /**
     * This test is used to validate the implementation of mcGameVersionManifestGet() method
     *
     * The method should: Get Minecraft version manifest
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void mcGameVersionManifestGetMethodTest() {
        // given

        // when
        McGameVersionManifestGet200Response result = controller.mcGameVersionManifestGet().block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/mc/game/version_manifest' to the features of mcGameVersionManifestGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void mcGameVersionManifestGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/mc/game/version_manifest").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@5560bcdf");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, McGameVersionManifestGet200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of v1PackagesPackageIdVersionIdJsonGet() method
     *
     * The method should: Get Minecraft version package details
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void v1PackagesPackageIdVersionIdJsonGetMethodTest() {
        // given
        String packageId = "177e49d3233cb6eac42f0495c0a48e719870c2ae";
        String versionId = "1.21";

        // when
        V1PackagesPackageIdVersionIdJsonGet200Response result = controller.v1PackagesPackageIdVersionIdJsonGet(packageId, versionId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/v1/packages/{packageId}/{versionId}.json' to the features of v1PackagesPackageIdVersionIdJsonGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void v1PackagesPackageIdVersionIdJsonGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/v1/packages/{packageId}/{versionId}.json").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("packageId", "177e49d3233cb6eac42f0495c0a48e719870c2ae");
            put("versionId", "1.21");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@b558294");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, V1PackagesPackageIdVersionIdJsonGet200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
