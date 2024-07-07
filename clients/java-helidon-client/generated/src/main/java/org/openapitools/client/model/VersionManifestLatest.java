/**
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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;




public class VersionManifestLatest  {
  
  private String release;

  private String snapshot;

 /**
   * Get release
   * @return release
  **/
  public String getRelease() {
    return release;
  }

  /**
    * Set release
  **/
  public void setRelease(String release) {
    this.release = release;
  }

  public VersionManifestLatest release(String release) {
    this.release = release;
    return this;
  }

 /**
   * Get snapshot
   * @return snapshot
  **/
  public String getSnapshot() {
    return snapshot;
  }

  /**
    * Set snapshot
  **/
  public void setSnapshot(String snapshot) {
    this.snapshot = snapshot;
  }

  public VersionManifestLatest snapshot(String snapshot) {
    this.snapshot = snapshot;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
