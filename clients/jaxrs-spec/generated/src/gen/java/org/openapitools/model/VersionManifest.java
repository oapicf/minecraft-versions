package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Version;
import org.openapitools.model.VersionManifestLatest;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("VersionManifest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-05-10T01:44:31.966794260Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class VersionManifest   {
  private VersionManifestLatest latest;
  private @Valid List<@Valid Version> versions = new ArrayList<>();

  public VersionManifest() {
  }

  /**
   **/
  public VersionManifest latest(VersionManifestLatest latest) {
    this.latest = latest;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("latest")
  @Valid public VersionManifestLatest getLatest() {
    return latest;
  }

  @JsonProperty("latest")
  public void setLatest(VersionManifestLatest latest) {
    this.latest = latest;
  }

  /**
   **/
  public VersionManifest versions(List<@Valid Version> versions) {
    this.versions = versions;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("versions")
  @Valid public List<@Valid Version> getVersions() {
    return versions;
  }

  @JsonProperty("versions")
  public void setVersions(List<@Valid Version> versions) {
    this.versions = versions;
  }

  public VersionManifest addVersionsItem(Version versionsItem) {
    if (this.versions == null) {
      this.versions = new ArrayList<>();
    }

    this.versions.add(versionsItem);
    return this;
  }

  public VersionManifest removeVersionsItem(Version versionsItem) {
    if (versionsItem != null && this.versions != null) {
      this.versions.remove(versionsItem);
    }

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

