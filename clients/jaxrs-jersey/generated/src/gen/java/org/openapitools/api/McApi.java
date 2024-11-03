package org.openapitools.api;

import org.openapitools.api.McApiService;
import org.openapitools.api.factories.McApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.VersionManifest;

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

@Path("/mc/game/version_manifest.json")


@io.swagger.annotations.Api(description = "the mc API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-11-03T05:51:11.784317652Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class McApi  {
   private final McApiService delegate;

   public McApi(@Context ServletConfig servletContext) {
      McApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("McApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (McApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = McApiServiceFactory.getMcApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Minecraft version manifest", notes = "", response = VersionManifest.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "A list of Minecraft versions with the latest and snapshot releases", response = VersionManifest.class)
    })
    public Response getMinecraftVersionManifest(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getMinecraftVersionManifest(securityContext);
    }
}
