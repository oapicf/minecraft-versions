package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.model.VersionPackageInfoAssetIndex;
import org.openapitools.model.VersionPackageInfoDownloads;
import org.openapitools.model.VersionPackageInfoJavaVersion;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("VersionPackageInfo")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-03T05:51:21.494053955Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class VersionPackageInfo   {
  private String version;
  private VersionPackageInfoAssetIndex assetIndex;
  private String assets;
  private Integer complianceLevel;
  private VersionPackageInfoDownloads downloads;
  private String id;
  private VersionPackageInfoJavaVersion javaVersion;
  private String mainClass;
  private Integer minimumLauncherVersion;
  private Date time;
  private Date releaseTime;
  private String type;

  /**
   **/
  public VersionPackageInfo version(String version) {
    this.version = version;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  @JsonProperty("version")
  public void setVersion(String version) {
    this.version = version;
  }

  /**
   **/
  public VersionPackageInfo assetIndex(VersionPackageInfoAssetIndex assetIndex) {
    this.assetIndex = assetIndex;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("assetIndex")
  @Valid public VersionPackageInfoAssetIndex getAssetIndex() {
    return assetIndex;
  }

  @JsonProperty("assetIndex")
  public void setAssetIndex(VersionPackageInfoAssetIndex assetIndex) {
    this.assetIndex = assetIndex;
  }

  /**
   **/
  public VersionPackageInfo assets(String assets) {
    this.assets = assets;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("assets")
  public String getAssets() {
    return assets;
  }

  @JsonProperty("assets")
  public void setAssets(String assets) {
    this.assets = assets;
  }

  /**
   **/
  public VersionPackageInfo complianceLevel(Integer complianceLevel) {
    this.complianceLevel = complianceLevel;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("complianceLevel")
  public Integer getComplianceLevel() {
    return complianceLevel;
  }

  @JsonProperty("complianceLevel")
  public void setComplianceLevel(Integer complianceLevel) {
    this.complianceLevel = complianceLevel;
  }

  /**
   **/
  public VersionPackageInfo downloads(VersionPackageInfoDownloads downloads) {
    this.downloads = downloads;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("downloads")
  @Valid public VersionPackageInfoDownloads getDownloads() {
    return downloads;
  }

  @JsonProperty("downloads")
  public void setDownloads(VersionPackageInfoDownloads downloads) {
    this.downloads = downloads;
  }

  /**
   **/
  public VersionPackageInfo id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  public VersionPackageInfo javaVersion(VersionPackageInfoJavaVersion javaVersion) {
    this.javaVersion = javaVersion;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("javaVersion")
  @Valid public VersionPackageInfoJavaVersion getJavaVersion() {
    return javaVersion;
  }

  @JsonProperty("javaVersion")
  public void setJavaVersion(VersionPackageInfoJavaVersion javaVersion) {
    this.javaVersion = javaVersion;
  }

  /**
   **/
  public VersionPackageInfo mainClass(String mainClass) {
    this.mainClass = mainClass;
    return this;
  }

  
  @ApiModelProperty(example = "net.minecraft.client.main.Main", value = "")
  @JsonProperty("mainClass")
  public String getMainClass() {
    return mainClass;
  }

  @JsonProperty("mainClass")
  public void setMainClass(String mainClass) {
    this.mainClass = mainClass;
  }

  /**
   **/
  public VersionPackageInfo minimumLauncherVersion(Integer minimumLauncherVersion) {
    this.minimumLauncherVersion = minimumLauncherVersion;
    return this;
  }

  
  @ApiModelProperty(example = "21", value = "")
  @JsonProperty("minimumLauncherVersion")
  public Integer getMinimumLauncherVersion() {
    return minimumLauncherVersion;
  }

  @JsonProperty("minimumLauncherVersion")
  public void setMinimumLauncherVersion(Integer minimumLauncherVersion) {
    this.minimumLauncherVersion = minimumLauncherVersion;
  }

  /**
   **/
  public VersionPackageInfo time(Date time) {
    this.time = time;
    return this;
  }

  
  @ApiModelProperty(example = "2024-04-01T11:14:41.000Z", value = "")
  @JsonProperty("time")
  public Date getTime() {
    return time;
  }

  @JsonProperty("time")
  public void setTime(Date time) {
    this.time = time;
  }

  /**
   **/
  public VersionPackageInfo releaseTime(Date releaseTime) {
    this.releaseTime = releaseTime;
    return this;
  }

  
  @ApiModelProperty(example = "2024-04-01T11:07:19.000Z", value = "")
  @JsonProperty("releaseTime")
  public Date getReleaseTime() {
    return releaseTime;
  }

  @JsonProperty("releaseTime")
  public void setReleaseTime(Date releaseTime) {
    this.releaseTime = releaseTime;
  }

  /**
   **/
  public VersionPackageInfo type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(example = "snapshot", value = "")
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  @JsonProperty("type")
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

