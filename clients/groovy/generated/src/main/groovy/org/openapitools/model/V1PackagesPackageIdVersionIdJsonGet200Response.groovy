package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex;
import org.openapitools.model.V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads;
import org.openapitools.model.V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion;

@Canonical
class V1PackagesPackageIdVersionIdJsonGet200Response {
    
    String version
    
    V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex assetIndex
    
    Integer assets
    
    Integer complianceLevel
    
    V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads downloads
    
    String id
    
    V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion javaVersion
    
    String mainClass
    
    Integer minimumLauncherVersion
    
    Date time
    
    Date releaseTime
    
    String type
}
