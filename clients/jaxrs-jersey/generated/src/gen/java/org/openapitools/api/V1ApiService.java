package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.VersionPackageInfo;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-07-06T13:12:01.967999178Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public abstract class V1ApiService {
    public abstract Response getMinecraftVersionPackageInfo(String packageId,String versionId,SecurityContext securityContext) throws NotFoundException;
}