package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import org.openapitools.model.VersionPackageInfo;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-11-03T05:50:40.177030495Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public abstract class V1ApiService {
    public abstract Response getMinecraftVersionPackageInfo(String packageId
 ,String versionId
 ) throws NotFoundException;
}
