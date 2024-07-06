package org.openapitools.api;

import org.openapitools.model.GetMinecraftVersionManifest200Response;
import org.openapitools.model.V1PackagesPackageIdVersionIdJsonGet200Response;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;

@Path("")
@Api(value = "/", description = "")
public interface DefaultApi  {

    /**
     * Get Minecraft version manifest
     *
     */
    @GET
    @Path("/mc/game/version_manifest.json")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Minecraft version manifest", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A list of Minecraft versions with the latest and snapshot releases", response = GetMinecraftVersionManifest200Response.class) })
    public GetMinecraftVersionManifest200Response getMinecraftVersionManifest();

    /**
     * Get Minecraft version package details
     *
     */
    @GET
    @Path("/v1/packages/{packageId}/{versionId}.json")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Minecraft version package details", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Get package version details", response = V1PackagesPackageIdVersionIdJsonGet200Response.class) })
    public V1PackagesPackageIdVersionIdJsonGet200Response v1PackagesPackageIdVersionIdJsonGet(@PathParam("packageId") String packageId, @PathParam("versionId") String versionId);
}
