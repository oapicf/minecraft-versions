package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.V1ApiService;
import org.openapitools.api.factories.V1ApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.V1PackagesPackageIdVersionIdJsonGet200Response;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/v1/packages/{packageId}/{versionId}.json")


@io.swagger.annotations.Api(description = "the v1 API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-07-06T08:44:39.112883984Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class V1Api  {
   private final V1ApiService delegate = V1ApiServiceFactory.getV1Api();

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Minecraft version package details", notes = "", response = V1PackagesPackageIdVersionIdJsonGet200Response.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Get package version details", response = V1PackagesPackageIdVersionIdJsonGet200Response.class) })
    public Response v1PackagesPackageIdVersionIdJsonGet(@ApiParam(value = "",required=true) @PathParam("packageId") String packageId
,@ApiParam(value = "",required=true) @PathParam("versionId") String versionId
)
    throws NotFoundException {
        return delegate.v1PackagesPackageIdVersionIdJsonGet(packageId,versionId);
    }
}
