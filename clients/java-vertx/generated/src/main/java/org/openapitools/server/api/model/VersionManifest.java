package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.Version;
import org.openapitools.server.api.model.VersionManifestLatest;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VersionManifest   {
  
  private VersionManifestLatest latest;
  private List<Version> versions = new ArrayList<>();

  public VersionManifest () {

  }

  public VersionManifest (VersionManifestLatest latest, List<Version> versions) {
    this.latest = latest;
    this.versions = versions;
  }

    
  @JsonProperty("latest")
  public VersionManifestLatest getLatest() {
    return latest;
  }
  public void setLatest(VersionManifestLatest latest) {
    this.latest = latest;
  }

    
  @JsonProperty("versions")
  public List<Version> getVersions() {
    return versions;
  }
  public void setVersions(List<Version> versions) {
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
    VersionManifest versionManifest = (VersionManifest) o;
    return Objects.equals(latest, versionManifest.latest) &&
        Objects.equals(versions, versionManifest.versions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latest, versions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionManifest {\n");
    
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
