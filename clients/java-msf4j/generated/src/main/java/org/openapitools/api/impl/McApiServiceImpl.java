package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.openapitools.model.VersionManifest;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2025-05-10T01:44:16.356714070Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class McApiServiceImpl extends McApiService {
    @Override
    public Response getMinecraftVersionManifest() throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
