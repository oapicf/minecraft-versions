package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Version
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-15T12:30:41.108715545Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class Version {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String id;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String type;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String url;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime time;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime releaseTime;

  public Version id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", example = "24w14potato", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(@Nullable String id) {
    this.id = id;
  }

  public Version type(@Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  
  @Schema(name = "type", example = "snapshot", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public @Nullable String getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(@Nullable String type) {
    this.type = type;
  }

  public Version url(@Nullable String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
   */
  
  @Schema(name = "url", example = "https://piston-meta.mojang.com/v1/packages/21df7f4ba484a6437ab5e9dca0b4dfb5dcefc802/24w14potato.json", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("url")
  public @Nullable String getUrl() {
    return url;
  }

  @JsonProperty("url")
  public void setUrl(@Nullable String url) {
    this.url = url;
  }

  public Version time(@Nullable OffsetDateTime time) {
    this.time = time;
    return this;
  }

  /**
   * Get time
   * @return time
   */
  @Valid 
  @Schema(name = "time", example = "2024-04-01T11:14:41.000+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("time")
  public @Nullable OffsetDateTime getTime() {
    return time;
  }

  @JsonProperty("time")
  public void setTime(@Nullable OffsetDateTime time) {
    this.time = time;
  }

  public Version releaseTime(@Nullable OffsetDateTime releaseTime) {
    this.releaseTime = releaseTime;
    return this;
  }

  /**
   * Get releaseTime
   * @return releaseTime
   */
  @Valid 
  @Schema(name = "releaseTime", example = "2024-04-01T11:07:19.000+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("releaseTime")
  public @Nullable OffsetDateTime getReleaseTime() {
    return releaseTime;
  }

  @JsonProperty("releaseTime")
  public void setReleaseTime(@Nullable OffsetDateTime releaseTime) {
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
    Version version = (Version) o;
    return Objects.equals(this.id, version.id) &&
        Objects.equals(this.type, version.type) &&
        Objects.equals(this.url, version.url) &&
        Objects.equals(this.time, version.time) &&
        Objects.equals(this.releaseTime, version.releaseTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, url, time, releaseTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Version {\n");
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

