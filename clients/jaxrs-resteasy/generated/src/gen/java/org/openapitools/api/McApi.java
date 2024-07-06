package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.McApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.GetMinecraftVersionManifest200Response;

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

@Path("/mc/game/version_manifest.json")


@io.swagger.annotations.Api(description = "the mc API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-07-06T08:45:08.613318098Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class McApi  {

    @Inject McApiService service;

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Minecraft version manifest", notes = "", response = GetMinecraftVersionManifest200Response.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "A list of Minecraft versions with the latest and snapshot releases", response = GetMinecraftVersionManifest200Response.class) })
    public Response getMinecraftVersionManifest(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getMinecraftVersionManifest(securityContext);
    }
}