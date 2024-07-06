package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.Download;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VersionPackageInfoDownloads   {
  
  private Download client;
  private Download clientMappings;
  private Download server;
  private Download serverMappings;

  public VersionPackageInfoDownloads () {

  }

  public VersionPackageInfoDownloads (Download client, Download clientMappings, Download server, Download serverMappings) {
    this.client = client;
    this.clientMappings = clientMappings;
    this.server = server;
    this.serverMappings = serverMappings;
  }

    
  @JsonProperty("client")
  public Download getClient() {
    return client;
  }
  public void setClient(Download client) {
    this.client = client;
  }

    
  @JsonProperty("client_mappings")
  public Download getClientMappings() {
    return clientMappings;
  }
  public void setClientMappings(Download clientMappings) {
    this.clientMappings = clientMappings;
  }

    
  @JsonProperty("server")
  public Download getServer() {
    return server;
  }
  public void setServer(Download server) {
    this.server = server;
  }

    
  @JsonProperty("server_mappings")
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
    return Objects.equals(client, versionPackageInfoDownloads.client) &&
        Objects.equals(clientMappings, versionPackageInfoDownloads.clientMappings) &&
        Objects.equals(server, versionPackageInfoDownloads.server) &&
        Objects.equals(serverMappings, versionPackageInfoDownloads.serverMappings);
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
