package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient  {
  
  @ApiModelProperty(value = "")
  private String sha1;

  @ApiModelProperty(value = "")
  private Integer size;

  @ApiModelProperty(value = "")
  private String url;
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
  public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient sha1(String sha1) {
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
  public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient size(Integer size) {
    this.size = size;
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
  public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient url(String url) {
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
    V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient v1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient = (V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient) o;
    return Objects.equals(this.sha1, v1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient.sha1) &&
        Objects.equals(this.size, v1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient.size) &&
        Objects.equals(this.url, v1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sha1, size, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient {\n");
    
    sb.append("    sha1: ").append(toIndentedString(sha1)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

