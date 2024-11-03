package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Version;
import org.openapitools.model.VersionManifestLatest;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * VersionManifest
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-03T05:50:59.622218574Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class VersionManifest {

  private VersionManifestLatest latest;

  @Valid
  private List<@Valid Version> versions = new ArrayList<>();

  public VersionManifest latest(VersionManifestLatest latest) {
    this.latest = latest;
    return this;
  }

  /**
   * Get latest
   * @return latest
   */
  @Valid 
  @Schema(name = "latest", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("latest")
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
   */
  @Valid 
  @Schema(name = "versions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("versions")
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

