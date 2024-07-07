package org.openapitools.model;

import java.util.Date;
import org.openapitools.model.VersionPackageInfoAssetIndex;
import org.openapitools.model.VersionPackageInfoDownloads;
import org.openapitools.model.VersionPackageInfoJavaVersion;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class VersionPackageInfo  {
  
  @ApiModelProperty(value = "")
  private String version;

  @ApiModelProperty(value = "")
  @Valid
  private VersionPackageInfoAssetIndex assetIndex;

  @ApiModelProperty(value = "")
  private String assets;

  @ApiModelProperty(value = "")
  private Integer complianceLevel;

  @ApiModelProperty(value = "")
  @Valid
  private VersionPackageInfoDownloads downloads;

  @ApiModelProperty(value = "")
  private String id;

  @ApiModelProperty(value = "")
  @Valid
  private VersionPackageInfoJavaVersion javaVersion;

  @ApiModelProperty(example = "net.minecraft.client.main.Main", value = "")
  private String mainClass;

  @ApiModelProperty(example = "21", value = "")
  private Integer minimumLauncherVersion;

  @ApiModelProperty(example = "2024-04-01T11:14:41Z", value = "")
  private Date time;

  @ApiModelProperty(example = "2024-04-01T11:07:19Z", value = "")
  private Date releaseTime;

  @ApiModelProperty(example = "snapshot", value = "")
  private String type;
 /**
   * Get version
   * @return version
  **/
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public VersionPackageInfo version(String version) {
    this.version = version;
    return this;
  }

 /**
   * Get assetIndex
   * @return assetIndex
  **/
  @JsonProperty("assetIndex")
  public VersionPackageInfoAssetIndex getAssetIndex() {
    return assetIndex;
  }

  public void setAssetIndex(VersionPackageInfoAssetIndex assetIndex) {
    this.assetIndex = assetIndex;
  }

  public VersionPackageInfo assetIndex(VersionPackageInfoAssetIndex assetIndex) {
    this.assetIndex = assetIndex;
    return this;
  }

 /**
   * Get assets
   * @return assets
  **/
  @JsonProperty("assets")
  public String getAssets() {
    return assets;
  }

  public void setAssets(String assets) {
    this.assets = assets;
  }

  public VersionPackageInfo assets(String assets) {
    this.assets = assets;
    return this;
  }

 /**
   * Get complianceLevel
   * @return complianceLevel
  **/
  @JsonProperty("complianceLevel")
  public Integer getComplianceLevel() {
    return complianceLevel;
  }

  public void setComplianceLevel(Integer complianceLevel) {
    this.complianceLevel = complianceLevel;
  }

  public VersionPackageInfo complianceLevel(Integer complianceLevel) {
    this.complianceLevel = complianceLevel;
    return this;
  }

 /**
   * Get downloads
   * @return downloads
  **/
  @JsonProperty("downloads")
  public VersionPackageInfoDownloads getDownloads() {
    return downloads;
  }

  public void setDownloads(VersionPackageInfoDownloads downloads) {
    this.downloads = downloads;
  }

  public VersionPackageInfo downloads(VersionPackageInfoDownloads downloads) {
    this.downloads = downloads;
    return this;
  }

 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VersionPackageInfo id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get javaVersion
   * @return javaVersion
  **/
  @JsonProperty("javaVersion")
  public VersionPackageInfoJavaVersion getJavaVersion() {
    return javaVersion;
  }

  public void setJavaVersion(VersionPackageInfoJavaVersion javaVersion) {
    this.javaVersion = javaVersion;
  }

  public VersionPackageInfo javaVersion(VersionPackageInfoJavaVersion javaVersion) {
    this.javaVersion = javaVersion;
    return this;
  }

 /**
   * Get mainClass
   * @return mainClass
  **/
  @JsonProperty("mainClass")
  public String getMainClass() {
    return mainClass;
  }

  public void setMainClass(String mainClass) {
    this.mainClass = mainClass;
  }

  public VersionPackageInfo mainClass(String mainClass) {
    this.mainClass = mainClass;
    return this;
  }

 /**
   * Get minimumLauncherVersion
   * @return minimumLauncherVersion
  **/
  @JsonProperty("minimumLauncherVersion")
  public Integer getMinimumLauncherVersion() {
    return minimumLauncherVersion;
  }

  public void setMinimumLauncherVersion(Integer minimumLauncherVersion) {
    this.minimumLauncherVersion = minimumLauncherVersion;
  }

  public VersionPackageInfo minimumLauncherVersion(Integer minimumLauncherVersion) {
    this.minimumLauncherVersion = minimumLauncherVersion;
    return this;
  }

 /**
   * Get time
   * @return time
  **/
  @JsonProperty("time")
  public Date getTime() {
    return time;
  }

  public void setTime(Date time) {
    this.time = time;
  }

  public VersionPackageInfo time(Date time) {
    this.time = time;
    return this;
  }

 /**
   * Get releaseTime
   * @return releaseTime
  **/
  @JsonProperty("releaseTime")
  public Date getReleaseTime() {
    return releaseTime;
  }

  public void setReleaseTime(Date releaseTime) {
    this.releaseTime = releaseTime;
  }

  public VersionPackageInfo releaseTime(Date releaseTime) {
    this.releaseTime = releaseTime;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public VersionPackageInfo type(String type) {
    this.type = type;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
