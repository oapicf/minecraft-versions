package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.Download;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class VersionPackageInfoDownloads   {

    private Download client;
    private Download clientMappings;
    private Download server;
    private Download serverMappings;

    /**
     * Default constructor.
     */
    public VersionPackageInfoDownloads() {
    // JSON-B / Jackson
    }

    /**
     * Create VersionPackageInfoDownloads.
     *
     * @param client client
     * @param clientMappings clientMappings
     * @param server server
     * @param serverMappings serverMappings
     */
    public VersionPackageInfoDownloads(
        Download client, 
        Download clientMappings, 
        Download server, 
        Download serverMappings
    ) {
        this.client = client;
        this.clientMappings = clientMappings;
        this.server = server;
        this.serverMappings = serverMappings;
    }



    /**
     * Get client
     * @return client
     */
    public Download getClient() {
        return client;
    }

    public void setClient(Download client) {
        this.client = client;
    }

    /**
     * Get clientMappings
     * @return clientMappings
     */
    public Download getClientMappings() {
        return clientMappings;
    }

    public void setClientMappings(Download clientMappings) {
        this.clientMappings = clientMappings;
    }

    /**
     * Get server
     * @return server
     */
    public Download getServer() {
        return server;
    }

    public void setServer(Download server) {
        this.server = server;
    }

    /**
     * Get serverMappings
     * @return serverMappings
     */
    public Download getServerMappings() {
        return serverMappings;
    }

    public void setServerMappings(Download serverMappings) {
        this.serverMappings = serverMappings;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        if (o == null) {
          return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

