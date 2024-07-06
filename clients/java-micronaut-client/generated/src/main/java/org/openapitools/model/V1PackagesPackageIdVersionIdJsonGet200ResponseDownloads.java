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
import org.openapitools.model.V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads
 */
@JsonPropertyOrder({
  V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.JSON_PROPERTY_CLIENT,
  V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.JSON_PROPERTY_CLIENT_MAPPINGS,
  V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.JSON_PROPERTY_SERVER,
  V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.JSON_PROPERTY_SERVER_MAPPINGS
})
@JsonTypeName("_v1_packages__packageId___versionId__json_get_200_response_downloads")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-07-06T08:44:33.176951613Z[Etc/UTC]", comments = "Generator version: 7.6.0")
@Introspected
public class V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads {
    public static final String JSON_PROPERTY_CLIENT = "client";
    private V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient _client;

    public static final String JSON_PROPERTY_CLIENT_MAPPINGS = "client_mappings";
    private V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient clientMappings;

    public static final String JSON_PROPERTY_SERVER = "server";
    private V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient server;

    public static final String JSON_PROPERTY_SERVER_MAPPINGS = "server_mappings";
    private V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient serverMappings;

    public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads() {
    }

    public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads _client(V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient _client) {
        this._client = _client;
        return this;
    }

    /**
     * Get _client
     * @return _client
     **/
    @Valid
    @Nullable
    @JsonProperty(JSON_PROPERTY_CLIENT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient getClient() {
        return _client;
    }

    @JsonProperty(JSON_PROPERTY_CLIENT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setClient(V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient _client) {
        this._client = _client;
    }

    public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads clientMappings(V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient clientMappings) {
        this.clientMappings = clientMappings;
        return this;
    }

    /**
     * Get clientMappings
     * @return clientMappings
     **/
    @Valid
    @Nullable
    @JsonProperty(JSON_PROPERTY_CLIENT_MAPPINGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient getClientMappings() {
        return clientMappings;
    }

    @JsonProperty(JSON_PROPERTY_CLIENT_MAPPINGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setClientMappings(V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient clientMappings) {
        this.clientMappings = clientMappings;
    }

    public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads server(V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient server) {
        this.server = server;
        return this;
    }

    /**
     * Get server
     * @return server
     **/
    @Valid
    @Nullable
    @JsonProperty(JSON_PROPERTY_SERVER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient getServer() {
        return server;
    }

    @JsonProperty(JSON_PROPERTY_SERVER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setServer(V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient server) {
        this.server = server;
    }

    public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads serverMappings(V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient serverMappings) {
        this.serverMappings = serverMappings;
        return this;
    }

    /**
     * Get serverMappings
     * @return serverMappings
     **/
    @Valid
    @Nullable
    @JsonProperty(JSON_PROPERTY_SERVER_MAPPINGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient getServerMappings() {
        return serverMappings;
    }

    @JsonProperty(JSON_PROPERTY_SERVER_MAPPINGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setServerMappings(V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient serverMappings) {
        this.serverMappings = serverMappings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads v1PackagesPackageIdVersionIdJsonGet200ResponseDownloads = (V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads) o;
        return Objects.equals(this._client, v1PackagesPackageIdVersionIdJsonGet200ResponseDownloads._client) &&
            Objects.equals(this.clientMappings, v1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.clientMappings) &&
            Objects.equals(this.server, v1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.server) &&
            Objects.equals(this.serverMappings, v1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.serverMappings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_client, clientMappings, server, serverMappings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads {\n");
        sb.append("    _client: ").append(toIndentedString(_client)).append("\n");
        sb.append("    clientMappings: ").append(toIndentedString(clientMappings)).append("\n");
        sb.append("    server: ").append(toIndentedString(server)).append("\n");
        sb.append("    serverMappings: ").append(toIndentedString(serverMappings)).append("\n");
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

