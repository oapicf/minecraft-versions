package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.McGameVersionManifestGet200ResponseLatest;
import org.openapitools.model.McGameVersionManifestGet200ResponseVersionsInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * McGameVersionManifestGet200Response
 */

@JsonTypeName("_mc_game_version_manifest_get_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T01:37:22.360466048Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class McGameVersionManifestGet200Response {

  private McGameVersionManifestGet200ResponseLatest latest;

  @Valid
  private List<@Valid McGameVersionManifestGet200ResponseVersionsInner> versions = new ArrayList<>();

  public McGameVersionManifestGet200Response latest(McGameVersionManifestGet200ResponseLatest latest) {
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
  public McGameVersionManifestGet200ResponseLatest getLatest() {
    return latest;
  }

  public void setLatest(McGameVersionManifestGet200ResponseLatest latest) {
    this.latest = latest;
  }

  public McGameVersionManifestGet200Response versions(List<@Valid McGameVersionManifestGet200ResponseVersionsInner> versions) {
    this.versions = versions;
    return this;
  }

  public McGameVersionManifestGet200Response addVersionsItem(McGameVersionManifestGet200ResponseVersionsInner versionsItem) {
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
  public List<@Valid McGameVersionManifestGet200ResponseVersionsInner> getVersions() {
    return versions;
  }

  public void setVersions(List<@Valid McGameVersionManifestGet200ResponseVersionsInner> versions) {
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
    McGameVersionManifestGet200Response mcGameVersionManifestGet200Response = (McGameVersionManifestGet200Response) o;
    return Objects.equals(this.latest, mcGameVersionManifestGet200Response.latest) &&
        Objects.equals(this.versions, mcGameVersionManifestGet200Response.versions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latest, versions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class McGameVersionManifestGet200Response {\n");
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

