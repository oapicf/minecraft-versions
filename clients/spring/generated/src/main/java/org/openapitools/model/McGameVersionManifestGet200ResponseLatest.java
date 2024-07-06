package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * McGameVersionManifestGet200ResponseLatest
 */

@JsonTypeName("_mc_game_version_manifest_get_200_response_latest")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T01:37:22.360466048Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class McGameVersionManifestGet200ResponseLatest {

  private String release;

  private String snapshot;

  public McGameVersionManifestGet200ResponseLatest release(String release) {
    this.release = release;
    return this;
  }

  /**
   * Get release
   * @return release
  */
  
  @Schema(name = "release", example = "1.21", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("release")
  public String getRelease() {
    return release;
  }

  public void setRelease(String release) {
    this.release = release;
  }

  public McGameVersionManifestGet200ResponseLatest snapshot(String snapshot) {
    this.snapshot = snapshot;
    return this;
  }

  /**
   * Get snapshot
   * @return snapshot
  */
  
  @Schema(name = "snapshot", example = "24w14potato", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("snapshot")
  public String getSnapshot() {
    return snapshot;
  }

  public void setSnapshot(String snapshot) {
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
    McGameVersionManifestGet200ResponseLatest mcGameVersionManifestGet200ResponseLatest = (McGameVersionManifestGet200ResponseLatest) o;
    return Objects.equals(this.release, mcGameVersionManifestGet200ResponseLatest.release) &&
        Objects.equals(this.snapshot, mcGameVersionManifestGet200ResponseLatest.snapshot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(release, snapshot);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class McGameVersionManifestGet200ResponseLatest {\n");
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

