package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.V1ApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.V1PackagesPackageIdVersionIdJsonGet200Response;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-07-06T01:33:17.904737996Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class V1Api  {

    @Inject V1ApiService service;

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Minecraft version package details", notes = "", response = V1PackagesPackageIdVersionIdJsonGet200Response.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Get package version details", response = V1PackagesPackageIdVersionIdJsonGet200Response.class) })
    public Response v1PackagesPackageIdVersionIdJsonGet( @PathParam("packageId") String packageId, @PathParam("versionId") String versionId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.v1PackagesPackageIdVersionIdJsonGet(packageId,versionId,securityContext);
    }
}
