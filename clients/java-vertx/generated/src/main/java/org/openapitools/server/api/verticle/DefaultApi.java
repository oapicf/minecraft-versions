package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.VersionManifest;
import org.openapitools.server.api.model.VersionPackageInfo;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface DefaultApi  {
    //getMinecraftVersionManifest
    void getMinecraftVersionManifest(Handler<AsyncResult<VersionManifest>> handler);

    //getMinecraftVersionPackageInfo
    void getMinecraftVersionPackageInfo(String packageId, String versionId, Handler<AsyncResult<VersionPackageInfo>> handler);

}
