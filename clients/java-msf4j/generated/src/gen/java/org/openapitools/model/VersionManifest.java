package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Version;
import org.openapitools.model.VersionManifestLatest;

/**
 * VersionManifest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2025-05-10T01:44:16.356714070Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class VersionManifest   {
  @JsonProperty("latest")
  private VersionManifestLatest latest;

  @JsonProperty("versions")
  private List<@Valid Version> versions = null;

  public VersionManifest latest(VersionManifestLatest latest) {
    this.latest = latest;
    return this;
  }

   /**
   * Get latest
   * @return latest
  **/
  @ApiModelProperty(value = "")
  public VersionManifestLatest getLatest() {
    return latest;
  }

  public void setLatest(VersionManifestLatest latest) {
    this.latest = latest;
  }

  public VersionManifest versions(List<@Valid Version> versions) {
    this.versions = versions;
    return this;
  }

  public VersionManifest addVersionsItem(Version versionsItem) {
    if (this.versions == null) {
      this.versions = new ArrayList<>();
    }
    this.versions.add(versionsItem);
    return this;
  }

   /**
   * Get versions
   * @return versions
  **/
  @ApiModelProperty(value = "")
  public List<@Valid Version> getVersions() {
    return versions;
  }

  public void setVersions(List<@Valid Version> versions) {
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
    return Objects.equals(this.latest, versionManifest.latest) &&
        Objects.equals(this.versions, versionManifest.versions);
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

