package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class Version {
    
    String id
    
    String type
    
    String url
    
    Date time
    
    Date releaseTime
}
