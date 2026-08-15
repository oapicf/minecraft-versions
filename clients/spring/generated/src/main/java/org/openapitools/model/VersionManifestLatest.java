package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * VersionManifestLatest
 */

@JsonTypeName("VersionManifest_latest")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-15T12:30:41.108715545Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class VersionManifestLatest {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String release;

  @JsonInclude(JsonInclude.Include.NON_NULL)
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

  @JsonProperty("release")
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

  @JsonProperty("snapshot")
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

