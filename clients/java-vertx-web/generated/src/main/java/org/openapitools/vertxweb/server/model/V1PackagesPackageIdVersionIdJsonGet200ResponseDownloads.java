package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads   {
  
  private V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient client;
  private V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient clientMappings;
  private V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient server;
  private V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient serverMappings;

  public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads () {

  }

  public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads (V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient client, V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient clientMappings, V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient server, V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient serverMappings) {
    this.client = client;
    this.clientMappings = clientMappings;
    this.server = server;
    this.serverMappings = serverMappings;
  }

    
  @JsonProperty("client")
  public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient getClient() {
    return client;
  }
  public void setClient(V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient client) {
    this.client = client;
  }

    
  @JsonProperty("client_mappings")
  public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient getClientMappings() {
    return clientMappings;
  }
  public void setClientMappings(V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient clientMappings) {
    this.clientMappings = clientMappings;
  }

    
  @JsonProperty("server")
  public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient getServer() {
    return server;
  }
  public void setServer(V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient server) {
    this.server = server;
  }

    
  @JsonProperty("server_mappings")
  public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient getServerMappings() {
    return serverMappings;
  }
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
    return Objects.equals(client, v1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.client) &&
        Objects.equals(clientMappings, v1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.clientMappings) &&
        Objects.equals(server, v1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.server) &&
        Objects.equals(serverMappings, v1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.serverMappings);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
