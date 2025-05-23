package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Version;
import org.openapitools.model.VersionManifestLatest;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class VersionManifest  {
  
  @ApiModelProperty(value = "")
  @Valid
  private VersionManifestLatest latest;

  @ApiModelProperty(value = "")
  @Valid
  private List<@Valid Version> versions = new ArrayList<>();
 /**
  * Get latest
  * @return latest
  */
  @JsonProperty("latest")
  public VersionManifestLatest getLatest() {
    return latest;
  }

  /**
   * Sets the <code>latest</code> property.
   */
 public void setLatest(VersionManifestLatest latest) {
    this.latest = latest;
  }

  /**
   * Sets the <code>latest</code> property.
   */
  public VersionManifest latest(VersionManifestLatest latest) {
    this.latest = latest;
    return this;
  }

 /**
  * Get versions
  * @return versions
  */
  @JsonProperty("versions")
  public List<@Valid Version> getVersions() {
    return versions;
  }

  /**
   * Sets the <code>versions</code> property.
   */
 public void setVersions(List<@Valid Version> versions) {
    this.versions = versions;
  }

  /**
   * Sets the <code>versions</code> property.
   */
  public VersionManifest versions(List<@Valid Version> versions) {
    this.versions = versions;
    return this;
  }

  /**
   * Adds a new item to the <code>versions</code> list.
   */
  public VersionManifest addVersionsItem(Version versionsItem) {
    this.versions.add(versionsItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

