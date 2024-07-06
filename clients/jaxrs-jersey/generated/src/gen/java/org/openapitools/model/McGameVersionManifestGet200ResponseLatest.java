/*
 * 
 * SDK for Minecraft versions info
 *
 * The version of the OpenAPI document: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * McGameVersionManifestGet200ResponseLatest
 */
@JsonPropertyOrder({
  McGameVersionManifestGet200ResponseLatest.JSON_PROPERTY_RELEASE,
  McGameVersionManifestGet200ResponseLatest.JSON_PROPERTY_SNAPSHOT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-07-06T01:33:12.790227571Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class McGameVersionManifestGet200ResponseLatest   {
  public static final String JSON_PROPERTY_RELEASE = "release";
  @JsonProperty(JSON_PROPERTY_RELEASE)
  private String release;

  public static final String JSON_PROPERTY_SNAPSHOT = "snapshot";
  @JsonProperty(JSON_PROPERTY_SNAPSHOT)
  private String snapshot;

  public McGameVersionManifestGet200ResponseLatest release(String release) {
    this.release = release;
    return this;
  }

  /**
   * Get release
   * @return release
   **/
  @JsonProperty(value = "release")
  @ApiModelProperty(example = "1.21", value = "")
  
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
  @JsonProperty(value = "snapshot")
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

