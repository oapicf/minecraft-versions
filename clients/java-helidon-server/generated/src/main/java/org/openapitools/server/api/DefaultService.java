package org.openapitools.server.api;

import org.openapitools.server.model.McGameVersionManifestGet200Response;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.openapitools.server.model.V1PackagesPackageIdVersionIdJsonGet200Response;

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
        rules.get("/mc/game/version_manifest", this::mcGameVersionManifestGet);
        rules.get("/v1/packages/{packageId}/{versionId}.json", this::v1PackagesPackageIdVersionIdJsonGet);
    }


    /**
     * GET /mc/game/version_manifest : Get Minecraft version manifest.
     * @param request the server request
     * @param response the server response
     */
    void mcGameVersionManifestGet(ServerRequest request, ServerResponse response);

    /**
     * GET /v1/packages/{packageId}/{versionId}.json : Get Minecraft version package details.
     * @param request the server request
     * @param response the server response
     */
    void v1PackagesPackageIdVersionIdJsonGet(ServerRequest request, ServerResponse response);

}
