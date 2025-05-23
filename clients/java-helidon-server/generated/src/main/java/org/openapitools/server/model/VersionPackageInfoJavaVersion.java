package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class VersionPackageInfoJavaVersion   {

    private String component;
    private Integer majorVersion;

    /**
     * Default constructor.
     */
    public VersionPackageInfoJavaVersion() {
    // JSON-B / Jackson
    }

    /**
     * Create VersionPackageInfoJavaVersion.
     *
     * @param component component
     * @param majorVersion majorVersion
     */
    public VersionPackageInfoJavaVersion(
        String component, 
        Integer majorVersion
    ) {
        this.component = component;
        this.majorVersion = majorVersion;
    }



    /**
     * Get component
     * @return component
     */
    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    /**
     * Get majorVersion
     * @return majorVersion
     */
    public Integer getMajorVersion() {
        return majorVersion;
    }

    public void setMajorVersion(Integer majorVersion) {
        this.majorVersion = majorVersion;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

