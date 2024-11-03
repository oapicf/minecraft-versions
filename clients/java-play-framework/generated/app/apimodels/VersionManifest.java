package apimodels;

import apimodels.Version;
import apimodels.VersionManifestLatest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * VersionManifest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-03T05:50:47.183358972Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class VersionManifest   {
  @JsonProperty("latest")
  @Valid

  private VersionManifestLatest latest;

  @JsonProperty("versions")
  @Valid

  private List<@Valid Version> versions = null;

  public VersionManifest latest(VersionManifestLatest latest) {
    this.latest = latest;
    return this;
  }

   /**
   * Get latest
   * @return latest
  **/
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
  **/
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
    return Objects.equals(latest, versionManifest.latest) &&
        Objects.equals(versions, versionManifest.versions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latest, versions);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

