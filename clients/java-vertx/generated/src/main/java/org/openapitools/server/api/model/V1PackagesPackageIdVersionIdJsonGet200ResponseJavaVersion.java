package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion   {
  
  private String component;
  private Integer majorVersion;

  public V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion () {

  }

  public V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion (String component, Integer majorVersion) {
    this.component = component;
    this.majorVersion = majorVersion;
  }

    
  @JsonProperty("component")
  public String getComponent() {
    return component;
  }
  public void setComponent(String component) {
    this.component = component;
  }

    
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
    V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion = (V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion) o;
    return Objects.equals(component, v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion.component) &&
        Objects.equals(majorVersion, v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion.majorVersion);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
