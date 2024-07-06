package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.model.V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex;
import org.openapitools.model.V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads;
import org.openapitools.model.V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-07-06T08:44:30.733727206Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class V1PackagesPackageIdVersionIdJsonGet200Response   {
  @JsonProperty("version")
  private String version;

  @JsonProperty("assetIndex")
  private V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex assetIndex;

  @JsonProperty("assets")
  private Integer assets;

  @JsonProperty("complianceLevel")
  private Integer complianceLevel;

  @JsonProperty("downloads")
  private V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads downloads;

  @JsonProperty("id")
  private String id;

  @JsonProperty("javaVersion")
  private V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion javaVersion;

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
  public V1PackagesPackageIdVersionIdJsonGet200Response version(String version) {
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
  public V1PackagesPackageIdVersionIdJsonGet200Response assetIndex(V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex assetIndex) {
    this.assetIndex = assetIndex;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("assetIndex")
  public V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex getAssetIndex() {
    return assetIndex;
  }
  public void setAssetIndex(V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex assetIndex) {
    this.assetIndex = assetIndex;
  }

  /**
   **/
  public V1PackagesPackageIdVersionIdJsonGet200Response assets(Integer assets) {
    this.assets = assets;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("assets")
  public Integer getAssets() {
    return assets;
  }
  public void setAssets(Integer assets) {
    this.assets = assets;
  }

  /**
   **/
  public V1PackagesPackageIdVersionIdJsonGet200Response complianceLevel(Integer complianceLevel) {
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
  public V1PackagesPackageIdVersionIdJsonGet200Response downloads(V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads downloads) {
    this.downloads = downloads;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("downloads")
  public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads getDownloads() {
    return downloads;
  }
  public void setDownloads(V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads downloads) {
    this.downloads = downloads;
  }

  /**
   **/
  public V1PackagesPackageIdVersionIdJsonGet200Response id(String id) {
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
  public V1PackagesPackageIdVersionIdJsonGet200Response javaVersion(V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion javaVersion) {
    this.javaVersion = javaVersion;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("javaVersion")
  public V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion getJavaVersion() {
    return javaVersion;
  }
  public void setJavaVersion(V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion javaVersion) {
    this.javaVersion = javaVersion;
  }

  /**
   **/
  public V1PackagesPackageIdVersionIdJsonGet200Response mainClass(String mainClass) {
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
  public V1PackagesPackageIdVersionIdJsonGet200Response minimumLauncherVersion(Integer minimumLauncherVersion) {
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
  public V1PackagesPackageIdVersionIdJsonGet200Response time(Date time) {
    this.time = time;
    return this;
  }

  
  @ApiModelProperty(example = "2024-04-01T11:14:41Z", value = "")
  @JsonProperty("time")
  public Date getTime() {
    return time;
  }
  public void setTime(Date time) {
    this.time = time;
  }

  /**
   **/
  public V1PackagesPackageIdVersionIdJsonGet200Response releaseTime(Date releaseTime) {
    this.releaseTime = releaseTime;
    return this;
  }

  
  @ApiModelProperty(example = "2024-04-01T11:07:19Z", value = "")
  @JsonProperty("releaseTime")
  public Date getReleaseTime() {
    return releaseTime;
  }
  public void setReleaseTime(Date releaseTime) {
    this.releaseTime = releaseTime;
  }

  /**
   **/
  public V1PackagesPackageIdVersionIdJsonGet200Response type(String type) {
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
