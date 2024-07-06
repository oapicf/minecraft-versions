package org.openapitools.api;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import java.util.Set;
import java.util.HashSet;

import org.openapitools.api.impl.McApiServiceImpl;
import org.openapitools.api.impl.V1ApiServiceImpl;

@ApplicationPath("")
public class RestApplication extends Application {


    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<Class<?>>();
        resources.add(McApiServiceImpl.class);
        resources.add(V1ApiServiceImpl.class);

        return resources;
    }




}