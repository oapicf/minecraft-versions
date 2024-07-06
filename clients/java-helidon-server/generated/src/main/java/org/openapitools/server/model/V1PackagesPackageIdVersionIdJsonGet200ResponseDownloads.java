package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads   {

    private V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient client;
    private V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient clientMappings;
    private V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient server;
    private V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient serverMappings;

    /**
     * Default constructor.
     */
    public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads() {
    // JSON-B / Jackson
    }

    /**
     * Create V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.
     *
     * @param client client
     * @param clientMappings clientMappings
     * @param server server
     * @param serverMappings serverMappings
     */
    public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads(
        V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient client, 
        V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient clientMappings, 
        V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient server, 
        V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient serverMappings
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
    public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient getClient() {
        return client;
    }

    public void setClient(V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient client) {
        this.client = client;
    }

    /**
     * Get clientMappings
     * @return clientMappings
     */
    public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient getClientMappings() {
        return clientMappings;
    }

    public void setClientMappings(V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient clientMappings) {
        this.clientMappings = clientMappings;
    }

    /**
     * Get server
     * @return server
     */
    public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient getServer() {
        return server;
    }

    public void setServer(V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient server) {
        this.server = server;
    }

    /**
     * Get serverMappings
     * @return serverMappings
     */
    public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient getServerMappings() {
        return serverMappings;
    }

    public void setServerMappings(V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient serverMappings) {
        this.serverMappings = serverMappings;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

