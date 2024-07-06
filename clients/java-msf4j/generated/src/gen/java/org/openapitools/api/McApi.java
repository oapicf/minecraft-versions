package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.McApiService;
import org.openapitools.api.factories.McApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.McGameVersionManifestGet200Response;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/mc/game/version_manifest")


@io.swagger.annotations.Api(description = "the mc API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-07-06T01:32:39.711052141Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class McApi  {
   private final McApiService delegate = McApiServiceFactory.getMcApi();

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Minecraft version manifest", notes = "", response = McGameVersionManifestGet200Response.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "A list of Minecraft versions with the latest and snapshot releases", response = McGameVersionManifestGet200Response.class) })
    public Response mcGameVersionManifestGet()
    throws NotFoundException {
        return delegate.mcGameVersionManifestGet();
    }
}
