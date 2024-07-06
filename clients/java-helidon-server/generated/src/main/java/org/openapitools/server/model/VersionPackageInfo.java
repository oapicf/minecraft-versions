package org.openapitools.server.model;

import java.time.OffsetDateTime;
import org.openapitools.server.model.VersionPackageInfoAssetIndex;
import org.openapitools.server.model.VersionPackageInfoDownloads;
import org.openapitools.server.model.VersionPackageInfoJavaVersion;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class VersionPackageInfo   {

    private String version;
    private VersionPackageInfoAssetIndex assetIndex;
    private String assets;
    private Integer complianceLevel;
    private VersionPackageInfoDownloads downloads;
    private String id;
    private VersionPackageInfoJavaVersion javaVersion;
    private String mainClass;
    private Integer minimumLauncherVersion;
    private OffsetDateTime time;
    private OffsetDateTime releaseTime;
    private String type;

    /**
     * Default constructor.
     */
    public VersionPackageInfo() {
    // JSON-B / Jackson
    }

    /**
     * Create VersionPackageInfo.
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
    public VersionPackageInfo(
        String version, 
        VersionPackageInfoAssetIndex assetIndex, 
        String assets, 
        Integer complianceLevel, 
        VersionPackageInfoDownloads downloads, 
        String id, 
        VersionPackageInfoJavaVersion javaVersion, 
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
    public VersionPackageInfoAssetIndex getAssetIndex() {
        return assetIndex;
    }

    public void setAssetIndex(VersionPackageInfoAssetIndex assetIndex) {
        this.assetIndex = assetIndex;
    }

    /**
     * Get assets
     * @return assets
     */
    public String getAssets() {
        return assets;
    }

    public void setAssets(String assets) {
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
    public VersionPackageInfoDownloads getDownloads() {
        return downloads;
    }

    public void setDownloads(VersionPackageInfoDownloads downloads) {
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
    public VersionPackageInfoJavaVersion getJavaVersion() {
        return javaVersion;
    }

    public void setJavaVersion(VersionPackageInfoJavaVersion javaVersion) {
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
        sb.append("class VersionPackageInfo {\n");
        
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

