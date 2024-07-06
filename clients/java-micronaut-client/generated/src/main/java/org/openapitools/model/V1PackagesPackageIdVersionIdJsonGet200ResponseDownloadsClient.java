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

/**
 * V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient
 */
@JsonPropertyOrder({
  V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient.JSON_PROPERTY_SHA1,
  V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient.JSON_PROPERTY_SIZE,
  V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient.JSON_PROPERTY_URL
})
@JsonTypeName("_v1_packages__packageId___versionId__json_get_200_response_downloads_client")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-07-06T08:44:33.176951613Z[Etc/UTC]", comments = "Generator version: 7.6.0")
@Introspected
public class V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient {
    public static final String JSON_PROPERTY_SHA1 = "sha1";
    private String sha1;

    public static final String JSON_PROPERTY_SIZE = "size";
    private Integer size;

    public static final String JSON_PROPERTY_URL = "url";
    private String url;

    public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient() {
    }

    public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient sha1(String sha1) {
        this.sha1 = sha1;
        return this;
    }

    /**
     * Get sha1
     * @return sha1
     **/
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

    public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient size(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * Get size
     * @return size
     **/
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

    public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     **/
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
        V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient v1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient = (V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient) o;
        return Objects.equals(this.sha1, v1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient.sha1) &&
            Objects.equals(this.size, v1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient.size) &&
            Objects.equals(this.url, v1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sha1, size, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient {\n");
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

