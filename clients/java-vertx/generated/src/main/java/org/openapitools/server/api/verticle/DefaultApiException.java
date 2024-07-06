package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.VersionManifest;
import org.openapitools.server.api.model.VersionPackageInfo;

public final class DefaultApiException extends MainApiException {
    public DefaultApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final DefaultApiException Default_getMinecraftVersionManifest_200_Exception = new DefaultApiException(200, "A list of Minecraft versions with the latest and snapshot releases");
    public static final DefaultApiException Default_getMinecraftVersionPackageInfo_200_Exception = new DefaultApiException(200, "Get package version details");
    

}