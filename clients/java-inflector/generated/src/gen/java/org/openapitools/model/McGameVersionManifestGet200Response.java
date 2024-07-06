package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.McGameVersionManifestGet200ResponseLatest;
import org.openapitools.model.McGameVersionManifestGet200ResponseVersionsInner;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-07-06T01:32:29.045945190Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class McGameVersionManifestGet200Response   {
  @JsonProperty("latest")
  private McGameVersionManifestGet200ResponseLatest latest;

  @JsonProperty("versions")
  private List<McGameVersionManifestGet200ResponseVersionsInner> versions = null;

  /**
   **/
  public McGameVersionManifestGet200Response latest(McGameVersionManifestGet200ResponseLatest latest) {
    this.latest = latest;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("latest")
  public McGameVersionManifestGet200ResponseLatest getLatest() {
    return latest;
  }
  public void setLatest(McGameVersionManifestGet200ResponseLatest latest) {
    this.latest = latest;
  }

  /**
   **/
  public McGameVersionManifestGet200Response versions(List<McGameVersionManifestGet200ResponseVersionsInner> versions) {
    this.versions = versions;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("versions")
  public List<McGameVersionManifestGet200ResponseVersionsInner> getVersions() {
    return versions;
  }
  public void setVersions(List<McGameVersionManifestGet200ResponseVersionsInner> versions) {
    this.versions = versions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    McGameVersionManifestGet200Response mcGameVersionManifestGet200Response = (McGameVersionManifestGet200Response) o;
    return Objects.equals(latest, mcGameVersionManifestGet200Response.latest) &&
        Objects.equals(versions, mcGameVersionManifestGet200Response.versions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latest, versions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class McGameVersionManifestGet200Response {\n");
    
    sb.append("    latest: ").append(toIndentedString(latest)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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

