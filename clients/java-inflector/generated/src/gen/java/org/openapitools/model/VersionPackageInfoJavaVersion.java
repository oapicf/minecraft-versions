package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2025-05-10T01:44:12.827040299Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class VersionPackageInfoJavaVersion   {
  @JsonProperty("component")
  private String component;

  @JsonProperty("majorVersion")
  private Integer majorVersion;

  /**
   **/
  public VersionPackageInfoJavaVersion component(String component) {
    this.component = component;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("component")
  public String getComponent() {
    return component;
  }
  public void setComponent(String component) {
    this.component = component;
  }

  /**
   **/
  public VersionPackageInfoJavaVersion majorVersion(Integer majorVersion) {
    this.majorVersion = majorVersion;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("majorVersion")
  public Integer getMajorVersion() {
    return majorVersion;
  }
  public void setMajorVersion(Integer majorVersion) {
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
    return Objects.equals(component, versionPackageInfoJavaVersion.component) &&
        Objects.equals(majorVersion, versionPackageInfoJavaVersion.majorVersion);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

