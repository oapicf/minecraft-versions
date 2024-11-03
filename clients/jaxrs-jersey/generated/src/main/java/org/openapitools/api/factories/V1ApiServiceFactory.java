package org.openapitools.api.factories;

import org.openapitools.api.V1ApiService;
import org.openapitools.api.impl.V1ApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-11-03T05:51:11.784317652Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class V1ApiServiceFactory {
    private static final V1ApiService service = new V1ApiServiceImpl();

    public static V1ApiService getV1Api() {
        return service;
    }
}
