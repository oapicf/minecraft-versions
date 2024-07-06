package org.openapitools.api.factories;

import org.openapitools.api.V1ApiService;
import org.openapitools.api.impl.V1ApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-07-06T11:27:47.555730347Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class V1ApiServiceFactory {
    private static final V1ApiService service = new V1ApiServiceImpl();

    public static V1ApiService getV1Api() {
        return service;
    }
}
