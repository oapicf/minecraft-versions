package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * McGameVersionManifestGet200ResponseVersionsInner
 */

@JsonTypeName("_mc_game_version_manifest_get_200_response_versions_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T01:37:22.360466048Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class McGameVersionManifestGet200ResponseVersionsInner {

  private String id;

  private String type;

  private String url;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime time;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime releaseTime;

  public McGameVersionManifestGet200ResponseVersionsInner id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", example = "24w14potato", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public McGameVersionManifestGet200ResponseVersionsInner type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  
  @Schema(name = "type", example = "snapshot", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public McGameVersionManifestGet200ResponseVersionsInner url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
  */
  
  @Schema(name = "url", example = "https://piston-meta.mojang.com/v1/packages/21df7f4ba484a6437ab5e9dca0b4dfb5dcefc802/24w14potato.json", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public McGameVersionManifestGet200ResponseVersionsInner time(OffsetDateTime time) {
    this.time = time;
    return this;
  }

  /**
   * Get time
   * @return time
  */
  @Valid 
  @Schema(name = "time", example = "2024-04-01T11:14:41Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("time")
  public OffsetDateTime getTime() {
    return time;
  }

  public void setTime(OffsetDateTime time) {
    this.time = time;
  }

  public McGameVersionManifestGet200ResponseVersionsInner releaseTime(OffsetDateTime releaseTime) {
    this.releaseTime = releaseTime;
    return this;
  }

  /**
   * Get releaseTime
   * @return releaseTime
  */
  @Valid 
  @Schema(name = "releaseTime", example = "2024-04-01T11:07:19Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("releaseTime")
  public OffsetDateTime getReleaseTime() {
    return releaseTime;
  }

  public void setReleaseTime(OffsetDateTime releaseTime) {
    this.releaseTime = releaseTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    McGameVersionManifestGet200ResponseVersionsInner mcGameVersionManifestGet200ResponseVersionsInner = (McGameVersionManifestGet200ResponseVersionsInner) o;
    return Objects.equals(this.id, mcGameVersionManifestGet200ResponseVersionsInner.id) &&
        Objects.equals(this.type, mcGameVersionManifestGet200ResponseVersionsInner.type) &&
        Objects.equals(this.url, mcGameVersionManifestGet200ResponseVersionsInner.url) &&
        Objects.equals(this.time, mcGameVersionManifestGet200ResponseVersionsInner.time) &&
        Objects.equals(this.releaseTime, mcGameVersionManifestGet200ResponseVersionsInner.releaseTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, url, time, releaseTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class McGameVersionManifestGet200ResponseVersionsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    releaseTime: ").append(toIndentedString(releaseTime)).append("\n");
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

