package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient
 */

@JsonTypeName("_v1_packages__packageId___versionId__json_get_200_response_downloads_client")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-07-06T01:32:59.863372340Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient {

  private String sha1;

  private Integer size;

  private String url;

  public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient sha1(String sha1) {
    this.sha1 = sha1;
    return this;
  }

  /**
   * Get sha1
   * @return sha1
  */
  
  @Schema(name = "sha1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sha1")
  public String getSha1() {
    return sha1;
  }

  public void setSha1(String sha1) {
    this.sha1 = sha1;
  }

  public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
  */
  
  @Schema(name = "size", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
  */
  
  @Schema(name = "url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

