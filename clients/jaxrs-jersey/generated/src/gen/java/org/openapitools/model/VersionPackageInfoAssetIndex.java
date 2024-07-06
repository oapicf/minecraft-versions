/*
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


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * VersionPackageInfoAssetIndex
 */
@JsonPropertyOrder({
  VersionPackageInfoAssetIndex.JSON_PROPERTY_ID,
  VersionPackageInfoAssetIndex.JSON_PROPERTY_SHA1,
  VersionPackageInfoAssetIndex.JSON_PROPERTY_SIZE,
  VersionPackageInfoAssetIndex.JSON_PROPERTY_TOTAL_SIZE,
  VersionPackageInfoAssetIndex.JSON_PROPERTY_URL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-07-06T13:12:01.967999178Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class VersionPackageInfoAssetIndex   {
  public static final String JSON_PROPERTY_ID = "id";
  @JsonProperty(JSON_PROPERTY_ID)
  private String id;

  public static final String JSON_PROPERTY_SHA1 = "sha1";
  @JsonProperty(JSON_PROPERTY_SHA1)
  private String sha1;

  public static final String JSON_PROPERTY_SIZE = "size";
  @JsonProperty(JSON_PROPERTY_SIZE)
  private Integer size;

  public static final String JSON_PROPERTY_TOTAL_SIZE = "totalSize";
  @JsonProperty(JSON_PROPERTY_TOTAL_SIZE)
  private Integer totalSize;

  public static final String JSON_PROPERTY_URL = "url";
  @JsonProperty(JSON_PROPERTY_URL)
  private String url;

  public VersionPackageInfoAssetIndex id(String id) {
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

  public VersionPackageInfoAssetIndex sha1(String sha1) {
    this.sha1 = sha1;
    return this;
  }

  /**
   * Get sha1
   * @return sha1
   **/
  @JsonProperty(value = "sha1")
  @ApiModelProperty(value = "")
  
  public String getSha1() {
    return sha1;
  }

  public void setSha1(String sha1) {
    this.sha1 = sha1;
  }

  public VersionPackageInfoAssetIndex size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
   **/
  @JsonProperty(value = "size")
  @ApiModelProperty(value = "")
  
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public VersionPackageInfoAssetIndex totalSize(Integer totalSize) {
    this.totalSize = totalSize;
    return this;
  }

  /**
   * Get totalSize
   * @return totalSize
   **/
  @JsonProperty(value = "totalSize")
  @ApiModelProperty(value = "")
  
  public Integer getTotalSize() {
    return totalSize;
  }

  public void setTotalSize(Integer totalSize) {
    this.totalSize = totalSize;
  }

  public VersionPackageInfoAssetIndex url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
   **/
  @JsonProperty(value = "url")
  @ApiModelProperty(value = "")
  
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionPackageInfoAssetIndex versionPackageInfoAssetIndex = (VersionPackageInfoAssetIndex) o;
    return Objects.equals(this.id, versionPackageInfoAssetIndex.id) &&
        Objects.equals(this.sha1, versionPackageInfoAssetIndex.sha1) &&
        Objects.equals(this.size, versionPackageInfoAssetIndex.size) &&
        Objects.equals(this.totalSize, versionPackageInfoAssetIndex.totalSize) &&
        Objects.equals(this.url, versionPackageInfoAssetIndex.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, sha1, size, totalSize, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionPackageInfoAssetIndex {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sha1: ").append(toIndentedString(sha1)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

