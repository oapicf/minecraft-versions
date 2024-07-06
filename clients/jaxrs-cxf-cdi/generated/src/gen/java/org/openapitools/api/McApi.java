package org.openapitools.api;

import org.openapitools.model.GetMinecraftVersionManifest200Response;
import org.openapitools.api.McApiService;

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
@Path("/mc/game/version_manifest.json")
@RequestScoped

@Api(description = "the mc API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2024-07-06T08:45:03.279398503Z[Etc/UTC]", comments = "Generator version: 7.6.0")

public class McApi  {

  @Context SecurityContext securityContext;

  @Inject McApiService delegate;


    @GET
    
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Minecraft version manifest", notes = "", response = GetMinecraftVersionManifest200Response.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A list of Minecraft versions with the latest and snapshot releases", response = GetMinecraftVersionManifest200Response.class) })
    public Response getMinecraftVersionManifest() {
        return delegate.getMinecraftVersionManifest(securityContext);
    }
}
