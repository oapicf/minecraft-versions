package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * McGameVersionManifestGet200ResponseLatest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-07-06T01:32:47.203764015Z[Etc/UTC]", comments = "Generator version: 7.6.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class McGameVersionManifestGet200ResponseLatest   {
  @JsonProperty("release")
  
  private String release;

  @JsonProperty("snapshot")
  
  private String snapshot;

  public McGameVersionManifestGet200ResponseLatest release(String release) {
    this.release = release;
    return this;
  }

   /**
   * Get release
   * @return release
  **/
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
  **/
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
    return Objects.equals(release, mcGameVersionManifestGet200ResponseLatest.release) &&
        Objects.equals(snapshot, mcGameVersionManifestGet200ResponseLatest.snapshot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(release, snapshot);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

