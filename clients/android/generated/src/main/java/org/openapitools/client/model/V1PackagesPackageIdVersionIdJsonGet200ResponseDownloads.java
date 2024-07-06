/**
 * 
 * SDK for Minecraft versions info
 *
 * The version of the OpenAPI document: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads {
  
  @SerializedName("client")
  private V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient client = null;
  @SerializedName("client_mappings")
  private V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient clientMappings = null;
  @SerializedName("server")
  private V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient server = null;
  @SerializedName("server_mappings")
  private V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient serverMappings = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient getClient() {
    return client;
  }
  public void setClient(V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient client) {
    this.client = client;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient getClientMappings() {
    return clientMappings;
  }
  public void setClientMappings(V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient clientMappings) {
    this.clientMappings = clientMappings;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient getServer() {
    return server;
  }
  public void setServer(V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient server) {
    this.server = server;
  }

  /**
   **/
  @ApiModelProperty(value = "")
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
    return (this.client == null ? v1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.client == null : this.client.equals(v1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.client)) &&
        (this.clientMappings == null ? v1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.clientMappings == null : this.clientMappings.equals(v1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.clientMappings)) &&
        (this.server == null ? v1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.server == null : this.server.equals(v1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.server)) &&
        (this.serverMappings == null ? v1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.serverMappings == null : this.serverMappings.equals(v1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.serverMappings));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.client == null ? 0: this.client.hashCode());
    result = 31 * result + (this.clientMappings == null ? 0: this.clientMappings.hashCode());
    result = 31 * result + (this.server == null ? 0: this.server.hashCode());
    result = 31 * result + (this.serverMappings == null ? 0: this.serverMappings.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads {\n");
    
    sb.append("  client: ").append(client).append("\n");
    sb.append("  clientMappings: ").append(clientMappings).append("\n");
    sb.append("  server: ").append(server).append("\n");
    sb.append("  serverMappings: ").append(serverMappings).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
