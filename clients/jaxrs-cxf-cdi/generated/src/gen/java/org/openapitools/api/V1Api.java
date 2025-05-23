package org.openapitools.api;

import org.openapitools.model.VersionPackageInfo;
import org.openapitools.api.V1ApiService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.swagger.annotations.*;
import java.io.InputStream;

import org.apache.cxf.jaxrs.ext.PATCH;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
@Path("/v1/packages/{packageId}/{versionId}.json")
@RequestScoped

@Api(description = "the v1 API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2025-05-10T01:44:27.196850942Z[Etc/UTC]", comments = "Generator version: 7.12.0")

public class V1Api  {

  @Context SecurityContext securityContext;

  @Inject V1ApiService delegate;


    @GET
    
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Minecraft version package info", notes = "", response = VersionPackageInfo.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Get package version details", response = VersionPackageInfo.class) })
    public Response getMinecraftVersionPackageInfo(@ApiParam(value = "",required=true) @PathParam("packageId") String packageId, @ApiParam(value = "",required=true) @PathParam("versionId") String versionId) {
        return delegate.getMinecraftVersionPackageInfo(packageId, versionId, securityContext);
    }
}
