/**
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.9.0).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.mockserver.api;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import com.github.tomakehurst.wiremock.client.MappingBuilder;
import com.github.tomakehurst.wiremock.http.Fault;

public class DefaultApiMockServer {

    public static MappingBuilder stubGetMinecraftVersionManifest200(String response) {
        MappingBuilder stub = get(urlPathEqualTo("/mc/game/version_manifest.json"))
            .withHeader("Accept", havingExactly("application/json"))
            .willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "application/json")
                .withBody(response)
            );


        return stub;
    }

    public static MappingBuilder stubGetMinecraftVersionManifestFault(Fault fault) {
        MappingBuilder stub = get(urlPathEqualTo("/mc/game/version_manifest.json"))
            .withHeader("Accept", havingExactly("application/json"))
            .willReturn(aResponse()
                .withFault(fault)
            );


        return stub;
    }

    public static String getMinecraftVersionManifest200ResponseSample1() {
        return "{ \"versions\" : [ { \"releaseTime\" : \"2024-04-01T11:07:19.000Z\", \"id\" : \"24w14potato\", \"time\" : \"2024-04-01T11:14:41.000Z\", \"type\" : \"snapshot\", \"url\" : \"https://piston-meta.mojang.com/v1/packages/21df7f4ba484a6437ab5e9dca0b4dfb5dcefc802/24w14potato.json\" }, { \"releaseTime\" : \"2024-04-01T11:07:19.000Z\", \"id\" : \"24w14potato\", \"time\" : \"2024-04-01T11:14:41.000Z\", \"type\" : \"snapshot\", \"url\" : \"https://piston-meta.mojang.com/v1/packages/21df7f4ba484a6437ab5e9dca0b4dfb5dcefc802/24w14potato.json\" } ], \"latest\" : { \"release\" : 1.21, \"snapshot\" : \"24w14potato\" } }";
    }



    public static MappingBuilder stubGetMinecraftVersionPackageInfo200(@javax.annotation.Nonnull String packageId, @javax.annotation.Nonnull String versionId, String response) {
        MappingBuilder stub = get(urlPathTemplate("/v1/packages/{packageId}/{versionId}.json"))
            .withHeader("Accept", havingExactly("application/json"))
            .willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "application/json")
                .withBody(response)
            );

        stub = stub.withPathParam("packageId", equalTo(packageId));
        stub = stub.withPathParam("versionId", equalTo(versionId));

        return stub;
    }

    public static MappingBuilder stubGetMinecraftVersionPackageInfoFault(@javax.annotation.Nonnull String packageId, @javax.annotation.Nonnull String versionId, Fault fault) {
        MappingBuilder stub = get(urlPathTemplate("/v1/packages/{packageId}/{versionId}.json"))
            .withHeader("Accept", havingExactly("application/json"))
            .willReturn(aResponse()
                .withFault(fault)
            );

        stub = stub.withPathParam("packageId", equalTo(packageId));
        stub = stub.withPathParam("versionId", equalTo(versionId));

        return stub;
    }

    public static String getMinecraftVersionPackageInfo200ResponseSample1() {
        return "{ \"assets\" : \"assets\", \"releaseTime\" : \"2024-04-01T11:07:19.000Z\", \"mainClass\" : \"net.minecraft.client.main.Main\", \"downloads\" : { \"server\" : { \"sha1\" : \"sha1\", \"size\" : 5, \"url\" : \"url\" }, \"server_mappings\" : { \"sha1\" : \"sha1\", \"size\" : 5, \"url\" : \"url\" }, \"client\" : { \"sha1\" : \"sha1\", \"size\" : 5, \"url\" : \"url\" }, \"client_mappings\" : { \"sha1\" : \"sha1\", \"size\" : 5, \"url\" : \"url\" } }, \"javaVersion\" : { \"component\" : \"component\", \"majorVersion\" : 5 }, \"complianceLevel\" : 1, \"minimumLauncherVersion\" : 21, \"assetIndex\" : { \"sha1\" : \"sha1\", \"totalSize\" : 6, \"size\" : 0, \"id\" : \"id\", \"url\" : \"url\" }, \"id\" : \"id\", \"time\" : \"2024-04-01T11:14:41.000Z\", \"type\" : \"snapshot\", \"version\" : \"version\" }";
    }



}
