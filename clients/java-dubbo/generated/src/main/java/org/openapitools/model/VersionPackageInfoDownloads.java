package org.openapitools.model;

import org.openapitools.model.Download;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class VersionPackageInfoDownloads implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("client")
  private Download client;

  @JsonProperty("client_mappings")
  private Download clientMappings;

  @JsonProperty("server")
  private Download server;

  @JsonProperty("server_mappings")
  private Download serverMappings;

  /**
   * 
   * @return client
   */
  public Download getClient() {
    return client;
  }

  public void setClient(Download client) {
    this.client = client;
  }

  /**
   * 
   * @return clientMappings
   */
  public Download getClientMappings() {
    return clientMappings;
  }

  public void setClientMappings(Download clientMappings) {
    this.clientMappings = clientMappings;
  }

  /**
   * 
   * @return server
   */
  public Download getServer() {
    return server;
  }

  public void setServer(Download server) {
    this.server = server;
  }

  /**
   * 
   * @return serverMappings
   */
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
