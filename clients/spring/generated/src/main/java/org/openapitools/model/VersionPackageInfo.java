package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.openapitools.model.VersionPackageInfoAssetIndex;
import org.openapitools.model.VersionPackageInfoDownloads;
import org.openapitools.model.VersionPackageInfoJavaVersion;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * VersionPackageInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-03T05:54:21.326388536Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class VersionPackageInfo {

  private String version;

  private VersionPackageInfoAssetIndex assetIndex;

  private String assets;

  private Integer complianceLevel;

  private VersionPackageInfoDownloads downloads;

  private String id;

  private VersionPackageInfoJavaVersion javaVersion;

  private String mainClass;

  private Integer minimumLauncherVersion;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime time;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime releaseTime;

  private String type;

  public VersionPackageInfo version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  
  @Schema(name = "version", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
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
   */
  @Valid 
  @Schema(name = "assetIndex", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assetIndex")
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
   */
  
  @Schema(name = "assets", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assets")
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
   */
  
  @Schema(name = "complianceLevel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("complianceLevel")
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
   */
  @Valid 
  @Schema(name = "downloads", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("downloads")
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
   */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
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
   */
  @Valid 
  @Schema(name = "javaVersion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("javaVersion")
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
   */
  
  @Schema(name = "mainClass", example = "net.minecraft.client.main.Main", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mainClass")
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
   */
  
  @Schema(name = "minimumLauncherVersion", example = "21", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minimumLauncherVersion")
  public Integer getMinimumLauncherVersion() {
    return minimumLauncherVersion;
  }

  public void setMinimumLauncherVersion(Integer minimumLauncherVersion) {
    this.minimumLauncherVersion = minimumLauncherVersion;
  }

  public VersionPackageInfo time(OffsetDateTime time) {
    this.time = time;
    return this;
  }

  /**
   * Get time
   * @return time
   */
  @Valid 
  @Schema(name = "time", example = "2024-04-01T11:14:41.000Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("time")
  public OffsetDateTime getTime() {
    return time;
  }

  public void setTime(OffsetDateTime time) {
    this.time = time;
  }

  public VersionPackageInfo releaseTime(OffsetDateTime releaseTime) {
    this.releaseTime = releaseTime;
    return this;
  }

  /**
   * Get releaseTime
   * @return releaseTime
   */
  @Valid 
  @Schema(name = "releaseTime", example = "2024-04-01T11:07:19.000Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("releaseTime")
  public OffsetDateTime getReleaseTime() {
    return releaseTime;
  }

  public void setReleaseTime(OffsetDateTime releaseTime) {
    this.releaseTime = releaseTime;
  }

  public VersionPackageInfo type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  
  @Schema(name = "type", example = "snapshot", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

