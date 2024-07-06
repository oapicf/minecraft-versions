package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.McGameVersionManifestGet200Response;
import org.openapitools.server.api.model.V1PackagesPackageIdVersionIdJsonGet200Response;

import java.util.List;
import java.util.Map;

public class DefaultApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(DefaultApiVerticle.class);

    static final String GET_MC_GAME_VERSION_MANIFEST_SERVICE_ID = "GET_mc_game_version_manifest";
    static final String GET_V1_PACKAGES_PACKAGEID_VERSIONID.JSON_SERVICE_ID = "GET_v1_packages_packageId_versionId.json";
    
    final DefaultApi service;

    public DefaultApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.DefaultApiImpl");
            service = (DefaultApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("DefaultApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for GET_mc_game_version_manifest
        vertx.eventBus().<JsonObject> consumer(GET_MC_GAME_VERSION_MANIFEST_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "GET_mc_game_version_manifest";
                service.mcGameVersionManifestGet(result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "GET_mc_game_version_manifest");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("GET_mc_game_version_manifest", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for GET_v1_packages_packageId_versionId.json
        vertx.eventBus().<JsonObject> consumer(GET_V1_PACKAGES_PACKAGEID_VERSIONID.JSON_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "GET_v1_packages_packageId_versionId.json";
                String packageIdParam = message.body().getString("packageId");
                if(packageIdParam == null) {
                    manageError(message, new MainApiException(400, "packageId is required"), serviceId);
                    return;
                }
                String packageId = packageIdParam;
                String versionIdParam = message.body().getString("versionId");
                if(versionIdParam == null) {
                    manageError(message, new MainApiException(400, "versionId is required"), serviceId);
                    return;
                }
                String versionId = versionIdParam;
                service.v1PackagesPackageIdVersionIdJsonGet(packageId, versionId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "GET_v1_packages_packageId_versionId.json");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("GET_v1_packages_packageId_versionId.json", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
    }

    private void manageError(Message<JsonObject> message, Throwable cause, String serviceName) {
        int code = MainApiException.INTERNAL_SERVER_ERROR.getStatusCode();
        String statusMessage = MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage();
        if (cause instanceof MainApiException) {
            code = ((MainApiException)cause).getStatusCode();
            statusMessage = ((MainApiException)cause).getStatusMessage();
        } else {
            logUnexpectedError(serviceName, cause);
        }

        message.fail(code, statusMessage);
    }

    private void logUnexpectedError(String serviceName, Throwable cause) {
        LOGGER.error("Unexpected error in "+ serviceName, cause);
    }
}
