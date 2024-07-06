package org.openapitools.server.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.openapitools.server.model.VersionManifest;
import org.openapitools.server.model.VersionPackageInfo;
import java.util.logging.Logger;

import io.helidon.webserver.ServerRequest;
import io.helidon.webserver.ServerResponse;

public class DefaultServiceImpl implements DefaultService {

    private static final int HTTP_CODE_NOT_IMPLEMENTED = 501;
    private static final Logger LOGGER = Logger.getLogger(DefaultService.class.getName());
    private static final ObjectMapper MAPPER = JsonProvider.objectMapper();


    public void getMinecraftVersionManifest(ServerRequest request, ServerResponse response) {
        response.status(HTTP_CODE_NOT_IMPLEMENTED).send();
    }

    public void getMinecraftVersionPackageInfo(ServerRequest request, ServerResponse response) {
        response.status(HTTP_CODE_NOT_IMPLEMENTED).send();
    }

}
