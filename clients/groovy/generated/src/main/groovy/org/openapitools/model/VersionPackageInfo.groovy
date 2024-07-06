package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.VersionPackageInfoAssetIndex;
import org.openapitools.model.VersionPackageInfoDownloads;
import org.openapitools.model.VersionPackageInfoJavaVersion;

@Canonical
class VersionPackageInfo {
    
    String version
    
    VersionPackageInfoAssetIndex assetIndex
    
    String assets
    
    Integer complianceLevel
    
    VersionPackageInfoDownloads downloads
    
    String id
    
    VersionPackageInfoJavaVersion javaVersion
    
    String mainClass
    
    Integer minimumLauncherVersion
    
    Date time
    
    Date releaseTime
    
    String type
}
