package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import org.openapitools.model.V1PackagesPackageIdVersionIdJsonGet200Response;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-07-06T08:44:39.112883984Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public abstract class V1ApiService {
    public abstract Response v1PackagesPackageIdVersionIdJsonGet(String packageId
 ,String versionId
 ) throws NotFoundException;
}
