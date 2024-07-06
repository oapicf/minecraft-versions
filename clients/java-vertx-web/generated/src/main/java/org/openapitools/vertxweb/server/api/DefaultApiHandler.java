package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.McGameVersionManifestGet200Response;
import org.openapitools.vertxweb.server.model.V1PackagesPackageIdVersionIdJsonGet200Response;

import com.fasterxml.jackson.core.type.TypeReference;
import io.vertx.core.json.jackson.DatabindCodec;
import io.vertx.ext.web.openapi.RouterBuilder;
import io.vertx.ext.web.validation.RequestParameters;
import io.vertx.ext.web.validation.RequestParameter;
import io.vertx.ext.web.validation.ValidationHandler;
import io.vertx.ext.web.RoutingContext;
import io.vertx.core.json.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

public class DefaultApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(DefaultApiHandler.class);

    private final DefaultApi api;

    public DefaultApiHandler(DefaultApi api) {
        this.api = api;
    }

    @Deprecated
    public DefaultApiHandler() {
        this(new DefaultApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("mcGameVersionManifestGet").handler(this::mcGameVersionManifestGet);
        builder.operation("v1PackagesPackageIdVersionIdJsonGet").handler(this::v1PackagesPackageIdVersionIdJsonGet);
    }

    private void mcGameVersionManifestGet(RoutingContext routingContext) {
        logger.info("mcGameVersionManifestGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);



        api.mcGameVersionManifestGet()
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void v1PackagesPackageIdVersionIdJsonGet(RoutingContext routingContext) {
        logger.info("v1PackagesPackageIdVersionIdJsonGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String packageId = requestParameters.pathParameter("packageId") != null ? requestParameters.pathParameter("packageId").getString() : null;
        String versionId = requestParameters.pathParameter("versionId") != null ? requestParameters.pathParameter("versionId").getString() : null;

        logger.debug("Parameter packageId is {}", packageId);
        logger.debug("Parameter versionId is {}", versionId);

        api.v1PackagesPackageIdVersionIdJsonGet(packageId, versionId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

}
