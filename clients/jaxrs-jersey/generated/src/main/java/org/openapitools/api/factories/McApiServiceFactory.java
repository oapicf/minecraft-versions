package org.openapitools.api.factories;

import org.openapitools.api.McApiService;
import org.openapitools.api.impl.McApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-11-03T05:51:11.784317652Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class McApiServiceFactory {
    private static final McApiService service = new McApiServiceImpl();

    public static McApiService getMcApi() {
        return service;
    }
}
