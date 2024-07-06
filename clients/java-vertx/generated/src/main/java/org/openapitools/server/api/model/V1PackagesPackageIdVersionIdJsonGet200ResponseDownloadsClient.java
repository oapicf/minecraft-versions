package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient   {
  
  private String sha1;
  private Integer size;
  private String url;

  public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient () {

  }

  public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient (String sha1, Integer size, String url) {
    this.sha1 = sha1;
    this.size = size;
    this.url = url;
  }

    
  @JsonProperty("sha1")
  public String getSha1() {
    return sha1;
  }
  public void setSha1(String sha1) {
    this.sha1 = sha1;
  }

    
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }
  public void setSize(Integer size) {
    this.size = size;
  }

    
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
    return Objects.equals(sha1, v1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient.sha1) &&
        Objects.equals(size, v1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient.size) &&
        Objects.equals(url, v1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient.url);
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
