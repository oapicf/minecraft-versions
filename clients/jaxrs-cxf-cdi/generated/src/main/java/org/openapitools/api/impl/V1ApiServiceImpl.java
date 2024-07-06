package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import org.openapitools.model.V1PackagesPackageIdVersionIdJsonGet200Response;

import java.util.List;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2024-07-06T01:33:09.413682202Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class V1ApiServiceImpl implements V1ApiService {
      @Override
      public Response v1PackagesPackageIdVersionIdJsonGet(String packageId, String versionId, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
}