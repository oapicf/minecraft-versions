package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.GetMinecraftVersionManifest200Response;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.V1PackagesPackageIdVersionIdJsonGet200Response;

public final class DefaultApiException extends MainApiException {
    public DefaultApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final DefaultApiException Default_getMinecraftVersionManifest_200_Exception = new DefaultApiException(200, "A list of Minecraft versions with the latest and snapshot releases");
    public static final DefaultApiException Default_v1PackagesPackageIdVersionIdJsonGet_200_Exception = new DefaultApiException(200, "Get package version details");
    

}