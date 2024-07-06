package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.GetMinecraftVersionManifest200Response;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.V1PackagesPackageIdVersionIdJsonGet200Response;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface DefaultApi  {
    //getMinecraftVersionManifest
    void getMinecraftVersionManifest(Handler<AsyncResult<GetMinecraftVersionManifest200Response>> handler);

    //GET_v1_packages_packageId_versionId.json
    void v1PackagesPackageIdVersionIdJsonGet(String packageId, String versionId, Handler<AsyncResult<V1PackagesPackageIdVersionIdJsonGet200Response>> handler);

}
