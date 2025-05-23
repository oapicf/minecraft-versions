/*
 * openapi-micronaut-client
 * SDK for Minecraft versions info
 *
 * The version of the OpenAPI document: 1.1.1-pre.0
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

/**
 * VersionManifestLatest
 */
@JsonPropertyOrder({
  VersionManifestLatest.JSON_PROPERTY_RELEASE,
  VersionManifestLatest.JSON_PROPERTY_SNAPSHOT
})
@JsonTypeName("VersionManifest_latest")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2025-05-10T01:44:13.915701679Z[Etc/UTC]", comments = "Generator version: 7.12.0")
@Introspected
public class VersionManifestLatest {
    public static final String JSON_PROPERTY_RELEASE = "release";
    private String release;

    public static final String JSON_PROPERTY_SNAPSHOT = "snapshot";
    private String snapshot;

    public VersionManifestLatest() {
    }

    public VersionManifestLatest release(String release) {
        this.release = release;
        return this;
    }

    /**
     * Get release
     * @return release
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_RELEASE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getRelease() {
        return release;
    }

    @JsonProperty(JSON_PROPERTY_RELEASE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRelease(String release) {
        this.release = release;
    }

    public VersionManifestLatest snapshot(String snapshot) {
        this.snapshot = snapshot;
        return this;
    }

    /**
     * Get snapshot
     * @return snapshot
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_SNAPSHOT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getSnapshot() {
        return snapshot;
    }

    @JsonProperty(JSON_PROPERTY_SNAPSHOT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSnapshot(String snapshot) {
        this.snapshot = snapshot;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VersionManifestLatest versionManifestLatest = (VersionManifestLatest) o;
        return Objects.equals(this.release, versionManifestLatest.release) &&
            Objects.equals(this.snapshot, versionManifestLatest.snapshot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(release, snapshot);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionManifestLatest {\n");
        sb.append("    release: ").append(toIndentedString(release)).append("\n");
        sb.append("    snapshot: ").append(toIndentedString(snapshot)).append("\n");
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

