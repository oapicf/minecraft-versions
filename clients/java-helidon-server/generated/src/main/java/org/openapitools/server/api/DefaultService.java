package org.openapitools.server.api;

import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.helidon.http.Status;
import org.openapitools.server.model.VersionManifest;
import org.openapitools.server.model.VersionPackageInfo;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Default'",
                             version = "7.12.0")
public interface DefaultService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.get("/mc/game/version_manifest.json", this::getMinecraftVersionManifest);
        rules.get("/v1/packages/{packageId}/{versionId}.json", this::getMinecraftVersionPackageInfo);
    }


    /**
     * GET /mc/game/version_manifest.json : Get Minecraft version manifest.
     *
     * @param request the server request
     * @param response the server response
     */
    void getMinecraftVersionManifest(ServerRequest request, ServerResponse response);
    /**
     * GET /v1/packages/{packageId}/{versionId}.json : Get Minecraft version package info.
     *
     * @param request the server request
     * @param response the server response
     */
    void getMinecraftVersionPackageInfo(ServerRequest request, ServerResponse response);
}
