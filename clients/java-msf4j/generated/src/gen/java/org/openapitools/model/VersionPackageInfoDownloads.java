package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Download;

/**
 * VersionPackageInfoDownloads
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2025-05-10T01:44:16.356714070Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class VersionPackageInfoDownloads   {
  @JsonProperty("client")
  private Download client;

  @JsonProperty("client_mappings")
  private Download clientMappings;

  @JsonProperty("server")
  private Download server;

  @JsonProperty("server_mappings")
  private Download serverMappings;

  public VersionPackageInfoDownloads client(Download client) {
    this.client = client;
    return this;
  }

   /**
   * Get client
   * @return client
  **/
  @ApiModelProperty(value = "")
  public Download getClient() {
    return client;
  }

  public void setClient(Download client) {
    this.client = client;
  }

  public VersionPackageInfoDownloads clientMappings(Download clientMappings) {
    this.clientMappings = clientMappings;
    return this;
  }

   /**
   * Get clientMappings
   * @return clientMappings
  **/
  @ApiModelProperty(value = "")
  public Download getClientMappings() {
    return clientMappings;
  }

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
  **/
  @ApiModelProperty(value = "")
  public Download getServer() {
    return server;
  }

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
  **/
  @ApiModelProperty(value = "")
  public Download getServerMappings() {
    return serverMappings;
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

