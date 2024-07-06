package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.McGameVersionManifestGet200ResponseLatest;
import org.openapitools.model.McGameVersionManifestGet200ResponseVersionsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class McGameVersionManifestGet200Response  {
  
  @ApiModelProperty(value = "")
  @Valid
  private McGameVersionManifestGet200ResponseLatest latest;

  @ApiModelProperty(value = "")
  @Valid
  private List<@Valid McGameVersionManifestGet200ResponseVersionsInner> versions = new ArrayList<>();
 /**
  * Get latest
  * @return latest
  */
  @JsonProperty("latest")
  public McGameVersionManifestGet200ResponseLatest getLatest() {
    return latest;
  }

  /**
   * Sets the <code>latest</code> property.
   */
 public void setLatest(McGameVersionManifestGet200ResponseLatest latest) {
    this.latest = latest;
  }

  /**
   * Sets the <code>latest</code> property.
   */
  public McGameVersionManifestGet200Response latest(McGameVersionManifestGet200ResponseLatest latest) {
    this.latest = latest;
    return this;
  }

 /**
  * Get versions
  * @return versions
  */
  @JsonProperty("versions")
  public List<@Valid McGameVersionManifestGet200ResponseVersionsInner> getVersions() {
    return versions;
  }

  /**
   * Sets the <code>versions</code> property.
   */
 public void setVersions(List<@Valid McGameVersionManifestGet200ResponseVersionsInner> versions) {
    this.versions = versions;
  }

  /**
   * Sets the <code>versions</code> property.
   */
  public McGameVersionManifestGet200Response versions(List<@Valid McGameVersionManifestGet200ResponseVersionsInner> versions) {
    this.versions = versions;
    return this;
  }

  /**
   * Adds a new item to the <code>versions</code> list.
   */
  public McGameVersionManifestGet200Response addVersionsItem(McGameVersionManifestGet200ResponseVersionsInner versionsItem) {
    this.versions.add(versionsItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

