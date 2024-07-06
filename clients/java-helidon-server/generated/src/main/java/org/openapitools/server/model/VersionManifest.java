package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.Version;
import org.openapitools.server.model.VersionManifestLatest;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class VersionManifest   {

    private VersionManifestLatest latest;
    private List<@Valid Version> versions = new ArrayList<>();

    /**
     * Default constructor.
     */
    public VersionManifest() {
    // JSON-B / Jackson
    }

    /**
     * Create VersionManifest.
     *
     * @param latest latest
     * @param versions versions
     */
    public VersionManifest(
        VersionManifestLatest latest, 
        List<@Valid Version> versions
    ) {
        this.latest = latest;
        this.versions = versions;
    }



    /**
     * Get latest
     * @return latest
     */
    public VersionManifestLatest getLatest() {
        return latest;
    }

    public void setLatest(VersionManifestLatest latest) {
        this.latest = latest;
    }

    /**
     * Get versions
     * @return versions
     */
    public List<@Valid Version> getVersions() {
        return versions;
    }

    public void setVersions(List<@Valid Version> versions) {
        this.versions = versions;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionManifest {\n");
        
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

