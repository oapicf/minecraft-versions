package org.openapitools.model;

import org.openapitools.model.V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads  {
  
  @ApiModelProperty(value = "")
  private V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient client;

  @ApiModelProperty(value = "")
  private V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient clientMappings;

  @ApiModelProperty(value = "")
  private V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient server;

  @ApiModelProperty(value = "")
  private V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient serverMappings;
 /**
   * Get client
   * @return client
  **/
  @JsonProperty("client")
  public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient getClient() {
    return client;
  }

  public void setClient(V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient client) {
    this.client = client;
  }

  public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads client(V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient client) {
    this.client = client;
    return this;
  }

 /**
   * Get clientMappings
   * @return clientMappings
  **/
  @JsonProperty("client_mappings")
  public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient getClientMappings() {
    return clientMappings;
  }

  public void setClientMappings(V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient clientMappings) {
    this.clientMappings = clientMappings;
  }

  public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads clientMappings(V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient clientMappings) {
    this.clientMappings = clientMappings;
    return this;
  }

 /**
   * Get server
   * @return server
  **/
  @JsonProperty("server")
  public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient getServer() {
    return server;
  }

  public void setServer(V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient server) {
    this.server = server;
  }

  public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads server(V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient server) {
    this.server = server;
    return this;
  }

 /**
   * Get serverMappings
   * @return serverMappings
  **/
  @JsonProperty("server_mappings")
  public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient getServerMappings() {
    return serverMappings;
  }

  public void setServerMappings(V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient serverMappings) {
    this.serverMappings = serverMappings;
  }

  public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads serverMappings(V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient serverMappings) {
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
    V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads v1PackagesPackageIdVersionIdJsonGet200ResponseDownloads = (V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads) o;
    return Objects.equals(this.client, v1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.client) &&
        Objects.equals(this.clientMappings, v1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.clientMappings) &&
        Objects.equals(this.server, v1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.server) &&
        Objects.equals(this.serverMappings, v1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.serverMappings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(client, clientMappings, server, serverMappings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads {\n");
    
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
