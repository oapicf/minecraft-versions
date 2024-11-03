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
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.Download;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * VersionPackageInfoDownloads
 */
@JsonPropertyOrder({
  VersionPackageInfoDownloads.JSON_PROPERTY_CLIENT,
  VersionPackageInfoDownloads.JSON_PROPERTY_CLIENT_MAPPINGS,
  VersionPackageInfoDownloads.JSON_PROPERTY_SERVER,
  VersionPackageInfoDownloads.JSON_PROPERTY_SERVER_MAPPINGS
})
@JsonTypeName("VersionPackageInfo_downloads")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-11-03T05:50:36.563568562Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class VersionPackageInfoDownloads {
    public static final String JSON_PROPERTY_CLIENT = "client";
    private Download _client;

    public static final String JSON_PROPERTY_CLIENT_MAPPINGS = "client_mappings";
    private Download clientMappings;

    public static final String JSON_PROPERTY_SERVER = "server";
    private Download server;

    public static final String JSON_PROPERTY_SERVER_MAPPINGS = "server_mappings";
    private Download serverMappings;

    public VersionPackageInfoDownloads() {
    }

    public VersionPackageInfoDownloads _client(Download _client) {
        this._client = _client;
        return this;
    }

    /**
     * Get _client
     * @return _client
     */
    @Valid
    @Nullable
    @Schema(name = "client", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_CLIENT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Download getClient() {
        return _client;
    }

    @JsonProperty(JSON_PROPERTY_CLIENT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setClient(Download _client) {
        this._client = _client;
    }

    public VersionPackageInfoDownloads clientMappings(Download clientMappings) {
        this.clientMappings = clientMappings;
        return this;
    }

    /**
     * Get clientMappings
     * @return clientMappings
     */
    @Valid
    @Nullable
    @Schema(name = "client_mappings", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_CLIENT_MAPPINGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Download getClientMappings() {
        return clientMappings;
    }

    @JsonProperty(JSON_PROPERTY_CLIENT_MAPPINGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setClientMappings(Download clientMappings) {
        this.clientMappings = clientMappings;
    }

    public VersionPackageInfoDownloads server(Download server) {
        this.server = server;
        return this;
    }

    /**
     * Get server
     * @return server
     */
    @Valid
    @Nullable
    @Schema(name = "server", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_SERVER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Download getServer() {
        return server;
    }

    @JsonProperty(JSON_PROPERTY_SERVER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setServer(Download server) {
        this.server = server;
    }

    public VersionPackageInfoDownloads serverMappings(Download serverMappings) {
        this.serverMappings = serverMappings;
        return this;
    }

    /**
     * Get serverMappings
     * @return serverMappings
     */
    @Valid
    @Nullable
    @Schema(name = "server_mappings", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_SERVER_MAPPINGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Download getServerMappings() {
        return serverMappings;
    }

    @JsonProperty(JSON_PROPERTY_SERVER_MAPPINGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setServerMappings(Download serverMappings) {
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
        VersionPackageInfoDownloads versionPackageInfoDownloads = (VersionPackageInfoDownloads) o;
        return Objects.equals(this._client, versionPackageInfoDownloads._client) &&
            Objects.equals(this.clientMappings, versionPackageInfoDownloads.clientMappings) &&
            Objects.equals(this.server, versionPackageInfoDownloads.server) &&
            Objects.equals(this.serverMappings, versionPackageInfoDownloads.serverMappings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_client, clientMappings, server, serverMappings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionPackageInfoDownloads {\n");
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

