/*
 * openapi-micronaut
 * SDK for Minecraft versions info
 *
 * The version of the OpenAPI document: 0.12.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Version
 */
@JsonPropertyOrder({
  Version.JSON_PROPERTY_ID,
  Version.JSON_PROPERTY_TYPE,
  Version.JSON_PROPERTY_URL,
  Version.JSON_PROPERTY_TIME,
  Version.JSON_PROPERTY_RELEASE_TIME
})
@JsonTypeName("Version")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-11-03T05:50:36.563568562Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class Version {
    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_TYPE = "type";
    private String type;

    public static final String JSON_PROPERTY_URL = "url";
    private String url;

    public static final String JSON_PROPERTY_TIME = "time";
    private OffsetDateTime time;

    public static final String JSON_PROPERTY_RELEASE_TIME = "releaseTime";
    private OffsetDateTime releaseTime;

    public Version() {
    }

    public Version id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @Nullable
    @Schema(name = "id", example = "24w14potato", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setId(String id) {
        this.id = id;
    }

    public Version type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @Nullable
    @Schema(name = "type", example = "snapshot", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getType() {
        return type;
    }

    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setType(String type) {
        this.type = type;
    }

    public Version url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @Nullable
    @Schema(name = "url", example = "https://piston-meta.mojang.com/v1/packages/21df7f4ba484a6437ab5e9dca0b4dfb5dcefc802/24w14potato.json", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getUrl() {
        return url;
    }

    @JsonProperty(JSON_PROPERTY_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setUrl(String url) {
        this.url = url;
    }

    public Version time(OffsetDateTime time) {
        this.time = time;
        return this;
    }

    /**
     * Get time
     * @return time
     */
    @Nullable
    @Schema(name = "time", example = "2024-04-01T11:14:41.000Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public OffsetDateTime getTime() {
        return time;
    }

    @JsonProperty(JSON_PROPERTY_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public void setTime(OffsetDateTime time) {
        this.time = time;
    }

    public Version releaseTime(OffsetDateTime releaseTime) {
        this.releaseTime = releaseTime;
        return this;
    }

    /**
     * Get releaseTime
     * @return releaseTime
     */
    @Nullable
    @Schema(name = "releaseTime", example = "2024-04-01T11:07:19.000Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_RELEASE_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public OffsetDateTime getReleaseTime() {
        return releaseTime;
    }

    @JsonProperty(JSON_PROPERTY_RELEASE_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public void setReleaseTime(OffsetDateTime releaseTime) {
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
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

