package org.openapitools.api.factories;

import org.openapitools.api.V1ApiService;
import org.openapitools.api.impl.V1ApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2025-05-10T01:44:28.341714206Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class V1ApiServiceFactory {
    private static final V1ApiService service = new V1ApiServiceImpl();

    public static V1ApiService getV1Api() {
        return service;
    }
}
