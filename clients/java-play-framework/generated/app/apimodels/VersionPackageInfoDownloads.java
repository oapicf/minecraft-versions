package apimodels;

import apimodels.Download;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * VersionPackageInfoDownloads
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-03T05:50:47.183358972Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class VersionPackageInfoDownloads   {
  @JsonProperty("client")
  @Valid

  private Download client;

  @JsonProperty("client_mappings")
  @Valid

  private Download clientMappings;

  @JsonProperty("server")
  @Valid

  private Download server;

  @JsonProperty("server_mappings")
  @Valid

  private Download serverMappings;

  public VersionPackageInfoDownloads client(Download client) {
    this.client = client;
    return this;
  }

   /**
   * Get client
   * @return client
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

