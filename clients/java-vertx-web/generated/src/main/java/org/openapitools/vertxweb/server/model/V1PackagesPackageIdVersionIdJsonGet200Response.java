package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import org.openapitools.vertxweb.server.model.V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex;
import org.openapitools.vertxweb.server.model.V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads;
import org.openapitools.vertxweb.server.model.V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class V1PackagesPackageIdVersionIdJsonGet200Response   {
  
  private String version;
  private V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex assetIndex;
  private Integer assets;
  private Integer complianceLevel;
  private V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads downloads;
  private String id;
  private V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion javaVersion;
  private String mainClass;
  private Integer minimumLauncherVersion;
  private OffsetDateTime time;
  private OffsetDateTime releaseTime;
  private String type;

  public V1PackagesPackageIdVersionIdJsonGet200Response () {

  }

  public V1PackagesPackageIdVersionIdJsonGet200Response (String version, V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex assetIndex, Integer assets, Integer complianceLevel, V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads downloads, String id, V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion javaVersion, String mainClass, Integer minimumLauncherVersion, OffsetDateTime time, OffsetDateTime releaseTime, String type) {
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
  public V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex getAssetIndex() {
    return assetIndex;
  }
  public void setAssetIndex(V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex assetIndex) {
    this.assetIndex = assetIndex;
  }

    
  @JsonProperty("assets")
  public Integer getAssets() {
    return assets;
  }
  public void setAssets(Integer assets) {
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
  public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads getDownloads() {
    return downloads;
  }
  public void setDownloads(V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads downloads) {
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
  public V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion getJavaVersion() {
    return javaVersion;
  }
  public void setJavaVersion(V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion javaVersion) {
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
    V1PackagesPackageIdVersionIdJsonGet200Response v1PackagesPackageIdVersionIdJsonGet200Response = (V1PackagesPackageIdVersionIdJsonGet200Response) o;
    return Objects.equals(version, v1PackagesPackageIdVersionIdJsonGet200Response.version) &&
        Objects.equals(assetIndex, v1PackagesPackageIdVersionIdJsonGet200Response.assetIndex) &&
        Objects.equals(assets, v1PackagesPackageIdVersionIdJsonGet200Response.assets) &&
        Objects.equals(complianceLevel, v1PackagesPackageIdVersionIdJsonGet200Response.complianceLevel) &&
        Objects.equals(downloads, v1PackagesPackageIdVersionIdJsonGet200Response.downloads) &&
        Objects.equals(id, v1PackagesPackageIdVersionIdJsonGet200Response.id) &&
        Objects.equals(javaVersion, v1PackagesPackageIdVersionIdJsonGet200Response.javaVersion) &&
        Objects.equals(mainClass, v1PackagesPackageIdVersionIdJsonGet200Response.mainClass) &&
        Objects.equals(minimumLauncherVersion, v1PackagesPackageIdVersionIdJsonGet200Response.minimumLauncherVersion) &&
        Objects.equals(time, v1PackagesPackageIdVersionIdJsonGet200Response.time) &&
        Objects.equals(releaseTime, v1PackagesPackageIdVersionIdJsonGet200Response.releaseTime) &&
        Objects.equals(type, v1PackagesPackageIdVersionIdJsonGet200Response.type);
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