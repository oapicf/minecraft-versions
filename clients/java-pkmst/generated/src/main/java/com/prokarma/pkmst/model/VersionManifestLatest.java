package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * VersionManifestLatest
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2025-05-10T01:44:17.459555707Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class VersionManifestLatest   {
  @JsonProperty("release")
  private String release;

  @JsonProperty("snapshot")
  private String snapshot;

  public VersionManifestLatest release(String release) {
    this.release = release;
    return this;
  }

  /**
   * Get release
   * @return release
   */
  @ApiModelProperty(example = "1.21", value = "")
  public String getRelease() {
    return release;
  }

  public void setRelease(String release) {
    this.release = release;
  }

  public VersionManifestLatest snapshot(String snapshot) {
    this.snapshot = snapshot;
    return this;
  }

  /**
   * Get snapshot
   * @return snapshot
   */
  @ApiModelProperty(example = "24w14potato", value = "")
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

