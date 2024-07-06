package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex   {

    private String id;
    private String sha1;
    private Integer size;
    private Integer totalSize;
    private String url;

    /**
     * Default constructor.
     */
    public V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex() {
    // JSON-B / Jackson
    }

    /**
     * Create V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex.
     *
     * @param id id
     * @param sha1 sha1
     * @param size size
     * @param totalSize totalSize
     * @param url url
     */
    public V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex(
        String id, 
        String sha1, 
        Integer size, 
        Integer totalSize, 
        String url
    ) {
        this.id = id;
        this.sha1 = sha1;
        this.size = size;
        this.totalSize = totalSize;
        this.url = url;
    }



    /**
     * Get id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
     * Get totalSize
     * @return totalSize
     */
    public Integer getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
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
        sb.append("class V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    sha1: ").append(toIndentedString(sha1)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
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

