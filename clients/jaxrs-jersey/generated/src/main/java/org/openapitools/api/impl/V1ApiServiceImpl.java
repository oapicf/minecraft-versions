package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.VersionPackageInfo;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-07-06T13:12:01.967999178Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class V1ApiServiceImpl extends V1ApiService {
    @Override
    public Response getMinecraftVersionPackageInfo(String packageId, String versionId, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
