package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-07-06T01:32:43.130084075Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("sha1")
  private String sha1;

  @JsonProperty("size")
  private Integer size;

  @JsonProperty("totalSize")
  private Integer totalSize;

  @JsonProperty("url")
  private String url;

  public V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex sha1(String sha1) {
    this.sha1 = sha1;
    return this;
  }

   /**
   * Get sha1
   * @return sha1
  **/
  @ApiModelProperty(value = "")
  public String getSha1() {
    return sha1;
  }

  public void setSha1(String sha1) {
    this.sha1 = sha1;
  }

  public V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(value = "")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex totalSize(Integer totalSize) {
    this.totalSize = totalSize;
    return this;
  }

   /**
   * Get totalSize
   * @return totalSize
  **/
  @ApiModelProperty(value = "")
  public Integer getTotalSize() {
    return totalSize;
  }

  public void setTotalSize(Integer totalSize) {
    this.totalSize = totalSize;
  }

  public V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
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
