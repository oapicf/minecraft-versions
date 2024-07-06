package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Download;

@Canonical
class VersionPackageInfoDownloads {
    
    Download client
    
    Download clientMappings
    
    Download server
    
    Download serverMappings
}
