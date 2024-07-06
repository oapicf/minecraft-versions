package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class McGameVersionManifestGet200ResponseLatest  {
  
  @ApiModelProperty(example = "1.21", value = "")
  private String release;

  @ApiModelProperty(example = "24w14potato", value = "")
  private String snapshot;
 /**
  * Get release
  * @return release
  */
  @JsonProperty("release")
  public String getRelease() {
    return release;
  }

  /**
   * Sets the <code>release</code> property.
   */
 public void setRelease(String release) {
    this.release = release;
  }

  /**
   * Sets the <code>release</code> property.
   */
  public McGameVersionManifestGet200ResponseLatest release(String release) {
    this.release = release;
    return this;
  }

 /**
  * Get snapshot
  * @return snapshot
  */
  @JsonProperty("snapshot")
  public String getSnapshot() {
    return snapshot;
  }

  /**
   * Sets the <code>snapshot</code> property.
   */
 public void setSnapshot(String snapshot) {
    this.snapshot = snapshot;
  }

  /**
   * Sets the <code>snapshot</code> property.
   */
  public McGameVersionManifestGet200ResponseLatest snapshot(String snapshot) {
    this.snapshot = snapshot;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

