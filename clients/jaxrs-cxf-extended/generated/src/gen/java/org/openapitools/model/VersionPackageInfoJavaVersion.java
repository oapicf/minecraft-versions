package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class VersionPackageInfoJavaVersion  {
  
  @ApiModelProperty(value = "")
  private String component;

  @ApiModelProperty(value = "")
  private Integer majorVersion;
 /**
  * Get component
  * @return component
  */
  @JsonProperty("component")
  public String getComponent() {
    return component;
  }

  /**
   * Sets the <code>component</code> property.
   */
 public void setComponent(String component) {
    this.component = component;
  }

  /**
   * Sets the <code>component</code> property.
   */
  public VersionPackageInfoJavaVersion component(String component) {
    this.component = component;
    return this;
  }

 /**
  * Get majorVersion
  * @return majorVersion
  */
  @JsonProperty("majorVersion")
  public Integer getMajorVersion() {
    return majorVersion;
  }

  /**
   * Sets the <code>majorVersion</code> property.
   */
 public void setMajorVersion(Integer majorVersion) {
    this.majorVersion = majorVersion;
  }

  /**
   * Sets the <code>majorVersion</code> property.
   */
  public VersionPackageInfoJavaVersion majorVersion(Integer majorVersion) {
    this.majorVersion = majorVersion;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

