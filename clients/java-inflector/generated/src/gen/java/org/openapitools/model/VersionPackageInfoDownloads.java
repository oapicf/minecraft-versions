package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Download;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-07-06T13:11:30.079690525Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class VersionPackageInfoDownloads   {
  @JsonProperty("client")
  private Download client;

  @JsonProperty("client_mappings")
  private Download clientMappings;

  @JsonProperty("server")
  private Download server;

  @JsonProperty("server_mappings")
  private Download serverMappings;

  /**
   **/
  public VersionPackageInfoDownloads client(Download client) {
    this.client = client;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("client")
  public Download getClient() {
    return client;
  }
  public void setClient(Download client) {
    this.client = client;
  }

  /**
   **/
  public VersionPackageInfoDownloads clientMappings(Download clientMappings) {
    this.clientMappings = clientMappings;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("client_mappings")
  public Download getClientMappings() {
    return clientMappings;
  }
  public void setClientMappings(Download clientMappings) {
    this.clientMappings = clientMappings;
  }

  /**
   **/
  public VersionPackageInfoDownloads server(Download server) {
    this.server = server;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("server")
  public Download getServer() {
    return server;
  }
  public void setServer(Download server) {
    this.server = server;
  }

  /**
   **/
  public VersionPackageInfoDownloads serverMappings(Download serverMappings) {
    this.serverMappings = serverMappings;
    return this;
  }

  
  @ApiModelProperty(value = "")
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

