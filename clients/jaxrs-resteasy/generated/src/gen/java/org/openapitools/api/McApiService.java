package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.McGameVersionManifestGet200Response;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-07-06T01:33:17.904737996Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public interface McApiService {
      Response mcGameVersionManifestGet(SecurityContext securityContext)
      throws NotFoundException;
}
