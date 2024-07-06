package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.VersionManifest;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-07-06T11:27:50.178088934Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public interface McApiService {
      Response getMinecraftVersionManifest(SecurityContext securityContext)
      throws NotFoundException;
}
