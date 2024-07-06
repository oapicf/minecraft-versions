package org.openapitools.server.model;

import java.time.OffsetDateTime;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class Version   {

    private String id;
    private String type;
    private String url;
    private OffsetDateTime time;
    private OffsetDateTime releaseTime;

    /**
     * Default constructor.
     */
    public Version() {
    // JSON-B / Jackson
    }

    /**
     * Create Version.
     *
     * @param id id
     * @param type type
     * @param url url
     * @param time time
     * @param releaseTime releaseTime
     */
    public Version(
        String id, 
        String type, 
        String url, 
        OffsetDateTime time, 
        OffsetDateTime releaseTime
    ) {
        this.id = id;
        this.type = type;
        this.url = url;
        this.time = time;
        this.releaseTime = releaseTime;
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
     * Get type
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
     * Get time
     * @return time
     */
    public OffsetDateTime getTime() {
        return time;
    }

    public void setTime(OffsetDateTime time) {
        this.time = time;
    }

    /**
     * Get releaseTime
     * @return releaseTime
     */
    public OffsetDateTime getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(OffsetDateTime releaseTime) {
        this.releaseTime = releaseTime;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Version {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    releaseTime: ").append(toIndentedString(releaseTime)).append("\n");
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

