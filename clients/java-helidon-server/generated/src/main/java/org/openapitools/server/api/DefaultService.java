package org.openapitools.server.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.openapitools.server.model.VersionManifest;
import org.openapitools.server.model.VersionPackageInfo;

import io.helidon.webserver.Routing;
import io.helidon.webserver.ServerRequest;
import io.helidon.webserver.ServerResponse;
import io.helidon.webserver.Service;

public interface DefaultService extends Service { 

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void update(Routing.Rules rules) {
        rules.get("/mc/game/version_manifest.json", this::getMinecraftVersionManifest);
        rules.get("/v1/packages/{packageId}/{versionId}.json", this::getMinecraftVersionPackageInfo);
    }


    /**
     * GET /mc/game/version_manifest.json : Get Minecraft version manifest.
     * @param request the server request
     * @param response the server response
     */
    void getMinecraftVersionManifest(ServerRequest request, ServerResponse response);

    /**
     * GET /v1/packages/{packageId}/{versionId}.json : Get Minecraft version package info.
     * @param request the server request
     * @param response the server response
     */
    void getMinecraftVersionPackageInfo(ServerRequest request, ServerResponse response);

}
