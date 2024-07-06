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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.openapitools.client.model.VersionPackageInfoAssetIndex;
import org.openapitools.client.model.VersionPackageInfoDownloads;
import org.openapitools.client.model.VersionPackageInfoJavaVersion;




public class VersionPackageInfo  {
  
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

 /**
   * Get version
   * @return version
  **/
  public String getVersion() {
    return version;
  }

  /**
    * Set version
  **/
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
  public VersionPackageInfoAssetIndex getAssetIndex() {
    return assetIndex;
  }

  /**
    * Set assetIndex
  **/
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
  public String getAssets() {
    return assets;
  }

  /**
    * Set assets
  **/
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
  public Integer getComplianceLevel() {
    return complianceLevel;
  }

  /**
    * Set complianceLevel
  **/
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
  public VersionPackageInfoDownloads getDownloads() {
    return downloads;
  }

  /**
    * Set downloads
  **/
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
  public String getId() {
    return id;
  }

  /**
    * Set id
  **/
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
  public VersionPackageInfoJavaVersion getJavaVersion() {
    return javaVersion;
  }

  /**
    * Set javaVersion
  **/
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
  public String getMainClass() {
    return mainClass;
  }

  /**
    * Set mainClass
  **/
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
  public Integer getMinimumLauncherVersion() {
    return minimumLauncherVersion;
  }

  /**
    * Set minimumLauncherVersion
  **/
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
  public OffsetDateTime getTime() {
    return time;
  }

  /**
    * Set time
  **/
  public void setTime(OffsetDateTime time) {
    this.time = time;
  }

  public VersionPackageInfo time(OffsetDateTime time) {
    this.time = time;
    return this;
  }

 /**
   * Get releaseTime
   * @return releaseTime
  **/
  public OffsetDateTime getReleaseTime() {
    return releaseTime;
  }

  /**
    * Set releaseTime
  **/
  public void setReleaseTime(OffsetDateTime releaseTime) {
    this.releaseTime = releaseTime;
  }

  public VersionPackageInfo releaseTime(OffsetDateTime releaseTime) {
    this.releaseTime = releaseTime;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  public String getType() {
    return type;
  }

  /**
    * Set type
  **/
  public void setType(String type) {
    this.type = type;
  }

  public VersionPackageInfo type(String type) {
    this.type = type;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
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

