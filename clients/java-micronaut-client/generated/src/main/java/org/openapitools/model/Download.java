/*
 * openapi-micronaut-client
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
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Download
 */
@JsonPropertyOrder({
  Download.JSON_PROPERTY_SHA1,
  Download.JSON_PROPERTY_SIZE,
  Download.JSON_PROPERTY_URL
})
@JsonTypeName("Download")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-11-03T05:50:32.994705385Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class Download {
    public static final String JSON_PROPERTY_SHA1 = "sha1";
    private String sha1;

    public static final String JSON_PROPERTY_SIZE = "size";
    private Integer size;

    public static final String JSON_PROPERTY_URL = "url";
    private String url;

    public Download() {
    }

    public Download sha1(String sha1) {
        this.sha1 = sha1;
        return this;
    }

    /**
     * Get sha1
     * @return sha1
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_SHA1)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getSha1() {
        return sha1;
    }

    @JsonProperty(JSON_PROPERTY_SHA1)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSha1(String sha1) {
        this.sha1 = sha1;
    }

    public Download size(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * Get size
     * @return size
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_SIZE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getSize() {
        return size;
    }

    @JsonProperty(JSON_PROPERTY_SIZE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSize(Integer size) {
        this.size = size;
    }

    public Download url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @Nullable
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Download download = (Download) o;
        return Objects.equals(this.sha1, download.sha1) &&
            Objects.equals(this.size, download.size) &&
            Objects.equals(this.url, download.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sha1, size, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Download {\n");
        sb.append("    sha1: ").append(toIndentedString(sha1)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

