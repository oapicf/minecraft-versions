package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import org.openapitools.model.V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex;
import org.openapitools.model.V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads;
import org.openapitools.model.V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * V1PackagesPackageIdVersionIdJsonGet200Response
 */

@JsonTypeName("_v1_packages__packageId___versionId__json_get_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T01:37:22.360466048Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class V1PackagesPackageIdVersionIdJsonGet200Response {

  private String version;

  private V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex assetIndex;

  private Integer assets;

  private Integer complianceLevel;

  private V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads downloads;

  private String id;

  private V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion javaVersion;

  private String mainClass;

  private Integer minimumLauncherVersion;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime time;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime releaseTime;

  private String type;

  public V1PackagesPackageIdVersionIdJsonGet200Response version(String version) {
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

  public V1PackagesPackageIdVersionIdJsonGet200Response assetIndex(V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex assetIndex) {
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
  public V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex getAssetIndex() {
    return assetIndex;
  }

  public void setAssetIndex(V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex assetIndex) {
    this.assetIndex = assetIndex;
  }

  public V1PackagesPackageIdVersionIdJsonGet200Response assets(Integer assets) {
    this.assets = assets;
    return this;
  }

  /**
   * Get assets
   * @return assets
  */
  
  @Schema(name = "assets", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assets")
  public Integer getAssets() {
    return assets;
  }

  public void setAssets(Integer assets) {
    this.assets = assets;
  }

  public V1PackagesPackageIdVersionIdJsonGet200Response complianceLevel(Integer complianceLevel) {
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

  public V1PackagesPackageIdVersionIdJsonGet200Response downloads(V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads downloads) {
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
  public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads getDownloads() {
    return downloads;
  }

  public void setDownloads(V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads downloads) {
    this.downloads = downloads;
  }

  public V1PackagesPackageIdVersionIdJsonGet200Response id(String id) {
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

  public V1PackagesPackageIdVersionIdJsonGet200Response javaVersion(V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion javaVersion) {
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
  public V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion getJavaVersion() {
    return javaVersion;
  }

  public void setJavaVersion(V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion javaVersion) {
    this.javaVersion = javaVersion;
  }

  public V1PackagesPackageIdVersionIdJsonGet200Response mainClass(String mainClass) {
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

  public V1PackagesPackageIdVersionIdJsonGet200Response minimumLauncherVersion(Integer minimumLauncherVersion) {
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

  public V1PackagesPackageIdVersionIdJsonGet200Response time(OffsetDateTime time) {
    this.time = time;
    return this;
  }

  /**
   * Get time
   * @return time
  */
  @Valid 
  @Schema(name = "time", example = "2024-04-01T11:14:41Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("time")
  public OffsetDateTime getTime() {
    return time;
  }

  public void setTime(OffsetDateTime time) {
    this.time = time;
  }

  public V1PackagesPackageIdVersionIdJsonGet200Response releaseTime(OffsetDateTime releaseTime) {
    this.releaseTime = releaseTime;
    return this;
  }

  /**
   * Get releaseTime
   * @return releaseTime
  */
  @Valid 
  @Schema(name = "releaseTime", example = "2024-04-01T11:07:19Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("releaseTime")
  public OffsetDateTime getReleaseTime() {
    return releaseTime;
  }

  public void setReleaseTime(OffsetDateTime releaseTime) {
    this.releaseTime = releaseTime;
  }

  public V1PackagesPackageIdVersionIdJsonGet200Response type(String type) {
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
    V1PackagesPackageIdVersionIdJsonGet200Response v1PackagesPackageIdVersionIdJsonGet200Response = (V1PackagesPackageIdVersionIdJsonGet200Response) o;
    return Objects.equals(this.version, v1PackagesPackageIdVersionIdJsonGet200Response.version) &&
        Objects.equals(this.assetIndex, v1PackagesPackageIdVersionIdJsonGet200Response.assetIndex) &&
        Objects.equals(this.assets, v1PackagesPackageIdVersionIdJsonGet200Response.assets) &&
        Objects.equals(this.complianceLevel, v1PackagesPackageIdVersionIdJsonGet200Response.complianceLevel) &&
        Objects.equals(this.downloads, v1PackagesPackageIdVersionIdJsonGet200Response.downloads) &&
        Objects.equals(this.id, v1PackagesPackageIdVersionIdJsonGet200Response.id) &&
        Objects.equals(this.javaVersion, v1PackagesPackageIdVersionIdJsonGet200Response.javaVersion) &&
        Objects.equals(this.mainClass, v1PackagesPackageIdVersionIdJsonGet200Response.mainClass) &&
        Objects.equals(this.minimumLauncherVersion, v1PackagesPackageIdVersionIdJsonGet200Response.minimumLauncherVersion) &&
        Objects.equals(this.time, v1PackagesPackageIdVersionIdJsonGet200Response.time) &&
        Objects.equals(this.releaseTime, v1PackagesPackageIdVersionIdJsonGet200Response.releaseTime) &&
        Objects.equals(this.type, v1PackagesPackageIdVersionIdJsonGet200Response.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, assetIndex, assets, complianceLevel, downloads, id, javaVersion, mainClass, minimumLauncherVersion, time, releaseTime, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PackagesPackageIdVersionIdJsonGet200Response {\n");
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

