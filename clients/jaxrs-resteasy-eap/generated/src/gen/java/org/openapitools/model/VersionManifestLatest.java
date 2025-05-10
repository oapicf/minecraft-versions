package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2025-05-10T01:44:30.825548058Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class VersionManifestLatest   {
  
  private String release;
  private String snapshot;

  /**
   **/
  
  @ApiModelProperty(example = "1.21", value = "")
  @JsonProperty("release")
  public String getRelease() {
    return release;
  }
  public void setRelease(String release) {
    this.release = release;
  }

  /**
   **/
  
  @ApiModelProperty(example = "24w14potato", value = "")
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

