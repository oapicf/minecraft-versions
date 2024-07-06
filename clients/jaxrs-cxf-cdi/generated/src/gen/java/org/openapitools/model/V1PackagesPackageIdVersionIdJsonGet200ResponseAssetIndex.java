package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex   {
  
  private String id;

  private String sha1;

  private Integer size;

  private Integer totalSize;

  private String url;

  /**
   **/
  public V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex id(String id) {
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
  public V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex sha1(String sha1) {
    this.sha1 = sha1;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("sha1")
  public String getSha1() {
    return sha1;
  }
  public void setSha1(String sha1) {
    this.sha1 = sha1;
  }


  /**
   **/
  public V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex size(Integer size) {
    this.size = size;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }
  public void setSize(Integer size) {
    this.size = size;
  }


  /**
   **/
  public V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex totalSize(Integer totalSize) {
    this.totalSize = totalSize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("totalSize")
  public Integer getTotalSize() {
    return totalSize;
  }
  public void setTotalSize(Integer totalSize) {
    this.totalSize = totalSize;
  }


  /**
   **/
  public V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex url(String url) {
    this.url = url;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("url")
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
    V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex v1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex = (V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex) o;
    return Objects.equals(this.id, v1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex.id) &&
        Objects.equals(this.sha1, v1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex.sha1) &&
        Objects.equals(this.size, v1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex.size) &&
        Objects.equals(this.totalSize, v1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex.totalSize) &&
        Objects.equals(this.url, v1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, sha1, size, totalSize, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex {\n");
    
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

