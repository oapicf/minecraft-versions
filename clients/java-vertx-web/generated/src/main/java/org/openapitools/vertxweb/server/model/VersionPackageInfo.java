package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import org.openapitools.vertxweb.server.model.VersionPackageInfoAssetIndex;
import org.openapitools.vertxweb.server.model.VersionPackageInfoDownloads;
import org.openapitools.vertxweb.server.model.VersionPackageInfoJavaVersion;

@JsonInclude(JsonInclude.Include.NON_NULL)
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
  private OffsetDateTime time;
  private OffsetDateTime releaseTime;
  private String type;

  public VersionPackageInfo () {

  }

  public VersionPackageInfo (String version, VersionPackageInfoAssetIndex assetIndex, String assets, Integer complianceLevel, VersionPackageInfoDownloads downloads, String id, VersionPackageInfoJavaVersion javaVersion, String mainClass, Integer minimumLauncherVersion, OffsetDateTime time, OffsetDateTime releaseTime, String type) {
    this.version = version;
    this.assetIndex = assetIndex;
    this.assets = assets;
    this.complianceLevel = complianceLevel;
    this.downloads = downloads;
    this.id = id;
    this.javaVersion = javaVersion;
    this.mainClass = mainClass;
    this.minimumLauncherVersion = minimumLauncherVersion;
    this.time = time;
    this.releaseTime = releaseTime;
    this.type = type;
  }

    
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }

    
  @JsonProperty("assetIndex")
  public VersionPackageInfoAssetIndex getAssetIndex() {
    return assetIndex;
  }
  public void setAssetIndex(VersionPackageInfoAssetIndex assetIndex) {
    this.assetIndex = assetIndex;
  }

    
  @JsonProperty("assets")
  public String getAssets() {
    return assets;
  }
  public void setAssets(String assets) {
    this.assets = assets;
  }

    
  @JsonProperty("complianceLevel")
  public Integer getComplianceLevel() {
    return complianceLevel;
  }
  public void setComplianceLevel(Integer complianceLevel) {
    this.complianceLevel = complianceLevel;
  }

    
  @JsonProperty("downloads")
  public VersionPackageInfoDownloads getDownloads() {
    return downloads;
  }
  public void setDownloads(VersionPackageInfoDownloads downloads) {
    this.downloads = downloads;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("javaVersion")
  public VersionPackageInfoJavaVersion getJavaVersion() {
    return javaVersion;
  }
  public void setJavaVersion(VersionPackageInfoJavaVersion javaVersion) {
    this.javaVersion = javaVersion;
  }

    
  @JsonProperty("mainClass")
  public String getMainClass() {
    return mainClass;
  }
  public void setMainClass(String mainClass) {
    this.mainClass = mainClass;
  }

    
  @JsonProperty("minimumLauncherVersion")
  public Integer getMinimumLauncherVersion() {
    return minimumLauncherVersion;
  }
  public void setMinimumLauncherVersion(Integer minimumLauncherVersion) {
    this.minimumLauncherVersion = minimumLauncherVersion;
  }

    
  @JsonProperty("time")
  public OffsetDateTime getTime() {
    return time;
  }
  public void setTime(OffsetDateTime time) {
    this.time = time;
  }

    
  @JsonProperty("releaseTime")
  public OffsetDateTime getReleaseTime() {
    return releaseTime;
  }
  public void setReleaseTime(OffsetDateTime releaseTime) {
    this.releaseTime = releaseTime;
  }

    
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
