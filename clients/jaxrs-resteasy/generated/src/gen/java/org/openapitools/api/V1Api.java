package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.V1ApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.VersionPackageInfo;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/v1/packages/{packageId}/{versionId}.json")


@io.swagger.annotations.Api(description = "the v1 API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-07-06T13:12:04.426552064Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class V1Api  {

    @Inject V1ApiService service;

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Minecraft version package info", notes = "", response = VersionPackageInfo.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Get package version details", response = VersionPackageInfo.class) })
    public Response getMinecraftVersionPackageInfo( @PathParam("packageId") String packageId, @PathParam("versionId") String versionId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getMinecraftVersionPackageInfo(packageId,versionId,securityContext);
    }
}
