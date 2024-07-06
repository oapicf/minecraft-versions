package org.openapitools.api.factories;

import org.openapitools.api.McApiService;
import org.openapitools.api.impl.McApiServiceImpl;

public class McApiServiceFactory {
    private static final McApiService service = new McApiServiceImpl();

    public static McApiService getMcApi() {
        return service;
    }
}
