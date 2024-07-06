package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import org.openapitools.server.model.V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex;
import org.openapitools.server.model.V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads;
import org.openapitools.server.model.V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class V1PackagesPackageIdVersionIdJsonGet200Response   {

    private String version;
    private V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex assetIndex;
    private Integer assets;
    private Integer complianceLevel;
    private V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads downloads;
    private String id;
    private V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion javaVersion;
    private String mainClass;
    private Integer minimumLauncherVersion;
    private OffsetDateTime time;
    private OffsetDateTime releaseTime;
    private String type;

    /**
     * Default constructor.
     */
    public V1PackagesPackageIdVersionIdJsonGet200Response() {
    // JSON-B / Jackson
    }

    /**
     * Create V1PackagesPackageIdVersionIdJsonGet200Response.
     *
     * @param version version
     * @param assetIndex assetIndex
     * @param assets assets
     * @param complianceLevel complianceLevel
     * @param downloads downloads
     * @param id id
     * @param javaVersion javaVersion
     * @param mainClass mainClass
     * @param minimumLauncherVersion minimumLauncherVersion
     * @param time time
     * @param releaseTime releaseTime
     * @param type type
     */
    public V1PackagesPackageIdVersionIdJsonGet200Response(
        String version, 
        V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex assetIndex, 
        Integer assets, 
        Integer complianceLevel, 
        V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads downloads, 
        String id, 
        V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion javaVersion, 
        String mainClass, 
        Integer minimumLauncherVersion, 
        OffsetDateTime time, 
        OffsetDateTime releaseTime, 
        String type
    ) {
        this.version = version;
        this.assetIndex = assetIndex;
        this.assets = assets;
        this.complianceLevel = complianceLevel;
        this.downloads = downloads;
        this.id = id;
        this.javaVersion = javaVersion;
        this.mainClass = mainClass;
        this.minimumLauncherVersion = minimumLauncherVersion;
        this.time = time;
        this.releaseTime = releaseTime;
        this.type = type;
    }



    /**
     * Get version
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Get assetIndex
     * @return assetIndex
     */
    public V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex getAssetIndex() {
        return assetIndex;
    }

    public void setAssetIndex(V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex assetIndex) {
        this.assetIndex = assetIndex;
    }

    /**
     * Get assets
     * @return assets
     */
    public Integer getAssets() {
        return assets;
    }

    public void setAssets(Integer assets) {
        this.assets = assets;
    }

    /**
     * Get complianceLevel
     * @return complianceLevel
     */
    public Integer getComplianceLevel() {
        return complianceLevel;
    }

    public void setComplianceLevel(Integer complianceLevel) {
        this.complianceLevel = complianceLevel;
    }

    /**
     * Get downloads
     * @return downloads
     */
    public V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads getDownloads() {
        return downloads;
    }

    public void setDownloads(V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads downloads) {
        this.downloads = downloads;
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
     * Get javaVersion
     * @return javaVersion
     */
    public V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion getJavaVersion() {
        return javaVersion;
    }

    public void setJavaVersion(V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion javaVersion) {
        this.javaVersion = javaVersion;
    }

    /**
     * Get mainClass
     * @return mainClass
     */
    public String getMainClass() {
        return mainClass;
    }

    public void setMainClass(String mainClass) {
        this.mainClass = mainClass;
    }

    /**
     * Get minimumLauncherVersion
     * @return minimumLauncherVersion
     */
    public Integer getMinimumLauncherVersion() {
        return minimumLauncherVersion;
    }

    public void setMinimumLauncherVersion(Integer minimumLauncherVersion) {
        this.minimumLauncherVersion = minimumLauncherVersion;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class V1PackagesPackageIdVersionIdJsonGet200Response {\n");
        
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    assetIndex: ").append(toIndentedString(assetIndex)).append("\n");
        sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
        sb.append("    complianceLevel: ").append(toIndentedString(complianceLevel)).append("\n");
        sb.append("    downloads: ").append(toIndentedString(downloads)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    javaVersion: ").append(toIndentedString(javaVersion)).append("\n");
        sb.append("    mainClass: ").append(toIndentedString(mainClass)).append("\n");
        sb.append("    minimumLauncherVersion: ").append(toIndentedString(minimumLauncherVersion)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    releaseTime: ").append(toIndentedString(releaseTime)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

