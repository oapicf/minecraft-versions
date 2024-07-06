package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.McGameVersionManifestGet200Response;
import org.openapitools.server.api.model.V1PackagesPackageIdVersionIdJsonGet200Response;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface DefaultApi  {
    //GET_mc_game_version_manifest
    void mcGameVersionManifestGet(Handler<AsyncResult<McGameVersionManifestGet200Response>> handler);

    //GET_v1_packages_packageId_versionId.json
    void v1PackagesPackageIdVersionIdJsonGet(String packageId, String versionId, Handler<AsyncResult<V1PackagesPackageIdVersionIdJsonGet200Response>> handler);

}
