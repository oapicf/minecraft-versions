package org.openapitools.api;

import org.openapitools.model.V1PackagesPackageIdVersionIdJsonGet200Response;

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
@Path("/v1/packages/{packageId}/{versionId}.json")
@Api(description = "the v1 API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-07-06T01:33:27.601676284Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class V1Api {

    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Minecraft version package details", notes = "", response = V1PackagesPackageIdVersionIdJsonGet200Response.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Get package version details", response = V1PackagesPackageIdVersionIdJsonGet200Response.class)
    })
    public Response v1PackagesPackageIdVersionIdJsonGet(@PathParam("packageId") String packageId,@PathParam("versionId") String versionId) {
        return Response.ok().entity("magic!").build();
    }
}
