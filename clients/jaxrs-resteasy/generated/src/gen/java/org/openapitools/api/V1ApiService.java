package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.VersionPackageInfo;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2025-05-10T01:44:29.558669995Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public interface V1ApiService {
      Response getMinecraftVersionPackageInfo(String packageId,String versionId,SecurityContext securityContext)
      throws NotFoundException;
}
