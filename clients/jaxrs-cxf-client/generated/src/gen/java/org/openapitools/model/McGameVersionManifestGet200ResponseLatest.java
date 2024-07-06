package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class McGameVersionManifestGet200ResponseLatest  {
  
  @ApiModelProperty(example = "1.21", value = "")
  private String release;

  @ApiModelProperty(example = "24w14potato", value = "")
  private String snapshot;
 /**
   * Get release
   * @return release
  **/
  @JsonProperty("release")
  public String getRelease() {
    return release;
  }

  public void setRelease(String release) {
    this.release = release;
  }

  public McGameVersionManifestGet200ResponseLatest release(String release) {
    this.release = release;
    return this;
  }

 /**
   * Get snapshot
   * @return snapshot
  **/
  @JsonProperty("snapshot")
  public String getSnapshot() {
    return snapshot;
  }

  public void setSnapshot(String snapshot) {
    this.snapshot = snapshot;
  }

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

