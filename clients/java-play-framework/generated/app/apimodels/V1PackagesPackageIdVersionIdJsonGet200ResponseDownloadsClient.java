package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-07-06T01:32:47.203764015Z[Etc/UTC]", comments = "Generator version: 7.6.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient   {
  @JsonProperty("sha1")
  
  private String sha1;

  @JsonProperty("size")
  
  private Integer size;

  @JsonProperty("url")
  
  private String url;

  public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient sha1(String sha1) {
    this.sha1 = sha1;
    return this;
  }

   /**
   * Get sha1
   * @return sha1
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

