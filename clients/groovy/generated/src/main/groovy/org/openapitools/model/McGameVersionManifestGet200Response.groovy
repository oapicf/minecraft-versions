package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.McGameVersionManifestGet200ResponseLatest;
import org.openapitools.model.McGameVersionManifestGet200ResponseVersionsInner;

@Canonical
class McGameVersionManifestGet200Response {
    
    McGameVersionManifestGet200ResponseLatest latest
    
    List<McGameVersionManifestGet200ResponseVersionsInner> versions = new ArrayList<>()
}
