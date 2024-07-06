package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-07-06T01:32:47.203764015Z[Etc/UTC]", comments = "Generator version: 7.6.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion   {
  @JsonProperty("component")
  
  private String component;

  @JsonProperty("majorVersion")
  
  private Integer majorVersion;

  public V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion component(String component) {
    this.component = component;
    return this;
  }

   /**
   * Get component
   * @return component
  **/
  public String getComponent() {
    return component;
  }

  public void setComponent(String component) {
    this.component = component;
  }

  public V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion majorVersion(Integer majorVersion) {
    this.majorVersion = majorVersion;
    return this;
  }

   /**
   * Get majorVersion
   * @return majorVersion
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

