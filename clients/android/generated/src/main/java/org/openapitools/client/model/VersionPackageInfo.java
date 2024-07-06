/**
 * 
 * SDK for Minecraft versions info
 *
 * The version of the OpenAPI document: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.Date;
import org.openapitools.client.model.VersionPackageInfoAssetIndex;
import org.openapitools.client.model.VersionPackageInfoDownloads;
import org.openapitools.client.model.VersionPackageInfoJavaVersion;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class VersionPackageInfo {
  
  @SerializedName("version")
  private String version = null;
  @SerializedName("assetIndex")
  private VersionPackageInfoAssetIndex assetIndex = null;
  @SerializedName("assets")
  private String assets = null;
  @SerializedName("complianceLevel")
  private Integer complianceLevel = null;
  @SerializedName("downloads")
  private VersionPackageInfoDownloads downloads = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("javaVersion")
  private VersionPackageInfoJavaVersion javaVersion = null;
  @SerializedName("mainClass")
  private String mainClass = null;
  @SerializedName("minimumLauncherVersion")
  private Integer minimumLauncherVersion = null;
  @SerializedName("time")
  private Date time = null;
  @SerializedName("releaseTime")
  private Date releaseTime = null;
  @SerializedName("type")
  private String type = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public VersionPackageInfoAssetIndex getAssetIndex() {
    return assetIndex;
  }
  public void setAssetIndex(VersionPackageInfoAssetIndex assetIndex) {
    this.assetIndex = assetIndex;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAssets() {
    return assets;
  }
  public void setAssets(String assets) {
    this.assets = assets;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getComplianceLevel() {
    return complianceLevel;
  }
  public void setComplianceLevel(Integer complianceLevel) {
    this.complianceLevel = complianceLevel;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public VersionPackageInfoDownloads getDownloads() {
    return downloads;
  }
  public void setDownloads(VersionPackageInfoDownloads downloads) {
    this.downloads = downloads;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public VersionPackageInfoJavaVersion getJavaVersion() {
    return javaVersion;
  }
  public void setJavaVersion(VersionPackageInfoJavaVersion javaVersion) {
    this.javaVersion = javaVersion;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getMainClass() {
    return mainClass;
  }
  public void setMainClass(String mainClass) {
    this.mainClass = mainClass;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getMinimumLauncherVersion() {
    return minimumLauncherVersion;
  }
  public void setMinimumLauncherVersion(Integer minimumLauncherVersion) {
    this.minimumLauncherVersion = minimumLauncherVersion;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getTime() {
    return time;
  }
  public void setTime(Date time) {
    this.time = time;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getReleaseTime() {
    return releaseTime;
  }
  public void setReleaseTime(Date releaseTime) {
    this.releaseTime = releaseTime;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionPackageInfo versionPackageInfo = (VersionPackageInfo) o;
    return (this.version == null ? versionPackageInfo.version == null : this.version.equals(versionPackageInfo.version)) &&
        (this.assetIndex == null ? versionPackageInfo.assetIndex == null : this.assetIndex.equals(versionPackageInfo.assetIndex)) &&
        (this.assets == null ? versionPackageInfo.assets == null : this.assets.equals(versionPackageInfo.assets)) &&
        (this.complianceLevel == null ? versionPackageInfo.complianceLevel == null : this.complianceLevel.equals(versionPackageInfo.complianceLevel)) &&
        (this.downloads == null ? versionPackageInfo.downloads == null : this.downloads.equals(versionPackageInfo.downloads)) &&
        (this.id == null ? versionPackageInfo.id == null : this.id.equals(versionPackageInfo.id)) &&
        (this.javaVersion == null ? versionPackageInfo.javaVersion == null : this.javaVersion.equals(versionPackageInfo.javaVersion)) &&
        (this.mainClass == null ? versionPackageInfo.mainClass == null : this.mainClass.equals(versionPackageInfo.mainClass)) &&
        (this.minimumLauncherVersion == null ? versionPackageInfo.minimumLauncherVersion == null : this.minimumLauncherVersion.equals(versionPackageInfo.minimumLauncherVersion)) &&
        (this.time == null ? versionPackageInfo.time == null : this.time.equals(versionPackageInfo.time)) &&
        (this.releaseTime == null ? versionPackageInfo.releaseTime == null : this.releaseTime.equals(versionPackageInfo.releaseTime)) &&
        (this.type == null ? versionPackageInfo.type == null : this.type.equals(versionPackageInfo.type));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.version == null ? 0: this.version.hashCode());
    result = 31 * result + (this.assetIndex == null ? 0: this.assetIndex.hashCode());
    result = 31 * result + (this.assets == null ? 0: this.assets.hashCode());
    result = 31 * result + (this.complianceLevel == null ? 0: this.complianceLevel.hashCode());
    result = 31 * result + (this.downloads == null ? 0: this.downloads.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.javaVersion == null ? 0: this.javaVersion.hashCode());
    result = 31 * result + (this.mainClass == null ? 0: this.mainClass.hashCode());
    result = 31 * result + (this.minimumLauncherVersion == null ? 0: this.minimumLauncherVersion.hashCode());
    result = 31 * result + (this.time == null ? 0: this.time.hashCode());
    result = 31 * result + (this.releaseTime == null ? 0: this.releaseTime.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionPackageInfo {\n");
    
    sb.append("  version: ").append(version).append("\n");
    sb.append("  assetIndex: ").append(assetIndex).append("\n");
    sb.append("  assets: ").append(assets).append("\n");
    sb.append("  complianceLevel: ").append(complianceLevel).append("\n");
    sb.append("  downloads: ").append(downloads).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  javaVersion: ").append(javaVersion).append("\n");
    sb.append("  mainClass: ").append(mainClass).append("\n");
    sb.append("  minimumLauncherVersion: ").append(minimumLauncherVersion).append("\n");
    sb.append("  time: ").append(time).append("\n");
    sb.append("  releaseTime: ").append(releaseTime).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
