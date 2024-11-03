package org.openapitools.api;

import org.openapitools.api.V1ApiService;
import org.openapitools.api.factories.V1ApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.VersionPackageInfo;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/v1/packages/{packageId}/{versionId}.json")


@io.swagger.annotations.Api(description = "the v1 API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-11-03T05:51:11.784317652Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class V1Api  {
   private final V1ApiService delegate;

   public V1Api(@Context ServletConfig servletContext) {
      V1ApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("V1Api.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (V1ApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = V1ApiServiceFactory.getV1Api();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Minecraft version package info", notes = "", response = VersionPackageInfo.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Get package version details", response = VersionPackageInfo.class)
    })
    public Response getMinecraftVersionPackageInfo(@ApiParam(value = "", required = true) @PathParam("packageId") @NotNull  String packageId,@ApiParam(value = "", required = true) @PathParam("versionId") @NotNull  String versionId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getMinecraftVersionPackageInfo(packageId, versionId, securityContext);
    }
}
