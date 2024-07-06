package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.Download;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class VersionPackageInfoDownloads  {
  
  @ApiModelProperty(value = "")
  @Valid
  private Download client;

  @ApiModelProperty(value = "")
  @Valid
  private Download clientMappings;

  @ApiModelProperty(value = "")
  @Valid
  private Download server;

  @ApiModelProperty(value = "")
  @Valid
  private Download serverMappings;
 /**
   * Get client
   * @return client
  **/
  @JsonProperty("client")
  public Download getClient() {
    return client;
  }

  public void setClient(Download client) {
    this.client = client;
  }

  public VersionPackageInfoDownloads client(Download client) {
    this.client = client;
    return this;
  }

 /**
   * Get clientMappings
   * @return clientMappings
  **/
  @JsonProperty("client_mappings")
  public Download getClientMappings() {
    return clientMappings;
  }

  public void setClientMappings(Download clientMappings) {
    this.clientMappings = clientMappings;
  }

  public VersionPackageInfoDownloads clientMappings(Download clientMappings) {
    this.clientMappings = clientMappings;
    return this;
  }

 /**
   * Get server
   * @return server
  **/
  @JsonProperty("server")
  public Download getServer() {
    return server;
  }

  public void setServer(Download server) {
    this.server = server;
  }

  public VersionPackageInfoDownloads server(Download server) {
    this.server = server;
    return this;
  }

 /**
   * Get serverMappings
   * @return serverMappings
  **/
  @JsonProperty("server_mappings")
  public Download getServerMappings() {
    return serverMappings;
  }

  public void setServerMappings(Download serverMappings) {
    this.serverMappings = serverMappings;
  }

  public VersionPackageInfoDownloads serverMappings(Download serverMappings) {
    this.serverMappings = serverMappings;
    return this;
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
    return Objects.equals(this.client, versionPackageInfoDownloads.client) &&
        Objects.equals(this.clientMappings, versionPackageInfoDownloads.clientMappings) &&
        Objects.equals(this.server, versionPackageInfoDownloads.server) &&
        Objects.equals(this.serverMappings, versionPackageInfoDownloads.serverMappings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(client, clientMappings, server, serverMappings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionPackageInfoDownloads {\n");
    
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

