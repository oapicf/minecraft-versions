package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * VersionPackageInfoJavaVersion
 */

@JsonTypeName("VersionPackageInfo_javaVersion")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-10T07:24:22.518481704Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class VersionPackageInfoJavaVersion {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String component;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer majorVersion;

  public VersionPackageInfoJavaVersion component(@Nullable String component) {
    this.component = component;
    return this;
  }

  /**
   * Get component
   * @return component
   */
  
  @Schema(name = "component", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("component")
  public @Nullable String getComponent() {
    return component;
  }

  @JsonProperty("component")
  public void setComponent(@Nullable String component) {
    this.component = component;
  }

  public VersionPackageInfoJavaVersion majorVersion(@Nullable Integer majorVersion) {
    this.majorVersion = majorVersion;
    return this;
  }

  /**
   * Get majorVersion
   * @return majorVersion
   */
  
  @Schema(name = "majorVersion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("majorVersion")
  public @Nullable Integer getMajorVersion() {
    return majorVersion;
  }

  @JsonProperty("majorVersion")
  public void setMajorVersion(@Nullable Integer majorVersion) {
    this.majorVersion = majorVersion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionPackageInfoJavaVersion versionPackageInfoJavaVersion = (VersionPackageInfoJavaVersion) o;
    return Objects.equals(this.component, versionPackageInfoJavaVersion.component) &&
        Objects.equals(this.majorVersion, versionPackageInfoJavaVersion.majorVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(component, majorVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionPackageInfoJavaVersion {\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    majorVersion: ").append(toIndentedString(majorVersion)).append("\n");
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

