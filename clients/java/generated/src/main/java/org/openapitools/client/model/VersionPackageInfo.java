/*
 * 
 * SDK for Minecraft versions info
 *
 * The version of the OpenAPI document: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.VersionPackageInfoAssetIndex;
import org.openapitools.client.model.VersionPackageInfoDownloads;
import org.openapitools.client.model.VersionPackageInfoJavaVersion;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * VersionPackageInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-06T13:11:16.515719371Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class VersionPackageInfo {
  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_ASSET_INDEX = "assetIndex";
  @SerializedName(SERIALIZED_NAME_ASSET_INDEX)
  private VersionPackageInfoAssetIndex assetIndex;

  public static final String SERIALIZED_NAME_ASSETS = "assets";
  @SerializedName(SERIALIZED_NAME_ASSETS)
  private String assets;

  public static final String SERIALIZED_NAME_COMPLIANCE_LEVEL = "complianceLevel";
  @SerializedName(SERIALIZED_NAME_COMPLIANCE_LEVEL)
  private Integer complianceLevel;

  public static final String SERIALIZED_NAME_DOWNLOADS = "downloads";
  @SerializedName(SERIALIZED_NAME_DOWNLOADS)
  private VersionPackageInfoDownloads downloads;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_JAVA_VERSION = "javaVersion";
  @SerializedName(SERIALIZED_NAME_JAVA_VERSION)
  private VersionPackageInfoJavaVersion javaVersion;

  public static final String SERIALIZED_NAME_MAIN_CLASS = "mainClass";
  @SerializedName(SERIALIZED_NAME_MAIN_CLASS)
  private String mainClass;

  public static final String SERIALIZED_NAME_MINIMUM_LAUNCHER_VERSION = "minimumLauncherVersion";
  @SerializedName(SERIALIZED_NAME_MINIMUM_LAUNCHER_VERSION)
  private Integer minimumLauncherVersion;

  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private OffsetDateTime time;

  public static final String SERIALIZED_NAME_RELEASE_TIME = "releaseTime";
  @SerializedName(SERIALIZED_NAME_RELEASE_TIME)
  private OffsetDateTime releaseTime;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public VersionPackageInfo() {
  }

  public VersionPackageInfo version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  public VersionPackageInfo assetIndex(VersionPackageInfoAssetIndex assetIndex) {
    this.assetIndex = assetIndex;
    return this;
  }

   /**
   * Get assetIndex
   * @return assetIndex
  **/
  @javax.annotation.Nullable
  public VersionPackageInfoAssetIndex getAssetIndex() {
    return assetIndex;
  }

  public void setAssetIndex(VersionPackageInfoAssetIndex assetIndex) {
    this.assetIndex = assetIndex;
  }


  public VersionPackageInfo assets(String assets) {
    this.assets = assets;
    return this;
  }

   /**
   * Get assets
   * @return assets
  **/
  @javax.annotation.Nullable
  public String getAssets() {
    return assets;
  }

  public void setAssets(String assets) {
    this.assets = assets;
  }


  public VersionPackageInfo complianceLevel(Integer complianceLevel) {
    this.complianceLevel = complianceLevel;
    return this;
  }

   /**
   * Get complianceLevel
   * @return complianceLevel
  **/
  @javax.annotation.Nullable
  public Integer getComplianceLevel() {
    return complianceLevel;
  }

  public void setComplianceLevel(Integer complianceLevel) {
    this.complianceLevel = complianceLevel;
  }


  public VersionPackageInfo downloads(VersionPackageInfoDownloads downloads) {
    this.downloads = downloads;
    return this;
  }

   /**
   * Get downloads
   * @return downloads
  **/
  @javax.annotation.Nullable
  public VersionPackageInfoDownloads getDownloads() {
    return downloads;
  }

  public void setDownloads(VersionPackageInfoDownloads downloads) {
    this.downloads = downloads;
  }


  public VersionPackageInfo id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public VersionPackageInfo javaVersion(VersionPackageInfoJavaVersion javaVersion) {
    this.javaVersion = javaVersion;
    return this;
  }

   /**
   * Get javaVersion
   * @return javaVersion
  **/
  @javax.annotation.Nullable
  public VersionPackageInfoJavaVersion getJavaVersion() {
    return javaVersion;
  }

  public void setJavaVersion(VersionPackageInfoJavaVersion javaVersion) {
    this.javaVersion = javaVersion;
  }


  public VersionPackageInfo mainClass(String mainClass) {
    this.mainClass = mainClass;
    return this;
  }

   /**
   * Get mainClass
   * @return mainClass
  **/
  @javax.annotation.Nullable
  public String getMainClass() {
    return mainClass;
  }

  public void setMainClass(String mainClass) {
    this.mainClass = mainClass;
  }


  public VersionPackageInfo minimumLauncherVersion(Integer minimumLauncherVersion) {
    this.minimumLauncherVersion = minimumLauncherVersion;
    return this;
  }

   /**
   * Get minimumLauncherVersion
   * @return minimumLauncherVersion
  **/
  @javax.annotation.Nullable
  public Integer getMinimumLauncherVersion() {
    return minimumLauncherVersion;
  }

  public void setMinimumLauncherVersion(Integer minimumLauncherVersion) {
    this.minimumLauncherVersion = minimumLauncherVersion;
  }


  public VersionPackageInfo time(OffsetDateTime time) {
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getTime() {
    return time;
  }

  public void setTime(OffsetDateTime time) {
    this.time = time;
  }


  public VersionPackageInfo releaseTime(OffsetDateTime releaseTime) {
    this.releaseTime = releaseTime;
    return this;
  }

   /**
   * Get releaseTime
   * @return releaseTime
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getReleaseTime() {
    return releaseTime;
  }

  public void setReleaseTime(OffsetDateTime releaseTime) {
    this.releaseTime = releaseTime;
  }


  public VersionPackageInfo type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionPackageInfo versionPackageInfo = (VersionPackageInfo) o;
    return Objects.equals(this.version, versionPackageInfo.version) &&
        Objects.equals(this.assetIndex, versionPackageInfo.assetIndex) &&
        Objects.equals(this.assets, versionPackageInfo.assets) &&
        Objects.equals(this.complianceLevel, versionPackageInfo.complianceLevel) &&
        Objects.equals(this.downloads, versionPackageInfo.downloads) &&
        Objects.equals(this.id, versionPackageInfo.id) &&
        Objects.equals(this.javaVersion, versionPackageInfo.javaVersion) &&
        Objects.equals(this.mainClass, versionPackageInfo.mainClass) &&
        Objects.equals(this.minimumLauncherVersion, versionPackageInfo.minimumLauncherVersion) &&
        Objects.equals(this.time, versionPackageInfo.time) &&
        Objects.equals(this.releaseTime, versionPackageInfo.releaseTime) &&
        Objects.equals(this.type, versionPackageInfo.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, assetIndex, assets, complianceLevel, downloads, id, javaVersion, mainClass, minimumLauncherVersion, time, releaseTime, type);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("version");
    openapiFields.add("assetIndex");
    openapiFields.add("assets");
    openapiFields.add("complianceLevel");
    openapiFields.add("downloads");
    openapiFields.add("id");
    openapiFields.add("javaVersion");
    openapiFields.add("mainClass");
    openapiFields.add("minimumLauncherVersion");
    openapiFields.add("time");
    openapiFields.add("releaseTime");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to VersionPackageInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VersionPackageInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VersionPackageInfo is not found in the empty JSON string", VersionPackageInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!VersionPackageInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VersionPackageInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
      // validate the optional field `assetIndex`
      if (jsonObj.get("assetIndex") != null && !jsonObj.get("assetIndex").isJsonNull()) {
        VersionPackageInfoAssetIndex.validateJsonElement(jsonObj.get("assetIndex"));
      }
      if ((jsonObj.get("assets") != null && !jsonObj.get("assets").isJsonNull()) && !jsonObj.get("assets").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assets` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assets").toString()));
      }
      // validate the optional field `downloads`
      if (jsonObj.get("downloads") != null && !jsonObj.get("downloads").isJsonNull()) {
        VersionPackageInfoDownloads.validateJsonElement(jsonObj.get("downloads"));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `javaVersion`
      if (jsonObj.get("javaVersion") != null && !jsonObj.get("javaVersion").isJsonNull()) {
        VersionPackageInfoJavaVersion.validateJsonElement(jsonObj.get("javaVersion"));
      }
      if ((jsonObj.get("mainClass") != null && !jsonObj.get("mainClass").isJsonNull()) && !jsonObj.get("mainClass").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mainClass` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mainClass").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VersionPackageInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VersionPackageInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VersionPackageInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VersionPackageInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<VersionPackageInfo>() {
           @Override
           public void write(JsonWriter out, VersionPackageInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VersionPackageInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VersionPackageInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VersionPackageInfo
  * @throws IOException if the JSON string is invalid with respect to VersionPackageInfo
  */
  public static VersionPackageInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VersionPackageInfo.class);
  }

 /**
  * Convert an instance of VersionPackageInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
