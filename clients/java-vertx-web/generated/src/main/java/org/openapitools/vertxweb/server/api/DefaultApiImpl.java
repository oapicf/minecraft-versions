package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.McGameVersionManifestGet200Response;
import org.openapitools.vertxweb.server.model.V1PackagesPackageIdVersionIdJsonGet200Response;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class DefaultApiImpl implements DefaultApi {
    public Future<ApiResponse<McGameVersionManifestGet200Response>> mcGameVersionManifestGet() {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<V1PackagesPackageIdVersionIdJsonGet200Response>> v1PackagesPackageIdVersionIdJsonGet(String packageId, String versionId) {
        return Future.failedFuture(new HttpException(501));
    }

}
