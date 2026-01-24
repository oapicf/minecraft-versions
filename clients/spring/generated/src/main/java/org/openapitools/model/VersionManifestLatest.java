package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * VersionManifestLatest
 */

@JsonTypeName("VersionManifest_latest")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-24T10:37:58.256640213Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class VersionManifestLatest {

  private @Nullable String release;

  private @Nullable String snapshot;

  public VersionManifestLatest release(@Nullable String release) {
    this.release = release;
    return this;
  }

  /**
   * Get release
   * @return release
   */
  
  @Schema(name = "release", example = "1.21", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("release")
  public @Nullable String getRelease() {
    return release;
  }

  public void setRelease(@Nullable String release) {
    this.release = release;
  }

  public VersionManifestLatest snapshot(@Nullable String snapshot) {
    this.snapshot = snapshot;
    return this;
  }

  /**
   * Get snapshot
   * @return snapshot
   */
  
  @Schema(name = "snapshot", example = "24w14potato", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("snapshot")
  public @Nullable String getSnapshot() {
    return snapshot;
  }

  public void setSnapshot(@Nullable String snapshot) {
    this.snapshot = snapshot;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionManifestLatest versionManifestLatest = (VersionManifestLatest) o;
    return Objects.equals(this.release, versionManifestLatest.release) &&
        Objects.equals(this.snapshot, versionManifestLatest.snapshot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(release, snapshot);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionManifestLatest {\n");
    sb.append("    release: ").append(toIndentedString(release)).append("\n");
    sb.append("    snapshot: ").append(toIndentedString(snapshot)).append("\n");
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

