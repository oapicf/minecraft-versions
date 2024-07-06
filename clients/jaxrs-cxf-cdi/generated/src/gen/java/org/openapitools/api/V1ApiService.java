package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import org.openapitools.model.V1PackagesPackageIdVersionIdJsonGet200Response;

import java.util.List;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2024-07-06T01:33:09.413682202Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public interface V1ApiService {
      public Response v1PackagesPackageIdVersionIdJsonGet(String packageId, String versionId, SecurityContext securityContext);
}
