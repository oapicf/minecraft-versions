package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.McGameVersionManifestGet200ResponseLatest;
import org.openapitools.server.model.McGameVersionManifestGet200ResponseVersionsInner;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class McGameVersionManifestGet200Response   {

    private McGameVersionManifestGet200ResponseLatest latest;
    private List<@Valid McGameVersionManifestGet200ResponseVersionsInner> versions = new ArrayList<>();

    /**
     * Default constructor.
     */
    public McGameVersionManifestGet200Response() {
    // JSON-B / Jackson
    }

    /**
     * Create McGameVersionManifestGet200Response.
     *
     * @param latest latest
     * @param versions versions
     */
    public McGameVersionManifestGet200Response(
        McGameVersionManifestGet200ResponseLatest latest, 
        List<@Valid McGameVersionManifestGet200ResponseVersionsInner> versions
    ) {
        this.latest = latest;
        this.versions = versions;
    }



    /**
     * Get latest
     * @return latest
     */
    public McGameVersionManifestGet200ResponseLatest getLatest() {
        return latest;
    }

    public void setLatest(McGameVersionManifestGet200ResponseLatest latest) {
        this.latest = latest;
    }

    /**
     * Get versions
     * @return versions
     */
    public List<@Valid McGameVersionManifestGet200ResponseVersionsInner> getVersions() {
        return versions;
    }

    public void setVersions(List<@Valid McGameVersionManifestGet200ResponseVersionsInner> versions) {
        this.versions = versions;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class McGameVersionManifestGet200Response {\n");
        
        sb.append("    latest: ").append(toIndentedString(latest)).append("\n");
        sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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

