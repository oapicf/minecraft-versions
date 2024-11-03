/**
 * 
 * SDK for Minecraft versions info
 *
 * The version of the OpenAPI document: 0.12.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.Download;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class VersionPackageInfoDownloads {
  
  @SerializedName("client")
  private Download client = null;
  @SerializedName("client_mappings")
  private Download clientMappings = null;
  @SerializedName("server")
  private Download server = null;
  @SerializedName("server_mappings")
  private Download serverMappings = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Download getClient() {
    return client;
  }
  public void setClient(Download client) {
    this.client = client;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Download getClientMappings() {
    return clientMappings;
  }
  public void setClientMappings(Download clientMappings) {
    this.clientMappings = clientMappings;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Download getServer() {
    return server;
  }
  public void setServer(Download server) {
    this.server = server;
  }

  /**
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
    return (this.client == null ? versionPackageInfoDownloads.client == null : this.client.equals(versionPackageInfoDownloads.client)) &&
        (this.clientMappings == null ? versionPackageInfoDownloads.clientMappings == null : this.clientMappings.equals(versionPackageInfoDownloads.clientMappings)) &&
        (this.server == null ? versionPackageInfoDownloads.server == null : this.server.equals(versionPackageInfoDownloads.server)) &&
        (this.serverMappings == null ? versionPackageInfoDownloads.serverMappings == null : this.serverMappings.equals(versionPackageInfoDownloads.serverMappings));
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
    sb.append("class VersionPackageInfoDownloads {\n");
    
    sb.append("  client: ").append(client).append("\n");
    sb.append("  clientMappings: ").append(clientMappings).append("\n");
    sb.append("  server: ").append(server).append("\n");
    sb.append("  serverMappings: ").append(serverMappings).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
