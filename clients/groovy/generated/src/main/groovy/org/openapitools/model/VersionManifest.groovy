package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.Version;
import org.openapitools.model.VersionManifestLatest;

@Canonical
class VersionManifest {
    
    VersionManifestLatest latest
    
    List<Version> versions = new ArrayList<>()
}
