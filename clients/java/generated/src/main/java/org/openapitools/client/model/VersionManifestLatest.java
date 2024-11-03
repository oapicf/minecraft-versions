/*
 * 
 * SDK for Minecraft versions info
 *
 * The version of the OpenAPI document: 0.12.1-pre.0
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
import java.util.Arrays;

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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * VersionManifestLatest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-03T05:50:14.104307196Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class VersionManifestLatest {
  public static final String SERIALIZED_NAME_RELEASE = "release";
  @SerializedName(SERIALIZED_NAME_RELEASE)
  private String release;

  public static final String SERIALIZED_NAME_SNAPSHOT = "snapshot";
  @SerializedName(SERIALIZED_NAME_SNAPSHOT)
  private String snapshot;

  public VersionManifestLatest() {
  }

  public VersionManifestLatest release(String release) {
    this.release = release;
    return this;
  }

  /**
   * Get release
   * @return release
   */
  @javax.annotation.Nullable
  public String getRelease() {
    return release;
  }

  public void setRelease(String release) {
    this.release = release;
  }


  public VersionManifestLatest snapshot(String snapshot) {
    this.snapshot = snapshot;
    return this;
  }

  /**
   * Get snapshot
   * @return snapshot
   */
  @javax.annotation.Nullable
  public String getSnapshot() {
    return snapshot;
  }

  public void setSnapshot(String snapshot) {
    this.snapshot = snapshot;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionManifestLatest versionManifestLatest = (VersionManifestLatest) o;
    return Objects.equals(this.release, versionManifestLatest.release) &&
        Objects.equals(this.snapshot, versionManifestLatest.snapshot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(release, snapshot);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionManifestLatest {\n");
    sb.append("    release: ").append(toIndentedString(release)).append("\n");
    sb.append("    snapshot: ").append(toIndentedString(snapshot)).append("\n");
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
    openapiFields.add("release");
    openapiFields.add("snapshot");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to VersionManifestLatest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VersionManifestLatest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VersionManifestLatest is not found in the empty JSON string", VersionManifestLatest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!VersionManifestLatest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VersionManifestLatest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("release") != null && !jsonObj.get("release").isJsonNull()) && !jsonObj.get("release").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `release` to be a primitive type in the JSON string but got `%s`", jsonObj.get("release").toString()));
      }
      if ((jsonObj.get("snapshot") != null && !jsonObj.get("snapshot").isJsonNull()) && !jsonObj.get("snapshot").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `snapshot` to be a primitive type in the JSON string but got `%s`", jsonObj.get("snapshot").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VersionManifestLatest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VersionManifestLatest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VersionManifestLatest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VersionManifestLatest.class));

       return (TypeAdapter<T>) new TypeAdapter<VersionManifestLatest>() {
           @Override
           public void write(JsonWriter out, VersionManifestLatest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VersionManifestLatest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of VersionManifestLatest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of VersionManifestLatest
   * @throws IOException if the JSON string is invalid with respect to VersionManifestLatest
   */
  public static VersionManifestLatest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VersionManifestLatest.class);
  }

  /**
   * Convert an instance of VersionManifestLatest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

