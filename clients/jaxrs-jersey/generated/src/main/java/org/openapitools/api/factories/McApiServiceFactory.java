package org.openapitools.api.factories;

import org.openapitools.api.McApiService;
import org.openapitools.api.impl.McApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-08-10T06:07:36.606517266Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class McApiServiceFactory {
    private static final McApiService service = new McApiServiceImpl();

    public static McApiService getMcApi() {
        return service;
    }
}
