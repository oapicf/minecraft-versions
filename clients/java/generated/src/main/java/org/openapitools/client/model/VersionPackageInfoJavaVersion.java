/*
 * 
 * SDK for Minecraft versions info
 *
 * The version of the OpenAPI document: 1.1.1-pre.0
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
 * VersionPackageInfoJavaVersion
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-10T01:44:03.457407048Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class VersionPackageInfoJavaVersion {
  public static final String SERIALIZED_NAME_COMPONENT = "component";
  @SerializedName(SERIALIZED_NAME_COMPONENT)
  @javax.annotation.Nullable
  private String component;

  public static final String SERIALIZED_NAME_MAJOR_VERSION = "majorVersion";
  @SerializedName(SERIALIZED_NAME_MAJOR_VERSION)
  @javax.annotation.Nullable
  private Integer majorVersion;

  public VersionPackageInfoJavaVersion() {
  }

  public VersionPackageInfoJavaVersion component(@javax.annotation.Nullable String component) {
    this.component = component;
    return this;
  }

  /**
   * Get component
   * @return component
   */
  @javax.annotation.Nullable
  public String getComponent() {
    return component;
  }

  public void setComponent(@javax.annotation.Nullable String component) {
    this.component = component;
  }


  public VersionPackageInfoJavaVersion majorVersion(@javax.annotation.Nullable Integer majorVersion) {
    this.majorVersion = majorVersion;
    return this;
  }

  /**
   * Get majorVersion
   * @return majorVersion
   */
  @javax.annotation.Nullable
  public Integer getMajorVersion() {
    return majorVersion;
  }

  public void setMajorVersion(@javax.annotation.Nullable Integer majorVersion) {
    this.majorVersion = majorVersion;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionPackageInfoJavaVersion versionPackageInfoJavaVersion = (VersionPackageInfoJavaVersion) o;
    return Objects.equals(this.component, versionPackageInfoJavaVersion.component) &&
        Objects.equals(this.majorVersion, versionPackageInfoJavaVersion.majorVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(component, majorVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionPackageInfoJavaVersion {\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    majorVersion: ").append(toIndentedString(majorVersion)).append("\n");
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
    openapiFields.add("component");
    openapiFields.add("majorVersion");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to VersionPackageInfoJavaVersion
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VersionPackageInfoJavaVersion.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VersionPackageInfoJavaVersion is not found in the empty JSON string", VersionPackageInfoJavaVersion.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!VersionPackageInfoJavaVersion.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VersionPackageInfoJavaVersion` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("component") != null && !jsonObj.get("component").isJsonNull()) && !jsonObj.get("component").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `component` to be a primitive type in the JSON string but got `%s`", jsonObj.get("component").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VersionPackageInfoJavaVersion.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VersionPackageInfoJavaVersion' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VersionPackageInfoJavaVersion> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VersionPackageInfoJavaVersion.class));

       return (TypeAdapter<T>) new TypeAdapter<VersionPackageInfoJavaVersion>() {
           @Override
           public void write(JsonWriter out, VersionPackageInfoJavaVersion value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VersionPackageInfoJavaVersion read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of VersionPackageInfoJavaVersion given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of VersionPackageInfoJavaVersion
   * @throws IOException if the JSON string is invalid with respect to VersionPackageInfoJavaVersion
   */
  public static VersionPackageInfoJavaVersion fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VersionPackageInfoJavaVersion.class);
  }

  /**
   * Convert an instance of VersionPackageInfoJavaVersion to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

