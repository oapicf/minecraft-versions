package org.openapitools.api.factories;

import org.openapitools.api.McApiService;
import org.openapitools.api.impl.McApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2025-05-10T01:44:28.341714206Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class McApiServiceFactory {
    private static final McApiService service = new McApiServiceImpl();

    public static McApiService getMcApi() {
        return service;
    }
}
