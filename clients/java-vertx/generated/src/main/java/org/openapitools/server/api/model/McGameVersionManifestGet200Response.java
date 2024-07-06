package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.McGameVersionManifestGet200ResponseLatest;
import org.openapitools.server.api.model.McGameVersionManifestGet200ResponseVersionsInner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class McGameVersionManifestGet200Response   {
  
  private McGameVersionManifestGet200ResponseLatest latest;
  private List<McGameVersionManifestGet200ResponseVersionsInner> versions = new ArrayList<>();

  public McGameVersionManifestGet200Response () {

  }

  public McGameVersionManifestGet200Response (McGameVersionManifestGet200ResponseLatest latest, List<McGameVersionManifestGet200ResponseVersionsInner> versions) {
    this.latest = latest;
    this.versions = versions;
  }

    
  @JsonProperty("latest")
  public McGameVersionManifestGet200ResponseLatest getLatest() {
    return latest;
  }
  public void setLatest(McGameVersionManifestGet200ResponseLatest latest) {
    this.latest = latest;
  }

    
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
