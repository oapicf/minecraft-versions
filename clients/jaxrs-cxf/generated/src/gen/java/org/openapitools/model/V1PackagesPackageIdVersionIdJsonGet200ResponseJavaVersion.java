package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion  {
  
  @ApiModelProperty(value = "")
  private String component;

  @ApiModelProperty(value = "")
  private Integer majorVersion;
 /**
   * Get component
   * @return component
  **/
  @JsonProperty("component")
  public String getComponent() {
    return component;
  }

  public void setComponent(String component) {
    this.component = component;
  }

  public V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion component(String component) {
    this.component = component;
    return this;
  }

 /**
   * Get majorVersion
   * @return majorVersion
  **/
  @JsonProperty("majorVersion")
  public Integer getMajorVersion() {
    return majorVersion;
  }

  public void setMajorVersion(Integer majorVersion) {
    this.majorVersion = majorVersion;
  }

  public V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion majorVersion(Integer majorVersion) {
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
    V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion = (V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion) o;
    return Objects.equals(this.component, v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion.component) &&
        Objects.equals(this.majorVersion, v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion.majorVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(component, majorVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion {\n");
    
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

