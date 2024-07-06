package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.GetMinecraftVersionManifest200Response;
import org.openapitools.vertxweb.server.model.V1PackagesPackageIdVersionIdJsonGet200Response;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface DefaultApi  {
    Future<ApiResponse<GetMinecraftVersionManifest200Response>> getMinecraftVersionManifest();
    Future<ApiResponse<V1PackagesPackageIdVersionIdJsonGet200Response>> v1PackagesPackageIdVersionIdJsonGet(String packageId, String versionId);
}
