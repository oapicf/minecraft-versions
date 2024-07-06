package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.McGameVersionManifestGet200ResponseLatest;
import com.prokarma.pkmst.model.McGameVersionManifestGet200ResponseVersionsInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * McGameVersionManifestGet200Response
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-07-06T01:32:43.130084075Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class McGameVersionManifestGet200Response   {
  @JsonProperty("latest")
  private McGameVersionManifestGet200ResponseLatest latest;

  @JsonProperty("versions")
  
  private List<McGameVersionManifestGet200ResponseVersionsInner> versions = null;

  public McGameVersionManifestGet200Response latest(McGameVersionManifestGet200ResponseLatest latest) {
    this.latest = latest;
    return this;
  }

   /**
   * Get latest
   * @return latest
  **/
  @ApiModelProperty(value = "")
  public McGameVersionManifestGet200ResponseLatest getLatest() {
    return latest;
  }

  public void setLatest(McGameVersionManifestGet200ResponseLatest latest) {
    this.latest = latest;
  }

  public McGameVersionManifestGet200Response versions(List<McGameVersionManifestGet200ResponseVersionsInner> versions) {
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
  **/
  @ApiModelProperty(value = "")
  public List<McGameVersionManifestGet200ResponseVersionsInner> getVersions() {
    return versions;
  }

  public void setVersions(List<McGameVersionManifestGet200ResponseVersionsInner> versions) {
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

