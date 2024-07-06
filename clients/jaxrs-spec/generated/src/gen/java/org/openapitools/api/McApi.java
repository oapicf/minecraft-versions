package org.openapitools.api;

import org.openapitools.model.McGameVersionManifestGet200Response;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
* Represents a collection of functions to interact with the API endpoints.
*/
@Path("/mc/game/version_manifest")
@Api(description = "the mc API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-07-06T01:33:27.601676284Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class McApi {

    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Minecraft version manifest", notes = "", response = McGameVersionManifestGet200Response.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A list of Minecraft versions with the latest and snapshot releases", response = McGameVersionManifestGet200Response.class)
    })
    public Response mcGameVersionManifestGet() {
        return Response.ok().entity("magic!").build();
    }
}
