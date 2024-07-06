package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("_v1_packages__packageId___versionId__json_get_200_response_downloads")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-07-06T01:33:27.601676284Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads   {
  private V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient client;
  private V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient clientMappings;
  private V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient server;
  private V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient serverMappings;

  /**
   **/
  public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads client(V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient client) {
    this.client = client;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("client")
  @Valid public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient getClient() {
    return client;
  }

  @JsonProperty("client")
  public void setClient(V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient client) {
    this.client = client;
  }

  /**
   **/
  public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads clientMappings(V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient clientMappings) {
    this.clientMappings = clientMappings;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("client_mappings")
  @Valid public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient getClientMappings() {
    return clientMappings;
  }

  @JsonProperty("client_mappings")
  public void setClientMappings(V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient clientMappings) {
    this.clientMappings = clientMappings;
  }

  /**
   **/
  public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads server(V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient server) {
    this.server = server;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("server")
  @Valid public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient getServer() {
    return server;
  }

  @JsonProperty("server")
  public void setServer(V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient server) {
    this.server = server;
  }

  /**
   **/
  public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads serverMappings(V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient serverMappings) {
    this.serverMappings = serverMappings;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("server_mappings")
  @Valid public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient getServerMappings() {
    return serverMappings;
  }

  @JsonProperty("server_mappings")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

