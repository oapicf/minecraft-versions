package org.openapitools.api;

import org.openapitools.model.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.McGameVersionManifestGet200Response;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/mc/game/version_manifest")


@io.swagger.annotations.Api(description = "the mc API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-07-06T01:33:22.572767133Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public interface McApi  {

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Minecraft version manifest", notes = "", response = McGameVersionManifestGet200Response.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "A list of Minecraft versions with the latest and snapshot releases", response = McGameVersionManifestGet200Response.class) })
    public Response mcGameVersionManifestGet(@Context SecurityContext securityContext);
}
