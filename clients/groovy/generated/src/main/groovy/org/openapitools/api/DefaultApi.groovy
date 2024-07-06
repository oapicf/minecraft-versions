package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.GetMinecraftVersionManifest200Response
import org.openapitools.model.V1PackagesPackageIdVersionIdJsonGet200Response

class DefaultApi {
    String basePath = "https://launchermeta.mojang.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def getMinecraftVersionManifest ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/mc/game/version_manifest.json"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetMinecraftVersionManifest200Response.class )

    }

    def v1PackagesPackageIdVersionIdJsonGet ( String packageId, String versionId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/v1/packages/${packageId}/${versionId}.json"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (packageId == null) {
            throw new RuntimeException("missing required params packageId")
        }
        // verify required params are set
        if (versionId == null) {
            throw new RuntimeException("missing required params versionId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    V1PackagesPackageIdVersionIdJsonGet200Response.class )

    }

}
