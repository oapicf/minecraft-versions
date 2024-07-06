package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.VersionManifest;
import org.openapitools.vertxweb.server.model.VersionPackageInfo;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface DefaultApi  {
    Future<ApiResponse<VersionManifest>> getMinecraftVersionManifest();
    Future<ApiResponse<VersionPackageInfo>> getMinecraftVersionPackageInfo(String packageId, String versionId);
}
