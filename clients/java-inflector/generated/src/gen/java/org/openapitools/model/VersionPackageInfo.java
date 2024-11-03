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





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-11-03T05:50:29.580421926Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class VersionPackageInfo   {
  @JsonProperty("version")
  private String version;

  @JsonProperty("assetIndex")
  private VersionPackageInfoAssetIndex assetIndex;

  @JsonProperty("assets")
  private String assets;

  @JsonProperty("complianceLevel")
  private Integer complianceLevel;

  @JsonProperty("downloads")
  private VersionPackageInfoDownloads downloads;

  @JsonProperty("id")
  private String id;

  @JsonProperty("javaVersion")
  private VersionPackageInfoJavaVersion javaVersion;

  @JsonProperty("mainClass")
  private String mainClass;

  @JsonProperty("minimumLauncherVersion")
  private Integer minimumLauncherVersion;

  @JsonProperty("time")
  private Date time;

  @JsonProperty("releaseTime")
  private Date releaseTime;

  @JsonProperty("type")
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
  public VersionPackageInfoAssetIndex getAssetIndex() {
    return assetIndex;
  }
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
  public VersionPackageInfoDownloads getDownloads() {
    return downloads;
  }
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
  public VersionPackageInfoJavaVersion getJavaVersion() {
    return javaVersion;
  }
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
    return Objects.equals(version, versionPackageInfo.version) &&
        Objects.equals(assetIndex, versionPackageInfo.assetIndex) &&
        Objects.equals(assets, versionPackageInfo.assets) &&
        Objects.equals(complianceLevel, versionPackageInfo.complianceLevel) &&
        Objects.equals(downloads, versionPackageInfo.downloads) &&
        Objects.equals(id, versionPackageInfo.id) &&
        Objects.equals(javaVersion, versionPackageInfo.javaVersion) &&
        Objects.equals(mainClass, versionPackageInfo.mainClass) &&
        Objects.equals(minimumLauncherVersion, versionPackageInfo.minimumLauncherVersion) &&
        Objects.equals(time, versionPackageInfo.time) &&
        Objects.equals(releaseTime, versionPackageInfo.releaseTime) &&
        Objects.equals(type, versionPackageInfo.type);
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

