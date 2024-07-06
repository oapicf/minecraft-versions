package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class McGameVersionManifestGet200ResponseLatest   {

    private String release;
    private String snapshot;

    /**
     * Default constructor.
     */
    public McGameVersionManifestGet200ResponseLatest() {
    // JSON-B / Jackson
    }

    /**
     * Create McGameVersionManifestGet200ResponseLatest.
     *
     * @param release release
     * @param snapshot snapshot
     */
    public McGameVersionManifestGet200ResponseLatest(
        String release, 
        String snapshot
    ) {
        this.release = release;
        this.snapshot = snapshot;
    }



    /**
     * Get release
     * @return release
     */
    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    /**
     * Get snapshot
     * @return snapshot
     */
    public String getSnapshot() {
        return snapshot;
    }

    public void setSnapshot(String snapshot) {
        this.snapshot = snapshot;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class McGameVersionManifestGet200ResponseLatest {\n");
        
        sb.append("    release: ").append(toIndentedString(release)).append("\n");
        sb.append("    snapshot: ").append(toIndentedString(snapshot)).append("\n");
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

