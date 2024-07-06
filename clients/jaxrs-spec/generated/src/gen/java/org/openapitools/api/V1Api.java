package org.openapitools.api;

import org.openapitools.model.VersionPackageInfo;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-07-06T13:12:09.534237786Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class V1Api {

    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Minecraft version package info", notes = "", response = VersionPackageInfo.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Get package version details", response = VersionPackageInfo.class)
    })
    public Response getMinecraftVersionPackageInfo(@PathParam("packageId") String packageId,@PathParam("versionId") String versionId) {
        return Response.ok().entity("magic!").build();
    }
}
