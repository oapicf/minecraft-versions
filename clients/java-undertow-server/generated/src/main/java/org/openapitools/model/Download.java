/*
 * 
 *
 * SDK for Minecraft versions info
 *
 * OpenAPI document version: 1.1.1-pre.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2025-05-10T01:44:19.984836271Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class Download   {
  
  private String sha1;
  private Integer size;
  private String url;

  /**
   */
  public Download sha1(String sha1) {
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
   */
  public Download size(Integer size) {
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
   */
  public Download url(String url) {
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
    Download download = (Download) o;
    return Objects.equals(sha1, download.sha1) &&
        Objects.equals(size, download.size) &&
        Objects.equals(url, download.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sha1, size, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Download {\n");
    
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

