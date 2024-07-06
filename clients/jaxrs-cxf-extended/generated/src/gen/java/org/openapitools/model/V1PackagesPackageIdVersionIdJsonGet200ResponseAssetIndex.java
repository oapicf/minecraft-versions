package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex  {
  
  @ApiModelProperty(value = "")
  private String id;

  @ApiModelProperty(value = "")
  private String sha1;

  @ApiModelProperty(value = "")
  private Integer size;

  @ApiModelProperty(value = "")
  private Integer totalSize;

  @ApiModelProperty(value = "")
  private String url;
 /**
  * Get id
  * @return id
  */
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Get sha1
  * @return sha1
  */
  @JsonProperty("sha1")
  public String getSha1() {
    return sha1;
  }

  /**
   * Sets the <code>sha1</code> property.
   */
 public void setSha1(String sha1) {
    this.sha1 = sha1;
  }

  /**
   * Sets the <code>sha1</code> property.
   */
  public V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex sha1(String sha1) {
    this.sha1 = sha1;
    return this;
  }

 /**
  * Get size
  * @return size
  */
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }

  /**
   * Sets the <code>size</code> property.
   */
 public void setSize(Integer size) {
    this.size = size;
  }

  /**
   * Sets the <code>size</code> property.
   */
  public V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex size(Integer size) {
    this.size = size;
    return this;
  }

 /**
  * Get totalSize
  * @return totalSize
  */
  @JsonProperty("totalSize")
  public Integer getTotalSize() {
    return totalSize;
  }

  /**
   * Sets the <code>totalSize</code> property.
   */
 public void setTotalSize(Integer totalSize) {
    this.totalSize = totalSize;
  }

  /**
   * Sets the <code>totalSize</code> property.
   */
  public V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex totalSize(Integer totalSize) {
    this.totalSize = totalSize;
    return this;
  }

 /**
  * Get url
  * @return url
  */
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  /**
   * Sets the <code>url</code> property.
   */
 public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Sets the <code>url</code> property.
   */
  public V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex url(String url) {
    this.url = url;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

