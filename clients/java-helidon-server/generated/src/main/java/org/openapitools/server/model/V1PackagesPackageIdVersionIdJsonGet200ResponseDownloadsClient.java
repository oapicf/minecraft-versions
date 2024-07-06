package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient   {

    private String sha1;
    private Integer size;
    private String url;

    /**
     * Default constructor.
     */
    public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient() {
    // JSON-B / Jackson
    }

    /**
     * Create V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient.
     *
     * @param sha1 sha1
     * @param size size
     * @param url url
     */
    public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient(
        String sha1, 
        Integer size, 
        String url
    ) {
        this.sha1 = sha1;
        this.size = size;
        this.url = url;
    }



    /**
     * Get sha1
     * @return sha1
     */
    public String getSha1() {
        return sha1;
    }

    public void setSha1(String sha1) {
        this.sha1 = sha1;
    }

    /**
     * Get size
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * Get url
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient {\n");
        
        sb.append("    sha1: ").append(toIndentedString(sha1)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

