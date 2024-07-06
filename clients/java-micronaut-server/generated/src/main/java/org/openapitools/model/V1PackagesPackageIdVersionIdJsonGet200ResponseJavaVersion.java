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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion
 */
@JsonPropertyOrder({
  V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion.JSON_PROPERTY_COMPONENT,
  V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion.JSON_PROPERTY_MAJOR_VERSION
})
@JsonTypeName("_v1_packages__packageId___versionId__json_get_200_response_javaVersion")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-07-06T08:44:36.167329976Z[Etc/UTC]", comments = "Generator version: 7.6.0")
@Introspected
public class V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion {
    public static final String JSON_PROPERTY_COMPONENT = "component";
    private String component;

    public static final String JSON_PROPERTY_MAJOR_VERSION = "majorVersion";
    private Integer majorVersion;

    public V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion() {
    }

    public V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion component(String component) {
        this.component = component;
        return this;
    }

    /**
     * Get component
     * @return component
     **/
    @Nullable
    @Schema(name = "component", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_COMPONENT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getComponent() {
        return component;
    }

    @JsonProperty(JSON_PROPERTY_COMPONENT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @Schema(name = "majorVersion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_MAJOR_VERSION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getMajorVersion() {
        return majorVersion;
    }

    @JsonProperty(JSON_PROPERTY_MAJOR_VERSION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

