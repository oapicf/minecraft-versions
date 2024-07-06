package org.openapitools.api.factories;

import org.openapitools.api.V1ApiService;
import org.openapitools.api.impl.V1ApiServiceImpl;

public class V1ApiServiceFactory {
    private static final V1ApiService service = new V1ApiServiceImpl();

    public static V1ApiService getV1Api() {
        return service;
    }
}
