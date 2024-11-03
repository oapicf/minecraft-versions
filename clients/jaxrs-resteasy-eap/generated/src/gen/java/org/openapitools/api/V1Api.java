package org.openapitools.api;

import org.openapitools.model.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.VersionPackageInfo;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/v1/packages/{packageId}/{versionId}.json")


@io.swagger.annotations.Api(description = "the v1 API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-11-03T05:51:18.620013524Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public interface V1Api  {

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Minecraft version package info", notes = "", response = VersionPackageInfo.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Get package version details", response = VersionPackageInfo.class) })
    public Response getMinecraftVersionPackageInfo( @PathParam("packageId") String packageId, @PathParam("versionId") String versionId,@Context SecurityContext securityContext);
}
