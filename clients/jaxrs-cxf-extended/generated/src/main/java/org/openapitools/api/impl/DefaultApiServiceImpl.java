package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.GetMinecraftVersionManifest200Response;
import org.openapitools.model.V1PackagesPackageIdVersionIdJsonGet200Response;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

public class DefaultApiServiceImpl implements DefaultApi {
    /**
     * Get Minecraft version manifest
     *
     */
    @Override
    public GetMinecraftVersionManifest200Response getMinecraftVersionManifest() {
        // TODO: Implement...
        return null;
    }

    /**
     * Get Minecraft version package details
     *
     */
    @Override
    public V1PackagesPackageIdVersionIdJsonGet200Response v1PackagesPackageIdVersionIdJsonGet(String packageId, String versionId) {
        // TODO: Implement...
        return null;
    }

}
