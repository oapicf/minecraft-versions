/*
 * 
 * SDK for Minecraft versions info
 *
 * The version of the OpenAPI document: 1.1.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.model.VersionPackageInfoAssetIndex;
import org.openapitools.model.VersionPackageInfoDownloads;
import org.openapitools.model.VersionPackageInfoJavaVersion;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * VersionPackageInfo
 */
@JsonPropertyOrder({
  VersionPackageInfo.JSON_PROPERTY_VERSION,
  VersionPackageInfo.JSON_PROPERTY_ASSET_INDEX,
  VersionPackageInfo.JSON_PROPERTY_ASSETS,
  VersionPackageInfo.JSON_PROPERTY_COMPLIANCE_LEVEL,
  VersionPackageInfo.JSON_PROPERTY_DOWNLOADS,
  VersionPackageInfo.JSON_PROPERTY_ID,
  VersionPackageInfo.JSON_PROPERTY_JAVA_VERSION,
  VersionPackageInfo.JSON_PROPERTY_MAIN_CLASS,
  VersionPackageInfo.JSON_PROPERTY_MINIMUM_LAUNCHER_VERSION,
  VersionPackageInfo.JSON_PROPERTY_TIME,
  VersionPackageInfo.JSON_PROPERTY_RELEASE_TIME,
  VersionPackageInfo.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2025-05-10T01:44:28.341714206Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class VersionPackageInfo   {
  public static final String JSON_PROPERTY_VERSION = "version";
  @JsonProperty(JSON_PROPERTY_VERSION)
  private String version;

  public static final String JSON_PROPERTY_ASSET_INDEX = "assetIndex";
  @JsonProperty(JSON_PROPERTY_ASSET_INDEX)
  private VersionPackageInfoAssetIndex assetIndex;

  public static final String JSON_PROPERTY_ASSETS = "assets";
  @JsonProperty(JSON_PROPERTY_ASSETS)
  private String assets;

  public static final String JSON_PROPERTY_COMPLIANCE_LEVEL = "complianceLevel";
  @JsonProperty(JSON_PROPERTY_COMPLIANCE_LEVEL)
  private Integer complianceLevel;

  public static final String JSON_PROPERTY_DOWNLOADS = "downloads";
  @JsonProperty(JSON_PROPERTY_DOWNLOADS)
  private VersionPackageInfoDownloads downloads;

  public static final String JSON_PROPERTY_ID = "id";
  @JsonProperty(JSON_PROPERTY_ID)
  private String id;

  public static final String JSON_PROPERTY_JAVA_VERSION = "javaVersion";
  @JsonProperty(JSON_PROPERTY_JAVA_VERSION)
  private VersionPackageInfoJavaVersion javaVersion;

  public static final String JSON_PROPERTY_MAIN_CLASS = "mainClass";
  @JsonProperty(JSON_PROPERTY_MAIN_CLASS)
  private String mainClass;

  public static final String JSON_PROPERTY_MINIMUM_LAUNCHER_VERSION = "minimumLauncherVersion";
  @JsonProperty(JSON_PROPERTY_MINIMUM_LAUNCHER_VERSION)
  private Integer minimumLauncherVersion;

  public static final String JSON_PROPERTY_TIME = "time";
  @JsonProperty(JSON_PROPERTY_TIME)
  private Date time;

  public static final String JSON_PROPERTY_RELEASE_TIME = "releaseTime";
  @JsonProperty(JSON_PROPERTY_RELEASE_TIME)
  private Date releaseTime;

  public static final String JSON_PROPERTY_TYPE = "type";
  @JsonProperty(JSON_PROPERTY_TYPE)
  private String type;

  public VersionPackageInfo version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   **/
  @JsonProperty(value = "version")
  @ApiModelProperty(value = "")
  
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public VersionPackageInfo assetIndex(VersionPackageInfoAssetIndex assetIndex) {
    this.assetIndex = assetIndex;
    return this;
  }

  /**
   * Get assetIndex
   * @return assetIndex
   **/
  @JsonProperty(value = "assetIndex")
  @ApiModelProperty(value = "")
  @Valid 
  public VersionPackageInfoAssetIndex getAssetIndex() {
    return assetIndex;
  }

  public void setAssetIndex(VersionPackageInfoAssetIndex assetIndex) {
    this.assetIndex = assetIndex;
  }

  public VersionPackageInfo assets(String assets) {
    this.assets = assets;
    return this;
  }

  /**
   * Get assets
   * @return assets
   **/
  @JsonProperty(value = "assets")
  @ApiModelProperty(value = "")
  
  public String getAssets() {
    return assets;
  }

  public void setAssets(String assets) {
    this.assets = assets;
  }

  public VersionPackageInfo complianceLevel(Integer complianceLevel) {
    this.complianceLevel = complianceLevel;
    return this;
  }

  /**
   * Get complianceLevel
   * @return complianceLevel
   **/
  @JsonProperty(value = "complianceLevel")
  @ApiModelProperty(value = "")
  
  public Integer getComplianceLevel() {
    return complianceLevel;
  }

  public void setComplianceLevel(Integer complianceLevel) {
    this.complianceLevel = complianceLevel;
  }

  public VersionPackageInfo downloads(VersionPackageInfoDownloads downloads) {
    this.downloads = downloads;
    return this;
  }

  /**
   * Get downloads
   * @return downloads
   **/
  @JsonProperty(value = "downloads")
  @ApiModelProperty(value = "")
  @Valid 
  public VersionPackageInfoDownloads getDownloads() {
    return downloads;
  }

  public void setDownloads(VersionPackageInfoDownloads downloads) {
    this.downloads = downloads;
  }

  public VersionPackageInfo id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @JsonProperty(value = "id")
  @ApiModelProperty(value = "")
  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VersionPackageInfo javaVersion(VersionPackageInfoJavaVersion javaVersion) {
    this.javaVersion = javaVersion;
    return this;
  }

  /**
   * Get javaVersion
   * @return javaVersion
   **/
  @JsonProperty(value = "javaVersion")
  @ApiModelProperty(value = "")
  @Valid 
  public VersionPackageInfoJavaVersion getJavaVersion() {
    return javaVersion;
  }

  public void setJavaVersion(VersionPackageInfoJavaVersion javaVersion) {
    this.javaVersion = javaVersion;
  }

  public VersionPackageInfo mainClass(String mainClass) {
    this.mainClass = mainClass;
    return this;
  }

  /**
   * Get mainClass
   * @return mainClass
   **/
  @JsonProperty(value = "mainClass")
  @ApiModelProperty(example = "net.minecraft.client.main.Main", value = "")
  
  public String getMainClass() {
    return mainClass;
  }

  public void setMainClass(String mainClass) {
    this.mainClass = mainClass;
  }

  public VersionPackageInfo minimumLauncherVersion(Integer minimumLauncherVersion) {
    this.minimumLauncherVersion = minimumLauncherVersion;
    return this;
  }

  /**
   * Get minimumLauncherVersion
   * @return minimumLauncherVersion
   **/
  @JsonProperty(value = "minimumLauncherVersion")
  @ApiModelProperty(example = "21", value = "")
  
  public Integer getMinimumLauncherVersion() {
    return minimumLauncherVersion;
  }

  public void setMinimumLauncherVersion(Integer minimumLauncherVersion) {
    this.minimumLauncherVersion = minimumLauncherVersion;
  }

  public VersionPackageInfo time(Date time) {
    this.time = time;
    return this;
  }

  /**
   * Get time
   * @return time
   **/
  @JsonProperty(value = "time")
  @ApiModelProperty(example = "2024-04-01T11:14:41.000Z", value = "")
  
  public Date getTime() {
    return time;
  }

  public void setTime(Date time) {
    this.time = time;
  }

  public VersionPackageInfo releaseTime(Date releaseTime) {
    this.releaseTime = releaseTime;
    return this;
  }

  /**
   * Get releaseTime
   * @return releaseTime
   **/
  @JsonProperty(value = "releaseTime")
  @ApiModelProperty(example = "2024-04-01T11:07:19.000Z", value = "")
  
  public Date getReleaseTime() {
    return releaseTime;
  }

  public void setReleaseTime(Date releaseTime) {
    this.releaseTime = releaseTime;
  }

  public VersionPackageInfo type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @JsonProperty(value = "type")
  @ApiModelProperty(example = "snapshot", value = "")
  
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
    return Objects.equals(this.version, versionPackageInfo.version) &&
        Objects.equals(this.assetIndex, versionPackageInfo.assetIndex) &&
        Objects.equals(this.assets, versionPackageInfo.assets) &&
        Objects.equals(this.complianceLevel, versionPackageInfo.complianceLevel) &&
        Objects.equals(this.downloads, versionPackageInfo.downloads) &&
        Objects.equals(this.id, versionPackageInfo.id) &&
        Objects.equals(this.javaVersion, versionPackageInfo.javaVersion) &&
        Objects.equals(this.mainClass, versionPackageInfo.mainClass) &&
        Objects.equals(this.minimumLauncherVersion, versionPackageInfo.minimumLauncherVersion) &&
        Objects.equals(this.time, versionPackageInfo.time) &&
        Objects.equals(this.releaseTime, versionPackageInfo.releaseTime) &&
        Objects.equals(this.type, versionPackageInfo.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, assetIndex, assets, complianceLevel, downloads, id, javaVersion, mainClass, minimumLauncherVersion, time, releaseTime, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionPackageInfo {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    assetIndex: ").append(toIndentedString(assetIndex)).append("\n");
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
    sb.append("    complianceLevel: ").append(toIndentedString(complianceLevel)).append("\n");
    sb.append("    downloads: ").append(toIndentedString(downloads)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    javaVersion: ").append(toIndentedString(javaVersion)).append("\n");
    sb.append("    mainClass: ").append(toIndentedString(mainClass)).append("\n");
    sb.append("    minimumLauncherVersion: ").append(toIndentedString(minimumLauncherVersion)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    releaseTime: ").append(toIndentedString(releaseTime)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

