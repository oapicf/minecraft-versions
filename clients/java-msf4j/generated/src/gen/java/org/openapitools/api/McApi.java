package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.McApiService;
import org.openapitools.api.factories.McApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.VersionManifest;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/mc/game/version_manifest.json")


@io.swagger.annotations.Api(description = "the mc API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-07-06T13:11:37.755941612Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class McApi  {
   private final McApiService delegate = McApiServiceFactory.getMcApi();

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Minecraft version manifest", notes = "", response = VersionManifest.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "A list of Minecraft versions with the latest and snapshot releases", response = VersionManifest.class) })
    public Response getMinecraftVersionManifest()
    throws NotFoundException {
        return delegate.getMinecraftVersionManifest();
    }
}